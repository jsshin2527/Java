package com.project3;

import java.util.Scanner;


public class BoardMain {
	
	public static String id ="";
	
	public BoardMain(String id) {
		
		this.id = id;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		BoardImpl ob = new BoardImpl();
		
		int ch;
		
		try {	
			while(true) {
				
				System.out.println("\n----------------------  �Խ���  ----------------------");
				
				ob.print();
				
				do {
					System.out.print("\n1.�Խù� ��� 2.�Խù� �˻� 3.����ȭ�� => ");
					ch = sc.nextInt();
				}while(ch<1 || ch>4);
				
				switch(ch) {
				case 1:
					ob.input(id);
					ob.save();
					break;
				case 2:
					ob.findBoard();
					break;
				default:
					Main.main(args);
				}
			}
			
		} catch (Exception e) {
			
		}
	}
}
