/*
 	System.in을 입력받아 대문자 이면 소문자로 소문자 이면 대문자로 변환하는 프로그램 
	매우 중요
	소문자를 -> 대문자로 
	대문자를 -> 소문자로 
	변환하는 프로그램 
*/

package com.day;

import java.io.IOException;

import java.io.InputStreamReader;

import java.io.BufferedReader;

class Capital_Small__Letter_Change 

{
	public static void main(String[] args) throws IOException
	
	{
		//char ch ='a';           //한개의 문자만 저장 
		char ch,result;
		System.out.print("한개의 문자를 입력하세요 : " ); //abcd
		ch = (char)System.in.read(); //System.in은 오로지 하나의 문자만 읽어드린다 a(97) a를 입력하면 
	    
		//97이라는 정수가 들어가있다 명시적 형 변환  
		int i = System.in.read();
		int j = System.in.read();
					
		System.out.println(ch); //
		System.out.println(i);
		System.out.println(j);
		System.out.println(Integer.toString(ch)); //
		result = ch>=65&&ch<=90?(char)(ch+32):(ch>='a' && ch<='z'?(char)(ch-32):ch);
		System.out.println(ch + "->" +result);
		//+32는 대문자를 소문자로 변형
		//String str = "가나다라"; //문자열 저장 
		/*
		char ab = 'a';
		System.out.print(Integer.toString(ab));
		*/
	}
}
