package com.project5;

public class Considering extends Thread{
	
	@Override
	public void run() {
		System.out.println();
		System.out.println("                                            ½É»çÁß");
		System.out.print("                                    ");
		int i = 10;
		while(i>0)
		{
			System.out.print(" .");
			i--;
			try {
				sleep(400);
			} catch (Exception e) {}
		}
		System.out.println("\n");
	}
}
