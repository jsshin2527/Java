/*
 	System.in�� �Է¹޾� �빮�� �̸� �ҹ��ڷ� �ҹ��� �̸� �빮�ڷ� ��ȯ�ϴ� ���α׷� 
	�ſ� �߿�
	�ҹ��ڸ� -> �빮�ڷ� 
	�빮�ڸ� -> �ҹ��ڷ� 
	��ȯ�ϴ� ���α׷� 
*/

package com.day;

import java.io.IOException;

import java.io.InputStreamReader;

import java.io.BufferedReader;

class Capital_Small__Letter_Change 

{
	public static void main(String[] args) throws IOException
	
	{
		//char ch ='a';           //�Ѱ��� ���ڸ� ���� 
		char ch,result;
		System.out.print("�Ѱ��� ���ڸ� �Է��ϼ��� : " ); //abcd
		ch = (char)System.in.read(); //System.in�� ������ �ϳ��� ���ڸ� �о�帰�� a(97) a�� �Է��ϸ� 
	    
		//97�̶�� ������ ���ִ� ����� �� ��ȯ  
		int i = System.in.read();
		int j = System.in.read();
					
		System.out.println(ch); //
		System.out.println(i);
		System.out.println(j);
		System.out.println(Integer.toString(ch)); //
		result = ch>=65&&ch<=90?(char)(ch+32):(ch>='a' && ch<='z'?(char)(ch-32):ch);
		System.out.println(ch + "->" +result);
		//+32�� �빮�ڸ� �ҹ��ڷ� ����
		//String str = "�����ٶ�"; //���ڿ� ���� 
		/*
		char ab = 'a';
		System.out.print(Integer.toString(ab));
		*/
	}
}
