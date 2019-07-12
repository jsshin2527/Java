/*
 * Inner Class
 * 
 */
package com.day13;

class Outer1{
	static int a=10;
	int b = 20;
	
	//Outer가 객체생성되었다고 Inner도 생성이 된것이 아니다 
	//Inner를 사용하려면 Outer의 객체를 생성해야 한다.
	
	public class Inner1{ //클래스 안에 클래스 : 클래스는 어디든 다 만들수 있습니다.  메소드 안에서도 생성 가능 
		
		int c = 30;
		
		public void write() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		
	}
	
	public void print() {
		//Inner 객체를 생성 
		Inner1 ob = new Inner1();
		ob.write();
	}
}

public class InnerClass {

	public static void main(String[] args) {

		// inner class 를 불러오는 방법 1
		Outer1 out = new Outer1();
		out.print();
		// inner class 를 불러오는 방법 2

		Outer1.Inner1 inner = out.new Inner1();
		inner.write();	
	}
}
