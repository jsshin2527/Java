package com.day;
/* 
    ȸ�� �Է� ���α׷� �����ϱ� 
	���� ���� ���� ���� ������ �ؾ� �մϴ�. 
	ȸ����,����,����,��°� 
	��°� 
	ȸ����,����,����,��°� ���� ���� ����ؾ� �Ѵ�. 
	�Է� ���� �ޱ����� BufferedReader Ŭ�������� member��� �ν��Ͻ�(��ü��) ���� �մϴ�.
	������ 
	name    : ȸ�� �̸� 
	sex     : ���� 
	address : �ּ� 
	age     : ���� 
	email   : �̸��� �ּ�
	Tip �ڵ��� �Ҷ����� �鿩���⸦ �ؾ��Ѵ� 
*/

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;

class PrivacyAccount 
{
	public static void main(String[] args) throws IOException
	{

	String membername,memberaddress,membersex,memberemail;
	int memberage;
	BufferedReader member = new BufferedReader (new InputStreamReader(System.in));
	System.out.print("**** �ȳ��ϼ��� ȸ�������� �Է��ϼ��� ****\n");
	System.out.print("ȸ�� ���� �Է��ϼ��� : ");
	membername = member.readLine();
	System.out.print("���� �Է��ϼ��� : ");
	membersex = member.readLine();
	System.out.print("�ּҸ� �Է��ϼ��� : ");
	memberaddress = member.readLine();
	System.out.print("���̸� �Է��ϼ��� : ");
	memberage  = Integer.parseInt(member.readLine());
	System.out.print("�̸��� �ּҸ� �Է��ϼ��� : ");
	memberemail = member.readLine();
	System.out.println("");
	System.out.println("****�Է��Ͻ� ȸ�� ���� �Դϴ�.****");
	System.out.println(membername+"�� ������ "+membersex+"�Դϴ�.");
	System.out.println(membername+"�� �ּҴ� "+memberaddress+"�Դϴ�.");
	System.out.println(membername+"�� ���̴� "+memberage+"�Դϴ�.");
	System.out.println(membername+"�� �̸��� �ּҴ� "+memberemail+"�Դϴ�.");
	}
}
