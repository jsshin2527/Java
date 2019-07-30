package com.JavaProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class OrderMain {
		
		public OrderMain() {
			
			}
		public void ordermain(String loginid) {
			XML_Paring xml = new XML_Paring();
			Scanner sc = new Scanner(System.in);
			OrderImpl ob = new OrderImpl();
			
			String[] seoulcoffee = new String[1558];
			String[] seoulwhere = 	new String[1558];
			
			//xml.seoulparing(seoulcoffee, seoulwhere);
			
			int ch;
			//System.out.println(seoulcoffee[3]+seoulwhere[3]);
			while(true) {
				do { 				
					System.out.println("┌──────┯──────┐");
					System.out.println("│① 주문하기 │ ② 결제하기│");
					System.out.println("└──────┻──────┘");
					System.out.print("메뉴얼을 선택하세요 : ");
					ch = sc.nextInt();
					
				}while(ch<1);
				
				switch (ch) {
				case 1:
					ob.menu();
					System.out.println();
					ob.order();break;
				case 2:
					break;				
				default:
					System.exit(0);;
				}
		}

	}

}
