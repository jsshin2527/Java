package com.day9;

//인스턴스 초기화 블럭,클래스 초기화 블럭 차이

/*
 * 클래스 초기화 블럭은 클래스가 메모리에 처음 로딩 될때 한번만 수행되며,
 * 인스턴스 초기화 블럭은 생성자와 같이 인스턴스를 생성할 때 마다 수행된다 
 * (클래스가 처음 로딩될 때 클래스 변수들이 자동적으로 메모리에 만들어지고 
 * 곧바로 클래스 초기화 블럭인 클래스 변수들을 초기화 하게 되는것이다. )
 * 블럭을 사용하는 이유는 코드의 중복을 제고함으로써 신뢰성을 높여주고 오류의 발생가능성을 줄여줄수 있습니다. 
 * 
 */

public class ClassInitialize_instacneInitialize {
	
	int a = 5;
	
	static int b;
	
	static { //static 블럭  알아서 메모리 상에 적재가 됩니다. 
	
		b = 10;
		System.out.println("static 블럭 b: " + b);
		
	}
	// 상수 선언 한번 여기 값을 선언이 되면 값을 바꿀수 없습니다. 
	// final 예약어를 사용을 할때는 꼭 초기화를 해줘아 합니다. 
	// 상수는 보통 대문자로 사용이 됩니다. 
	
	final int C ; //상수
	
	public ClassInitialize_instacneInitialize () {
		System.out.println("생성자 ....");
		C = 100;
		System.out.println("C :" +C);
	}
	
	{ //초기화 블럭 *중요* -> 인스턴스 초기화 변수 라고 표현하기도 합니다. 
		System.out.println("초기화 블럭 a: " + a);
		a=10;
		System.out.println("초기화 블럭 a: " + a);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassInitialize_instacneInitialize ob = new ClassInitialize_instacneInitialize();
		ClassInitialize_instacneInitialize ob1 = new ClassInitialize_instacneInitialize();
		
	}

}
