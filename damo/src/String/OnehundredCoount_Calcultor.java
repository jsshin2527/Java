package String;

import java.util.Calendar;
import java.util.Scanner;
public class OnehundredCoount_Calcultor {

	public static void main(String[] args) {

		int year,month,day,week,afterday;
		
		String[] weekDay = {"��","��","ȭ","��","��","��","��"};
		
		Calendar now = Calendar.getInstance();
		
		Scanner sc = new Scanner(System.in);
		//input 
		
		System.out.print("�⵵�� �Է��ϼ��� : ");
		year =sc.nextInt();

		System.out.print("���� �Է��ϼ��� : ");
		month =sc.nextInt();
	
		System.out.print("���� �Է��ϼ��� : ");
		day =sc.nextInt();
		
		System.out.print("���� �ڷ� ���ðڽ��ϱ�?  : ");
		afterday =sc.nextInt();
		
		now.set(year,month-1,day);
		
		year  = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH)+1;
		day   = now.get(Calendar.DATE);
		week  = now.get(Calendar.DAY_OF_WEEK);
		System.out.println("���� ��¥�� "+year+"��"+month+"��"+day+"��"+weekDay[week-1]+"���� �Դϴ�.");
		
		now.add(Calendar.DATE,afterday);
		
		year  = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH)+1;
		day   = now.get(Calendar.DATE);
		week  = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(afterday+"�� ��¥�� "+year+"��"+month+"��"+day+"��"+weekDay[week-1]+"���� �Դϴ�.");
		
		
	}

}
