package JavaProjectTest;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ŀ�� �ֹ����α׷��Դϴ�.");
		
		int menu;
		AccountImpl aim = new AccountImpl();
		while(true) {
			
			System.out.println("1. ȸ������ \n2. �α��� \n3. ���� \n4. ȸ�����");
			System.out.print("�޴��� �����ϼ��� ");
			menu = sc.nextInt();
			switch(menu) {
				case 1 :
					aim.input(); break;
				case 2 :
					aim.login(); break;
				case 3 :
					System.exit(0);
				case 4 :
					aim.output();
			}
		}	
	}
}
