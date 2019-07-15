/*
 * 내부 클래스 (중첩)
 * 내부 클래스를 static 으로 만들는 경우 
 * inner가 먼저 메모리 상에 올라가는 경우 
 * 
 */
package com.day13;

class Outer3{
	
	static int a =10;
	
	int b =20; //인스턴스 변수 -> 객체를 생성해야만 사용할수가 있음 
	
	
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
