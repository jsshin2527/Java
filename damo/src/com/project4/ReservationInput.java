package com.project4;

import java.util.Scanner;

public class ReservationInput {

	public void reservationin() throws Exception {

		Scanner sc = new Scanner(System.in);

		ReservationImpl ob = new ReservationImpl();

		int sel;

		System.out.println("                   �� ���� ���� ��");

		ob.check();

		while (true) {
			do {

				System.out.println();
				System.out.print("0. ù ȭ�� 1.���� ��Ȳ 2. ���� �߰� 3.���� ���� 4. ���� ����  ");
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
