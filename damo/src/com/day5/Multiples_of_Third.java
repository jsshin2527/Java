package com.day5;

/*
 * 1���� 100������ ���� 3�� ����� ����
 */

public class Multiples_of_Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,result=0;
		int array[] = new int[100];
		
		for(i=0;i<array.length;i++) {
			array[i] = i+1;
		}
		
		result = array.length/3;
		System.out.println("1���� 100������ ���� 3�� ����� ���� : "+result+" �Դϴ�.");
	}

}
