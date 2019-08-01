package com.project3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static String id ="";
	
	public Main() throws IOException {
		main(null);
	}

	public Main(String id) throws IOException {
		
		//System.out.println("-------------------------------------------------");
		this.id = id;
		System.out.println(id + "님 환영합니다\n");
		
		MyRef ob = new MyRef(id);
		ob.compare();

		main(null);
	}

	public static void main(String[] args) throws IOException {

		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		while(true)	{

			do {
				System.out.println("┌───────────────────────────┐");
				System.out.println("│                                                      │");
				System.out.println("│   ******   레시피 월드에 오신걸 환영합니다   ******  │");
				System.out.println("│                                                      │");
				System.out.println("│                                                      │");
				System.out.println("│     1.나의 냉장고  2.레시피 검색  3.식재료 쇼핑      │");
				System.out.println("│                                                      │");
				System.out.println("│          4.장바구니  5.게시판  6.로그아웃            │");
				System.out.println("│                                                      │");
				System.out.println("└───────────────────────────┘");
				System.out.print("    => ");
				
				//System.out.println("*****레시피 월드에 오신걸 환영합니다*****");
				//System.out.print("1.나의 냉장고 2.레시피 검색 3.식재료 쇼핑\n" + "4.장바구니 5.게시판 6.로그아웃 => ");
				n = sc.nextInt();
			}while(n<1||n>6);

			switch(n) {

			case 1: {
				MyRefMain ob1 = new MyRefMain(id);
				ob1.main(args); 
				break;
				}
			case 2: 
				Recipe_name.main(args);
				break;
			case 3: {
				Market m = new Market(id);
				m.main(null);				
				break;
			}
			case 4: Cart c = new Cart(id); break;
			case 5:
				BoardMain b = new BoardMain(id);
				b.main(null);
				break;
			case 6: 
				System.out.println("로그아웃 되었습니다!");
				System.out.println();
				Login l = new Login();
				l.main(null);
				break;
			}
		}
	}
}
