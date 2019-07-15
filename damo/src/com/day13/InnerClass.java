/*
 * Inner Class
 * Ŭ���� �ȿ� Ŭ���� 
 * 
 */
package com.day13;

class Outer1{
	static int a=10;
	int b = 20;
	
	//Outer�� ��ü�����Ǿ��ٰ� Inner�� ������ �Ȱ��� �ƴϴ� 
	//Inner�� ����Ϸ��� Outer�� ��ü�� �����ؾ� �Ѵ�.
	//OuterClass ������ InnerClass�� �����մϴ�. 
	//Outer�� inner�� �����ϴ� ����� �ֽ��ϴ�. 
	//NetstedClass
	//class�� class �ȿ� ȭ���� ����� �ֽ��ϴ�. 
	//�޼ҵ� �ȿ� Ŭ������ ����� ��쵵 �ֽ��ϴ�. (Local method)
	//
	
	public class Inner1{ //Ŭ���� �ȿ� Ŭ���� : Ŭ������ ���� �� ����� �ֽ��ϴ�.  �޼ҵ� �ȿ����� ���� ���� 
		
		int c = 30;
		
		public void write() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		
	}
	
	public void print() {
		//Inner ��ü�� ���� 
		Inner1 ob = new Inner1();
		ob.write();
	}
}

public class InnerClass {

	public static void main(String[] args) {

		// inner class �� �ҷ����� ��� 1
		Outer1 out = new Outer1();
		out.print();
		// inner class �� �ҷ����� ��� 2
		// ���� Ŭ���� ��ü�� �ܺ� Ŭ������ ��ü�� ������� �ʰ� �ܵ����� ��ü ���� 
		
		Outer1.Inner1 inner = out.new Inner1();
		inner.write();	
	}
}
