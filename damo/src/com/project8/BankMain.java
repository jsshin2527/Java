package com.project8;

import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;



public class BankMain implements Serializable {

	private static final long serialVersionUID = 1L;


	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		BankImpl ob = new BankImpl();
		
		
		BankLogo bl=new BankLogo();
		
		Thread t1 = new Thread(bl);
		
		t1.start();

		try {
			
			t1.join();
			
		} catch (Exception e) {
			
		}
	
		END end = new END();
		Thread t2 = new Thread(end);




		String ano = null;
		int bal=0;

		BankVO voo = null;
		System.out.println("                                                 ");
		System.out.println("                                                 ");
		System.out.println("                                                 ");
		System.out.println("                                                 ");
			
		System.out.println("                           ��==================��");
		System.out.print(  "                           ��   �ǵ���  ��ũ   ��\n");
		System.out.println("                           ��==================��");
 
		
		
		
		
		
		try {
			int ch;

			do {
		    	System.out.println("                ��==================����=================��");
				System.out.print(  "                ��    1.�α���      ����    2.ȸ������   ��\n");
				System.out.println("                ��==================����=================��");
				System.out.print("      ��==============��\n");
				System.out.print("      �����Ͻô� ����:��\n");	
				System.out.print("      ��==============��");


				ch = sc.nextInt();

			} while (1>ch||ch>2);

			//String addre="";
			switch(ch) {

			case 1:
				voo=ob.logIn(); 

				break;

			case 2:
				voo=ob.input(); 
				
				break;
			}


		} catch (Exception e) {

		}



		try {

			int ch;
			while(true) {

				
				System.out.println("                                                                  ");
				System.out.println("                                                                  ");
				System.out.println("                                                                  ");
				System.out.println("                                                                  ");
				System.out.println("                ��===========����===========����===========��");
				System.out.println("                ��   1.����  ����  2.���   ����  3.��ü   ��");
				System.out.println("                ��===========����===========����===========��");
			
				System.out.println("                ��===========����===========����===========��");
				System.out.println("                �� 4.�ܾ���ȸ����5.���»��� ����  6.����   ��");
				System.out.println("                ��===========����===========����===========��");
				
				System.out.println("                                                                    ");
				System.out.println("                                                                    ");
				//System.out.println("                                                                    ");
				//System.out.println("                                                                    ");

				
				System.out.print("      ��==============��\n");
				System.out.print("      �����Ͻô� ����:��\n");	
				System.out.print("      ��==============��");

			    ch = sc.nextInt();


				switch(ch) {

				case 1:
					ob.deposit(voo); //�����ϱ�
					break;
				case 2:
					ob.withdraw(voo); break; //����
				case 3:
					ob.transfer(voo); break; //��ü
				case 4:
					ob.searchbal(voo); break; //���� �ŷ����� �� �ܾ���ȸ
					
				case 5:
					ob.delete(); break; // ���»���
					
				default:
					
					t2.start();
					try {
						t2.join();
					} catch (Exception e) {
						
					}
					
					System.exit(0); //����
				
				case 7:
					ob.print(); break; // ��ü ȸ������ 


				}
			}

		} catch (Exception e) {

		}


	}
	
}
	

