/*
 * 2.�� ���� ������ �Է� �ް�, ū ���ڿ� ���� ���ڸ� �����ؼ� ���.(if�� �̿�)
	 20, 30 �Է½� -> ū ���� 30, ���� ���� 20

 */
package com.day4;

import java.util.Scanner;

public class TwoNumber_Min_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		System.out.println("�ΰ��� ���� ���Ͽ� ū�� ������ ����ϴ� ���α׷� �Դϴ�.");
		System.out.print("���� 1�� �Է��ϼ��� : ");
		num1 = sc.nextInt();
		System.out.print("���� 2�� �Է��ϼ��� : ");
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1+"�� "+num2+"���� ū ���� �Դϴ�.");
			System.out.println("ū���� : "+num1+", ���� ���� :"+num2);
		}else if (num1 < num2) {
			System.out.println(num1+"�� "+num2+"���� ���� ���� �Դϴ�.");
			System.out.println("ū���� : "+num2+",���� ���� :"+num1);
		}else {
			System.out.println("�ΰ��� ���ڴ� �����ϴ�.");
		}
		
	}
}
