package com.day5;

import java.util.Scanner;

public class Switch_Example {

	public static void main(String[] args) {
		
		
		//switch �� ���� 
		
		// default �� �ش� case ���� ��Ī�� �ȵǸ� ����Ǵ� ����� �Դϴ�. 
		//
		
		Scanner sc = new Scanner(System.in);
		
		int su;
		
		System.out.print("1~3�̳��� �� ? : "); //1,2,3
		
		su = sc.nextInt();
		
		//jdk 7 ������ String �� ������ �������� 
		//jdk 8 ������ ��� Ÿ���� �������� ����Ҽ� �ֽ��ϴ�.
		
		switch(su){
		
		case 3: 
			System.out.println("***");
			break;
		case 2:
			System.out.println("**");
			break;
		case 1:
			System.out.println("*");
			break;
		default:
			System.out.println("�����Է� ���� !!");
		}
	}
}
