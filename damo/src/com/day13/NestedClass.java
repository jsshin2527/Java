/*
 * ���� Ŭ���� (��ø)
 * ���� Ŭ������ static ���� ����� ��� 
 * inner�� ���� �޸� �� �ö󰡴� ��� 
 * 
 */
package com.day13;

class Outer3{
	
	static int a =10;
	
	int b =20; //�ν��Ͻ� ���� -> ��ü�� �����ؾ߸� ����Ҽ��� ���� 
	
	
	public static class Inner3{
		int c = 30;
		public void write() {
			System.out.println(a);
			//System.out.println(b);
			System.out.println(c);
			Outer3 o = new Outer3();
			System.out.println("o.b : "+o.b);
			
		}
	}
	public void print() {
		Inner3 ob = new Inner3();
		ob.write();
	}
}

public class NestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer3 out = new Outer3();
		out.print();
		
		Outer3.Inner3 inner = new Outer3.Inner3();
		inner.write();
	
	}
}
