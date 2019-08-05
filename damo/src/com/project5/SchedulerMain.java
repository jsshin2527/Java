package com.project5;

import java.util.Scanner;

public class SchedulerMain {

	static int loan;

	SchedulerMain(int loan)
	{
		this.loan = loan;
	}

	public static int inputSch() throws InterruptedException {


		Scanner input = new Scanner(System.in);

		ScheduleAmoi sa = new ScheduleAmoi(loan);
		ScheduleInterest si = new ScheduleInterest(loan);
		ScheduleEqualPrincipal sep = new ScheduleEqualPrincipal(loan);
		int sel;

		while(true) {
			
			new MenuBar().start();
			Thread.sleep(1000);
			do {
				System.out.println();
				System.out.println("                                        상환방식을 선택하세요");
				System.out.println("         [1.원리금균등상환]  [2.만기일시상환]  [3.원금균등상환]  [4.담보초기화]  [5.종료]");
				System.out.print("=> ");
				sel = input.nextInt();
			} while(sel<1||sel>5);

			switch(sel) {

			case 1:
				sa.amoi();
				break;

			case 2:
				si.interest();
				break;

			case 3:
				sep.equalPrincipal();
				break;

			case 4:
				return 1;

			case 5:
				new WarningMsg().run();
				System.exit(0);
			}
		}
	}
}
