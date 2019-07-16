package com.day14;

import java.util.Iterator;
import java.util.Vector;

public class Iterator_Upcating_DownCasting {

	public static void main(String[] args) {
	
		Vector v = new Vector();
		
		//UpCasting 3번 적용되었습니다. 
		
		
		v.add("서울");
		v.add(30);
		v.add('A');
		
		String str;
		Integer i;
		char c;
		
		str = (String)v.get(0);
		System.out.println(str);
		i = (Integer)v.get(1);
		System.out.println(i);
		c = (char)v.get(2);
		System.out.println(c);
		
		Iterator it = v.iterator();
		
		//instance of 의 용도 예제 
		// 참조 변수의 참조 타입을 알기 위해 사용 
		// 제너릭을 사용하는 이유 
		
		while(it.hasNext()) {
			Object o = it.next();
			if( o instanceof String) {
				str = (String)o;
				System.out.println(str);
			}else if( o instanceof Integer) {
				i = (Integer)o;
				System.out.println(i);
			}else if( o instanceof Character) {
				c = (char)o;
				System.out.println(c);
			}		
		}	
	}
}
