/* 
	테스트용 프로그램 
		
	1.BufferedReader 를 이용하여 입력값을받기 
	
	2.char 에 대한 개념 확인 

*/
package com.day;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;
class Scanner_Example2_Test 
{
	public static void main(String[] args) throws IOException
	
	{
		//입력값을 받기위한 변수를 선언 
		/*
		String test1input;
		int test2input;
	    BufferedReader test = new BufferedReader (new InputStreamReader(System.in));
		System.out.print("test1input 입력값을 입력하세요 : ");
  		test1input = test.readLine();
		System.out.print("test2input 입력값을 입력하세요 : ");
		test2input = Integer.parseInt(test.readLine());
		System.out.println("test1input값은 " +test1input+" 입니다.");
		System.out.println("test2input값은 " +test2input+" 입니다.");
		*/
		/*
		char test1ch,result ;
		test1ch = 'c';
		System.out.println(test1ch);
		System.out.println(Integer.toString(test1ch));
		result = (char)System.in.read();
		System.out.println("result 의 해당 변수값은" + result + " 입니다.");
		*/
		/*
		int test1 = System.in.read();
		System.in.skip(2);
		int test2 = System.in.read();
		System.out.println(test1);
		System.out.println(test2);
		System.in.skip(2);
		*/
		InputStreamReader test3 = new InputStreamReader(System.in);		
		int test5 = test3.read();
		System.out.println(test5);
		System.out.println(Integer.toBinaryString(test5));
	}
}
