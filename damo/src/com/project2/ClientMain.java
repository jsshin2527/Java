package com.project2;

import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		Client ob = new ClientImpl();
		SirenorderThread st = new SirenorderThread();
		SirenorderThread1 st1 = new SirenorderThread1();

		st1.SirenorderThread1();

		for (int i = 1; i <= 100; i++) {

			System.out.print(
					"                              1.�ֹ�\n\n                              2.�ֹ���ȸ\n\n                              3.�Ϸ�� �ֹ� Ȯ��\n\n                              4.����\n");
			System.out.println();
			System.out.print("                              �������Ͻðڽ��ϱ�?\n");
			i = sc.nextInt();

			switch (i) {
			case 1:
				ob.input();
				System.out.println();
				System.out.println();
				break;
			case 2:
				System.out.println();
				ob.write();
				System.out.println();
				System.out.println();
				break;
			case 3:
				System.out.println();
				ob.print();
				System.out.println();
				System.out.println();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("�ùٸ����ڸ� �Է��ϼ���");

			}

		}

	}

}
