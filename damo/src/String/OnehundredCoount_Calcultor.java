package String;

import java.util.Calendar;
import java.util.Scanner;
public class OnehundredCoount_Calcultor {

	public static void main(String[] args) {

		int year,month,day,week,afterday;
		
		String[] weekDay = {"일","월","화","수","목","금","토"};
		
		Calendar now = Calendar.getInstance();
		
		Scanner sc = new Scanner(System.in);
		//input 
		
		System.out.print("년도를 입력하세요 : ");
		year =sc.nextInt();

		System.out.print("월을 입력하세요 : ");
		month =sc.nextInt();
	
		System.out.print("일자 입력하세요 : ");
		day =sc.nextInt();
		
		System.out.print("몇일 뒤로 가시겠습니까?  : ");
		afterday =sc.nextInt();
		
		now.set(year,month-1,day);
		
		year  = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH)+1;
		day   = now.get(Calendar.DATE);
		week  = now.get(Calendar.DAY_OF_WEEK);
		System.out.println("현재 날짜는 "+year+"년"+month+"월"+day+"일"+weekDay[week-1]+"요일 입니다.");
		
		now.add(Calendar.DATE,afterday);
		
		year  = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH)+1;
		day   = now.get(Calendar.DATE);
		week  = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(afterday+"후 날짜는 "+year+"년"+month+"월"+day+"일"+weekDay[week-1]+"요일 입니다.");
		
		
	}

}
