package com.JavaProject;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class OrderImpl implements Order {

	List<OrderVO> lists = new ArrayList<OrderVO>();
	Scanner sc = new Scanner(System.in);
	
	String m1 = "coldbrew"; 			//�ݵ���
	String m2 = "americano"; 			//�Ƹ޸�ī��
	String m3 = "javachipfrappuchino"; 	//�ڹ�Ĩ
	String m4 = "redvelvetcake"; 		//���座��
	List<OrderVO> priceList = new ArrayList<OrderVO>();
	//2.�޴��� ���� ���̱�
	@Override
	public void order() {
		
		ButtonClass btn = new ButtonClass();
		OrderVO vo = new OrderVO();
		System.out.println();
		System.out.print(" �� ���� �ֹ� �� ����ũ �ֹ� : ");
		int o = sc.nextInt();

		if(o==1) {

			//�ֹ� �޴� ����
			System.out.println("\n������� �������ּ���! ");
			vo.setDrink(btn.coffee());
			System.out.println(vo.getDrink() + "�� �����ϼ̽��ϴ�");		
			System.out.println("\n����� �����ϼ���! ");
			vo.setSize(btn.Size());
			System.out.println(vo.getSize()+"�� �����ϼ̽��ϴ�");
			System.out.println("ICE/HOT? ");
			vo.setMode(btn.temperature());
			System.out.println(vo.getMode()+ "�� �����ϼ̽��ϴ�");
			System.out.print("������ �����ּ���![ex: 1] ");
			vo.setSu(sc.nextInt());
			
			//���� �κ�
			//���� ��Ʈ���� �����ص� ��Ʈ���� ������ vo�� �ش��ϴ� �� �߰�?\
			//����: if������ ���� ��Ʈ���� �޴��� �ִ� ��Ʈ�� ���� ������ ���? ������?
			//���� �ٸ��� ������ �ٽ� ��޶�� �޼���? ����
			
			if(vo.getDrink().equals(m1)) { //�ݵ���
				//���� �߰� ����
				//vo.setPrice(3000*vo.getSu()); 
				vo.setPricecode(vo.getSu());
			}
			if(vo.getDrink().equals(m2)) { //�Ƹ޸�ī��
				//vo.setPrice(2500*vo.getSu());
				vo.setPriceamea(vo.getSu());
			}
			if(vo.getDrink().equals(m3)) { //�ڹ�Ĩ��������
				//vo.setPrice(3500*vo.getSu());
				vo.setPricejava(vo.getSu());
			}
			
			lists.add(vo);
			//����?�� ����..?
			System.out.println();
			System.out.println("��������������������������������������������");
			System.out.println("���� �߰��ֹ� ���� �ֹ����� ���� �ֹ����  ��");
			System.out.println("��������������������������������������������");
			System.out.print("�޴��� �����ϼ��� : ");
			
			int resu = sc.nextInt();

			if(resu==1) {
				reOrder();
			}
			else if(resu==2) {
				keep();
			}
			else if(resu==3) {
				cancel();
			}
		}
		else if(o==2) {

			vo.setDrink(btn.cake());
			System.out.println("����ũ�� �������ּ���! ");

			System.out.print("������ �����ּ���![ex: 1] ");
			vo.setSu(sc.nextInt());
			
			if(vo.getDrink().equals(m4)) {
				vo.setPricecake(vo.getSu());
			}

			lists.add(vo);
			//����ũ ������� �ٸ���
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("��������������������������������������������");
			System.out.println("���� �߰��ֹ� ���� �ֹ����� ���� �ֹ���� ��");
			System.out.println("��������������������������������������������");
			System.out.print("�޴��� �����ϼ��� : ");
			int resu = sc.nextInt();

			if(resu==1) {
				reOrder();
			}
			else if(resu==2) {
				keep();
			}
			else if(resu==3) {
				cancel();
			}
		}
	}
	@Override
	public void reOrder() {

		System.out.print("��� �ֹ��Ͻðڽ��ϱ�?");
		System.out.println();
		
		System.out.print(" �� ���� �ֹ� �� ����ũ �ֹ� ");
		int o = sc.nextInt();

		OrderVO vo = new OrderVO();
		ButtonClass btn = new ButtonClass();
		
		if(o==1) {
			
			System.out.println("\n������� �������ּ���! ");
			vo.setDrink(btn.coffee());
			System.out.println(vo.getDrink() + "�� �����ϼ̽��ϴ�");		
			System.out.println("\n����� �����ϼ���! ");
			vo.setSize(btn.Size());
			System.out.println(vo.getSize()+"�� �����ϼ̽��ϴ�");
			System.out.println("ICE/HOT? ");
			vo.setMode(btn.temperature());
			System.out.println(vo.getMode()+ "�� �����ϼ̽��ϴ�");
			System.out.print("������ �����ּ���![ex: 1] ");
			vo.setSu(sc.nextInt());
			
			/*//�ֹ� �޴� ����
			System.out.println("\n������� �������ּ���! ");
			String drink = btn.coffee();

			System.out.println("����� �����ϼ���! ");
			String size = btn.Size();

			System.out.println("ICE/HOT? ");
			String mode = btn.temperature();
			 */
/*
			System.out.println("������ �����ּ���![ex: 1] ");
			int su = sc.nextInt();
			*/
			if(vo.getDrink().equals(m1)) { //�ݵ���
				//���� �߰� ����
				//vo.setPrice(3000*vo.getSu()); 
				vo.setPricecode(vo.getSu());
			}
			if(vo.getDrink().equals(m2)) { //�Ƹ޸�ī��
				//vo.setPrice(2500*vo.getSu());
				vo.setPriceamea(vo.getSu());
			}
			if(vo.getDrink().equals(m3)) { //�ڹ�Ĩ������ġ��
				//vo.setPrice(3500*vo.getSu());
				vo.setPricejava(vo.getSu());
			}

			lists.add(vo);
			//����?�� ����..?
			System.out.println();
			System.out.println(" �� ���� �ֹ� �� ����ũ �ֹ� : ");
		
		}
		else if(o==2) {
			System.out.println("����ũ�� �������ּ���! ");
			vo.setDrink(btn.cake());
			System.out.print("������ �����ּ���![ex: 1] ");
			vo.setSu(sc.nextInt());
			if(vo.getDrink().equals(m4)) {
				vo.setPricecake(vo.getSu());
				}
			}
			lists.add(vo);

			System.out.println();
			System.out.println();
			System.out.println("��������������������������������������������");
			System.out.println("���� �߰��ֹ� ���� �ֹ����� ���� �ֹ���� ��");
			System.out.println("��������������������������������������������");
			System.out.print("�޴��� �����ϼ��� : ");
			
			while(true) {
				//System.out.print("  ");
				int resu = sc.nextInt();
				if(resu==1) {
					reOrder();
					break;
				}
				else if(resu==2) {
					keep();
					break;
				}
				else if(resu==3){
					cancel();
					break;
				}else {
			
				}System.out.println("�߸��Է��Ͽ����ϴ�. ");
			}
		}
	

	@Override
	public void keep() {
		System.out.println("�̴�� �ֹ��Ͻðڽ��ϱ�?");

		//�迭�� �� ���� ���
		Iterator<OrderVO> ov = lists.iterator();

		while(ov.hasNext()) {
			OrderVO vo = ov.next();
			System.out.println("��------------------------------��");
			System.out.println(vo.toString());
			System.out.println("��------------------------------��");
	
		}
		while(true) {
			System.out.println();
			System.out.print("������ �� �ƴϸ� �� �����ּ���!");
			int ssu = sc.nextInt();
			if(ssu==1) {
				chul();//����ϴ� �κ����� �Ѿ
				break;
			}
			else if(ssu==2) {
				order();
				break;
			}else {
				System.out.println("�߸������Ͽ����ϴ�.");
			}
			
		}
	}
	@Override
	public void cancel() {
		//���
		System.out.println("�ֹ� �ý����� �����մϴ�.");
		System.exit(0);
	}

	@Override
	public void menu() {
		//�޴� �κ�
		for (int i = 0; i < 2; i++) {
			
			System.out.println();
		}
		System.out.println("  	               ��MENU��			         		");
		System.out.println(" ��-----------------------------------------------��");
		System.out.println(" ��[Coffee]                                       ��");
		System.out.println(" ��                      	                      ��");
		System.out.println(" �� --------------------------- : 3,000�� ��");
		System.out.println(" ��                                               ��"); //��+����
		System.out.println(" ��americano -------------------------- : 2,500�� ��");		
		System.out.println(" ��                                               ��");
		System.out.println(" ��Lotte ------------------------------ : 3,500�� ��");
		System.out.println(" ��                                               ��");
		System.out.println(" ��[Cake]                                         ��");
		System.out.println(" ��                                               ��");
		System.out.println(" ��redvelvetcake ---------------------- : 3,000�� ��");
		System.out.println(" ��                                               ��");
		System.out.println(" ��-----------------------------------------------��");

	}
	@Override
	public int price() {
		
	/*	String m1 = "coldbrew"; //�ݵ��� 3.0
		String m2 = "americano"; //�Ƹ޸�ī�� 2.5
		String m3 = "javachipfrappuchino"; //�ڹ�Ĩ 3.5
		String m4 = "redvelvetcake"; //���座�� 3.0
		*/
		//���� ���
		
		int total=0;
		OrderVO vo = new OrderVO();
		try {
			
			int c = 0, d1 = 0, d2 = 0, d3 = 0; //cake, drink
			
			if(vo.getDrink().equals(m1)) {
				d1 = 1;
			}
			//The method setPrice(int) in the type OrderVO is not applicable for the arguments ()
			//-> OrderVO ������ �޼��� ����Price(int)�� �μ�()�� ������� ����
			if(vo.getDrink().equals(m2)) {
				d2 = 1;
			}
			if(vo.getDrink().equals(m3)) {
				d3 = vo.getPrice();
			}
			if(vo.getDrink().equals(m4)) {
				c = vo.getPrice();
			}
			
			total = d1 + d2 + d3 + c;
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return total;
	}
	/*public void menu() {
		//�޴� �κ�
		for (int i = 0; i < 2; i++) {
			
			System.out.println();
		}
		System.out.println("\t\t  	        ��MENU��						");
		System.out.println(" ��--------------------------------------------------------------------��");
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��                      	coldbrew : 3,000��                     ��");
		System.out.println(" ��                                                                    ��"); //��+����
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��                        americano : 2,500��                         ��");
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��                   javachipfrappuchino : 3,500��                    ��");
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��                       redvelvetcake : 3,000��                      ��");
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��--------------------------------------------------------------------��");

	}*/
	@Override
	public void chul() {
		//������ ���?
		//price���� ���ϱ�? ���� �޴��϶� ������ int ���� ���ϱ�
		//������ ���� ���ݺ���
		//����Ʈ �״�� ����ϱ�!!
		//�迭�� �� ���� ���
		Iterator<OrderVO> ov = lists.iterator();

		System.out.println("===========================================");
		System.out.println("                ������ ���               ");
		System.out.println("                                         ");
		System.out.printf("   %1$tF         %1$tT \n", Calendar.getInstance());
		System.out.println("-------------------------------------------");
		System.out.println();
		while(ov.hasNext()) {
			OrderVO vo = ov.next();	
			System.out.println("   "+vo.toString()+"   ");
		}
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println(price());
		//���� ��� �κ�
		//if(����ũ) { ���� price} + if(����) { ���� price} => �����ϳ��� �༭ ���?
		OrderVO vo = (OrderVO) ov.next();
		System.out.println(vo.getTot());
		System.out.println("===========================================");
		
		}
	
		//�׽�Ʈ �ڵ� 
		/*Iterator<OrderVO> ov = lists.iterator();
	
		System.out.println("��---------------------------��");
		while(ov.hasNext()) {
			OrderVO vo = ov.next();
			System.out.println(vo.toString());
			System.out.println("�׽�Ʈ ���� ����"+vo.getTot());
		}
		System.out.println("��---------------------------��");	
	}*/
}


class ButtonClass {
	
	Scanner sc = new Scanner(System.in);
	public String coffee() {
		
		System.out.println("��---------------------------��");
		System.out.println("��(a) coldbrew               ��");
		System.out.println("��(b) americano              ��");
		System.out.println("��(c) javachipfrappuchino    ��");
		System.out.println("��---------------------------��");
		System.out.println();
		String coffee = null;
		while(true) {
			
			System.out.print("�޴��� �����ϼ��� : ");
			coffee = sc.next();
			String[] menu = {"a","b","c"};
			
			if(coffee.equals(menu[0])) {
				coffee = "coldbrew";
				break;
			}else if(coffee.equals(menu[1])) {
				coffee = "americano";
				break;
			}else if(coffee.equals(menu[2])) {
				coffee = "javachipfrappuchino";
				break;
			}else{
				System.out.println("�޴��� �ٽ� ������ �ּ���");
				continue;
			}
		}
		return coffee;
	}
	
	public String cake() {
		System.out.println("��---------------------------��");
		System.out.println("��(a) redvelvetcake          ��");
		System.out.println("��---------------------------��");
		System.out.println();
		String cake = null;
		
		while(true) {
			System.out.print("�޴��� �����ϼ��� : ");
			cake = sc.next();
			String[] menu = {"a"};
			if(cake.equals(menu[0])) {
				cake = "redvelvetcake";
				break;
			}else{
				System.out.println("�߸��Է��Ͽ����ϴ�. ");
				continue;
			}
		}
		
		return cake;
	}
	public String Size() {
		
		String size = null;	
		System.out.println("��---------------------------��");
		System.out.println("��(a) Regular                ��");
		System.out.println("��(b) Large                  ��");	
		System.out.println("��---------------------------��");
	
		while(true) {
			System.out.print("Size �� �����ϼ��� : ");
			String[] menu = {"a","b"};
			size = sc.next();
			if(size.equals(menu[0])) {
				size = "R";
				break;
			}
			if(size.equals(menu[1])) {
				size = "L";
				break;
			}else {
				System.out.println("�߸��Է��Ͽ����ϴ�. ");
				continue;
			}
		}
		return size;
	}
	public String temperature() {
		
		String temperature = null;	
		System.out.println("��---------------------------��");
		System.out.println("��(a) ice                    ��");
		System.out.println("��(b) hot                    ��");	
		System.out.println("��---------------------------��");
		
		while(true) {
			System.out.print("�µ��� �����ϼ��� : ");
			String[] menu = {"a","b"};
			temperature = sc.next();
			if(temperature.equals(menu[0])) {
				temperature = "ice";
				break;
			}else if(temperature.equals(menu[1])) {
				temperature = "hot";
				break;
			}else {
				System.out.println("�߸��Է��Ͽ����ϴ�. ");
				continue;
			}
		}
		return temperature;
	}
}

