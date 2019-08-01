package com.project4;

import java.util.Scanner;

public class ReservationInput {

	public void reservationin() throws Exception {

		Scanner sc = new Scanner(System.in);

		ReservationImpl ob = new ReservationImpl();

		int sel;

		System.out.println("                   ※ 진료 예약 ※");

		ob.check();

		while (true) {
			do {

				System.out.println();
				System.out.print("0. 첫 화면 1.예약 현황 2. 예약 추가 3.예약 수정 4. 예약 삭제  ");
				sel = sc.nextInt();
			} while (sel < 0 || sel > 5);

			switch (sel) {
			case 1:
				ob.allprint();
				break;
			case 2:
				ob.reseradd();
				break;
			case 3:
				ob.reserupdate();
				break;
			case 4:
				ob.reserdel();
				break;
			case 0:
				ob.end();
				break;
			}
		}
	}

}
