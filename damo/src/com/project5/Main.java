package com.project5;

// 담보대출 이자계산기

import java.util.Scanner;

public class Main {


	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		int loan = 0;
		int chk= 0;
	
		//new Frame1();
		
		while(true)
		{
			new Menu().start(); // 대출이 필요하신가요 출력
			
			char a;		
			
			// 대출이 필요하십니까(Y/N)
			do{
				a = sc.next().charAt(0);
			}while(a!='Y' && a!='y' && a!='n' && a!='N');
			
			if(a=='n' || a=='N')
				break;
			
			// 담보선택 (1.부동산 2.자동차)
			do {
				System.out.println("||                                       담보를 선택하세요                                        ||");
				System.out.println("||                         1.부동산 담보 대출        2.자동차 담보 대출                           ||");
				System.out.print("=> ");
				a = sc.next().charAt(0);
			}while(a!='1' && a!='2');
			
			new MenuBar().start(); // 메뉴중간중간 "----------"바 출력
			
			// 부동산 대출 실행
			if (a=='1')
			{
				Thread.sleep(1000);
				Immovables ob = new Immovables();
				ob.Immovablesset();
				loan = ob.getResMon();
			}
			
			//자동차 대출 실행
			if (a=='2')
			{
				Thread.sleep(1000);
				InputCar ob = new InputCar();
				ob.inputCar();
				loan = ob.getloan(); // 최종가격
			}			
			if(loan == 0)
				continue;
			// 대출을 하시겠습니까(Y/N)
			do {
				System.out.println("                                +------------------------------------+");
				System.out.println("                                |                                    |");
				System.out.println("                                |    대출 견적을 조회할까요? (Y/N)   |");
				System.out.println("                                |                                    |");
				System.out.println("                                +------------------------------------+");
				System.out.println();
				System.out.print("=> ");
				a = sc.next().charAt(0);								
			}while(a!='Y' && a!='y' && a!='n' && a!='N');
			if(a=='n' ||a=='N')
				break;
			
			SchedulerMain sm = new SchedulerMain(loan);
			chk = sm.inputSch();
			if(chk == 0)
				break;
		}
	}
}
