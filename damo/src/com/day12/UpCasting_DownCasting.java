package com.day12;

//UPCAST DOUWNCAST는 상속관계에서만 가능
//웹페이지 한장마다 자바.jsp ~~~.확장자 페이지와 페이지를 옮길 때 내 정보가 따라다님
//로그인 한 값이 계속 따라다니게 하려면 UPCAST DOUWNCAST 필요

class TestA{
	public void print() {
		System.out.println("A 클래스....");
	}
}

class TestB extends TestA{
	public void print() {
		System.out.println("B 클래스....");
	}
}

public class UpCasting_DownCasting {

	public static void main(String[] args) {
		
		TestA a = new TestA();
		TestB b = new TestB();
		
		//b=a;
		//일반 1:1관계에서는 넣을 수 없다
		//UPCAST DOUWNCAST는 상속관계에서만 가능
		//Test
		//TestB는 TestA를 상속받고 있습니다. 
		//TestA 부모 TestB 자식 
		// upcasting 
		// 
		// 형 변환 할때 upcasting 을 하는겨우 
		/*
	       부모 = 자식; - 자식을 부모로 바꾸어 놓는다  UPCAST
		   부모 = (부모)자식  - UPCAST 
		   자식 = 부모; 	  - X (안됨)
		   자식 = (자식)부모; - DOWNCAST
		*/
		 int i =3;
		 double j =5.20;
		 i=(int)j; // 큰곳 (부모)에서 작은 범위(부모)로 들어갈때는 명시적 형변환을 명시해야합니다.
		 j=i;	   // 작은 (자식)에서 큰 범위로 들어갈때는 형 선언을 따로 할 필요는 없습니다. 
		//upcasting 
		a=b; //따로 형을 명시 하지 않아도 됩니다. 
		//downcasting 
		b=(TestB)a;  
	
		
	}
}
