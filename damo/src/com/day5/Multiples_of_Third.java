package com.day5;

/*
 * 1���� 100������ ���� 3�� ����� ����
 */

public class Multiples_of_Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,count=0;
		
		//�迭 ���� 
		int array[] = new int[100];
		
		for(i=0;i<array.length;i++) {
		
			array[i] = i+1;
		}
		//3�� ��� ���� ���ϱ� = (3�� ����� ���ϰ��� �ϴ� ����)/3
		count = array.length/3;
		
		System.out.println("1���� 100������ ���� 3�� ����� ���� : "+count+" �Դϴ�.");
	}

}
