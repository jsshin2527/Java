/*
 * Map<키,값> - 인터페이스 
 * HashTable(C) - Vector
 * HashMap(C) - ArrayList
 * 키는 중복 값을  가질수가 없습니다. 
 * 키가 중복 값을 가지면 마지막 데이터가 저장 됩니다. (수정 입니다.) 
 * Map은 Iterator가 없습니다. 
 * 친척의 Iterator를 빌려 사용합니다. 
 * put(키,값) : 입력 
 * get(키) : 출력  key 값을 주면 value를 출력하게 됩니다. 
 * 
 */
package com.day15;

import java.util.Hashtable;
import java.util.Iterator;

public class Collection_Map {

	public static final String jumin[] = {"111","222","333","111","555"}; //중복이 되어서는 안됨 
	
	public static final String name[] = {"배수지","이순신","홍길동","안젤리나","티파니"};
	
	public static void main(String[] args) {
		
		Hashtable<String,String> h = new Hashtable<>();
		
		for (int i = 0; i < name.length; i++) {
			
			h.put(jumin[i], name[i]); //자기가 원하는 대로 출력을 합니다. 
		}	
		System.out.println(h);
		
		String str;
		str = h.get("222");
		if(str == null) {
			System.out.println("자료 없음 !");
		}else {
			System.out.println(str);
		}
		/*
		 * h 객체를 이용하여 containskey containsValue 메소드를 이용하 존재 여부를 판단할수가 있습니다. 
		 * 
		 */
		
		//키의 존재 여부  
		if(h.containsKey("222")) {
			System.out.println("222 있다 !");
		}else {
			System.out.println("222 없다 !");
		}
		
		// 값의 존재 여부 
		if(h.containsValue("티파니")) {
			System.out.println("티파니가 있습니다 !");
		}else {
			System.out.println("티파니가 없습니다 !");
		}
		
		//데이터 삭제 
		h.remove("222");
		System.out.println(h);
		
		/*
		 * 키는 자료형이 Set은 중복을 허영하지 않는 자료구조이다.
		 * Set은 Iterator가 존재하므로 Hashtable,HashMap의 
		 * keySet() 메소드로 iterator를 구한다.
		 */
		Iterator<String> it = h.keySet().iterator(); //List와 다른점 
		while(it.hasNext()) {
			String key = it.next();
			String value = h.get(key); //한줄이 더 들어가야합니다. 
			
			System.out.println(key + ":"  + value);
		}
	}
}
