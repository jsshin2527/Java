package com.day5;

import java.util.Scanner;

public class Array_length {

	public static void main(String[] args) {

		//배열 
		//배열을 움직이려면 반복문이 자주 사용된다 
		
		int num[] = new int [10];
		int[] num1 = new int [5];
		
		//num[0] = 10;
		//int a = num[0];
		//int 형태의 배열의 초기값은 0 입니다. 배열은 초기값이 들어가있다.
		//배열에 boolean 자료형의 초기값은 false 입니다.
		//new 라는 예약어는 변수를 선언할때 값이 초기화가 되어있습니다. 
		/*
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		
		System.out.println("num[0] : "+num[0]);
		System.out.println("num[1] : "+num[1]);
		System.out.println("num[2] : "+num[2]);
		System.out.println("num[3] : "+num[3]);
		System.out.println("num[4] : "+num[4]);
		System.out.println("배열의 개수는 : "+num.length+"입니다.");
		//length은 괄호가 없다 ***** 
		for(int i=0;i<num.length;i++) {
			System.out.println("num["+i+"] : "+num[i]);
		}
		*
		*
		*/
		Scanner sc = new Scanner(System.in);
		
		for (int i =0;i<num1.length;i++) {
			System.out.print("정수"+(i+1)+"번을  입력하세요 : ");
			num1[i] = sc.nextInt();
		}
		for (int i =0;i<num1.length;i++) {
			//System.out.println("num["+i+"] : "+num1[i]);
			System.out.printf("%4d",num1[i]);
		}
		System.out.println("\n다음과 같은 배열이 출력되었습니다. \n");
		System.out.println("배열의 개수는"+num1.length+"입니다.");
		
			
	}

}
