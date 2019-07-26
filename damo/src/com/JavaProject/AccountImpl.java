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
				System.out.println("회원정보가 없습니다.");
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
		
		//System.out.println("회원 가입 프로그램입니다");
		System.out.println("회원 정보를 입력하세요 : ");
		System.out.print("사용할 ID 를 입력하세요 : ");
		avo.setId(asc.next());
		System.out.print("사용할 패스워드를 입력하세요 ");
		avo.setPassword(asc.next());
		System.out.print("이름을 입력하세요 : ");
		avo.setName(asc.next());
		System.out.print("나이를 입력하세요 : ");
		avo.setAge(asc.next());
		System.out.print("성별을 입력하세요 : ");
		avo.setGender(asc.next());
		System.out.print("휴대폰 번호를 입력하세요 : ");
		avo.setPhone(asc.next());
		System.out.print("이메일을 입력하세요 : ");
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
			System.out.println("파일이 저장되었습니다. ");
		
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
		
		
		System.out.print("아이디를 입력하세요 : ");
		avo.setId(asc.next());
		System.out.print("패스워드를 입력하세요 : ");
		avo.setPassword(asc.next());
		
		/*
		 * 아이디 체크 
		 * 
		 */
		String checkid;
		String checkpw;
		
		try{
			while(ait.hasNext()) {
				
				if(avo.getId().equals(null)) {
					System.out.println("아이디를 입력하세요");
					continue;
				}
				AccountVO asvo = (AccountVO)ait.next();
				if(asvo.getId() == avo.getId()) {
					checkid = asvo.getId();
				}
			}
		} catch (Exception e) {
			System.out.println("입력한 아이디가 맞지 않습니다. ");
		}
		
	}
		
	
	public void searchAccount() {
		
		String searchname = asc.next();
		System.out.print("찾을 ID를 입력하세요");
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
			System.out.println("사용자를 찾을수가 없습니다.");
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
