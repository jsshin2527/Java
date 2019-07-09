/*
	2019.06.28 네번째 코드 

	제어문 if 


*/
package com.day;
import java.util.Scanner;
class If_else_Example 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name; 
		int kor;
		System.out.print("너의 이름이 무엇이냐 ? " );
		name = sc.next(); //String값 으로 읽어옴 
    	System.out.print("국어점수가 무엇이니  ?" );
		kor = sc.nextInt(); //형 변환
		String pan; 
		if (kor>=90)
		{
			pan = "수";
		}else if (kor>=80)
		{
			pan = "우";
		}else if (kor >=70)
		{
			pan = "미";
		}else if (kor >=60)
		{
			pan = "양";
		
		}else{
			pan = "가";
		}
		System.out.println(name+":"+pan);
	}
}
