package com.JavaProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class OrderMain {
		
		public OrderMain() {
			
			}
		public void ordermain(String loginid) {
			
			Scanner sc = new Scanner(System.in);
			OrderImpl ob = new OrderImpl();
			
			int ch;
			
			while(true) {
				do { 
					System.out.print("1. �ֹ��ϱ� \n2. �����ϱ� ");
					System.out.print("\n�޴��� �����ϼ���  : ");
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
