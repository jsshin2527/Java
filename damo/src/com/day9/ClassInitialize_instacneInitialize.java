package com.day9;

//�ν��Ͻ� �ʱ�ȭ ��,Ŭ���� �ʱ�ȭ �� ����

/*
 * Ŭ���� �ʱ�ȭ ���� Ŭ������ �޸𸮿� ó�� �ε� �ɶ� �ѹ��� ����Ǹ�,
 * �ν��Ͻ� �ʱ�ȭ ���� �����ڿ� ���� �ν��Ͻ��� ������ �� ���� ����ȴ� 
 * (Ŭ������ ó�� �ε��� �� Ŭ���� �������� �ڵ������� �޸𸮿� ��������� 
 * ��ٷ� Ŭ���� �ʱ�ȭ ���� Ŭ���� �������� �ʱ�ȭ �ϰ� �Ǵ°��̴�. )
 * ���� ����ϴ� ������ �ڵ��� �ߺ��� ���������ν� �ŷڼ��� �����ְ� ������ �߻����ɼ��� �ٿ��ټ� �ֽ��ϴ�. 
 * 
 */

public class ClassInitialize_instacneInitialize {
	
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
	
	public ClassInitialize_instacneInitialize () {
		System.out.println("������ ....");
		C = 100;
		System.out.println("C :" +C);
	}
	
	{ //�ʱ�ȭ �� *�߿�* -> �ν��Ͻ� �ʱ�ȭ ���� ��� ǥ���ϱ⵵ �մϴ�. 
		System.out.println("�ʱ�ȭ �� a: " + a);
		a=10;
		System.out.println("�ʱ�ȭ �� a: " + a);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassInitialize_instacneInitialize ob = new ClassInitialize_instacneInitialize();
		ClassInitialize_instacneInitialize ob1 = new ClassInitialize_instacneInitialize();
		
	}

}
