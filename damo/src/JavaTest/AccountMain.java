package JavaTest;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {

		AccountImpl aim = new AccountImpl();
		OrderMain omain = new OrderMain();
		Scanner sc = new Scanner(System.in);

		int menu =0;	
		while(true) {

			System.out.println("\n\n      �ؼ������ҿ� ���Ű��� ȯ���մϴ�\n"); 
			//System.out. println("1. ȸ������ \n2. �α��� \n3. �޴� \n4. �ֹ��ϱ� \n5. ���� \n6. ���ݱ��� �ֹ��� ���� ");
			System.out.println("������������������������������������������������");
			System.out.print("���� ȸ������ ���� �α��� ���� �ֹ� ���� ���� ��");
			System.out.println("\n������������������������������������������������");
			System.out.print("\n�޴����� �Է��ϼ��� : ");


			/*
			 * //System.out. System.out.
			 * println("1. ȸ������ \n2. �α��� \n3. �޴� \n4. �ֹ��ϱ� \n5. ���� \n6. ���ݱ��� �ֹ��� ���� ");
			 * System.out.println("=========================================");
			 * System.out.print("1. ȸ������ \n2. �α��� \n3. ȸ��������� \n4.���� \n");
			 * System.out.println("=========================================");
			 * System.out.print("\n�޴��� �Է��ϼ��� : ");
			 */		menu = sc.nextInt();

			switch(menu){

			case 1 :
				aim.input();break; 
			case 2 :	
				aim.login();
				aim.loginidmigration(aim.getloginId());
				if(aim.loginSuccess()) {
					omain.ordermain((aim.loginidmigration(aim.getloginId())));
					break;	
				}else {
					System.out.println("�α��� ����");
					break;
				}
			case 3 :
				aim.output();break; 
		  //case:
		  // aim.MakeCoffee();	
			case 4 :
				System.exit(0);
	
			default:
				System.out.println("�޴��� �ٽ� ���� �ϼ��� ");
			}
		}
	}
}
