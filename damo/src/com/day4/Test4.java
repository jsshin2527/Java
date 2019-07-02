package com.day4;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//사용자가  입력한 수까지의 합계를 구할것 
		//1~5000까지 합계를 구할것 
		int su,sum1,sum2;
		
		//제대로 숫자를 입력할 경우에는 while문을 빠저 나올수 있다.
		//조건을 반대를 주었다 
		do {
			System.out.print("0 과 음수 그리고 5000 이상의 수를 제외한 정수를 입력하세요 :");
			su = sc.nextInt();
			if(su<1 ||su>5000) {
				System.out.println("수를 잘못 입력하였습니다.다시 입력해 주세요:\n");
			}
		}while(su<1 ||su>5000);
		
		//공식 활용하여 합계 구하기 
		sum1 = ((su)*(su+1))/2;
		sum2 = 0;
		
		for (int i=0;i<su;i++){
			sum2 += i+1;
		}
		System.out.println("공식을     활용한 숫자 1부터"+su+"까지의 합은 "+sum1+"입니다.");
		System.out.println("for문을 활용한 숫자 1부터"+su+"까지의 합은 "+sum2+"입니다.");

		//System.out.println("");
		//1+2+3+4+5 =15
	}

}
