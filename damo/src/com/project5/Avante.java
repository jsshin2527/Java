package com.project5;

import java.util.Iterator;
import java.util.Scanner;

public class Avante extends Car{
	
	Scanner sc = new Scanner(System.in);
	
	// �ɼ�-���� �Է�
	public static final String op[] = {"Style(��Ÿ��)","SmartChoice(����Ʈ���̽�)",
			"Smart(����Ʈ)","Best Choice Package(����Ʈ ���̽� ��Ű��)", "Premium(�����̾�)"};
	public static final Integer pr[] = {14110000,17350000, 18030000,19950000,22140000};
	
	Avante() // �ƹݶ� ������
	{
		this.carName = "�ƹݶ�";
		
		// �ɼǰ� ������ map�� ����
		for(int i=0; i<op.length; i++)
		{
			opt.put(op[i], pr[i]);
		}
	}

	public void setPrice()
	{
		setcarOption(op[optnum-1]);
		setcarPrice(opt.get(op[optnum-1]));
	}
}