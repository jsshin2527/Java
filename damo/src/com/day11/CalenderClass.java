package com.day11;

import java.util.Calendar;
import java.util.GregorianCalendar;;

public abstract class CalenderClass {

	public static void main(String[] args) {

		//Calendar cal = new GregorianCalendar(); //UPCAST	
		
		Calendar now = Calendar.getInstance(); //call by reference 
		
		int y = now.get(Calendar.YEAR); //static final 
		int m = now.get(Calendar.MONTH)+1; //�� (0~11)
		int d = now.get(Calendar.DATE);  
		int w = now.get(Calendar.DAY_OF_WEEK); //���Ǽ� (1~7= ��:1)

		String[] week = {"��","��","ȭ","��","��","��","��"};
		System.out.println(y+"-"+m+"-"+d+"-"+week[w-1]+"����");

		//���� ù�� ���� ���ϱ� 
		int startDay = now.getActualMinimum(Calendar.DATE);
		int endDay = now.getActualMaximum(Calendar.DATE);
		
		System.out.println(startDay+":"+endDay);	
		//��¥ ���ϱ� 
		//ȣ���� �ð��� ���ϴ� �ҽ� 
		System.out.printf("%tF\n",now);
		System.out.printf("%tT\n",now);
		// ���� ���� �������� -1 ���ζ��� +1
		System.out.println("2020-10-10�� ��¥ ���ϱ�");
		now.set(2020,10-1,10);	
		y = now.get(Calendar.YEAR); //static final 
		m = now.get(Calendar.MONTH)+1; //�� (0~11)
		d = now.get(Calendar.DATE);  
		w = now.get(Calendar.DAY_OF_WEEK); //���Ǽ� (1~7= ��:1)
		
		System.out.println(y+"-"+m+"-"+d+"-"+week[w-1]+"����");

	}
}
