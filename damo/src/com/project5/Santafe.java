package com.project5;

import java.util.Scanner;

public class Santafe extends Car{
	Scanner sc = new Scanner(System.in);
	public static final String op[] = {"Premium(�����̾�)", "Exclusive(�ͽ�Ŭ��ú�)","Prestige(������Ƽ��)"};
	public static final Integer pr[] = {26950000,29500000,32690000};
	
	Santafe()
	{
		this.carName = "��Ÿ��";
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
