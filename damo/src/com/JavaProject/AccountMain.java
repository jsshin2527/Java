package com.JavaProject;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
	
		AccountImpl aim = new AccountImpl();
		OrderMain omain = new OrderMain();
		Scanner sc = new Scanner(System.in);
		
		int menu =0;	
		while(true) {
			
			//System.out.print("1. 회원가입 \n2. 로그인 \n3. 메뉴 \n4. 주문하기 \n5. 종료 \n6. 지금까지 주문한 내용 ");
			System.out.println("=========================================");
			System.out.print("1. 회원가입 \n2. 로그인 \n3. 회원정보출력 \n4.종료 \n");
			System.out.println("=========================================");
			System.out.print("\n메뉴를 입력하세요 : ");
			menu = sc.nextInt();
			
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
					System.out.println("로그인 실패");
					break;
				}
			case 3 :
				aim.output();
			case 4 :
				System.exit(0);
			default:
				System.out.println("메뉴를 다시 선택 하세요 ");
			}
		}
	}
}
