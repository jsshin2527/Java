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
 * List(Interface) - List(Class),Vector(Class)  list 자체가 Object 클래스 
 * Map(Interfece) - HashMap(Class,HashTable(Class)
 * List는 왜 빠른가요 ?? 
 * Map은 범용적인 인터페이스 입니다. 
 * 
 * (수집하다) 
 */

package com.day14;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class ArrayList_Collection {

	private static  final String city[] = {"서울","경기","대구","인천","광주","대전","부산"};
	
	public static void main(String[] args) {
		
		//제너릭 
		//어느 타임의 자료형이 대입 될지 모르기 때문에 제너릭을 사용합니다.
		//Vector의 참조 변수 v는 String 형만 들어갈수 있게 표현 
		Vector<String> v = new Vector<String>(); //S,I Object Class 
		// upcasting 은 
		// 자식의 메소드를 사용할수가 없습니다. 
		// List<String> v = new Vector(String>();
		//v.capacity()메소드를 사용할수가 없습니다 
		// arraylist가 가지고 있는 메소드의 양이 별로 없습니다. 
		
		String str;
		//벡터의 초기량 
		//벡터의 초기량 10개 씩 자동으로 늘림 
		// 7,8 개쯤 데이터가 들어가면 자동적으로 10개를 늘립니다. 
		
		System.out.println("벡터의 초기 용량 : "+v.capacity()+"개");
		
		//v.add(10) 들어갈수가 없음 
		
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			str = it.next();
			System.out.println(str + " ");
		}
		//벡터에 데이터 추가 
		for (String c : city) {
			v.add(c); //Upcasting 
		}
		System.out.println("데이터 갯수 : " + v.size() + "개" );
		v.set(0,"Seoul"); // 데이터 수정 
		v.set(1,"Busan");
		
		for(String c : v) {
			System.out.print(c+" ");
		}
		System.out.println();
		
		//삽입 
		v.insertElementAt("대한민국" , 0);
		for (String s : v) {
			System.out.print(s+" ");
		}
		
		System.out.println();
		System.out.println("벡터의 초기 용량 : "+v.capacity()+"개");
		System.out.println("데이터 갯수 : " + v.size() + "개" );
		
		
		// 검색 
		int index = v.indexOf("대구"); //3
		//int index = Collections.binarySearch(v,"대전"); //문자만 검색 가능 
		//만약에 
		if(index != -1 /* 보통 -1이 아니면을 많이 사용합니다. */) {
		// 데이터 값이 있으면 
			System.out.println("검색 성공 :" + index);//3
			System.out.println(v.get(index));
		}else {
			System.out.println("검색 실패 :" + index);//-1
		}
		//오름차순 정렬가능 
		Collections.sort(v);
		for (String s : v) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		//내림 차순 정렬가능  Collections.reverseOrder 
		Collections.sort(v, Collections.reverseOrder());
		for (String s : v) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		//데이터 삭제 
		v.remove("Busan"); //v.remove(7) 
		for (String s : v) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("벡터의 초기 용량 : "+v.capacity()+"개");
		System.out.println("데이터 갯수 : " + v.size() + "개" );
		
		for (int i = 0; i < 20;i++) {
			v.add(Integer.toString(i)); //문자열로 변환 
		}
		
		for (String s : v) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("벡터의 초기 용량 : "+v.capacity()+"개");
		System.out.println("데이터 갯수 : " + v.size() + "개" );
		// 8번째 정도에서 용량이 늘려간다 
		// 특정 범위 삭제 
		for (int i = 1; i <=10; i++) {
			v.remove(5);			
		}
		for (String s : v) {
			System.out.print(s+" ");
		}
		//늘려간 데이터 공간은 줄어들지 않습니다. 
		System.out.println();
		System.out.println("=============특정 범위 삭제=============");
		System.out.println("벡터의 초기 용량 : "+v.capacity()+"개");
		System.out.println("데이터 갯수 : " + v.size() + "개" );

		//벡터 공간 수동으로 지우기 
		System.out.println("=============벡터 공간 수동으로 지우기=============");
		v.trimToSize();
		System.out.println("벡터의 초기 용량 : "+v.capacity()+"개");
		System.out.println("데이터 갯수 : " + v.size() + "개" );
		
		System.out.println("=============모든 데이터 삭제=============");
		v.clear();
		System.out.println("벡터의 초기 용량 : "+v.capacity()+"개");
		System.out.println("데이터 갯수 : " + v.size() + "개" );
		
		v.trimToSize();
		System.out.println("벡터의 초기 용량 : "+v.capacity()+"개");
		System.out.println("데이터 갯수 : " + v.size() + "개" );
		
	}		
}

	

