package com.project3;

//ȸ������ Ŭ����

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Member extends MemberVO {

	private Main main;
	private String id;
	private String password;
	
	private static final long serialVersionUID = 1L;
	
	Scanner sc = new Scanner(System.in);
	List<MemberVO> lists = null;
	File f = new File("C:\\Users\\stu\\Desktop\\member.txt");

	@SuppressWarnings("unchecked")
	public Member() {

		if(f.exists()) {
			
			try {
				if(!f.getParentFile().exists()) {
				f.getParentFile().mkdirs();
				}
				if(!f.exists()) {
					lists = new ArrayList<MemberVO>();
					System.out.println("ȸ�������� �����ϴ�.");
				}else{
					FileInputStream fis = new FileInputStream(f);
					ObjectInputStream ois = new ObjectInputStream(fis);
					lists = (ArrayList<MemberVO>)ois.readObject();
				}
			}catch(Exception e) {
				//System.out.println(e.toString());
			}
		}
	}

	public void input() {
		
		MemberVO vo = new MemberVO();
		System.out.println("\nȸ������ ������ �Դϴ�");
	
		System.out.print("���̵�: ");
		vo.setId(sc.next());
		
		if(!OverlapID(vo)){
			System.out.println("�ߺ��� �� ���̵� �ֽ��ϴ�.");
			System.out.println("�ٸ� ���̵� �Է��ϼ���");
			return;
		}
		
		System.out.print("��й�ȣ: ");
		vo.setPassword(sc.next());
		System.out.print("�̸�: ");
		vo.setName(sc.next());

		if(lists==null) {
			lists = new ArrayList<MemberVO>();
		}
		lists.add(vo);
		System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
		//filestore(lists);
		
	}
	/*
	public void filestore(List lists) {
		
		Iterator it =  lists.iterator();
		MemberVO vo = (MemberVO)it.next();
		String str = vo.getId(); 
		try{	
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(lists);
			System.out.println("������ ����Ǿ����ϴ�. ");
		
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	*/
	public void output() {
		
		Iterator<MemberVO> it = lists.iterator();
		try {
			while(it.hasNext()) {	
				MemberVO vo = it.next();	
			}	
		} catch (Exception e) {
		
		}
	}

	public void save() {

		try {
			if(lists!=null) {
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);

				oos.writeObject(lists);
				fos.close();
				oos.close();
			}
			//System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
			
		} catch (Exception e) {
			
		} 
		System.out.println();
	}
	
	public boolean OverlapID(MemberVO vo) {

		try {
			Iterator<MemberVO> it = lists.iterator();
			
			while(it.hasNext()) {	
				MemberVO checkid = it.next();
				if(checkid.getId().equals(vo.getId())) {
					return false;
				}
			}
			
		}catch (Exception e) {
			
		}
		return true;
	}
	
	public void login() {

		MemberVO vo = new MemberVO(); 

		System.out.print("���̵�: "); 
		id = sc.next();

		System.out.print("��й�ȣ: ");
		password = sc.next();
		
	}
	
	@SuppressWarnings("static-access")
	public void check() {
		
		int num=0;

		try {

			Iterator<MemberVO> it = lists.iterator(); 

			while (it.hasNext()) {
				MemberVO vo = it.next();
				
				if(  vo.getId().equals(id) && vo.getPassword().equals(password) ) {
					System.out.println("�α��� ����!\n");
					main = new Main(vo.getId());
					main.main(null);
					return;
				}else if ( vo.getId().equals(id) && !vo.getPassword().equals(password) ) {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}else {
					num ++;
				}
			}
			if(num== lists.size()) {
				System.out.println("�������� �ʴ� ���̵� �Դϴ�");
			}
			
		} catch (Exception e) {
			
		}
		System.out.println();
	}
}