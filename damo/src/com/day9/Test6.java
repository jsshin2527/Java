package com.day9;

import java.io.IOException;
import java.util.Scanner;

//boolean Ȱ�� ��� 
class Calc{
	//�⺻ �����ڰ� �ִٰ� �����ϰ� �ڵ� 
	
	private int  num1,num2;
	
	private char oper;
	
	public boolean input() throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("�ΰ��� ���� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.print("\n������[+,-,*,/]�� �Է��ϼ��� ");
		oper = (char)System.in.read();
		//!= �� �ΰ��̸� �� && ���� ? 
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
		//Ŭ������ �޼ҵ带 ȣ���ϴ� ������ ����ó���� �Ѵٸ� ���� �Լ������� ����ó���� �����ؾ��մϴ�.  
		//! - > not ���� true -> false �϶� ������ ���� 
		//true 
		if(!ob.input()) { //false�� ���� ��� !
			//���������� �Է��� �ߴٸ� true�� ������ if ���ȿ� �Է��ؾ��� ���� ���ٸ� �ݴ밪�� false�� �־� true �������� �ڵ带 ������ �ۼ��մϴ�.
			//���α׷� ���� 
			System.out.println("�����ڸ� �߸� �Է��Ͽ����ϴ�.\n ���α׷��� ���� �ϰڽ��ϴ�.");
			return;
		}
		int r = ob.result();
		ob.print(r);	
	}
}
