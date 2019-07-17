package com.day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class TestCodeing {

	public static void main(String[] args) {

		
		Set<String> s= new HashSet<>();
		
		s.add("linux");
		s.add("clanguage");
		s.add("java");
		s.add("Data Structure");
		
		System.out.println(s);
		
		Iterator<String> it = s.iterator();
		
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str+" ");
		}
		s.add("linux");
		
		System.out.println(s);
		
		
		System.out.println("=================================");
		
		Stack<String> st = new Stack<>();
		
		st.push("one");
		st.add("two");
		st.push("three");
		st.push("four");
		System.out.println("====stack example=====");
		while(!st.empty()) {
			System.out.println(st.pop()+ " ");
		}
		System.out.println();
		System.out.println("=================================");
		
		Queue<String> q =new LinkedList<>();
		
		q.offer("one");
		q.offer("two");
		q.offer("three");
		q.offer("four");
		
		System.out.println("====Queue example=====");
		
		while(q.peek() != null) {
			System.out.print(q.poll()+" ");
		}
		System.out.println("\n=======LinkedList============");
		List<String> lists1 = new LinkedList<>();
		lists1.add("A");
		lists1.add("B");
		lists1.add("C");
		lists1.add("D");
		lists1.add("E");
		lists1.add("F");
		lists1.add("G");
		lists1.add("H");
		List<String> lists2 = new LinkedList<>();
		lists2.add("1");
		lists2.add("2");
		lists2.add("3");
		lists2.add("4");
		lists2.add("5");
		lists2.add("6");
		lists2.add("7");
		
		lists2.addAll(lists1);
		for(String ss : lists1) {
			System.out.print(ss+"");
		}
		for(String ss : lists2) {
			System.out.print(ss+"");
		}
		lists2.subList(2, 7).clear();
		System.out.println("\n===========================");
		for(String ss : lists1) {
			System.out.print(ss+"");
		}
		for(String ss : lists1) {
			System.out.print(ss+"");
		}
	}
	
}	
