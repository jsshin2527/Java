package com.project5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Car {

	Scanner sc = new Scanner(System.in);
	String carName;
	int optnum;
	String carOption;
	int carPrice;
	ArrayList<String> car = new ArrayList<>();  // �� ������ list�� ����
	LinkedHashMap<String, Integer> opt = new LinkedHashMap<>(); // �� �ɼǺ� ������ map�� ����
	StringBuffer sb = new StringBuffer();
	String pristr;
	
	Car() // Car��ü ������ ���� ������ ���
	{
		car.add("�ƹݶ�");
		car.add("�׷���");
		car.add("��Ÿ��");
		car.add("�ҳ�Ÿ");
		car.add("���ν���");
		car.add("����");
	}
	public String getcarName() {
		return carName;
	}
	
	public void inputOption() throws InterruptedException
	{
		do
		{	
			System.out.println();
			System.out.println("                                         �ɼ��� �Է��ϼ���                                          \n");
			Iterator<String> it = opt.keySet().iterator();
			int inx=1;
			
			while(it.hasNext()) // �� ���� �´� �ɼ� ���
			{
				String str = it.next();
				int cnt = (94-str.length())/2;
				for(int i=0; i<cnt; i++)
					System.out.print(" ");
				System.out.print((inx++) + "." + str);
				for(int i=0; i<(96-cnt-str.length()); i++)
					System.out.print(" ");
				System.out.println();
			}
			System.out.print("=> ");
			optnum= sc.nextInt();
			}while(optnum<1||optnum>opt.size());
		//
	}

	public void setcarOption(String carOption) {
		this.carOption = carOption;
	}
	public String getcarOption() {
		return carOption;
	}	
	public void setcarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	public int getcarPrice() {
		return carPrice;
	}
	public void changeToWon() {
		
		pristr = Integer.toString(getcarPrice());
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
	}
	
	public void print() throws InterruptedException  // ���� ���
	{
		Thread.sleep(500);				
		System.out.println();
		changeToWon();
		
		int cnt = (90-getcarName().length())/2;
		for(int i=0; i<cnt; i++)
			System.out.print(" ");
		System.out.println("���� : " + getcarName());
		
		cnt = (90-getcarOption().length())/2;
		for(int i=0; i<cnt; i++)
			System.out.print(" ");
		System.out.println("�ɼ� : " + getcarOption());
		System.out.println();
		
		cnt = (90-pristr.length()-10)/2;
		for(int i=0; i<cnt; i++)
			System.out.print(" ");
		
		System.out.println("���� ���� �ݾ� : " + pristr + "��");
		System.out.println("\n");
		// ����� ��������(Integer) => getcarPrice();
		
	}
	
}