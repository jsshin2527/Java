package com.project4;

import java.util.Scanner;

public class ChartInput {

	public void chartin() throws Exception {

		Scanner sc = new Scanner(System.in);

		Chart obj = new ChartImpl();

		int ch;

		System.out.println("                    ※ 환자 차트 정보 ※");
		System.out.println();
		
		obj.restore();
		
		
		while (true) {

			do {
				System.out.print(
						"1.차트 입력 \n2.차트 출력 \n3.차트 환자번호 검색 \n4.차트 환자이름 검색 \n5.차트 정보 갱신 \n6.차트 정보 삭제 \n7.차트 정보 저장 \n8.첫 화면 \n▷");
				ch = sc.nextInt();
			} while (ch < 1 || ch > 8);

			switch (ch) {
			case 1:
				obj.input();
				break;
			case 2:
				obj.print();
				break;
			case 3:
				obj.searchPrn();
				break;
			case 4:
				obj.searchName();
				break;
			case 5:
				obj.update();
				break;
			case 6:
				obj.delete();
				break;
			case 7:
				obj.store();
				break;
			case 8:
				new Main();
				
			}

		}

	}

}
