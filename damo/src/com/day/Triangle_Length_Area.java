/*
BufferedReader Ŭ������ �̿��Ͽ� �ﰢ���� �غ��� ���̸� �Է¹޾� �ѷ��� ���̸� ���ϴ� ���α׷� �Դϴ�.
1. float �� double �� ���̸� �˾ƺ��� �ڵ� 
2. �غ��� ���̸� �Է¹޾� �ﰢ���� ���� ���ϱ� 
�غ� : 10
���� : 20
���� : �غ� * ���� /2
*/

package com.day;

import java.io.BufferedReader;

import java.io.InputStreamReader; 

import java.io.IOException;

class Triangle_Length_Area 

{
	public static void main(String[] args) throws IOException

	{
		/* 1. float �� double �� ���̸� �˾ƺ��� �ڵ�*/	
		float f = 0; //0.0
		double d = 0; //0.0
		//�ʱⰪ 
		for (int i=1;i<100000000; i++ ) //i++ = i=i+1
		{
			f+=100000; //f=f+100000; 10->2 2->10 ������ �ٲٴ� �������� �ڿ� 000�� ���� ������ ������ ���� ���̰� ������� �ִ� 
			d+=100000; //d=d+100000;

		}
		System.out.println("float : "+f);
		System.out.println("double : "+d);
		/* �ﰢ�� ���̸� ���ϴ� �ڵ� �ۼ� */
		//������ ���� �������� ������ ���� ������ �ؾ��մϴ�.
		int base,height; 
		// �غ��� ���̸� �Է� �޾ƺ���.
		// �Է� �ޱ� ���� �ʿ��� ��ü�� �����ؾ� �մϴ�. 
		// Ű����� �Է��� ����Ʈ �ڵ带 ���ڿ��� ��ȯ�Ͽ� �Է� �ްڴ�.
		BufferedReader example = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�ﰢ���� ���̸� ���ϰڽ��ϴ�.");
		System.out.print("�غ��� �Է��ϼ��� : " ) ;
		//�غ� �� �Է� �ޱ�  
		base = Integer.parseInt(example.readLine());
		System.out.print("���̸� �Է��ϼ��� : " ); 
		//���� �� �Է� �ޱ� 
		height = Integer.parseInt(example.readLine());
		double Triangle; 
		Triangle = (double)base*height/2;
		//a = (double)(base*height)/2; ����� ����ȯ 
		System.out.println("**************���**************");
		System.out.println("�ﰢ���� ���̴� "+Triangle +"�Դϴ�");
		//%d �� int %f �� float %g�� double 
		//�þ� double ���� int ������ ��ȯ�� �Ѵٸ� ���� ���� ����� ���ɴϴ�. 
	}
}
