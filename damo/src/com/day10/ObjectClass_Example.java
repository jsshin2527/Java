package com.day10;

/*
 * 블루스크린은 컴퓨터를 끄고 다시 키는것이다 
 * 메모리 충돌 : 블루스크린 
 * 자바의 모든 클래스는 Object의 상속을 받는다 
 */


class Super{
	private int a = 10;
	
	public void write() {
		System.out.println("a"+a);
	}
}
public class ObjectClass_Example {
	
	public static void main(String[]args) {
		
		Super ob2 = new Super();
		Super ob1 = new Super();
		
		System.out.println("ob1 == ob2 : " + (ob1==ob2)); //false 
		System.out.println("ob1.equals(ob2) : "+ ob1.equals(ob2)); //false
		/*
		 * 모든 클래스의 부모는 Object입니다.
		 * 내가 만든 클래스도 부모는 Object입니다. 
		 */
		//Hashcode 
		System.out.println("ob1 : " + ob1); //:com.day10.Super@2f7a2457
		System.out.println("ob1 : " + ob2); //:com.day10.Super@566776ad
		//toString Object 클래스에 속합니다. 
		System.out.println("ob1.toString() : " + ob1.toString()); //com.day10.Super@2f7a2457
		System.out.println("ob2.toString() : " + ob2.toString()); //com.day10.Super@566776ad		
	}
}
