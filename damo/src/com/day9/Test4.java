package com.day9;

//�ν��Ͻ� �ʱ�ȭ ��,Ŭ���� �ʱ�ȭ �� ����  

public class Test4 {
	
	int a = 5;
	
	static int b;
	
	static { //static ��  �˾Ƽ� �޸� �� ���簡 �˴ϴ�. 
	
		b = 10;
		System.out.println("static �� b: " + b);
		
	}
	// ��� ���� �ѹ� ���� ���� ������ �Ǹ� ���� �ٲܼ� �����ϴ�. 
	// final ���� ����� �Ҷ��� �� �ʱ�ȭ�� ����� �մϴ�. 
	// ����� ���� �빮�ڷ� ����� �˴ϴ�. 
	
	final int C ; //���
	
	public Test4 () {
		System.out.println("������ ....");
		C = 100;
		System.out.println("C :" +C);
	}
	
	{ //�ʱ�ȭ �� *�߿�*
		System.out.println("�ʱ�ȭ �� a: " + a);
		a=10;
		System.out.println("�ʱ�ȭ �� a: " + a);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test4 ob = new Test4();
		Test4 ob1 = new Test4();
		
	}

}
