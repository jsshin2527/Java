package com.day15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Test3 {

	public static void main(String[] args) {
		//Set : 중복을 허용하지 않음 
		Set<String> s = new HashSet<>();
		
		s.add("서울");
		s.add("부산");
		s.add("대구");
		
		System.out.println(s);	
		
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str +" ");
		}
		//중복을 허용하지 않습니다. 
		s.add("서울");
		System.out.println(s);
		
		System.out.println("=================================");
		//Stack 
		Stack<String> st = new Stack<>();
		
		st.push("서울");
		st.add("부산");
		st.push("대구");
		st.push("광주");
		//마지막에 입력을 한것이 가장 먼저 출력이 됩니다. 
		
		while(!st.empty()) {
			System.out.print(st.pop()+ " ");
		}
		System.out.println();
		System.out.println("=================================");
		//Queue 
		Queue<String> q = new LinkedList<>();
		
		q.offer("서울");
		q.offer("부산");
		q.offer("광주");
		q.offer("대구");
		
		while(q.peek()!=null){
			System.out.print(q.poll() + " ");
		}
		System.out.println("\n=================================");
		List<String> lists1 = new LinkedList<>();
		
		lists1.add("A");
		lists1.add("B");
		lists1.add("C");
		lists1.add("D");
		lists1.add("E");
		lists1.add("F");
		lists1.add("G");
		lists1.add("H");
		lists1.add("I");
		lists1.add("G");
		
		List<String> lists2 = new LinkedList<>();
		
		lists2.add("서울");
		lists2.add("부산");
		lists2.add("대구");
		
		lists2.addAll(lists1);
		
		System.out.println("lists1===========================");
		for (String ss : lists1) {
			System.out.print(ss+" ");
		}
		System.out.println("\nlists2===========================");
		for (String ss : lists2) {
			System.out.print(ss+" ");
		}
		//일정 영역 범위를 지울때 사용합니다. 
		
		lists2.subList(2, 5).clear();
		System.out.println("\nlists2===========================");
		for (String ss : lists2) {
			System.out.print(ss+" ");
		}
		String[] str = {"다","나","가","라","마","바"};
		for (String ss : str) {
			System.out.print(ss + "  ");
		}
		System.out.println();
		Arrays.sort(str);
		for (String ss : str) {
			System.out.print(ss + "  ");
		}
	}
}
