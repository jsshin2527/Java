package com.day8;

class SubClass{//클래스는 자료형이다
	
	int a,b;
	
}
public class Class_Object_method {//클래스의 메소드는 공용으로 사용하지만 변수는 메소드는 따로 공간을 사용한다?

	public static void main(String[] args) {
		
		SubClass ob1 = new SubClass();
		SubClass ob2 = new SubClass();
		
		ob1.a=10;
		ob1.b=20;
		
		
		System.out.println("ob1.a:" + ob1.a);//10
		System.out.println("ob1.b:" + ob1.b);//20
		
		System.out.println("ob2.a:" + ob2.a);//0
		System.out.println("ob2.b:" + ob2.b);//0
		
		ob2.a=100;
		ob2.b=200;
		
		System.out.println("ob2.a:" + ob2.a);//100
		System.out.println("ob2.b:" + ob2.b);//200
		
		System.out.println("ob1.a:" + ob1.a);//10
		System.out.println("ob1.b:" + ob1.b);//20

	}
}
