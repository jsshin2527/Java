package com.day5;

import java.util.Scanner;

public class TwoNumSmallBigSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2,max,min,sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1�� �Է��ϼ��� : ");
		num1 = sc.nextInt();
		System.out.print("����2�� �Է��ϼ��� : ");
		num2 = sc.nextInt();
		
		if(num1>num2) {
			
			max = num1;
		}else {
			max = num2;
		}
		if(num1<num2) {
			
			min = num1;
		}else {
			min = num2;
		}
		
		System.out.println("�μ��� ū���ڴ�"+max+"�Դϴ�.");
		System.out.println("�μ��� �������ڴ�"+min+"�Դϴ�.");		
		
		for(int i = min ; i<=max ; i++) {
			sum += i;
		}
		
		System.out.printf("%d �� %d�� ������ ���ڵ��� ���� : %d �Դϴ�",min,max,sum);
	}

}
