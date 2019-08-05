package com.project5;

public class WarningMsg implements Runnable {

	@Override
	public void run() {

		int i=0;

		while(true) {
						
			System.out.println("\n");
			System.out.println("          ┌──────────────────────────────────┐");i++;
			try {Thread.sleep(500);} catch (Exception e) {}
			System.out.println("          │                                                                    │");i++;
			try {Thread.sleep(500);} catch (Exception e) {}
			System.out.println("          │      돈은 최선의 종이요, 최악의 주인이다. - 프랜시스 베이컨        │");i++;
			try {Thread.sleep(700);} catch (Exception e) {}
			System.out.println("          │                                                                    │");i++;
			try {Thread.sleep(500);} catch (Exception e) {}
			System.out.println("          │       남의 돈에는 날카로운 이빨이 돋아 있다. - 러시아 속담         │");i++;
			try {Thread.sleep(700);} catch (Exception e) {}
			System.out.println("          │                                                                    │");i++;
			try {Thread.sleep(500);} catch (Exception e) {}
			System.out.println("          │            빚을 갚지 않는 자는 도둑질을 한 것과 같다.              │");i++;
			try {Thread.sleep(700);} catch (Exception e) {}
			System.out.println("          │                                                                    │");i++;
			try {Thread.sleep(500);} catch (Exception e) {}
			System.out.println("          └──────────────────────────────────┘");i++;
			System.out.println();

			break;
		}
	}
}
