/* 
�ڿ��� ������ ������ �˾ƺ��� ���α׷��Դϴ�. �������� �Է¹޾� ���� ������ �ѷ��� ����ϴ� ���α׷��Դϴ�. 

�ſ� �߿� 
�ش� Ŭ���� �ǹ� �߿�
Scanner �� BufferedReader �� ���̸� �˾ƾ��Ѵ� 
System.in�� Ű����� ���� ����ڷ� ���� �Է��� �޴� ǥ�� �Է½�Ʈ�� ��ü�� ��Ÿ���ϴ�. 
�׸��� ���� ���� InputStream �Դϴ�.
Ű����� �Է��� �Ѱ��� ����(1byte)�� ���� �Ѱ��� �о� �´� 
15.4�� �Է��ϸ� 1->5->.4 ������ �о� �´� 
InputStreamReader : Ű����� �Է��� 1byte�� ���ڷ� ��ȯ (�긴�� Ŭ����) 
BufferedReader :���۸� ����� �����͸� ���� 

*/
package com.day;

import java.io.BufferedReader;
import java.io.InputStreamReader; 
import java.io.IOException; //3���� ��Ű���� import �� �ҷ��´� 

class JavaDataType2 
{
	public static void main (String[] args) throws IOException 
	{
		/*
		System.out.println("���� ���� �Է��Ͻÿ� ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input1 =Integer.parseInt(br.readLine());
	    System.out.println("�ش� �������� "+input1+" �Դϴ�");
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double r;
		//double area,length;
		double area;
		double length;
		System.out.print("�������� �Է��ϼ��� : ");
		r = Double.parseDouble(br.readLine()); 
		/*
		br.readLine�� �Է°��� ���ڷ� �о� ���� ��ȯ�մϴ�. 
		���� Integer.parseInt�� ���� ���� ���� ������ ��ȯ�Ͽ� r�� �����մϴ�. 
		�Ǽ������� ������ �ϰ� �ʹٸ� Double.parseDouble(br.readLine()); �� ���� ���ش� 
		*/
		area = r*r*3.14f;
		length = r*2*3.14f;
		// area = (double) r*r*3.14; ����� �� ��ȯ (����)
		System.out.println("****************�����***************");
		System.out.println("������ : "+ r);
		System.out.println("����   : "+ area);
		System.out.println("�ѷ�   : "+ length);
	}
}
