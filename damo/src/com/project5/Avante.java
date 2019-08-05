package com.project5;

import java.util.Iterator;
import java.util.Scanner;

public class Avante extends Car{
	
	Scanner sc = new Scanner(System.in);
	
	// 옵션-가격 입력
	public static final String op[] = {"Style(스타일)","SmartChoice(스마트초이스)",
			"Smart(스마트)","Best Choice Package(베스트 초이스 패키지)", "Premium(프리미엄)"};
	public static final Integer pr[] = {14110000,17350000, 18030000,19950000,22140000};
	
	Avante() // 아반떼 생성자
	{
		this.carName = "아반떼";
		
		// 옵션과 가격을 map에 저장
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