package com.project5;

import java.util.Scanner;

public class InputCar{
	Scanner sc = new Scanner(System.in);
	Car ob = new Car();
	int loan;
	
	public void inputCar() throws InterruptedException {
		int cnum;
	
		do {
			System.out.println("                                                                                                    ");
			System.out.println("                                         차종을 입력하세요.                                         ");
			System.out.print("               ");
			for(int i=0; i<ob.car.size(); i++)
			{
				System.out.print((i+1)+"."+ob.car.get(i)+"    ");

			}
			System.out.println();
			System.out.print("=> ");
			cnum = sc.nextInt();
			
		}while(cnum<1||cnum>ob.car.size());
		new MenuBar().start();
		Thread.sleep(1000);
		
		if(cnum == 1)
		{ 	ob = new Avante();
			ob.inputOption();
			((Avante) ob).setPrice();
			new Considering().start();
			Thread.sleep(4500);
			System.out.println("+= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = +");
			ob.print();
			loan = ob.getcarPrice();
		}
		else if(cnum == 2)
		{ 
			ob = new Grandeur();
			ob.inputOption();
			((Grandeur) ob).setPrice();
			new Considering().start();
			Thread.sleep(4500);
			System.out.println("+= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = +");
			ob.print();
			loan = ob.getcarPrice();
		}
		else if(cnum == 3)
		{ 
			ob = new Santafe();
			ob.inputOption();
			((Santafe) ob).setPrice();
			new Considering().start();
			Thread.sleep(4500);
			System.out.println("+= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = +");
			ob.print();
			loan = ob.getcarPrice();
		}
		else if(cnum == 4)
		{ 
			ob = new Sonata();
			ob.inputOption();
			Thread.sleep(100);
			((Sonata) ob).setPrice();
			new Considering().start();
			Thread.sleep(4500);
			System.out.println("+= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = +");
			ob.print();
			loan = ob.getcarPrice();
		}
		else if(cnum == 5)
		{ 
			ob = new Veloster();
			ob.inputOption();
			Thread.sleep(100);
			((Veloster) ob).setPrice();
			new Considering().start();
			Thread.sleep(4500);
			System.out.println("+= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = +");
			ob.print();
			loan = ob.getcarPrice();
		}
		else if(cnum == 6)
		{
			ob = new Tucsan();
			ob.inputOption();
			((Tucsan) ob).setPrice();
			new Considering().start();
			Thread.sleep(4500);
			System.out.println("+= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = +");
			ob.print();
			loan = ob.getcarPrice();
		}
	}
	public int getloan()
	{
		return loan;
	}
}