/*
 * 2.두 개의 정수를 입력 받고, 큰 숫자와 작은 숫자를 구분해서 출력.(if문 이용)
	 20, 30 입력시 -> 큰 숫자 30, 작은 숫자 20

 */
package com.day4;

import java.util.Scanner;

public class TwoNumber_Min_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		System.out.println("두개의 수를 비교하여 큰수 작은수 출력하는 프로그램 입니다.");
		System.out.print("정수 1를 입력하세요 : ");
		num1 = sc.nextInt();
		System.out.print("정수 2를 입력하세요 : ");
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1+"는 "+num2+"보다 큰 숫자 입니다.");
			System.out.println("큰숫자 : "+num1+", 작은 숫자 :"+num2);
		}else if (num1 < num2) {
			System.out.println(num1+"는 "+num2+"보다 작은 숫자 입니다.");
			System.out.println("큰숫자 : "+num2+",작은 숫자 :"+num1);
		}else {
			System.out.println("두개의 숫자는 같습니다.");
		}
		
	}
}
