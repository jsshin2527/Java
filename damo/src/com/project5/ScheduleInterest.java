package com.project5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ScheduleInterest {
	
	DecimalFormat df = new DecimalFormat("###,###,###");
	double loanAmount1;
	int numberOfYears1;
	double annualInterestRate1;
	String pristr ="";
	
	String str1 = "����ȸ��";
	String str2 = "�����Ա�";
	String str3 = "��������";
	String str4 = "���Կ���";
	String str5 = "�ܿ�����";
	String str6 = "Total";
	
	double total1, total2, total3;
	
	ScheduleInterest(int loan){
		this.loanAmount1 = (double)loan;
	};

	public void interest() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("                                  ");
		System.out.printf("�����û�ݾ�: " + df.format((int)loanAmount1)+"��");
		System.out.println();

		System.out.print("                                  ");
		System.out.print("�����ȯ�Ⱓ(YEAR): ");
		numberOfYears1 = input.nextInt();

		System.out.print("                                  ");
		System.out.print("��������(%): ");
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
		for(int i=len-1; i>=0; i--) // ��(��ȭ)�� 3�ڸ������� ,�� ǥ��
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