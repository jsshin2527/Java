package com.project3;

import java.io.IOException;
import java.util.Scanner;

public class MyRefMain {
	
	public static String id ="";
	
	public MyRefMain(String id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}
	

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		MyRef ob = new MyRef(id);
		
		int n;
		
		while(true)	{

			do {
				System.out.println("\n-------------------  ���� �����  -------------------");
				System.out.print("1.����Է� 2.������ 3.������� 4.����ȭ�� => ");
				n = sc.nextInt();
			}while(n<1 || n>4);

			switch(n) {
				case 1: 
					ob.input();
					break;
				case 2: 
					ob.delete();
					break;
				case 3:
					ob.print();
					break;
				default:
					Main.main(args);
					break;
			}
		}
	}
}
