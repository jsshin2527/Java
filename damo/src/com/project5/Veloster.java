package com.project5;

import java.util.Scanner;

public class Veloster extends Car{
	Scanner sc = new Scanner(System.in);
	public static final String op[] = {"1.4�ͺ� Modern(���)","1.4�ͺ� ModernCore(����ھ�)","1.6�ͺ� Sport(������)"
			,"1.6�ͺ� SportCore(�������ھ�)", "1.6�ͺ� JBL Extreme Sound Edition(JBL �ͽ�Ʈ�� ���� �����)", "1.6�ͺ� Extreme Driving Edition(�ͽ�Ʈ�� ����̺� �����)"};
	public static final Integer pr[] = {20960000,22960000,21600000,23960000,26350000,26070000};
	
	Veloster()
	{
		this.carName = "���ν���";
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
