package com.project5;

import java.util.Scanner;

public class Menu extends Thread {
	
	@Override
	public void run() {
		
		int i=0;
		System.out.print("+");
		while(i<98)
		{
			System.out.print("=");
			i++;
			try {
				sleep(7);
			} catch (Exception e) {}
		}
		System.out.println("+");
		System.out.println("||                                                                                                ||");
		System.out.println("||                                   대출이 필요하신가요? (Y/N)                                   ||");
		System.out.println("||                                                                                                ||");
		i=0;
		System.out.print("+");
		while(i<98)
		{
			System.out.print("=");
			i++;
			try {
				sleep(7);
			} catch (Exception e) {}
		}
		System.out.print("+");
		System.out.println();
		System.out.print("=> ");
	}
}
