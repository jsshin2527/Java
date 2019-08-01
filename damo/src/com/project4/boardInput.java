package com.project4;

import java.util.Scanner;

public class boardInput {

	public void lis() throws Exception {
		
		Scanner sc = new Scanner(System.in);

		Board obj = new BoardImpl();

		int ch;

		System.out.println("                         ※ 진료 대기 현황 ※");
		System.out.println();
		
		obj.restore();
		
		while (true) {

			do {

				System.out.print(" 1.대기자 명단  2.대기자 추가  3.대기자 삭제  4. 업데이트  5. 첫화면\n▷");
				ch = sc.nextInt();

			} while (ch < 1 || ch > 5);

			switch (ch) {

			case 1:
				obj.print();
				break;
			case 2:
				obj.input();
				break;
			case 3:
				obj.delete();
				break;
			case 4:
				obj.update();
				break;
			case 5:
				obj.store();
				new Main();
				
			}
		}
	}
}
