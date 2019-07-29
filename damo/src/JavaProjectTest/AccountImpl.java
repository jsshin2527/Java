package JavaProjectTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.DirectoryStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.naming.spi.DirectoryManager;

public class AccountImpl extends AccountVO implements Account{

	private static final long serialVersionUID = 1L;
	
	List<AccountVO> aclists = new ArrayList<>();
	Scanner asc = new Scanner(System.in);
	private String accountfilepath = "C:\\Users\\tb252\\project\\";
	private String accountmanagefilepath = "C:\\Users\\tb252\\project\\account.txt";
	private String accountfilename = null;
	
	private File f;
	private DirectoryStream d;
	public AccountImpl() {
		f = new File(accountmanagefilepath);
	
		try {
			
			if(f.getParentFile().exists()) {
				f.getParentFile().mkdirs();
			}
			
			if(!f.exists()) {
				aclists = new ArrayList<AccountVO>();
				System.out.println("ȸ�� ������ �����ϴ�.");
			}else {
				
				FileInputStream fis = new FileInputStream(accountmanagefilepath);
				ObjectInputStream ois = new ObjectInputStream(fis);
				aclists = (ArrayList<AccountVO>)ois.readObject();	
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	@Override
	public void input() {
		
		List<AccountVO> templist = new ArrayList<AccountVO>();
		AccountVO avo = new AccountVO();
		
		System.out.print("���̵� �Է��ϼ��� : ");
		avo.setId(asc.next());
		System.out.print("�н����带 �Է��ϼ��� : ");
		avo.setPassword(asc.next());
		System.out.print("�̸��� �Է��ϼ��� : ");
		avo.setName(asc.next());
		System.out.print("������ �Է��ϼ��� : ");
		avo.setGender(asc.next());
		System.out.print("���̸� �Է��ϼ��� : ");
		avo.setAge(asc.next());
		System.out.print("�޴�����ȣ�� �Է��ϼ��� : ");
		avo.setPhone(asc.next());
		System.out.print("�̸����� �Է��ϼ���");
		avo.setEmail(asc.next());
		
		aclists.add(avo);
		templist.add(avo);
		filestore(templist);
		accountstore(aclists);
	}

	@Override
	public void filestore(List templist) {
		
		Iterator<AccountVO> tempit = templist.iterator();
		
		while(tempit.hasNext()){
			AccountVO avo = tempit.next();
			accountfilename = avo.getId();
		}
		try {
			FileOutputStream fos = new FileOutputStream(accountfilepath+accountfilename+".txt");
			ObjectOutputStream oss = new ObjectOutputStream(fos);
			oss.writeObject(templist);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}
	@Override
	public void accountstore(List aclists) {
		try {		
			FileOutputStream fos = new FileOutputStream(accountmanagefilepath);
			ObjectOutputStream oss = new ObjectOutputStream(fos);
			oss.writeObject(aclists);
		} catch (Exception e) {
			System.out.println(e.toString());
		}	
	}
	@Override
	public void output() {
		
		Iterator<AccountVO> ait = aclists.iterator();
		while(ait.hasNext()) {
			AccountVO avo = ait.next();
			System.out.println(avo.toString());
		}
	}
	/*
	 * �α����� �ϴ� �޼ҵ� 
	 */
	@Override
	public void login() {
		Iterator<AccountVO> ait = aclists.iterator();
		AccountVO checklogin = new AccountVO();
		System.out.print("���̵� �Է��ϼ��� ");
		checklogin.setId(asc.next());
		System.out.print("�н����带 �Է��ϼ��� ");
		checklogin.setPassword(asc.next());
		
		while(ait.hasNext()) {
			AccountVO avo = ait.next();
			if(avo.getId().equals(checklogin.getId())) {
				System.out.println("���̵� üũ �Ϸ� ");
				if(avo.getPassword().equals(checklogin.getPassword())) {
					System.out.println("��й�ȣ üũ �Ϸ� ");
					System.out.println("�α��εǾ����ϴ�");
				}else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. ");
					continue;
				}
			}else {
				System.out.println("��ġ�ϴ� ���̵� �����ϴ�. ");
				continue;
			}
		}
	}
}
