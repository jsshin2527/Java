package com.project5;

import java.util.Scanner;

public class Tucsan extends Car{
	Scanner sc = new Scanner(System.in);
	public static final String op[] = {"Smart(스마트)","Modern(모던)","Premium(프리미엄)"};
	public static final Integer pr[] = {24300000,25570000,28470000};
	
	Tucsan() // 투싼생성자
	{
		this.carName = "투싼";
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
