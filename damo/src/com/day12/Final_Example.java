/*
 * final 을 붙일수 없는 경우 
 * 변수에 final 붙이면 : 한번만 초기화가 됩니다. 
 * 메소드에 final을 붙이면 : Override가 불가능 
 * 클래스에 final을 붙이면 : 상속이 불가능 합니다. 
 *  
 *
 */
package com.day12;

//class final <class name> : 클래스를 상속을 받지 못합니다. 

class Test{
	public static final double PI;
	
	static {
		PI = 3.14;
		//PI = 3.14 변수에 final을 붙이면 1번만 초기화가 가능하다 수정 불가
	}
	
	public double area; //instance variable new를 사용하야 메모리상에 올라감 
	
	// public final void <method name> 메소드 상속 불가 
	
	public void write(String title) {

		System.out.println(title + ":"+area);
	
	}
	
}

public class Final_Example extends Test{

	public void circleArea(int r) {
		area = (double)r*r*PI;	
	}
	
	@Override
	public void write(String title) {
		System.out.println(title + ":"+area);
	}
	
	public static void main(String[] args) {

		Final_Example ob = new Final_Example();
	
		ob.circleArea(10);
		ob.write("원");
	}
}
