package com.JavaProject;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
	
		AccountImpl aim = new AccountImpl();
		
		
		Scanner sc = new Scanner(System.in);
	
			
		int menu =0;
		
		System.out.println("로그인 프로그램 테스트 ");
		
		while(true) {
			
			System.out.print("1. 회원가입 \n2. 회원출력 \n3. 로그인 \n4. 회원 검색 \n5. 종료");
			System.out.print("\n메뉴를 입력하세요 : ");
			menu = sc.nextInt();
			
			switch(menu){
				
			case 1 :
				aim.input();break;
			//현재 모든 회원을 출력하는 메뉴 
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
