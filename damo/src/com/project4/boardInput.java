package com.project4;

import java.util.Scanner;

public class boardInput {

	public void lis() throws Exception {
		
		Scanner sc = new Scanner(System.in);

		Board obj = new BoardImpl();

		int ch;

		System.out.println("                         �� ���� ��� ��Ȳ ��");
		System.out.println();
		
		obj.restore();
		
		while (true) {

			do {

				System.out.print(" 1.����� ���  2.����� �߰�  3.����� ����  4. ������Ʈ  5. ùȭ��\n��");
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
