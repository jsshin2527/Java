package com.project4;

import java.util.Scanner;

public class ChartInput {

	public void chartin() throws Exception {

		Scanner sc = new Scanner(System.in);

		Chart obj = new ChartImpl();

		int ch;

		System.out.println("                    �� ȯ�� ��Ʈ ���� ��");
		System.out.println();
		
		obj.restore();
		
		
		while (true) {

			do {
				System.out.print(
						"1.��Ʈ �Է� \n2.��Ʈ ��� \n3.��Ʈ ȯ�ڹ�ȣ �˻� \n4.��Ʈ ȯ���̸� �˻� \n5.��Ʈ ���� ���� \n6.��Ʈ ���� ���� \n7.��Ʈ ���� ���� \n8.ù ȭ�� \n��");
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
