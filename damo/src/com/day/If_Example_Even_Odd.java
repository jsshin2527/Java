/*
 	BufferedReader 클래스를 이용하여 숫자를 입력받아 짝수 홀수 출력을 하는 프로그램 
	제어문 
	if   조건이 을때  
	for  시작과 끝이 정해져 있는 경우 for 문을 사용하면 좋다 
	while  몇번 돌려야 할지 모를때 사용 하면 좋다 
	do~while 	
	switch
	{
	작업이 하나일때는 중괄호 생략이 가능하다 }
*/

package com.day;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;

class If_Example_Even_Odd 

{
	public static void main(String[] args) throws IOException

	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int num; //정수 초기화  
		String str ; // 일반적으로 String 값 초기화
		System.out.print("수 입력 ?? "); //10
		num = Integer.parseInt(br.readLine());
		/*if (조건){
		  작업 
		 }
		*/
		/*
		if (num%2==0)
		{
			str = "짝수";
			str = str + "입니다.";
		}
		if (num%2!=0)
			str = "홀수";	
		System.out.println(num+":"+str);
		*/
		//if~else 
		if (num%2==0)
		{
			str = "짝수";
		}else{
			str = "홀수";
		}
		System.out.println(num+":"+str);
	}
}
