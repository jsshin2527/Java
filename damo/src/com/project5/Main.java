package com.project5;

// �㺸���� ���ڰ���

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
			new Menu().start(); // ������ �ʿ��ϽŰ��� ���
			
			char a;		
			
			// ������ �ʿ��Ͻʴϱ�(Y/N)
			do{
				a = sc.next().charAt(0);
			}while(a!='Y' && a!='y' && a!='n' && a!='N');
			
			if(a=='n' || a=='N')
				break;
			
			// �㺸���� (1.�ε��� 2.�ڵ���)
			do {
				System.out.println("||                                       �㺸�� �����ϼ���                                        ||");
				System.out.println("||                         1.�ε��� �㺸 ����        2.�ڵ��� �㺸 ����                           ||");
				System.out.print("=> ");
				a = sc.next().charAt(0);
			}while(a!='1' && a!='2');
			
			new MenuBar().start(); // �޴��߰��߰� "----------"�� ���
			
			// �ε��� ���� ����
			if (a=='1')
			{
				Thread.sleep(1000);
				Immovables ob = new Immovables();
				ob.Immovablesset();
				loan = ob.getResMon();
			}
			
			//�ڵ��� ���� ����
			if (a=='2')
			{
				Thread.sleep(1000);
				InputCar ob = new InputCar();
				ob.inputCar();
				loan = ob.getloan(); // ��������
			}			
			if(loan == 0)
				continue;
			// ������ �Ͻðڽ��ϱ�(Y/N)
			do {
				System.out.println("                                +------------------------------------+");
				System.out.println("                                |                                    |");
				System.out.println("                                |    ���� ������ ��ȸ�ұ��? (Y/N)   |");
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
