package com.day5;

import java.util.Scanner;

public class Switch_Example {

	public static void main(String[] args) {
		
		
		//switch 문 예제 
		
		// default 는 해당 case 값이 매칭이 안되면 실행되는 예약어 입니다. 
		//
		
		Scanner sc = new Scanner(System.in);
		
		int su;
		
		System.out.print("1~3이내의 수 ? : "); //1,2,3
		
		su = sc.nextInt();
		
		//jdk 7 에서는 String 을 쓸수가 없었지만 
		//jdk 8 에서는 모든 타입의 변수형을 사용할수 있습니다.
		
		switch(su){
		
		case 3: 
			System.out.println("***");
			break;
		case 2:
			System.out.println("**");
			break;
		case 1:
			System.out.println("*");
			break;
		default:
			System.out.println("숫자입력 오류 !!");
		}
	}
}
