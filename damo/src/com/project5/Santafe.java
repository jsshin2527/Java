package com.project5;

import java.util.Scanner;

public class Santafe extends Car{
	Scanner sc = new Scanner(System.in);
	public static final String op[] = {"Premium(프리미엄)", "Exclusive(익스클루시브)","Prestige(프레스티지)"};
	public static final Integer pr[] = {26950000,29500000,32690000};
	
	Santafe()
	{
		this.carName = "산타페";
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
