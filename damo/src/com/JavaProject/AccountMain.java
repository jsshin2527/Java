package com.JavaProject;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
	
		AccountImpl aim = new AccountImpl();
		
		
		Scanner sc = new Scanner(System.in);
	
			
		int menu =0;
		
		System.out.println("�α��� ���α׷� �׽�Ʈ ");
		
		while(true) {
			
			System.out.print("1. ȸ������ \n2. ȸ����� \n3. �α��� \n4. ȸ�� �˻� \n5. ����");
			System.out.print("\n�޴��� �Է��ϼ��� : ");
			menu = sc.nextInt();
			
			switch(menu){
				
			case 1 :
				aim.input();break;
			//���� ��� ȸ���� ����ϴ� �޴� 
			case 2 :
				aim.output();break;
			case 3 :
				aim.login();break;
			case 4 :
				aim.searchAccount();break;
			case 5 :
				System.exit(0);
			}
			
		}
		
	}

}
