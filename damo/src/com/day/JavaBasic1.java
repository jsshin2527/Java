/*
2019.06.27 첫번째 자바 소스코드 
다음 Test1 클래스는 수업에서 한 코드를 정리한 것 입니다. 
정리 순서 
1. class 의 의미 설명 및 public static void method main String[] args 설명 정리 
2. 자바 별찍기 프로그램 (for 문을 활용하여 성모양의 별 찍기 
// 주석 사용 
/* 여러줄 주석 
Class 는 프로그램을 실행 시키는 단위 
Class name : Test1 
Class 의 이름 앞글자는 대문자로 설정한다 
Class 파일이름은 Class 명과 같아야 한다 
*public : 접근 제어자 : 누가 접근이 가능하냐 ?? 
*static : 정적 변수 
*void : return 값이 없이 실행 가능하다  
*main : 메소드 이름 (첫글자는 소문자)
String[] args : 매개변수  : 기본적인 메소드 매개변수 [] 배열 나중에 배움 
이 외에도 터미널 창에서 javac 프로그램을 이용하여 java 소스파일을 클래스 파일로 만들고 (binarny file) java 자바 프로그램으로 class 파일을 실행하여 결과값으로 출력합니다. 
환경 변수 적용후 터미널 창을 띄워서 다음 명령어로 파일을 실행합니다.
javac .java -> java 파일 클래스 파일로 변환 
java classfile -> 자바 클래스 파일 실행 
== 대입 연산자 
*/
package com.day;
class JavaBasic1 

{
	public static void main(String[] args) 
	
	{
		/*
		
		System클래스가 가지고 있는 println이라는 메소드가 있고 괄호 안에 값은 매개 변수로 값을 받아 화면에 출력을 합니다. 
		System 클래스 안에 있는 println 메소드를 불러와 사용 합니다. 그렇다면 System 클래스를 어떻게 불러올수 있는가는 
		static 정적변수를 이용하여 기본 java 클래스를 불려올수 있습니다. 
		*/

		System.out.println("Hello World!");
		System.out.println("안녕하세요!! 자바 테스트 입니다.");
		System.out.println("안녕 자바 ");
		System.out.println("오늘 날씨 덥다 ");
		
		char a = 65; // 65의 아스키 코드가 무엇인지 확인 
		int  b = 65; // int 65 값을 출력하기위해 다음과 같은 값은 b 라는 int 형을 선언후 65 값을 대입  
		
		System.out.println(a);
		System.out.println(b);
/*

2. 자바 별찍기 프로그램 

	*
   ***
  *****
 *******
*********

*/

		
	for (int i=0; i<=5 ;i++)
	
	{    
		System.out.print(" ");

		for (int j=5; j>i ; j--)
	
		{
			System.out.printf(" ");
		}

		for (int j=0 ; j<=i ; j++ )
		
		{
			System.out.printf("*");
		}
				
		for (int z =0; z < i ; z++ )
		
		{
		System.out.print("*");
		}
		System.out.println("\n");
		}
	}
}