package com.day5;

/*
 * 1에서 100까지의 수중 3의 배수의 갯수
 */

public class Multiples_of_Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,result=0;
		int array[] = new int[100];
		
		for(i=0;i<array.length;i++) {
			array[i] = i+1;
		}
		
		result = array.length/3;
		System.out.println("1에서 100까지의 수중 3의 배수의 갯수 : "+result+" 입니다.");
	}

}
