package com.project5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ScheduleInterest {
	
	DecimalFormat df = new DecimalFormat("###,###,###");
	double loanAmount1;
	int numberOfYears1;
	double annualInterestRate1;
	String pristr ="";
	
	String str1 = "납입회차";
	String str2 = "월납입금";
	String str3 = "산출이자";
	String str4 = "납입원금";
	String str5 = "잔여원금";
	String str6 = "Total";
	
	double total1, total2, total3;
	
	ScheduleInterest(int loan){
		this.loanAmount1 = (double)loan;
	};

	public void interest() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("                                  ");
		System.out.printf("대출신청금액: " + df.format((int)loanAmount1)+"원");
		System.out.println();

		System.out.print("                                  ");
		System.out.print("대출상환기간(YEAR): ");
		numberOfYears1 = input.nextInt();

		System.out.print("                                  ");
		System.out.print("연이자율(%): ");
		annualInterestRate1 = input.nextDouble();
		System.out.println();


		double monthlyInterestRate = annualInterestRate1 / 1200;

		double balance = loanAmount1;
		double interest = 0.0;
		double principal = 0.0;
		double monthlyPayment = 0.0;

		int i;

		System.out.printf("%4s|%18s|%18s|%18s|%18s\n",str1,str2,str3,str4,str5);
		System.out.println("===========================================================================================================");
		System.out.printf("%8d|%22s|%22s|%22s|%22s\n",0, 0, changeToWon((int)interest),changeToWon((int)principal) , changeToWon((int)balance));

		for (i = 1; i <= numberOfYears1 * 12-1; i++) {
			interest = monthlyInterestRate * balance * 100 / 100.0;
			balance = balance - principal * 100 / 100.0;
			monthlyPayment = interest + principal;
			
			total1 += monthlyPayment;
			total2 += interest;
			total3 += principal;
			
			System.out.printf("%8d|%22s|%22s|%22s|%22s\n",i, changeToWon((int)monthlyPayment), changeToWon((int)interest),changeToWon((int)principal) , changeToWon((int)balance));
		}

		principal = balance;
		monthlyPayment = interest + principal;
		
		total1 += monthlyPayment;
		total2 += interest;
		total3 += principal;

		System.out.printf("%8d|%22s|%22s|%22s|%22s\n", numberOfYears1*12, changeToWon((int)monthlyPayment),changeToWon((int)interest) , changeToWon((int)principal), changeToWon((int)balance));

		System.out.println("===========================================================================================================");
		System.out.printf("%8s|%22s|%22s|%22s|\n",str6, changeToWon((int)total1), changeToWon((int)total2),changeToWon((int)total3));
		System.out.println();
		
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