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
					"                              1.주문\n\n                              2.주문조회\n\n                              3.완료된 주문 확인\n\n                              4.종료\n");
			System.out.println();
			System.out.print("                              무엇을하시겠습니까?\n");
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
				System.out.println("올바른숫자를 입력하세요");

			}

		}

	}

}
