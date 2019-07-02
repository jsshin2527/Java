/*피보나치 수열을 구하는 프로그램 입니다.
(1)+(1+2)+(1+2+3)+...+(1+2+3+...+10) 
n=1을 입력하면 1
n=2을 입력하면 (1)+(1+2) = 4 
n=3을 입력하면 (1)+(1+2)+(1+2+3) =10
n=4을 입력하면 (1)+(1+2)+(1+2+3)+(1+2+3+4) = 17
을 출력합니다. 
*/
package com.day5;

import java.util.Scanner;

public class Fibonacci_Sequence {

	public static void main(String[] args) {
		
		int i,j,result=0,sum,number,test=1;
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("피보나치 수열을 구하는 프로그램 입니다. ");
		System.out.print("3 보다 큰 정수의 값을 입력하세요 : ");
		number = sc.nextInt();
		}while(number <3);	
		
		for(i=1;i<number;i++) {
			sum=0;
			for(j=1;j<i;j++) {
				if(j == i-1) {
					System.out.printf("%d",j);
					sum+=j;
				}else {
					System.out.printf("%d+",j);
					sum+=j;
				}
			}
			System.out.printf("+%d",sum);
			result += sum;
			System.out.printf("=%d",result);
			System.out.println();
		}
		System.out.println("결과 값은 "+result+"입니다.");
	}
}
