package com.day8;

//[����1]
//System.in.read()�� ����ؼ� ���ڸ� �Է¹ް�
//�Է¹��� �������� �հ踦 ���Ͻÿ�

//����
//1.BufferedReader X
//2.Scanner X

//���
//���Է�? 10 ������ ��: 55

import java.io.IOException;

public class ASCII48 {

	public static void main(String[] args) throws IOException {

		int n=0,s=0;
		int data;
		System.out.print("��� : ");//100(49,48,48,13����)
		while((data = System.in.read()) !=13){//13�� Enter
			n=n*10+data-48;//����0->ASCII48
		}
		
		for(int i=1;i<=n;i++) {
			s+=i;
		}
		System.out.print("���  : " + s);

	}
}

