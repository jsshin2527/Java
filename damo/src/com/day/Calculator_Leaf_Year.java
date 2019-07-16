/*
 	BufferedReader 클래스를 이용하여 2개의 숫자를 입력받아 계산기 프로그램과 윤년을 계산하는 프로그램 

	java.lang 이라는 것은 사용빈도수가 높은 클래스들이 이미 메모리 상에 올라가 있다 

	따라서 따로 import를 하지않아도 사용할수 있다.
	
*/
package com.day;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;

class Calculator_Leaf_Year 

{
	public static void main(String[] args) throws IOException
	
	{
		BufferedReader test8 = new BufferedReader (new InputStreamReader(System.in));
		
		int num1,num2;

		System.out.print("첫번째 수를 입력 하세요 : ");

		num1 = Integer.parseInt(test8.readLine());
		
		//num1 = test8.readLine();
		
		System.out.print("두번째 수를 입력 하세요 : ");

		num2 = Integer.parseInt(test8.readLine());
		
		System.out.printf("%d + %d = %d 입니다. \t",num1,num2,num1+num2);
		System.out.printf("%d - %d = %d 입니다. \n",num1,num2,num1-num2);
		System.out.printf("%d * %d = %d 입니다. \t",num1,num2,num1*num2);
		System.out.printf("%d / %d = %d 입니다. \n",num1,num2,num1/num2);
		System.out.printf("%d %% %d = %d 입니다. \n",num1,num2,num1%num2);
		//숫자를 등호나 부등호로 비교하면 true.false 가 생성된다.
		System.out.println("num1>num2 : "+(num1>num2)+"입니다. \n");
		//문자를 담을수 있는 변수
		System.out.print("String 문자를 담을수 있는 변수\n1");
		String str;
		// == 대입 연산자 
		// 삼항 연산자 
		str = num1%2==0?"짝수":"홀수";
		System.out.println("num1 에 있는 값은 : "+str);
		str = num1>0?"양수":(num1<0?"음수":"영");
		System.out.println("num1 에 있는 값은 : "+str);

		//윤년 구하는 공식 
		str = num1%4==0&&num1%100!=0 || num1%400==0? "윤년":"평년";
		System.out.println("num1 에 있는 값은 : "+str);
		// A and B(&&)
		// A 도 true B 도 true
		// A  or B(||)
		// A가 true 이거나 B가 true 이면 (둘중 하나가 true이면) 
	}
}
