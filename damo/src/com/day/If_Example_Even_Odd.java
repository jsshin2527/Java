/*
 	BufferedReader Ŭ������ �̿��Ͽ� ���ڸ� �Է¹޾� ¦�� Ȧ�� ����� �ϴ� ���α׷� 
	��� 
	if   ������ ����  
	for  ���۰� ���� ������ �ִ� ��� for ���� ����ϸ� ���� 
	while  ��� ������ ���� �𸦶� ��� �ϸ� ���� 
	do~while 	
	switch
	{
	�۾��� �ϳ��϶��� �߰�ȣ ������ �����ϴ� }
*/

package com.day;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;

class If_Example_Even_Odd 

{
	public static void main(String[] args) throws IOException

	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int num; //���� �ʱ�ȭ  
		String str ; // �Ϲ������� String �� �ʱ�ȭ
		System.out.print("�� �Է� ?? "); //10
		num = Integer.parseInt(br.readLine());
		/*if (����){
		  �۾� 
		 }
		*/
		/*
		if (num%2==0)
		{
			str = "¦��";
			str = str + "�Դϴ�.";
		}
		if (num%2!=0)
			str = "Ȧ��";	
		System.out.println(num+":"+str);
		*/
		//if~else 
		if (num%2==0)
		{
			str = "¦��";
		}else{
			str = "Ȧ��";
		}
		System.out.println(num+":"+str);
	}
}
