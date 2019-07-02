package com.day4;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 세개의 수를 입력받아 작은 수에서 큰 수로 출력
		// 선언
		Scanner sc = new Scanner(System.in);

		int num1, num2, num3, temp;

		// 입력

		System.out.print("세개의 수? ");// 9 6 2
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		/*
		 * //연산 if(num1>num2) { temp=num1; num1=num2; num2=temp;
		 * 
		 * }if(num2>num3) { temp=num2; num2=num3; num3=temp;
		 * 
		 * }if(num1>num2) { temp=num1; num1=num2; num2=temp; }
		 * 
		 * 
		 */
		// 출력
		System.out.printf("%d %d %d", num1, num2, num3);

	}

}
