package Collection_Frameword;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collection_ArrayList {

	public static void main(String[] args) {

		ArrayList<String> lists = new ArrayList<>();
		
		lists.add("����");
		lists.add("�λ�");
		lists.add("�뱸");
		
		//���� iterator
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
		
		lists1.add("��õ");
		
		int i = lists1.indexOf("�λ�");
		lists1.add(i+1, "����");
		
		for (String c : lists1) {
			System.out.print(c + " "); 
			
		}
		System.out.println();
		
		String str;
		
		Iterator<String> it2 = lists1.iterator();
		
		while(it2.hasNext()) {
			str = it2.next();
			if(str.startsWith("�λ�"));{ //startsWith�޼ҵ带 ����ϸ� �����ϴ� ���ڸ� ã���� ���� 
				System.out.print(str+ " ");
			}
		}
		System.out.println();
	}
	
}
