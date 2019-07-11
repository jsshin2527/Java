package com.day12;

//UPCAST DOUWNCAST는 상속관계에서만 가능
//웹페이지 한장마다 자바.jsp ~~~.확장자 페이지와 페이지를 옮길 때 내 정보가 따라다님
//로그인 한 값이 계속 따라다니게 하려면 UPCAST DOUWNCAST 필요

class TestA{
	
	public void print() {
		System.out.println("A 클래스....");
		
	}
}

class TestB{
	
	public void print() {
		System.out.println("B 클래스....");
		
	}
}

public class Test6 {

	public static void main(String[] args) {
		
		TestA a = new TestA();
		TestB b = new TestB();
		
		//b=a;
		//일반 1:1관계에서는 넣을 수 없다
		//UPCAST DOUWNCAST는 상속관계에서만 가능

	}

}
