package com.project5;

public class MenuBar extends Thread{
	
	@Override
	public void run() {
		
		int i=0;
		System.out.print("+");
		while(i<49)
		{
			System.out.print("= ");
			i++;
			try {
				sleep(10);
			} catch (Exception e) {}
		}
		System.out.print("+");
		System.out.println("");
	}
	
}