package com.JavaProject;

import java.util.Random;
import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		
		String[] seoulcoffee = new String[1558];
		String[] seoulwhere = new String[1558];
		String[] seoulid = new String[1558];
		
		Iloveseoul seoul = new Iloveseoul();
		
		AccountImpl aim = new AccountImpl();
		OrderMain omain = new OrderMain();
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int shopindex;
		shopindex = rd.nextInt(1557);
		seoul.start();
		
		try {
			seoul.join();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		XML_Paring xml = new XML_Paring();
		seoulcoffee = xml.seoulcoffeeparing(seoulcoffee);
		seoulwhere = xml.seoulwhereparing(seoulwhere);
		seoulid  = xml.seoulidparing(seoulid);
		
		int menu =0;

		System.out.println("ī�� ID   : "+seoulid[shopindex]);
		System.out.println("ī�� �̸� : "+seoulcoffee[shopindex]);
		System.out.println("ī�� ��ġ : "+seoulwhere[shopindex]);
		System.out.println();
		//System.out.println(""+"�ȳ��ϼ��� "+"============");	
		System.out.println("==========�ȳ��ϼ��� "+seoulcoffee[shopindex]+"�Դϴ�.===========");	
		
		while(true) {		
			//System.out. println("1. ȸ������ \n2. �α��� \n3. �޴� \n4. �ֹ��ϱ� \n5. ���� \n6. ���ݱ��� �ֹ��� ���� ");
			System.out.println();
			System.out.println("������������������������������������������������");
			System.out.print("���� ȸ������ ���� �α��� ���� �ֹ� ���� ���� ��");
			System.out.println("\n������������������������������������������������");
			System.out.print("\n�޴����� �Է��ϼ��� : ");
			menu = sc.nextInt();
			switch(menu){
			case 1 :
				aim.input();break; 
			case 2 :	
				aim.login();
				//aim.loginidmigration(aim.getloginId());
				if(aim.loginSuccess()) {
					omain.ordermain((aim.loginidmigration(aim.getloginId())));
					break;	
				}else {
					System.out.println("�α��� ����");
					break;
				}
			case 3 :
				aim.output();
			case 4 :
				System.exit(0);
			default:
				System.out.println("�޴��� �ٽ� ���� �ϼ��� ");
			}
		}
	}
}
