package com.day5;

public class Test2 {
	//2단 부터 9단 구구단 프로그램 
	//이중 for문을 활용하여 소스코드 작성 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j;
		
		for(i=2;i<=9;i++) {
			System.out.println(i+" 단");
			for(j=1;j<=9;j++){
				System.out.println(i+"X"+j+"="+(i*j));
			}
		System.out.println("");
		}
	}
}
