package com.day4;

import java.util.Scanner;

/*
 * 논리
 * boolean  : 1 byte true/false
 * 정수 
 * byte : 1byte  -128~127;
 * short: 2byte
 * int  : 4byte
 * long : 8byte
 * 
 * 진수
 * 10진수 : 20
 *  8진수 : 016
 * 16진수 : 0x17
 * 
 * 실수 
 * float  : 4byte 4.15
 * double : 8byte
 * 
 * 3.14  : double 
 * 3.14f : float 
 * 
 * 문자 
 * char : 2byte(utf-16) 
 * 문자 상수 : 'a'; a자가 저장되는것이 아닌 아스키 코드 값이 저장이 된다 
 * 
 * 연산자 
 * 산술연산자 : +,-,*,/,%,++(i=i+1),i--(i=i-1)
 * 관계연산자 : >,>=,<,<= : 결과 true,false 
 * 등가연산자 : ==,!=
 * 논리연산자 : &&(and),||(or)
 * 비트연산자 : &,|,^,~,>>,<<,>>>
 * 
 * 삼항연산자 :
 * 조건 ? (true일때 값) : (false일때 값)
 * 
 * 대입 연산자 
 * =,+=,-=,*=,/=
 * 
 * ----------------------------------------------------------------------------
 *	
 * int a =10;
 * float b;
 * 
 * b=a //암시적 형변환 int의 값은 float 형이 들어값니다. 
 * b=(Int) a //명시적 형변환 
 * 
 * ----------------------------------------------------------------------------
 * if (조건){
 * 	작업;
 * }
 * 
 * if(조건){
 * 	작업1;
 * }else{
 * 	작업2
 * }
 * 
 *if(조건1){
 * 작업 1
 * }else if(조건2){
 * 작업 2
 * }else if(조건3){
 * 작업 3
 * }else{
 * 작업 4
 * }
 * 여러개의 조건중 하나만 찾는것 if~else
 * 무조건 다비교 단일 if 
 * 
 * while(조건){
 * 	작업
 * }
 * 
 * do{
 * 	작업;
 * }while(조건)
 * 
 * while (true){
 * 	작업 
 * }
 *   // 무한 루프 
 * ====================================================================================
 */

public class Test1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		int su = 10;
		
		//while의 경우는 조건이 만족하면 계속 돈다 
		//만약 조건이 false로 된다면 while문을 빠져 나오게 됩니다.
		
		do {
		System.out.print("수 입력 : ");
		su = sc.nextInt();}while(su<0);

		if (su%3 == 0 && su%4 ==0){
		//str = "3와 4의 배수 입니다.";
		//printf("%s",str);
			System.out.println("3와 4의 배수 입니다.");
		}else if (su%3==0){
			System.out.println("3의 배수입니다.");	
		}else if (su%4==0){
			System.out.println("4의 배수입니다.");	
		}else{
			System.out.println("3과 4의 배수가 아닙니다.");
		}
		int a = 10;
		float b ;
		System.out.print(b=a);
	}

}
