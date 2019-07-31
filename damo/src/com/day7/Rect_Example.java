package com.day7;

import java.util.Scanner;

public class Rect_Example {//사각형의 둘레와 높이만 전문적으로 만드는 회사
	
	int w,h;//instance변수(전역변수:모두통용)(웹에선 멤버변수)
	//클래스 안 어디서나 사용 가능
	
	public void input() {//method
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로?");
		w = sc.nextInt();
		
	    
		System.out.print("세로?");
		h = sc.nextInt();
				
		
	}
	
	public int area() {
		
		int result;//사용자에게 줄 떡을 담아놓는다.그릇을 만듬
		           //지역변수는 바깥으로 나갈 수 없다
		
		result = w*h;
		
		return result;//데이터 int를 가지고 나감
		
	}
	
	public int length() {
		
		return (w+h)*2;//데이터만 가지고 나감//위의 세줄을 한줄로 압축
		
	}
	
	public void print(int a,int l) {
		
		System.out.println("가로:" + w);
		System.out.println("세로:" + h);
		System.out.println("넓이:" + a);
		System.out.println("둘레:" + l);
		
		
	}

}
