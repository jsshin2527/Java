package com.project4;

import java.util.Scanner;


public class Main {
	
	public Main() throws Exception {
		
		Hospitalization h = new HosvotalizationImpl();
		ReservationInput ri=new ReservationInput();
		ChartInput ci=new ChartInput();
		boardInput bi = new boardInput();
		address1 ad = new address1();
		
		int num;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println();
			System.out.println("                     ----------------------");
			System.out.println("                       IT WILL`S HOSPITAL");
			System.out.println("                     ----------------------");
			System.out.print("1. 환자 정보   2. 진료 접수   3. 병실 현황  4. 대기자현황  5. 인근병원 찾기  6. 종료 \n ▷ ");
			num = sc.nextInt();
			System.out.println();
		} while (num < 1 || num > 6);

		switch (num) {
		case 1:
			ci.chartin();
			break;
		case 2:
			ri.reservationin();
			break;
		case 3:
			h.setup();
			break;
		case 4:
			bi.lis();
			break;
		case 5:
			ad.address();
			ad.name();
			break;	
		case 6:
			System.out.println("▷ 시스템이 종료되었습니다. ◁");
			System.exit(0);
		}
	}


	//public static void main(String[] args) throws Exception {

		

	//}
}
