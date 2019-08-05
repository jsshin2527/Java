package com.project5;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ScheduleAmoi {
	
	DecimalFormat df = new DecimalFormat("###,###,###");
	double loanAmount;
	int numberOfYears;
	double annualInterestRate;
	String pristr ="";
	
	double total1, total2, total3;
	
	String str1 = "납입회차";
	String str2 = "월납입금";
	String str3 = "산출이자";
	String str4 = "납입원금";
	String str5 = "잔여원금";
	String str6 = "Total";
	
	ScheduleAmoi(int loan){
		this.loanAmount = (double)loan;
	};

	public void amoi() {

			Scanner input = new Scanner(System.in);
			
			System.out.print("                                  ");
			System.out.printf("대출신청금액: " + df.format((int)loanAmount)+ "원");
			System.out.println();
			
			System.out.print("                                  ");
			System.out.print("대출상환기간(YEAR): ");
			numberOfYears = input.nextInt();

			System.out.print("                                  ");
			System.out.print("연이자율(%): ");
			annualInterestRate = input.nextDouble();
			System.out.println();

		
		double monthlyInterestRate = annualInterestRate / 1200;

		// Compute mortgage
		double monthlyPayment = monthlyPayment(loanAmount, numberOfYears, monthlyInterestRate);

		double balance = loanAmount;
		double interest=0.0;
		double principal=0.0;

		int i;

		System.out.printf("%4s|%18s|%18s|%18s|%18s\n",str1,str2,str3,str4,str5);
		System.out.println("===========================================================================================================");
		System.out.printf("%8d|%22s|%22s|%22s|%22s\n",0, 0, changeToWon((int)interest),changeToWon((int)principal) , changeToWon((int)balance));

		for (i = 1; i <= numberOfYears * 12; i++) {
			interest = monthlyInterestRate * balance * 100 / 100.0;
			principal = monthlyPayment - interest * 100 / 100.0;
			balance = balance - principal * 100 / 100.0;
			
			total1 += monthlyPayment;
			total2 += interest;
			total3 += principal;
			
			System.out.printf("%8d|%22s|%22s|%22s|%22s\n",i, changeToWon((int)monthlyPayment), changeToWon((int)interest),changeToWon((int)principal) , changeToWon((int)balance));
		}
		
		total1 += monthlyPayment;
		total2 += interest;
		total3 += principal;

		System.out.println("===========================================================================================================");
		System.out.printf("%8s|%22s|%22s|%22s|\n",str6, changeToWon((int)total1), changeToWon((int)total2),changeToWon((int)total3));
		System.out.println();
	}

	private static double monthlyPayment(double loanAmount, int numberOfYears, double monthlyInterestRate) {
		double monthlyPayment = 
				loanAmount * monthlyInterestRate * Math.pow(1+monthlyInterestRate, numberOfYears*12)
				/ (Math.pow(1 + monthlyInterestRate, numberOfYears * 12)-1);

		return monthlyPayment;
	}
	private String changeToWon(int money) {
		pristr = "";
		pristr = Integer.toString(money);
		
		StringBuffer sb = new StringBuffer();
		sb.append(pristr);
		int cnt=0;
		int len = sb.length();
		for(int i=len-1; i>=0; i--) // 돈(원화)에 3자리수마다 ,로 표시
		{
			cnt++;
			if(cnt==3 && i != 0)
			{
				sb.insert(i, ",");
				cnt=0;
			}
		}
		pristr = sb.toString();
		return pristr;
	}
	
}