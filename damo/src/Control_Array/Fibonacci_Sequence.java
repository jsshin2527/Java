/*피보나치 수열을 구하는 프로그램 입니다.
(1)+(1+2)+(1+2+3)+...+(1+2+3+...+10) 
n=1을 입력하면 1
n=2을 입력하면 (1)+(1+2) = 4 
n=3을 입력하면 (1)+(1+2)+(1+2+3) =10
n=4을 입력하면 (1)+(1+2)+(1+2+3)+(1+2+3+4) = 20
을 출력합니다. 
*/
package Control_Array;

import java.util.Scanner;

public class Fibonacci_Sequence {

	public static void main(String[] args) {
		
		int i,j,result=0,sum=0,number,test=1;
		Scanner sc = new Scanner(System.in);
		
		
		do {
		System.out.println("피보나치 수열을 구하는 프로그램 입니다. ");
		System.out.print("3 보다 큰 정수의 값을 입력하세요 : ");
		number = sc.nextInt();
		}while(number <3);	
		int array[][] = new int [number][number];
		/*
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
			//System.out.printf("+%d",sum);
			result += sum;
			System.out.printf("=%d",result);
			System.out.println();
		}
		*/
		for (i=0;i<number;i++) {
			for (j=0;j<i;j++) {
				array[i][j] += j+1;
				sum += array[i][j];
			}
			System.out.println();
			
		}
		for (i=0;i<number;i++) {
			if(i!=0) {
				System.out.print("(");
			}
			for (j=0;j<i;j++) {
				if(i == 1  && j == 0) {
				System.out.printf("%d",array[i][j]);
				}else if(j == i-1){
				System.out.printf("%d",array[i][j]);
				}else {
				System.out.printf("%d+",array[i][j]);	
				}
			}
			if(i!=0) {
				System.out.print(")");
				System.out.print("+");
			}
				
		}
		/*
		for(i=0;i<number;i++) {
			for(j=0;j<number;j++) {
				System.out.printf("%3d", array[i][j]);
			}
		System.out.println();
		}
		*/
		System.out.printf("=%d 입니다.\n",sum);
	
	}
	//System.out.println("결과 값은 "+result+"입니다.");
}

