package com.day4;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ���� �Է¹޾� ���� ������ ū ���� ���
		// ����
		Scanner sc = new Scanner(System.in);

		int num1, num2, num3, temp;

		// �Է�

		System.out.print("������ ��? ");// 9 6 2
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		/*
		 * //���� if(num1>num2) { temp=num1; num1=num2; num2=temp;
		 * 
		 * }if(num2>num3) { temp=num2; num2=num3; num3=temp;
		 * 
		 * }if(num1>num2) { temp=num1; num1=num2; num2=temp; }
		 * 
		 * 
		 */
		// ���
		System.out.printf("%d %d %d", num1, num2, num3);

	}

}
