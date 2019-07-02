package com.day5;

import java.util.Scanner;

public class TwoNumSmallBigSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2,max,min,sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1를 입력하세요 : ");
		num1 = sc.nextInt();
		System.out.print("정수2를 입력하세요 : ");
		num2 = sc.nextInt();
		
		if(num1>num2) {
			
			max = num1;
		}else {
			max = num2;
		}
		if(num1<num2) {
			
			min = num1;
		}else {
			min = num2;
		}
		
		System.out.println("두수중 큰숫자는"+max+"입니다.");
		System.out.println("두수중 작은숫자는"+min+"입니다.");		
		
		for(int i = min ; i<=max ; i++) {
			sum += i;
		}
		
		System.out.printf("%d 와 %d의 사이의 숫자들의 합은 : %d 입니다",min,max,sum);
	}

}
