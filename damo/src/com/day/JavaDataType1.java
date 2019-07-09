/* 
	자바의 데이터 형식을 알아보는 프로그램 입니다.  
	
	JVM이 자동을 호출 
	1. 변수를 선언한다. int 형 
	자바는 데이터 구조를 확실하게 따지는 프로그래밍 언어 입니다. 
	int 자료형 : 정수 값만 저장 21

*/


package com.day;
class JavaDataType1 

{
	public static void main(String[] args) 
	
	{
		int a = 10000;
		int b = 5 ;
		System.out.println(a);
		int c,d; // garbarg value 
		/* 
		해당 값을 초기화 하지 않는다 오버라이드 개념 공부 
		변수를 선언했다는 것은 초기화를 했다는과 동일 의미로 사용이 됩니다.    
		*/ 
		c = a+b;
		d = a-b;
		System.out.println(a); //10000 
		System.out.println(c); //10005
		System.out.println(d); //9995
		//a+b
		System.out.println(a+"+"+b+"="+c);
		//a-b
		System.out.println(a+"-"+b+"="+d);
		//format 
		/* 

		변수의 타입 출력 format 
		정수 %d 
		실수 %f 
		double %g 
		*/
		System.out.printf("%d+%d=%d",a,b,c);
		System.out.printf("%d-%d=%d",a,b,d);
	}
}
