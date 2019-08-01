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
		
		System.out.println("\n-------------------  마켓 코너  -------------------");
		System.out.println("실시간 랭킹순으로 보여드립니다!");
		System.out.print("구매할 식재료를 입력해주세요: ");
	 	
		MarketSearch ob = new MarketSearch(id);
		ob.set(sc.next());
		ob.Searching();
		
	}
}
