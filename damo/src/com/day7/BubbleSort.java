package com.day7;

public class BubbleSort {
	
	public static void main(String[] args) {	
		
		//bubble sort //
		
		int[] num = {28,65,7,4,10};
		int i,j,temp;
		System.out.print("Source Data:");
		for(int su :num) {
			
			System.out.printf("%4d",su);
		}
		System.out.println();
		//bubble sort
		for(i=1;i<num.length;i++) {
			for(j=1;j<num.length;j++) {
				if(num[j]>num[j+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		System.out.print("Sorted Data:");
		for(int su :num) {
			System.out.printf("%4d",su);
	}
		System.out.println();
	}
}
