package com.day5;
/*
 * 1에서 100까지 수의 홀수의 합, 짝수의 합, 전체의 합을 구하는 프로그램 
 */
public class OddSum_EvenSum_TotalSum {

	public static void main(String[] args) {
	
		int i,totalsum=0,evensum=0,oddsum=0;
		int n=0;
		int sum;
		totalsum = 0;
		for(i=0;i<=100;i++) {
			
			totalsum += i;
		}
		for(i=0;i<=100;i+=2) {
			
			evensum += i;
		}
		for(i=1;i<=100;i=i+2) {
			
			oddsum += i;
		}
		
		System.out.println("전체의 합 " +totalsum);
		System.out.println("홀수의 합 " +oddsum);
		System.out.println("짝수의 합 " +evensum);
		
		//홀수의 합 
		/*
		for(i=0;i<100;i++) {
			array[i] = i+1;
			evensum += array[i];
		}
		for(i=0;i<100;i++) {
			array[i] = i+1;
			oddsum += array[i];
		}
		*/
		
		/*
		if (i%2 == 0) {
			
			for(i=1;i<=100;i++) {
					
			}
			
		}else if (sum%2 == 0) {
			
		}else {
			
		}
		*/
		
	}
}
