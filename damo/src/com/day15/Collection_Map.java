/*
 * Map<Ű,��> - �������̽� 
 * HashTable(C) - Vector
 * HashMap(C) - ArrayList
 * Ű�� �ߺ� ����  �������� �����ϴ�. 
 * Ű�� �ߺ� ���� ������ ������ �����Ͱ� ���� �˴ϴ�. (���� �Դϴ�.) 
 * Map�� Iterator�� �����ϴ�. 
 * ģô�� Iterator�� ���� ����մϴ�. 
 * put(Ű,��) : �Է� 
 * get(Ű) : ���  key ���� �ָ� value�� ����ϰ� �˴ϴ�. 
 * 
 */
package com.day15;

import java.util.Hashtable;
import java.util.Iterator;

public class Collection_Map {

	public static final String jumin[] = {"111","222","333","111","555"}; //�ߺ��� �Ǿ�� �ȵ� 
	
	public static final String name[] = {"�����","�̼���","ȫ�浿","��������","Ƽ�Ĵ�"};
	
	public static void main(String[] args) {
		
		Hashtable<String,String> h = new Hashtable<>();
		
		for (int i = 0; i < name.length; i++) {
			
			h.put(jumin[i], name[i]); //�ڱⰡ ���ϴ� ��� ����� �մϴ�. 
		}	
		System.out.println(h);
		
		String str;
		str = h.get("222");
		if(str == null) {
			System.out.println("�ڷ� ���� !");
		}else {
			System.out.println(str);
		}
		/*
		 * h ��ü�� �̿��Ͽ� containskey containsValue �޼ҵ带 �̿��� ���� ���θ� �Ǵ��Ҽ��� �ֽ��ϴ�. 
		 * 
		 */
		
		//Ű�� ���� ����  
		if(h.containsKey("222")) {
			System.out.println("222 �ִ� !");
		}else {
			System.out.println("222 ���� !");
		}
		
		// ���� ���� ���� 
		if(h.containsValue("Ƽ�Ĵ�")) {
			System.out.println("Ƽ�Ĵϰ� �ֽ��ϴ� !");
		}else {
			System.out.println("Ƽ�Ĵϰ� �����ϴ� !");
		}
		
		//������ ���� 
		h.remove("222");
		System.out.println(h);
		
		/*
		 * Ű�� �ڷ����� Set�� �ߺ��� �㿵���� �ʴ� �ڷᱸ���̴�.
		 * Set�� Iterator�� �����ϹǷ� Hashtable,HashMap�� 
		 * keySet() �޼ҵ�� iterator�� ���Ѵ�.
		 */
		Iterator<String> it = h.keySet().iterator(); //List�� �ٸ��� 
		while(it.hasNext()) {
			String key = it.next();
			String value = h.get(key); //������ �� �����մϴ�. 
			
			System.out.println(key + ":"  + value);
		}
	}
}
