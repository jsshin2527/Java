/*�Ǻ���ġ ������ ���ϴ� ���α׷� �Դϴ�.
(1)+(1+2)+(1+2+3)+...+(1+2+3+...+10) 
n=1�� �Է��ϸ� 1
n=2�� �Է��ϸ� (1)+(1+2) = 4 
n=3�� �Է��ϸ� (1)+(1+2)+(1+2+3) =10
n=4�� �Է��ϸ� (1)+(1+2)+(1+2+3)+(1+2+3+4) = 17
�� ����մϴ�. 
*/
package com.day5;

import java.util.Scanner;

public class Fibonacci_Sequence {

	public static void main(String[] args) {
		
		int i,j,result=0,sum,number,test=1;
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("�Ǻ���ġ ������ ���ϴ� ���α׷� �Դϴ�. ");
		System.out.print("3 ���� ū ������ ���� �Է��ϼ��� : ");
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
		System.out.println("��� ���� "+result+"�Դϴ�.");
	}
}
