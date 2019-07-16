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
 * List(Interface) - List(Class),Vector(Class)  list ��ü�� Object Ŭ���� 
 * Map(Interfece) - HashMap(Class,HashTable(Class)
 * List�� �� �������� ?? 
 * Map�� �������� �������̽� �Դϴ�. 
 * 
 * (�����ϴ�) 
 */

package com.day14;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class ArrayList_Collection {

	private static  final String city[] = {"����","���","�뱸","��õ","����","����","�λ�"};
	
	public static void main(String[] args) {
		
		//���ʸ� 
		//��� Ÿ���� �ڷ����� ���� ���� �𸣱� ������ ���ʸ��� ����մϴ�.
		//Vector�� ���� ���� v�� String ���� ���� �ְ� ǥ�� 
		Vector<String> v = new Vector<String>(); //S,I Object Class 
		// upcasting �� 
		// �ڽ��� �޼ҵ带 ����Ҽ��� �����ϴ�. 
		// List<String> v = new Vector(String>();
		//v.capacity()�޼ҵ带 ����Ҽ��� �����ϴ� 
		// arraylist�� ������ �ִ� �޼ҵ��� ���� ���� �����ϴ�. 
		
		String str;
		//������ �ʱⷮ 
		//������ �ʱⷮ 10�� �� �ڵ����� �ø� 
		// 7,8 ���� �����Ͱ� ���� �ڵ������� 10���� �ø��ϴ�. 
		
		System.out.println("������ �ʱ� �뷮 : "+v.capacity()+"��");
		
		//v.add(10) ������ ���� 
		
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			str = it.next();
			System.out.println(str + " ");
		}
		//���Ϳ� ������ �߰� 
		for (String c : city) {
			v.add(c); //Upcasting 
		}
		System.out.println("������ ���� : " + v.size() + "��" );
		v.set(0,"Seoul"); // ������ ���� 
		v.set(1,"Busan");
		
		for(String c : v) {
			System.out.print(c+" ");
		}
		System.out.println();
		
		//���� 
		v.insertElementAt("���ѹα�" , 0);
		for (String s : v) {
			System.out.print(s+" ");
		}
		
		System.out.println();
		System.out.println("������ �ʱ� �뷮 : "+v.capacity()+"��");
		System.out.println("������ ���� : " + v.size() + "��" );
		
		
		// �˻� 
		int index = v.indexOf("�뱸"); //3
		//int index = Collections.binarySearch(v,"����"); //���ڸ� �˻� ���� 
		//���࿡ 
		if(index != -1 /* ���� -1�� �ƴϸ��� ���� ����մϴ�. */) {
		// ������ ���� ������ 
			System.out.println("�˻� ���� :" + index);//3
			System.out.println(v.get(index));
		}else {
			System.out.println("�˻� ���� :" + index);//-1
		}
		//�������� ���İ��� 
		Collections.sort(v);
		for (String s : v) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		//���� ���� ���İ���  Collections.reverseOrder 
		Collections.sort(v, Collections.reverseOrder());
		for (String s : v) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		//������ ���� 
		v.remove("Busan"); //v.remove(7) 
		for (String s : v) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("������ �ʱ� �뷮 : "+v.capacity()+"��");
		System.out.println("������ ���� : " + v.size() + "��" );
		
		for (int i = 0; i < 20;i++) {
			v.add(Integer.toString(i)); //���ڿ��� ��ȯ 
		}
		
		for (String s : v) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("������ �ʱ� �뷮 : "+v.capacity()+"��");
		System.out.println("������ ���� : " + v.size() + "��" );
		// 8��° �������� �뷮�� �÷����� 
		// Ư�� ���� ���� 
		for (int i = 1; i <=10; i++) {
			v.remove(5);			
		}
		for (String s : v) {
			System.out.print(s+" ");
		}
		//�÷��� ������ ������ �پ���� �ʽ��ϴ�. 
		System.out.println();
		System.out.println("=============Ư�� ���� ����=============");
		System.out.println("������ �ʱ� �뷮 : "+v.capacity()+"��");
		System.out.println("������ ���� : " + v.size() + "��" );

		//���� ���� �������� ����� 
		System.out.println("=============���� ���� �������� �����=============");
		v.trimToSize();
		System.out.println("������ �ʱ� �뷮 : "+v.capacity()+"��");
		System.out.println("������ ���� : " + v.size() + "��" );
		
		System.out.println("=============��� ������ ����=============");
		v.clear();
		System.out.println("������ �ʱ� �뷮 : "+v.capacity()+"��");
		System.out.println("������ ���� : " + v.size() + "��" );
		
		v.trimToSize();
		System.out.println("������ �ʱ� �뷮 : "+v.capacity()+"��");
		System.out.println("������ ���� : " + v.size() + "��" );
		
	}		
}

	

