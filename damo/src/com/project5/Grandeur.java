package com.project5;

import java.util.Scanner;

public class Grandeur extends Car{
	Scanner sc = new Scanner(System.in);
	public static final String op[] = {"Modern(모던)","Premiun(프리미엄)","Exclusive Special(익스클루시브 스페셜)","Celebrity(셀러브리티)"};
	public static final Integer pr[] = {31120000,32350000,36080000,42700000};
	
	
	Grandeur() // 그랜저생성자
	{
		this.carName = "그랜저";
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
