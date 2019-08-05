package com.project5;

import java.util.Scanner;

public class Sonata extends Car{
	Scanner sc = new Scanner(System.in);
	public static final String op[] = {"Smart(스마트)","Premiun(프리미엄)","Premium family(프리미엄 패밀리)",
			"Premium millennual(프리미엄 밀레니얼)", "Inspiration(인스퍼레이션)"};
	public static final Integer pr[] = {23460000,25920000,27980000,29940000,32890000};
	
	Sonata()
	{
		this.carName = "소나타";
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
