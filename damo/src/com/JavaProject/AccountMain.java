package com.JavaProject;

import java.util.Random;
import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		
		String[] seoulcoffee = new String[1558];
		String[] seoulwhere = new String[1558];
		String[] seoulid = new String[1558];
		
		Iloveseoul seoul = new Iloveseoul();
		
		AccountImpl aim = new AccountImpl();
		OrderMain omain = new OrderMain();
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int shopindex;
		shopindex = rd.nextInt(1557);
		seoul.start();
		
		try {
			seoul.join();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		XML_Paring xml = new XML_Paring();
		seoulcoffee = xml.seoulcoffeeparing(seoulcoffee);
		seoulwhere = xml.seoulwhereparing(seoulwhere);
		seoulid  = xml.seoulidparing(seoulid);
		
		int menu =0;

		System.out.println("카페 ID   : "+seoulid[shopindex]);
		System.out.println("카페 이름 : "+seoulcoffee[shopindex]);
		System.out.println("카페 위치 : "+seoulwhere[shopindex]);
		System.out.println();
		//System.out.println(""+"안녕하세요 "+"============");	
		System.out.println("==========안녕하세요 "+seoulcoffee[shopindex]+"입니다.===========");	
		
		while(true) {		
			//System.out. println("1. 회원가입 \n2. 로그인 \n3. 메뉴 \n4. 주문하기 \n5. 종료 \n6. 지금까지 주문한 내용 ");
			System.out.println();
			System.out.println("┌──────┯─────┳────┯────┐");
			System.out.print("│① 회원가입 │② 로그인 │③ 주문 │④ 종료 │");
			System.out.println("\n└──────┻─────┷────┻────┘");
			System.out.print("\n메뉴얼을 입력하세요 : ");
			menu = sc.nextInt();
			switch(menu){
			case 1 :
				aim.input();break; 
			case 2 :	
				aim.login();
				//aim.loginidmigration(aim.getloginId());
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
