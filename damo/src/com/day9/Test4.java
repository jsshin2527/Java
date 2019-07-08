package com.day9;

//인스턴스 초기화 블럭,클래스 초기화 블럭 차이  

public class Test4 {
	
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
	
	public Test4 () {
		System.out.println("생성자 ....");
		C = 100;
		System.out.println("C :" +C);
	}
	
	{ //초기화 블럭 *중요*
		System.out.println("초기화 블럭 a: " + a);
		a=10;
		System.out.println("초기화 블럭 a: " + a);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test4 ob = new Test4();
		Test4 ob1 = new Test4();
		
	}

}
