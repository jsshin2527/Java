package com.day4;

import java.util.Scanner;;

// �ټ����� ���� �Է� �޾� �߰����� ���ϴ� ���α׷� 

public class Midvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�ټ����� ���� �Է� �޾� �߰����� ���ϴ� ���α׷� ");
		// num�迭 5���� �����Ѵ�,
		int num[] = new int[5];
		int num1[] = new int[5];
		for(int i=0;i<5;i++) {
			System.out.printf("%d���� ������ �Է��ϼ��� : ",i+1);
			num[i] = sc.nextInt();
		}
		
		System.out.println("���� ���� �Է� �޾ҽ��ϴ�. ");
		
		for(int i=0;i<5;i++) {
			System.out.printf("%4d",num[i]);
		}
		
		//�Է°� Ȯ�� 
		System.out.println();
		System.out.println("������ �����ϰڽ��ϴ�.");
		int max = 0;
		for(int i =0;i<5;i++){
			for(int j =0;j<5-i;j++){
				if( max < num[j]) {
					num1[4-i] = num[j];
				}
			
			}	
		}
		for(int i=0;i<5;i++) {
			System.out.printf("%4d",num1[i]);
		}
	}

}
