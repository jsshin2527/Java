package com.project5;

import java.util.Scanner;

public class Grandeur extends Car{
	Scanner sc = new Scanner(System.in);
	public static final String op[] = {"Modern(���)","Premiun(�����̾�)","Exclusive Special(�ͽ�Ŭ��ú� �����)","Celebrity(�����긮Ƽ)"};
	public static final Integer pr[] = {31120000,32350000,36080000,42700000};
	
	
	Grandeur() // �׷���������
	{
		this.carName = "�׷���";
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
