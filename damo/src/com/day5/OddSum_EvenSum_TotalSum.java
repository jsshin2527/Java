package com.day5;
/*
 * 1���� 100���� ���� Ȧ���� ��, ¦���� ��, ��ü�� ���� ���ϴ� ���α׷� 
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
		
		System.out.println("��ü�� �� " +totalsum);
		System.out.println("Ȧ���� �� " +oddsum);
		System.out.println("¦���� �� " +evensum);
		
		//Ȧ���� �� 
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
