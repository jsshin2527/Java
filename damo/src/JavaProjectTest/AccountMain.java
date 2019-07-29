package JavaProjectTest;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("커피 주문프로그램입니다.");
		
		int menu;
		AccountImpl aim = new AccountImpl();
		while(true) {
			
			System.out.println("1. 회원가입 \n2. 로그인 \n3. 종료 \n4. 회원출력");
			System.out.print("메뉴를 선택하세요 ");
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
