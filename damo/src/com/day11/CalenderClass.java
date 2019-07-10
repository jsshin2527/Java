package com.day11;

import java.util.Calendar;
import java.util.GregorianCalendar;;

public abstract class CalenderClass {

	public static void main(String[] args) {

		//Calendar cal = new GregorianCalendar(); //UPCAST	
		
		Calendar now = Calendar.getInstance(); //call by reference 
		
		int y = now.get(Calendar.YEAR); //static final 
		int m = now.get(Calendar.MONTH)+1; //월 (0~11)
		int d = now.get(Calendar.DATE);  
		int w = now.get(Calendar.DAY_OF_WEEK); //주의수 (1~7= 일:1)

		String[] week = {"일","월","화","수","목","금","토"};
		System.out.println(y+"-"+m+"-"+d+"-"+week[w-1]+"요일");

		//달의 첫날 말일 구하기 
		int startDay = now.getActualMinimum(Calendar.DATE);
		int endDay = now.getActualMaximum(Calendar.DATE);
		
		System.out.println(startDay+":"+endDay);	
		//날짜 구하기 
		//호출할 시간을 구하는 소스 
		System.out.printf("%tF\n",now);
		System.out.printf("%tT\n",now);
		// 월은 집어 넣으때는 -1 꺼널때는 +1
		System.out.println("2020-10-10일 날짜 구하기");
		now.set(2020,10-1,10);	
		y = now.get(Calendar.YEAR); //static final 
		m = now.get(Calendar.MONTH)+1; //월 (0~11)
		d = now.get(Calendar.DATE);  
		w = now.get(Calendar.DAY_OF_WEEK); //주의수 (1~7= 일:1)
		
		System.out.println(y+"-"+m+"-"+d+"-"+week[w-1]+"요일");

	}
}
