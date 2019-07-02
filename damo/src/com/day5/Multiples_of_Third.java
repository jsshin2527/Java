package com.day5;

/*
 * 1에서 100까지의 수중 3의 배수의 갯수
 */

public class Multiples_of_Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,count=0;
		
		//배열 선언 
		int array[] = new int[100];
		
		for(i=0;i<array.length;i++) {
		
			array[i] = i+1;
		}
		//3의 배수 개수 구하기 = (3의 배수를 구하고자 하는 숫자)/3
		count = array.length/3;
		
		System.out.println("1에서 100까지의 수중 3의 배수의 갯수 : "+count+" 입니다.");
	}

}
