/* 
	�׽�Ʈ�� ���α׷� 
		
	1.BufferedReader �� �̿��Ͽ� �Է°����ޱ� 
	
	2.char �� ���� ���� Ȯ�� 

*/
package com.day;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;
class Scanner_Example2_Test 
{
	public static void main(String[] args) throws IOException
	
	{
		//�Է°��� �ޱ����� ������ ���� 
		/*
		String test1input;
		int test2input;
	    BufferedReader test = new BufferedReader (new InputStreamReader(System.in));
		System.out.print("test1input �Է°��� �Է��ϼ��� : ");
  		test1input = test.readLine();
		System.out.print("test2input �Է°��� �Է��ϼ��� : ");
		test2input = Integer.parseInt(test.readLine());
		System.out.println("test1input���� " +test1input+" �Դϴ�.");
		System.out.println("test2input���� " +test2input+" �Դϴ�.");
		*/
		/*
		char test1ch,result ;
		test1ch = 'c';
		System.out.println(test1ch);
		System.out.println(Integer.toString(test1ch));
		result = (char)System.in.read();
		System.out.println("result �� �ش� ��������" + result + " �Դϴ�.");
		*/
		/*
		int test1 = System.in.read();
		System.in.skip(2);
		int test2 = System.in.read();
		System.out.println(test1);
		System.out.println(test2);
		System.in.skip(2);
		*/
		InputStreamReader test3 = new InputStreamReader(System.in);		
		int test5 = test3.read();
		System.out.println(test5);
		System.out.println(Integer.toBinaryString(test5));
	}
}
