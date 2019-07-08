package com.day8;

import java.util.Calendar;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Data ob = new Data(); //메모리에 적재 
		//ob.print(); 일반 객체 호출 
		
		//static 메소드를 호출할때 클래스 이름을 앞에 붙여서 구분을 하는것이 중요하다
		//들어 누운 static 변수만 표시가 된다 
		Data.getPrint();
		Data.name = "슬기";
		
		Calendar now = Calendar.getInstance(); //시스템의 날자를 저장하고있는 static 변수
											   // 이미 메모리상에 올려저 있다 
	}

}
