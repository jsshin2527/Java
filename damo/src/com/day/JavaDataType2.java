/* 
자에의 데이터 유형을 알아보는 프로그램입니다. 반지름을 입력받아 원의 면적과 둘레를 출력하는 프로그램입니다. 

매우 중요 
해당 클래스 의미 중요
Scanner 와 BufferedReader 의 차이를 알아야한다 
System.in은 키보드와 같은 사용자로 부터 입력을 받는 표준 입력스트림 객체를 나타냅니다. 
그리고 리턴 값은 InputStream 입니다.
키보드로 입력한 한개의 문자(1byte)의 문자 한개를 읽어 온다 
15.4를 입력하면 1->5->.4 순으로 읽어 온다 
InputStreamReader : 키보드로 입력한 1byte를 문자로 변환 (브릿지 클래스) 
BufferedReader :버퍼를 만들고 데이터를 보관 

*/
package com.day;

import java.io.BufferedReader;
import java.io.InputStreamReader; 
import java.io.IOException; //3개의 패키지를 import 로 불러온다 

class JavaDataType2 
{
	public static void main (String[] args) throws IOException 
	{
		/*
		System.out.println("변수 명을 입력하시요 ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input1 =Integer.parseInt(br.readLine());
	    System.out.println("해당 변수값은 "+input1+" 입니다");
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double r;
		//double area,length;
		double area;
		double length;
		System.out.print("반지름을 입력하세요 : ");
		r = Double.parseDouble(br.readLine()); 
		/*
		br.readLine은 입력값을 문자로 읽어 값을 받환합니다. 
		따라서 Integer.parseInt로 문자 값은 정수 값으로 변환하여 r에 대입합니다. 
		실수형으로 변형을 하고 싶다면 Double.parseDouble(br.readLine()); 로 선언 해준다 
		*/
		area = r*r*3.14f;
		length = r*2*3.14f;
		// area = (double) r*r*3.14; 명시적 형 변환 (공부)
		System.out.println("****************결과값***************");
		System.out.println("반지름 : "+ r);
		System.out.println("면적   : "+ area);
		System.out.println("둘레   : "+ length);
	}
}
