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

public class AccountImpl extends AccountVO implements Account{

	private static final long serialVersionUID = 1L;

	List<AccountVO> aclists = new ArrayList<>();
	Scanner asc = new Scanner(System.in);
	private String accountfilepath = "d:\\project\\"; 
	private String accountfilename = null;
	private String accountmanagefilepath = "d:\\project\\account.txt";
	private File f;
	
	public AccountImpl() {
		f = new File(accountmanagefilepath);
		
		try {
			if(f.getParentFile().exists()) {
				f.getParentFile().mkdirs();
			}
			if(!f.exists()) {
				aclists = new ArrayList<AccountVO>();
				System.out.println("ȸ�������� �����ϴ�.");
			}else{
				
				//aclists = new ArrayList<AccountVO>();
				FileInputStream fis = new FileInputStream(accountmanagefilepath);
				ObjectInputStream ois = new ObjectInputStream(fis);
				aclists = (List<AccountVO>)ois.readObject();
			}
		}catch(Exception e) {
			
		}
	}
	@Override
	public void input() {
		
		AccountVO avo = new AccountVO();
		List<AccountVO> templists = new ArrayList<AccountVO>();
		
		//System.out.println("ȸ�� ���� ���α׷��Դϴ�");
		System.out.println("ȸ�� ������ �Է��ϼ��� : ");
		System.out.print("����� ID �� �Է��ϼ��� : ");
		avo.setId(asc.next());
		System.out.print("����� �н����带 �Է��ϼ��� ");
		avo.setPassword(asc.next());
		System.out.print("�̸��� �Է��ϼ��� : ");
		avo.setName(asc.next());
		System.out.print("���̸� �Է��ϼ��� : ");
		avo.setAge(asc.next());
		System.out.print("������ �Է��ϼ��� : ");
		avo.setGender(asc.next());
		System.out.print("�޴��� ��ȣ�� �Է��ϼ��� : ");
		avo.setPhone(asc.next());
		System.out.print("�̸����� �Է��ϼ��� : ");
		avo.setEmail(asc.next());
		templists.add(avo);
		aclists.add(avo);
		filestore(templists);
		accountstore(aclists);
	}
	@Override
	public void filestore(List templists) {
		
		Iterator ait =  templists.iterator();
		AccountVO avo = (AccountVO)ait.next();
		accountfilename = avo.getId(); 
		try{	
			FileOutputStream fos = new FileOutputStream(accountfilepath+accountfilename+".txt");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(aclists);
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
		
		/*
		 * ���̵� üũ 
		 * 
		 */
		String checkid;
		String checkpw;
		
		try{
			while(ait.hasNext()) {
				
				if(avo.getId().equals(null)) {
					System.out.println("���̵� �Է��ϼ���");
					continue;
				}
				AccountVO asvo = (AccountVO)ait.next();
				if(asvo.getId() == avo.getId()) {
					checkid = asvo.getId();
				}
			}
		} catch (Exception e) {
			System.out.println("�Է��� ���̵� ���� �ʽ��ϴ�. ");
		}
		
	}
		
	
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
	@Override
	public void accountstore(List aclists) {

		Iterator ait =  aclists.iterator();
		AccountVO avo = (AccountVO)ait.next();
		
		try{	
			FileOutputStream fos = new FileOutputStream(accountmanagefilepath);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(aclists);
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}	
}
