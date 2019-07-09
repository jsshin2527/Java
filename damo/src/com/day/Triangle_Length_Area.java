/*
BufferedReader 클래스를 이용하여 삼각형의 밑변과 높이를 입력받아 둘레와 넓이를 구하는 프로그램 입니다.
1. float 와 double 의 차이를 알아보는 코드 
2. 밑변과 높이를 입력받아 삼각형의 면적 구하기 
밑변 : 10
높이 : 20
면적 : 밑변 * 높이 /2
*/

package com.day;

import java.io.BufferedReader;

import java.io.InputStreamReader; 

import java.io.IOException;

class Triangle_Length_Area 

{
	public static void main(String[] args) throws IOException

	{
		/* 1. float 와 double 의 차이를 알아보는 코드*/	
		float f = 0; //0.0
		double d = 0; //0.0
		//초기값 
		for (int i=1;i<100000000; i++ ) //i++ = i=i+1
		{
			f+=100000; //f=f+100000; 10->2 2->10 진수를 바꾸는 과정에서 뒤에 000의 값을 버리기 때문에 값의 차이가 생길수가 있다 
			d+=100000; //d=d+100000;

		}
		System.out.println("float : "+f);
		System.out.println("double : "+d);
		/* 삼각형 넓이를 구하는 코드 작성 */
		//다음과 같은 내용으로 문제를 따로 생각을 해야합니다.
		int base,height; 
		// 밑변과 높이를 입력 받아보자.
		// 입력 받기 위해 필요한 객체를 생성해야 합니다. 
		// 키보드로 입력한 바이트 코드를 문자열로 변환하여 입력 받겠다.
		BufferedReader example = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("삼각형의 넓이를 구하겠습니다.");
		System.out.print("밑변을 입력하세요 : " ) ;
		//밑변 값 입력 받기  
		base = Integer.parseInt(example.readLine());
		System.out.print("높이를 입력하세요 : " ); 
		//높이 값 입력 받기 
		height = Integer.parseInt(example.readLine());
		double Triangle; 
		Triangle = (double)base*height/2;
		//a = (double)(base*height)/2; 명시적 형변환 
		System.out.println("**************결과**************");
		System.out.println("삼각형의 넓이는 "+Triangle +"입니다");
		//%d 는 int %f 는 float %g는 double 
		//먄약 double 형을 int 형으로 변환을 한다면 정수 값이 결과로 나옵니다. 
	}
}
