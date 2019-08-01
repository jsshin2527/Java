package com.project3;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//�α��� ������ LoginView

public class Login {
	
	Scanner sc = new Scanner(System.in);
	List<MemberVO> lists = null;
	
	File f = new File("C:\\Users\\stu\\Desktop\\member.txt");
	
	@SuppressWarnings("unchecked")
	public Login() {
		
		if(f.exists()) {
			
			try {
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				lists = new ArrayList<MemberVO>();  
				lists = (List<MemberVO>) ois.readObject();
				
				fis.close();
				ois.close();
				
			} catch (Exception e) {
			
			}
			
		} else {
			lists = new ArrayList<MemberVO>();
			System.out.println("������ ȸ���� �����ϴ�");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Member ob = new Member();
		int ch;

		try {
			while(true) {
				
				do {
					System.out.println("  ����������������������������������������������");
					System.out.println("  ��                                          ��");
					System.out.println("  ��      1.�α���  2.ȸ������  3.����        ��");
					System.out.println("  ��                                          ��");
					System.out.println("  ����������������������������������������������");
					System.out.print("    => ");
					//System.out.println("*****������ ���忡 ���Ű� ȯ���մϴ�*****");
					//System.out.print("1.�α��� 2.ȸ������ 3.���� => ");
					ch = sc.nextInt();
				}while(ch<1 || ch>3);
				
				switch(ch) {
					
					case 1:
						ob.login(); ob.check(); break;
					case 2:
						ob.input(); ob.output(); ob.save(); break;
					default:
						System.out.println("\n���α׷��� �����մϴ�!"); System.exit(0);
				}
			}
			
		} catch (Exception e) {
			
		}
		
	}
}
