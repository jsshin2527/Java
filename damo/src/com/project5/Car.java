package com.project5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Car {

	Scanner sc = new Scanner(System.in);
	String carName;
	int optnum;
	String carOption;
	int carPrice;
	ArrayList<String> car = new ArrayList<>();  // 차 종류를 list에 저장
	LinkedHashMap<String, Integer> opt = new LinkedHashMap<>(); // 차 옵션별 가격을 map에 저장
	StringBuffer sb = new StringBuffer();
	String pristr;
	
	Car() // Car객체 생성시 차의 종류를 등록
	{
		car.add("아반떼");
		car.add("그랜저");
		car.add("싼타페");
		car.add("소나타");
		car.add("벨로스터");
		car.add("투싼");
	}
	public String getcarName() {
		return carName;
	}
	
	public void inputOption() throws InterruptedException
	{
		do
		{	
			System.out.println();
			System.out.println("                                         옵션을 입력하세요                                          \n");
			Iterator<String> it = opt.keySet().iterator();
			int inx=1;
			
			while(it.hasNext()) // 각 차에 맞는 옵션 출력
			{
				String str = it.next();
				int cnt = (94-str.length())/2;
				for(int i=0; i<cnt; i++)
					System.out.print(" ");
				System.out.print((inx++) + "." + str);
				for(int i=0; i<(96-cnt-str.length()); i++)
					System.out.print(" ");
				System.out.println();
			}
			System.out.print("=> ");
			optnum= sc.nextInt();
			}while(optnum<1||optnum>opt.size());
		//
	}

	public void setcarOption(String carOption) {
		this.carOption = carOption;
	}
	public String getcarOption() {
		return carOption;
	}	
	public void setcarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	public int getcarPrice() {
		return carPrice;
	}
	public void changeToWon() {
		
		pristr = Integer.toString(getcarPrice());
		sb.append(pristr);
		int cnt=0;
		int len = sb.length();
		for(int i=len-1; i>=0; i--) // 돈(원화)에 3자리수마다 ,로 표시
		{
			cnt++;
			if(cnt==3 && i != 0)
			{
				sb.insert(i, ",");
				cnt=0;
			}
		}
		pristr = sb.toString();
	}
	
	public void print() throws InterruptedException  // 최종 출력
	{
		Thread.sleep(500);				
		System.out.println();
		changeToWon();
		
		int cnt = (90-getcarName().length())/2;
		for(int i=0; i<cnt; i++)
			System.out.print(" ");
		System.out.println("차종 : " + getcarName());
		
		cnt = (90-getcarOption().length())/2;
		for(int i=0; i<cnt; i++)
			System.out.print(" ");
		System.out.println("옵션 : " + getcarOption());
		System.out.println();
		
		cnt = (90-pristr.length()-10)/2;
		for(int i=0; i<cnt; i++)
			System.out.print(" ");
		
		System.out.println("대출 가능 금액 : " + pristr + "원");
		System.out.println("\n");
		// 사용할 최종가격(Integer) => getcarPrice();
		
	}
	
}