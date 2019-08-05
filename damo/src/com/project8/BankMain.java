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
			
		System.out.println("                           ┌==================┐");
		System.out.print(  "                           │   판도라  뱅크   │\n");
		System.out.println("                           ┗==================┘");
 
		
		
		
		
		
		try {
			int ch;

			do {
		    	System.out.println("                ┌==================┐┌=================┐");
				System.out.print(  "                │    1.로그인      ││    2.회원가입   │\n");
				System.out.println("                ┗==================┘┗=================┘");
				System.out.print("      ┌==============┐\n");
				System.out.print("      │원하시는 업무:│\n");	
				System.out.print("      ┗==============┘");


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
				System.out.println("                ┌===========┐┌===========┐┌===========┐");
				System.out.println("                │   1.예금  ││  2.출금   ││  3.이체   │");
				System.out.println("                ┗===========┘┗===========┘┗===========┘");
			
				System.out.println("                ┌===========┐┌===========┐┌===========┐");
				System.out.println("                │ 4.잔액조회││5.계좌삭제 ││  6.종료   │");
				System.out.println("                ┗===========┘┗===========┘┗===========┘");
				
				System.out.println("                                                                    ");
				System.out.println("                                                                    ");
				//System.out.println("                                                                    ");
				//System.out.println("                                                                    ");

				
				System.out.print("      ┌==============┐\n");
				System.out.print("      │원하시는 업무:│\n");	
				System.out.print("      ┗==============┘");

			    ch = sc.nextInt();


				switch(ch) {

				case 1:
					ob.deposit(voo); //예금하기
					break;
				case 2:
					ob.withdraw(voo); break; //인출
				case 3:
					ob.transfer(voo); break; //이체
				case 4:
					ob.searchbal(voo); break; //개인 거래내역 및 잔액조회
					
				case 5:
					ob.delete(); break; // 계좌삭제
					
				default:
					
					t2.start();
					try {
						t2.join();
					} catch (Exception e) {
						
					}
					
					System.exit(0); //종료
				
				case 7:
					ob.print(); break; // 전체 회원정보 


				}
			}

		} catch (Exception e) {

		}


	}
	
}
	

