package com.day5;

import java.util.Scanner;

public class Array_length {

	public static void main(String[] args) {

		//�迭 
		//�迭�� �����̷��� �ݺ����� ���� ���ȴ� 
		
		int num[] = new int [10];
		int[] num1 = new int [5];
		
		//num[0] = 10;
		//int a = num[0];
		//int ������ �迭�� �ʱⰪ�� 0 �Դϴ�. �迭�� �ʱⰪ�� ���ִ�.
		//�迭�� boolean �ڷ����� �ʱⰪ�� false �Դϴ�.
		//new ��� ������ ������ �����Ҷ� ���� �ʱ�ȭ�� �Ǿ��ֽ��ϴ�. 
		/*
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		
		System.out.println("num[0] : "+num[0]);
		System.out.println("num[1] : "+num[1]);
		System.out.println("num[2] : "+num[2]);
		System.out.println("num[3] : "+num[3]);
		System.out.println("num[4] : "+num[4]);
		System.out.println("�迭�� ������ : "+num.length+"�Դϴ�.");
		//length�� ��ȣ�� ���� ***** 
		for(int i=0;i<num.length;i++) {
			System.out.println("num["+i+"] : "+num[i]);
		}
		*
		*
		*/
		Scanner sc = new Scanner(System.in);
		
		for (int i =0;i<num1.length;i++) {
			System.out.print("����"+(i+1)+"����  �Է��ϼ��� : ");
			num1[i] = sc.nextInt();
		}
		for (int i =0;i<num1.length;i++) {
			//System.out.println("num["+i+"] : "+num1[i]);
			System.out.printf("%4d",num1[i]);
		}
		System.out.println("\n������ ���� �迭�� ��µǾ����ϴ�. \n");
		System.out.println("�迭�� ������"+num1.length+"�Դϴ�.");
		
			
	}

}
