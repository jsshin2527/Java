package com.project5;

import java.util.Scanner;

public class Sonata extends Car{
	Scanner sc = new Scanner(System.in);
	public static final String op[] = {"Smart(����Ʈ)","Premiun(�����̾�)","Premium family(�����̾� �йи�)",
			"Premium millennual(�����̾� �з��Ͼ�)", "Inspiration(�ν��۷��̼�)"};
	public static final Integer pr[] = {23460000,25920000,27980000,29940000,32890000};
	
	Sonata()
	{
		this.carName = "�ҳ�Ÿ";
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
