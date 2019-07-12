package com.day12;

//UPCAST DOUWNCAST�� ��Ӱ��迡���� ����
//�������� ���帶�� �ڹ�.jsp ~~~.Ȯ���� �������� �������� �ű� �� �� ������ ����ٴ�
//�α��� �� ���� ��� ����ٴϰ� �Ϸ��� UPCAST DOUWNCAST �ʿ�

class TestA{
	public void print() {
		System.out.println("A Ŭ����....");
	}
}

class TestB extends TestA{
	public void print() {
		System.out.println("B Ŭ����....");
	}
}

public class UpCasting_DownCasting {

	public static void main(String[] args) {
		
		TestA a = new TestA();
		TestB b = new TestB();
		
		//b=a;
		//�Ϲ� 1:1���迡���� ���� �� ����
		//UPCAST DOUWNCAST�� ��Ӱ��迡���� ����
		//Test
		//TestB�� TestA�� ��ӹް� �ֽ��ϴ�. 
		//TestA �θ� TestB �ڽ� 
		// upcasting 
		// 
		// �� ��ȯ �Ҷ� upcasting �� �ϴ°ܿ� 
		/*
	       �θ� = �ڽ�; - �ڽ��� �θ�� �ٲپ� ���´�  UPCAST
		   �θ� = (�θ�)�ڽ�  - UPCAST 
		   �ڽ� = �θ�; 	  - X (�ȵ�)
		   �ڽ� = (�ڽ�)�θ�; - DOWNCAST
		*/
		 int i =3;
		 double j =5.20;
		 i=(int)j; // ū�� (�θ�)���� ���� ����(�θ�)�� ������ ����� ����ȯ�� ����ؾ��մϴ�.
		 j=i;	   // ���� (�ڽ�)���� ū ������ ������ �� ������ ���� �� �ʿ�� �����ϴ�. 
		//upcasting 
		a=b; //���� ���� ��� ���� �ʾƵ� �˴ϴ�. 
		//downcasting 
		b=(TestB)a;  
	
		
	}
}
