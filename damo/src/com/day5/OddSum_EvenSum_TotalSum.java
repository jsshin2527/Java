package com.day5;
/*
 * 1에서 100까지 수의 홀수의 합, 짝수의 합, 전체의 합을 구하는 프로그램 
 */
public class OddSum_EvenSum_TotalSum {

	public static void main(String[] args) {
	
		int i;
		int totalsum=0; // 전체 총합 
		int evensum=0; 	// 짝수 총합
		int oddsum=0;   // 홀수 총합 
		
		int sum;
		totalsum = 0;
		
		//1~100 까지 전체 총합을 구하는 for문
		for(i=0;i<=100;i++) {
			
			totalsum += i;
		}
		//1~100 까지 짝수 총합을 구하는 for문
		for(i=0;i<=100;i+=2) {
			
			evensum += i;
		}
		//1~100 까지 홀수 총합을 구하는 for문
		for(i=1;i<=100;i=i+2) {
			
			oddsum += i;
		}
		System.out.println("전체의 합 " +totalsum);
		System.out.println("홀수의 합 " +oddsum);
		System.out.println("짝수의 합 " +evensum);
		
	}
}
