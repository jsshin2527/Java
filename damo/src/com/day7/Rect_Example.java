package com.day7;

import java.util.Scanner;

public class Rect_Example {//�簢���� �ѷ��� ���̸� ���������� ����� ȸ��
	
	int w,h;//instance����(��������:������)(������ �������)
	//Ŭ���� �� ��𼭳� ��� ����
	
	public void input() {//method
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����?");
		w = sc.nextInt();
		
	    
		System.out.print("����?");
		h = sc.nextInt();
				
		
	}
	
	public int area() {
		
		int result;//����ڿ��� �� ���� ��Ƴ��´�.�׸��� ����
		           //���������� �ٱ����� ���� �� ����
		
		result = w*h;
		
		return result;//������ int�� ������ ����
		
	}
	
	public int length() {
		
		return (w+h)*2;//�����͸� ������ ����//���� ������ ���ٷ� ����
		
	}
	
	public void print(int a,int l) {
		
		System.out.println("����:" + w);
		System.out.println("����:" + h);
		System.out.println("����:" + a);
		System.out.println("�ѷ�:" + l);
		
		
	}

}
