package com.day4;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//����ڰ�  �Է��� �������� �հ踦 ���Ұ� 
		//1~5000���� �հ踦 ���Ұ� 
		int su,sum1,sum2;
		
		//����� ���ڸ� �Է��� ��쿡�� while���� ���� ���ü� �ִ�.
		//������ �ݴ븦 �־��� 
		do {
			System.out.print("0 �� ���� �׸��� 5000 �̻��� ���� ������ ������ �Է��ϼ��� :");
			su = sc.nextInt();
			if(su<1 ||su>5000) {
				System.out.println("���� �߸� �Է��Ͽ����ϴ�.�ٽ� �Է��� �ּ���:\n");
			}
		}while(su<1 ||su>5000);
		
		//���� Ȱ���Ͽ� �հ� ���ϱ� 
		sum1 = ((su)*(su+1))/2;
		sum2 = 0;
		
		for (int i=0;i<su;i++){
			sum2 += i+1;
		}
		System.out.println("������     Ȱ���� ���� 1����"+su+"������ ���� "+sum1+"�Դϴ�.");
		System.out.println("for���� Ȱ���� ���� 1����"+su+"������ ���� "+sum2+"�Դϴ�.");

		//System.out.println("");
		//1+2+3+4+5 =15
	}

}
