package com.day12;

//UPCAST DOUWNCAST�� ��Ӱ��迡���� ����
//�������� ���帶�� �ڹ�.jsp ~~~.Ȯ���� �������� �������� �ű� �� �� ������ ����ٴ�
//�α��� �� ���� ��� ����ٴϰ� �Ϸ��� UPCAST DOUWNCAST �ʿ�

class TestA{
	
	public void print() {
		System.out.println("A Ŭ����....");
		
	}
}

class TestB{
	
	public void print() {
		System.out.println("B Ŭ����....");
		
	}
}

public class Test6 {

	public static void main(String[] args) {
		
		TestA a = new TestA();
		TestB b = new TestB();
		
		//b=a;
		//�Ϲ� 1:1���迡���� ���� �� ����
		//UPCAST DOUWNCAST�� ��Ӱ��迡���� ����

	}

}
