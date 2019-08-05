package com.project5;

import java.util.Scanner;

public class Veloster extends Car{
	Scanner sc = new Scanner(System.in);
	public static final String op[] = {"1.4터보 Modern(모던)","1.4터보 ModernCore(모던코어)","1.6터보 Sport(스포츠)"
			,"1.6터보 SportCore(스포츠코어)", "1.6터보 JBL Extreme Sound Edition(JBL 익스트림 사운드 에디션)", "1.6터보 Extreme Driving Edition(익스트림 드라이빙 에디션)"};
	public static final Integer pr[] = {20960000,22960000,21600000,23960000,26350000,26070000};
	
	Veloster()
	{
		this.carName = "벨로스터";
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
