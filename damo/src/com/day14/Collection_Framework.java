/*
 * Collection Framework(방법론)
 * JSP/Servlet -> framework -> coding의 방식만 달리지지 기본 원리는 똑같습니다.
 * 자료처리를 위한 클래스을 이미 제공하며 컬렉션 관련 클래스는 list,Vector,Set,Map,ListLinked,TreeSet,HashTable
 * 같은 인터페이스를 상속 받았습니다. 자기 자신이 데이터를 처리 할수 있는 능력은 없지만 인터페이스를 상속 받으므로 
 * 자료처리를 할수있는 역활을 맡는다 
 * collection framework를 왜 사용하나요 
 * 배열의 단점을 보완하기 위해서 사용합니다.
 * 배열의 단점   
 * 미리 크게 잡았을때 메모리의 낭비가 있습니다. (resize 불가능)
 * 중간에 임의의 값을 넣을수 없습니다.
 * 
 * List(Interface) - ArrayList(Class),Vector(Class)  list 자체가 Object 클래스 
 * Map(Interfece) - HashMap(Class,HashTable(Class)
 * List는 왜 빠른가요 ?? 
 * Map은 범용적인 인터페이스 입니다. 
 * 
 * (수집하다) 
 */

package com.day14;

import java.util.Iterator;

import java.util.Vector;

public class Collection_Framework {

	private static  final String city[] = {"서울","경기","대구","인천","광주","대전","부산"};
	
	public static void main(String[] args) {
		
		Vector v = new Vector(); //S,I Object Class 
		
		//벡터에 데이터 추가 
		for (String c : city) {
			v.add(c); //Upcasting 
		}
		
		//v.add(10);
		
		String str;
		
		str =(String)v.firstElement(); //DownCasting 		
		System.out.println("첫번째 요소 : "+str);

		str =(String)v.lastElement(); //DownCasting 	
		System.out.println("마지막 요소 : "+str);	

		str = (String) v.get(1); //DownCasting 
		System.out.println("두번째 요소 : "+str);
		
		
		for (int i = 0; i < v.size(); i++) {
			
			System.out.println(v.get(i) + "  ") ;
		}	
		//배열 안에 들어가있는 내용은 확장 for문으로도 출력이 가능합니다 
		for(Object s : v){
			
			System.out.println((String)s + " ");
		}
		
		System.out.println();
		
		//Collection 은 전용 출력기 가 있습니다. 
		//iterrator : 반복자 
		Iterator  it = v.iterator(); // <>을 명시하지 않는경우 Object 클래스로 받겠다라는 의미 입니다. 
		
		while(it.hasNext()) {
			str = (String)it.next();
			System.out.println(str +" ");
		}
	
		while(it.hasNext()) {
			str = (String)it.next();
			System.out.println(str +" ");
		}
		while(it.hasNext()) {
			str = (String)it.next();
			System.out.println(str +" ");
		}
	}		
}

	

