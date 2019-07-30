package com.JavaProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AccountImpl implements Account{

	List<AccountVO> aclists = null;
	
	Scanner asc = new Scanner(System.in);
	private String accountfilepath = "d:\\project\\"; 
	private String accountfilename = null;
	private String accountmanagefilepath = "d:\\project\\account.txt";
	private File f;
	boolean logincheck = false;
	
	//�α����� ������ �ش� id ���� ���� 
	private String loginid;
	/*
	 * ���̵� ó���ϱ� 
	 */
	public void setloginId(String loginid) {
		this.loginid = loginid;
	}
	public String getloginId() {
		return loginid;
	}
	public AccountImpl() {
		
		f = new File(accountmanagefilepath);
		
		try {
			if(!f.getParentFile().exists()) {
			f.getParentFile().mkdirs();
			}
			if(!f.exists()) {
				aclists = new ArrayList<AccountVO>();
				System.out.println("ȸ�������� �����ϴ�.");
			}else{
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				aclists = (List<AccountVO>)ois.readObject();
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	@Override
	public void input() {
		
		AccountVO avo = new AccountVO();
		System.out.println(loginid);
	
		System.out.println("ȸ�� ������ �Է��ϼ��� : ");
		System.out.println("����� ID �� �Է��ϼ��� : ");
		System.out.println("*������ ���� ȥ���Ͽ� 8~12���� �Է��ϼ���*");
		System.out.print(" :");
		avo.setId(asc.next());
		
		if(!OverlapID(avo)){
			System.out.println("�ߺ��� �� ���̵� �ֽ��ϴ�.");
			System.out.println("�ٸ� ���̵� �Է��ϼ���");
			return;
		}
		if(!FormatIDCheck(avo)) {
			System.out.println("������ ����ȥ���Ͽ� 8~12�̳��� �����ּ���");
			return;
		}
		System.out.println("����� �н����带 �Է��ϼ��� ");
		System.out.print(" :");
		avo.setPassword(asc.next());
		System.out.println("�̸��� �Է��ϼ��� ");
		System.out.print(" :");
		/*avo.setName(asc.next());
		System.out.println("���̸� �Է��ϼ��� ");
		System.out.print(" :");
		avo.setAge(asc.nextInt());
		System.out.println("������ �Է��ϼ��� 1. ���� 2 . ���� ");
		System.out.print(" :");
		avo.setGender(asc.nextInt());
		System.out.println("�޴��� ��ȣ�� �Է��ϼ��� (ex 010-1111-2222)");
		System.out.print(" :");
		avo.setPhone(asc.next());
		FormatphoneCheck(avo);
		System.out.println("�̸����� �Է��ϼ��� (ex abc@bcd.com ");
		System.out.print(" :");
		avo.setEmail(asc.next());*/
		
		/*if(!FormatEmailCheck(avo)) {
			System.out.println("�̸��� ���Ŀ� ���� �ʽ��ϴ�.");
			return;
		}*/
		
		aclists.add(avo);
		filestore(aclists);
		
	}
	@Override
	public void filestore(List aclist) {
		
		Iterator ait =  aclist.iterator();
		AccountVO avo = (AccountVO)ait.next();
		accountfilename = avo.getId(); 
		try{	
			FileOutputStream fos = new FileOutputStream(accountmanagefilepath);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(aclist);
			System.out.println("������ ����Ǿ����ϴ�. ");
		
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	@Override
	public void output() {
		
		Iterator<AccountVO> ait = aclists.iterator();
		try {
			while(ait.hasNext()) {	
				AccountVO avo = ait.next();
				System.out.println(avo.toString());	
			}	
		} catch (Exception e) {
		
		}
	}
	@Override
	public void login() {
		
		AccountVO avo = new AccountVO();
		Iterator ait = aclists.iterator();
		System.out.print("���̵� �Է��ϼ��� : ");
		avo.setId(asc.next());
		System.out.print("�н����带 �Է��ϼ��� : ");
		avo.setPassword(asc.next());
		
		try{
			/*
			 * login - > id and password check 
			 */
			while(ait.hasNext()) {
				/*
				 * id �� null ���� üũ 
				 */
				if(avo.getId().equals(null)) {
					System.out.println("���̵� �Է��ϼ���");
					continue;
				}
				AccountVO asvo = (AccountVO)ait.next();
				if(asvo.getId().equals(avo.getId())) {
					System.out.println("���̵� üũ");
					if(asvo.getPassword().equals(avo.getPassword())) {
						System.out.println("�н����尡 Ȯ�εǾ����ϴ�.");
						loginid = avo.getId();
						setloginId(loginid);
						logincheck = true;
					}else {
						//System.out.println("�н����尡 Ʋ���ϴ�.");
						logincheck = false;
					}
				}
			}	
		} catch (Exception e) {
			System.out.println("�Է��� ���̵� �н����尡 ���� �ʽ��ϴ�. ");
		}
	}
	
	public boolean OverlapID(AccountVO avo) {
		
		Iterator<AccountVO> ait = aclists.iterator();
		while(ait.hasNext()) {	
			AccountVO checkid = ait.next();
			if(checkid.getId().equals(avo.getId())) {
				return false;
			}
		}
		return true;
	}
	/* 1. ���̵� ���� üũ 
	 * 2. ������ ���� ȥ�� ���̵� 
	 */
	public boolean FormatIDCheck(AccountVO avo) {
		int charcounting=0;
		int numbercounting=0;
		// ���̵� ���� üũ 
		if(avo.getId().length() < 8 || avo.getId().length()> 12) {
			return false;
		}
		//������ ������ ȥ������ üũ 
		for (int i = 0; i < avo.getId().length(); i++) {
			
			if((avo.getId().charAt(i) >= 'a' && avo.getId().charAt(i) <= 'z')  || (avo.getId().charAt(i) >= 'A' && avo.getId().charAt(i) <= 'Z') ) {
				charcounting++;
			}
			if((avo.getId().charAt(i) >= '1' && avo.getId().charAt(i) <= '9')) {
				numbercounting++;
			}
		}
		if(charcounting == avo.getId().length() || numbercounting == avo.getId().length()) {
			return false;
		}
		return true;
	}
	/*
	 * �̸��� ���� üũ �Ϸ�
	 */
	/*public boolean FormatEmailCheck(AccountVO avo) {
		String emailpatten = "[\\w..]+@[\\w]+(\\.[\\w+]+)+";
		if(!Pattern.matches(emailpatten,avo.getEmail())) {
			return false;
		}
		return true;
	}	*/
	/*
	 * ���� �̿ϼ� 
	 */
	/*public boolean FormatphoneCheck(AccountVO avo) {
		String phonepatten = "[\\w]+-[\\w]+-[\\w]";
		return true;
	}*/
	public boolean loginSuccess() {
		if(!logincheck) {
			System.out.println("���̵�� �н����尡 ��ġ�����ʽ��ϴ�. ");
			
		}else {			
			System.out.println("!!!"+getloginId() +"�� �ȳ��ϼ��� !!!");
		}
		return logincheck;
	}
	public String  loginidmigration(String loginid) {
		loginid  = getloginId();
		return loginid;
	}
}


































//ȸ���˻� ��� �ּ�ó�� 
/*
	public void searchAccount() {
		
		String searchname = asc.next();
		System.out.print("ã�� ID�� �Է��ϼ���");
		
		try {	
			FileInputStream fis = new FileInputStream(accountfilepath+searchname+".txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			AccountVO avo = new AccountVO();
			Iterator ait = aclists.iterator();
			
			try {
				while(ait.hasNext()) {
					aclists = (List<AccountVO>)ois.readObject();
					avo = (AccountVO)ait.next();
					if(ait.next() == null) {
						break;
					}	
					System.out.println(avo.toString());
				}				
			}catch (Exception e) {
				System.out.println(e.toString());
			}
			fis.close();
			ois.close();
		} catch (Exception e) {
			System.out.println("����ڸ� ã������ �����ϴ�.");
		}
	}
 */