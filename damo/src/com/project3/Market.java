package com.project3;

import java.util.Scanner;

public class Market {
	
	public static String id="";
	
	public Market() {
		main(null);
	}
	
	public Market(String id) {
		this.id = id;
		main(null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc = new Scanner(System.in);
		
		System.out.println("\n-------------------  ���� �ڳ�  -------------------");
		System.out.println("�ǽð� ��ŷ������ �����帳�ϴ�!");
		System.out.print("������ ����Ḧ �Է����ּ���: ");
	 	
		MarketSearch ob = new MarketSearch(id);
		ob.set(sc.next());
		ob.Searching();
		
	}
}
