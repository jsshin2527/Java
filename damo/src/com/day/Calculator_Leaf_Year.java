/*
 	BufferedReader Ŭ������ �̿��Ͽ� 2���� ���ڸ� �Է¹޾� ���� ���α׷��� ������ ����ϴ� ���α׷� 

	java.lang �̶�� ���� ���󵵼��� ���� Ŭ�������� �̹� �޸� �� �ö� �ִ� 

	���� ���� import�� �����ʾƵ� ����Ҽ� �ִ�.
	
*/
package com.day;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;

class Calculator_Leaf_Year 

{
	public static void main(String[] args) throws IOException
	
	{
		BufferedReader test8 = new BufferedReader (new InputStreamReader(System.in));
		
		int num1,num2;

		System.out.print("ù��° ���� �Է� �ϼ��� : ");

		num1 = Integer.parseInt(test8.readLine());
		
		//num1 = test8.readLine();
		
		System.out.print("�ι�° ���� �Է� �ϼ��� : ");

		num2 = Integer.parseInt(test8.readLine());
		
		System.out.printf("%d + %d = %d �Դϴ�. \t",num1,num2,num1+num2);
		System.out.printf("%d - %d = %d �Դϴ�. \n",num1,num2,num1-num2);
		System.out.printf("%d * %d = %d �Դϴ�. \t",num1,num2,num1*num2);
		System.out.printf("%d / %d = %d �Դϴ�. \n",num1,num2,num1/num2);
		System.out.printf("%d %% %d = %d �Դϴ�. \n",num1,num2,num1%num2);
		//���ڸ� ��ȣ�� �ε�ȣ�� ���ϸ� true.false �� �����ȴ�.
		System.out.println("num1>num2 : "+(num1>num2)+"�Դϴ�. \n");
		//���ڸ� ������ �ִ� ����
		System.out.print("String ���ڸ� ������ �ִ� ����\n1");
		String str;
		// == ���� ������ 
		// ���� ������ 
		str = num1%2==0?"¦��":"Ȧ��";
		System.out.println("num1 �� �ִ� ���� : "+str);
		str = num1>0?"���":(num1<0?"����":"��");
		System.out.println("num1 �� �ִ� ���� : "+str);

		//���� ���ϴ� ���� 
		str = num1%4==0&&num1%100!=0 || num1%400==0? "����":"���";
		System.out.println("num1 �� �ִ� ���� : "+str);
		// A and B(&&)
		// A �� true B �� true
		// A  or B(||)
		// A�� true �̰ų� B�� true �̸� (���� �ϳ��� true�̸�) 
	}
}
