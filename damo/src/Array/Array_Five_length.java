package Array;

import java.util.Scanner;

public class Array_Five_length {

	int num[] = new int[5];
	int i;

	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("5���� ����?");
		for(int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();			
		}
		
	}
	public int oper() {


		for(int i=0;i<num.length;i++) {
			System.out.println("num[" + i + "]:" + num[i]);
		}

		return i;

	}

	public void print(int a) {

		System.out.println("�迭 ����:" + num.length);

	}

}



	
	
	
	
