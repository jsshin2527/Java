package com.day9;

import java.io.IOException;
import java.util.Scanner;

//boolean 활용 방법 
class Calc{
	//기본 생성자가 있다고 생각하고 코딩 
	
	private int  num1,num2;
	
	private char oper;
	
	public boolean input() throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("두개의 수를 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.print("\n연산자[+,-,*,/]를 입력하세요 ");
		oper = (char)System.in.read();
		//!= 가 두개이면 왜 && 이지 ? 
		if(oper != '+' && oper !='-' && oper != '/' && oper !='*') {
			return false;
		}
		return true;
	}
	public int result() {
		int r = 0;
		switch(oper) {
		case '+' : r=num1+num2;break;
		case '-' : r=num1-num2;break;
		case '*' : r=num1*num2;break;
		case '/' : r=num1/num2;break;	
		}
		return r;
	}
	public void print(int r ) {
		System.out.printf("%d %c %d = %d\n",num1,oper,num2,r);
	}
}

public class Test6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Calc ob  = new Calc();
		//클래스의 메소드를 호출하는 곳에서 예외처리를 한다면 메인 함수에서도 예외처리를 적용해야합니다.  
		//! - > not 연산 true -> false 일때 참으로 변경 
		//true 
		if(!ob.input()) { //false가 참일 경우 !
			//정상적으로 입력을 했다면 true가 오지만 if 문안에 입력해야할 값이 많다면 반대값인 false를 주어 true 값에대한 코드를 밖으로 작성합니다.
			//프로그램 종료 
			System.out.println("연산자를 잘못 입력하였습니다.\n 프로그램을 종료 하겠습니다.");
			return;
		}
		int r = ob.result();
		ob.print(r);	
	}
}
