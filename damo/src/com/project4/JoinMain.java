package com.project4;

import java.util.Scanner;

public class JoinMain {

	public static void main(String[] args) throws Exception {
		
		int ch;
		
		JoinImpl ob = new JoinImpl();
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{

			do {
				System.out.print("\t┌━━━━━━━━━┐\n");
				System.out.print("\t│       ■■       ┃\n");
				System.out.print("\t│       ■■       ┃\n");
				System.out.print("\t│       ■■       ┃\n");
				System.out.print("\t│ ■■■■■■■■ ┃\n");
				System.out.print("\t│ ■■■■■■■■ ┃\n");
				System.out.print("\t│       ■■       ┃\n");
				System.out.print("\t│       ■■       ┃\n");
				System.out.print("\t│       ■■       ┃\n");
				System.out.print("\t└━━━━━━━━━┘\n");
				
				
				System.out.println("-----------------------------------------");
				System.out.println("       welcome to It Will`s Hospital");
				System.out.println("-----------------------------------------");
				System.out.print("       1.회원가입       2.로그인\n▷");
				ch = sc.nextInt();
			} while (ch < 1);

			switch (ch) {
			case 1:
				ob.join();
				break;
			case 2:
				ob.login();
				break;
			
				}
			}
	}

}
