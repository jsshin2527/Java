package com.score4;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		
		// ���� �����ö��� getter 
		// ���� ���� �Ҷ��� setter �Դϴ�. 
		Scanner sc = new Scanner(System.in);
		
		ScoreImpl ob = new ScoreImpl();
		/*
		ob.input();
		ob.print(); //1���� �����͸� �����ݴϴ�. 		
		*/
		int ch;
		
		while(true) {	
			do{
				System.out.println();
				System.out.print("1. �Է� \n2. ��� \n3. ���� \n4. ����  \n5. �й��˻� \n6. �̸��˻� \n7. ����: \n");
				System.out.println();
				System.out.print("�޴����� �����ϼ��� ");
				
				ch = sc.nextInt();
			
			}while(ch<1);
			
			switch(ch) {
			case 1 :
				ob.input(); break;
			case 2 : 
				ob.print(); break;
			case 3 :
				ob.delete();break;
			case 4 :		
				ob.updata();break;
			case 5 : 
				ob.findHak();break;
			case 6 : 
				ob.findName();break;
			default:
				System.exit(0); //���Ḧ ������ �ִ� ������ 
			}
		}
	}
}
