package com.project2;

import java.util.Scanner;

public class SirenOrderOhShitMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SirenOrderOhShitImple ob = new SirenOrderOhShitImple();

		int number;

		SirenorderThread1 st1 = new SirenorderThread1();
		
		st1.SirenorderThread1();
		
		try {
			
			while (true) {

				System.out.println("                      1. Order From Angel Inner Wear Cafe\n\n                      2. Exit");
				
				number = sc.nextInt();
				
					switch (number) {

					case 1:
						ob.input();
						break;

					case 2:
						ob.print();
						System.exit(0);
						break;
						
					default: 
						
						System.out.println("                             You Got A Wrong Number");
						System.out.println();
					
				}
				
				}
			
		} catch (Exception e) {
			
		}
		
		
		}
	}
