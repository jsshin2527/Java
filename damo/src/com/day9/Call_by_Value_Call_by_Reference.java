package com.day9;

/*
 *Call by Value
 *stack 영역에서 heap영역으로 데이터 그 자체가 넘어감 
 *변수 선언     자료형 선언 
 *Call by Reference
 *값을 넘길때 객체의 시작주소가 넘어감 ( 주소를 나누어 갖습니다)

*/
 
class Test{
	
	public int x = 10;
	
	public void sub(int a) {
	
		x += a;
	}
	
}

public class Call_by_Value_Call_by_Reference {
	
	public static void main(String[] args) {
		
		Test ob = new Test();
		
		//Call by Value 
		
		int a = 10;
		System.out.println("메소드 실행 전 x :"+ob.x);
		ob.sub(a);
		System.out.println("메소드 실행 후 x :"+ob.x);
		
		//call by reference 
		int i = 10;
		int j;
		j = i;
		//stack 영역의 자료형은 값이 그대로 넘어간다 
		
		Test ob1; //class는 정의만 해두면 null 이 들어가있습니다. 
		
		ob1 = ob; 
		
		ob.x =200;
		System.out.println(ob.x);
		System.out.println(ob1.x);
		
		
	}

}
