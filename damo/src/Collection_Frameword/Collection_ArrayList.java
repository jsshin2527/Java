package Collection_Frameword;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collection_ArrayList {

	public static void main(String[] args) {

		ArrayList<String> lists = new ArrayList<>();
		
		lists.add("서울");
		lists.add("부산");
		lists.add("대구");
		
		//기존 iterator
		Iterator<String> it = lists.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.print(str+ " ");
		}
		System.out.println();
		
		//ListIterator
		/*
		ListIterator<String> it1 = lists.listIterator();
		
		while(it1.hasNext()) {
			System.out.print(it.next()+" ");
		}	
		System.out.println();
		
		while(it1.hasPrevious()) {
			System.out.print(it1.previous()+" ");
		}
		System.out.println();
		*/
		
		List<String> lists1 = new ArrayList<>();
		
		lists1.addAll(lists);
		
		lists1.add("인천");
		
		int i = lists1.indexOf("부산");
		lists1.add(i+1, "광주");
		
		for (String c : lists1) {
			System.out.print(c + " "); 
			
		}
		System.out.println();
		
		String str;
		
		Iterator<String> it2 = lists1.iterator();
		
		while(it2.hasNext()) {
			str = it2.next();
			if(str.startsWith("부산"));{ //startsWith메소드를 사용하면 시작하는 문자를 찾을수 있음 
				System.out.print(str+ " ");
			}
		}
		System.out.println();
	}
	
}
