package com.day12;


class SuperClass{
	protected int a=10,b=20;
	
	public void write() {
		System.out.println("Super Class write () ... ");
		System.out.println("a : "+a+", b "+b);
		
	}
}

class SubClass extends SuperClass{
	
	protected int b = 30,c=40;
	//�⺻�����ڰ� ���ϸ������� ������ �ȴ� 
	//�⺻�����ڿ���  super �� �����ֽ��ϴ�. 
	
	@Override
	public void write() {
		System.out.println("Sub Class write() ...");
		System.out.println("a : "+a+", b "+b+", c "+c);
		System.out.println("super.b : " + super.b); //�θ��� ������ ��´� 
		// a ���  b �� �ڽ� Ŭ���� ���� ��� c�� �ڽ� Ŭ���� ���� ��� 
		super.write();
	}
	
	public void print1() {
		System.out.println("sub class print1() : write ȣ�� ");
		write();
	}
	public void print2() {
		System.out.println("sub class print2() : write ȣ�� ");
		super.write();;
	}
}

public class JavaMethod_Secuity_TypeChang {
	
	public static void main(String[] args) {
		
		SubClass ob = new SubClass();
		//ob.write();
		//ob.print1();
		ob.print2();
		// main�� �θ� Ŭ������ Object �̹Ƿ� super.write() ����Ҽ� ���� 
		// �θ� ������ �ְ� ���� ������ �ִٸ� ������ ����մϴ�. 
		System.out.println("ob.b : "+ob.b);
		
		//UPCAST�� ���� 
		System.out.println("((SuperClass)ob).b : " + ((SuperClass)ob).b);
		//�θ�� �ڱ���� ������ �����ϴ�. 
		//System.out.println("((SuperClass)ob).b : " + ((SuperClass)ob).c);
		
		System.out.println("-----------------------------------------");
		((SuperClass)ob).write();
	}
}
