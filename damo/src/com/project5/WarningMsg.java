package com.project5;

public class WarningMsg implements Runnable {

	@Override
	public void run() {

		int i=0;

		while(true) {
						
			System.out.println("\n");
			System.out.println("          ������������������������������������������������������������������������");i++;
			try {Thread.sleep(500);} catch (Exception e) {}
			System.out.println("          ��                                                                    ��");i++;
			try {Thread.sleep(500);} catch (Exception e) {}
			System.out.println("          ��      ���� �ּ��� ���̿�, �־��� �����̴�. - �����ý� ������        ��");i++;
			try {Thread.sleep(700);} catch (Exception e) {}
			System.out.println("          ��                                                                    ��");i++;
			try {Thread.sleep(500);} catch (Exception e) {}
			System.out.println("          ��       ���� ������ ��ī�ο� �̻��� ���� �ִ�. - ���þ� �Ӵ�         ��");i++;
			try {Thread.sleep(700);} catch (Exception e) {}
			System.out.println("          ��                                                                    ��");i++;
			try {Thread.sleep(500);} catch (Exception e) {}
			System.out.println("          ��            ���� ���� �ʴ� �ڴ� �������� �� �Ͱ� ����.              ��");i++;
			try {Thread.sleep(700);} catch (Exception e) {}
			System.out.println("          ��                                                                    ��");i++;
			try {Thread.sleep(500);} catch (Exception e) {}
			System.out.println("          ������������������������������������������������������������������������");i++;
			System.out.println();

			break;
		}
	}
}
