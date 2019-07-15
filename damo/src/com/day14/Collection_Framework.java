/*
 * Collection Framework(�����)
 * JSP/Servlet -> framework -> coding�� ��ĸ� �޸����� �⺻ ������ �Ȱ����ϴ�.
 * �ڷ�ó���� ���� Ŭ������ �̹� �����ϸ� �÷��� ���� Ŭ������ list,Vector,Set,Map,ListLinked,TreeSet,HashTable
 * ���� �������̽��� ��� �޾ҽ��ϴ�. �ڱ� �ڽ��� �����͸� ó�� �Ҽ� �ִ� �ɷ��� ������ �������̽��� ��� �����Ƿ� 
 * �ڷ�ó���� �Ҽ��ִ� ��Ȱ�� �ô´� 
 * collection framework�� �� ����ϳ��� 
 * �迭�� ������ �����ϱ� ���ؼ� ����մϴ�.
 * �迭�� ����   
 * �̸� ũ�� ������� �޸��� ���� �ֽ��ϴ�. (resize �Ұ���)
 * �߰��� ������ ���� ������ �����ϴ�.
 * 
 * List(Interface) - ArrayList(Class),Vector(Class)  list ��ü�� Object Ŭ���� 
 * Map(Interfece) - HashMap(Class,HashTable(Class)
 * List�� �� �������� ?? 
 * Map�� �������� �������̽� �Դϴ�. 
 * 
 * (�����ϴ�) 
 */

package com.day14;

import java.util.Iterator;

import java.util.Vector;

public class Collection_Framework {

	private static  final String city[] = {"����","���","�뱸","��õ","����","����","�λ�"};
	
	public static void main(String[] args) {
		
		Vector v = new Vector(); //S,I Object Class 
		
		//���Ϳ� ������ �߰� 
		for (String c : city) {
			v.add(c); //Upcasting 
		}
		
		//v.add(10);
		
		String str;
		
		str =(String)v.firstElement(); //DownCasting 		
		System.out.println("ù��° ��� : "+str);

		str =(String)v.lastElement(); //DownCasting 	
		System.out.println("������ ��� : "+str);	

		str = (String) v.get(1); //DownCasting 
		System.out.println("�ι�° ��� : "+str);
		
		
		for (int i = 0; i < v.size(); i++) {
			
			System.out.println(v.get(i) + "  ") ;
		}	
		//�迭 �ȿ� ���ִ� ������ Ȯ�� for�����ε� ����� �����մϴ� 
		for(Object s : v){
			
			System.out.println((String)s + " ");
		}
		
		System.out.println();
		
		//Collection �� ���� ��±� �� �ֽ��ϴ�. 
		//iterrator : �ݺ��� 
		Iterator  it = v.iterator(); // <>�� ������� �ʴ°�� Object Ŭ������ �ްڴٶ�� �ǹ� �Դϴ�. 
		
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

	

