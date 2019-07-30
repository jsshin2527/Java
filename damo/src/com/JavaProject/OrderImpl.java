package com.JavaProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class OrderImpl implements Order {

	List<OrderVO> lists = new ArrayList<OrderVO>();
	Scanner sc = new Scanner(System.in);
	
	String m1 = "coldbrew"; //�ݵ���
	String m2 = "americano"; //�Ƹ޸�ī��
	String m3 = "javachipfrappuchino"; //�ڹ�Ĩ
	String m4 = "redvelvetcake"; //���座��
	
	
	//2.�޴��� ���� ���̱�

	@Override
	public void order() {
		
		ButtonClass btn = new ButtonClass();
		OrderVO vo = new OrderVO();
		System.out.print("���Ḧ �ֹ��Ͻðڽ��ϱ�(1)? ����ũ�� �ֹ��Ͻðڽ��ϱ�(2)?");
		int o = sc.nextInt();

		if(o==1) {

			//�ֹ� �޴� ����
			System.out.println("������� �������ּ���![ex: americano] ");
			vo.setDrink(btn.coffee());
			System.out.println(vo.getDrink());
			
			System.out.println("����� �����ϼ���[ex: R, L]! ");
			vo.setSize(btn.Size());
			System.out.println(vo.getSize());
			System.out.println("ICE/HOT?(ex: ice] ");
			vo.setMode(btn.temperature());
			System.out.println(vo.getMode());
			System.out.print("������ �����ּ���![ex: 1] ");
			vo.setSu(sc.nextInt());
			
			//���� �κ�
			//���� ��Ʈ���� �����ص� ��Ʈ���� ������ vo�� �ش��ϴ� �� �߰�?\
			//����: if������ ���� ��Ʈ���� �޴��� �ִ� ��Ʈ�� ���� ������ ���? ������?
			//���� �ٸ��� ������ �ٽ� ��޶�� �޼���? ����
			
			if(vo.getDrink().equals(m1)) { //�ݵ���
				//���� �߰� ����
				vo.setPrice(3000*vo.getSu()); 
			}
			if(vo.getDrink().equals(m2)) { //�Ƹ޸�ī��
				vo.setPrice(2500*vo.getSu());
			}
			if(vo.getDrink().equals(m3)) { //�ڹ�Ĩ��������
				vo.setPrice(3500*vo.getSu());
				
			}
			
			lists.add(vo);
			//����?�� ����..?
			System.out.println();
			System.out.println();
			System.out.print("1.��� �ֹ�? 2.�̴�� �ֹ�? 3.���");

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
			System.out.println("����ũ�� �������ּ���![ex: redvelvetcake] ");

			System.out.print("������ �����ּ���![ex: 1] ");
			vo.setSu(sc.nextInt());
			
			if(vo.getDrink().equals(m4)) {
				vo.setPrice(3000*vo.getSu());
			}

			lists.add(vo);
			//����ũ ������� �ٸ���
			System.out.println();
			System.out.println();
			System.out.print("1.��� �ֹ�? 2.�̴�� �ֹ�? 3.���");

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
		System.out.print("���Ḧ �ֹ��Ͻðڽ��ϱ�(1)? ����ũ�� �ֹ��Ͻðڽ��ϱ�(2)?");
		
		int o = sc.nextInt();

		OrderVO vo = new OrderVO();
		ButtonClass btn = new ButtonClass();
		
		if(o==1) {
			
			//�ֹ� �޴� ����
			System.out.println("������� �������ּ���![ex: americano] ");
			String drink = btn.coffee();

			System.out.println("����� �����ϼ���[ex: R, L]! ");
			String size = btn.Size();

			System.out.println("ICE/HOT?(ex: ice] ");
			String mode = btn.temperature();
		

			System.out.println("������ �����ּ���![ex: 1] ");
			int su = sc.nextInt();
			
			if(vo.getDrink().equals(m1)) { //�ݵ���
				//���� �߰� ����
				vo.setPrice(3000*vo.getSu()); 
			}
			if(vo.getDrink().equals(m2)) { //�Ƹ޸�ī��
				vo.setPrice(2500*vo.getSu());
			}
			if(vo.getDrink().equals(m3)) { //�ڹ�Ĩ������ġ��
				vo.setPrice(3500*vo.getSu());
				
			}

			lists.add(vo);
			//����?�� ����..?
			System.out.println();
			System.out.println();
			System.out.print("1.��� �ֹ�? 2.�̴�� �ֹ�? 3.���");
		}
		else if(o==2) {

			System.out.println("����ũ�� �������ּ���![ex: redvelvetcake] ");
			vo.setDrink(btn.cake());

			System.out.print("������ �����ּ���![ex: 1] ");
			vo.setSu(sc.nextInt());
			
			if(vo.getDrink().equals(m4)) {
				vo.setPrice(3000*vo.getSu());
			}

			lists.add(vo);

			System.out.println();
			System.out.println();
			System.out.print("1.��� �ֹ�? 2.�̴�� �ֹ�? 3.���");

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
	public void keep() {
		System.out.println("�̴�� �ֹ��Ͻðڽ��ϱ�?");

		//�迭�� �� ���� ���
		Iterator<OrderVO> ov = lists.iterator();

		while(ov.hasNext()) {
			OrderVO vo = ov.next();

			System.out.println("��---------------------------��");
			System.out.println(vo.toString());
			System.out.println("��---------------------------��");
		}

		System.out.println();
		System.out.print("������ 1, �ƴϸ� 2 �����ּ���!");
		int ssu = sc.nextInt();

		if(ssu==1) {
			chul(); //����ϴ� �κ����� �Ѿ
		}
		else if(ssu==2) {
			order();
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
		System.out.println("\t\t  	        ��MENU��						");
		System.out.println(" ��--------------------------------------------------------------------��");
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��                      	coldbrew : 3,000��                         ��");
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



	}
	@Override
	public void chul() {
		//������ ���?
		//price���� ���ϱ�? ���� �޴��϶� ������ int ���� ���ϱ�
		//������ ���� ���ݺ���
		//����Ʈ �״�� ����ϱ�!!
		//�迭�� �� ���� ���
		Iterator<OrderVO> ov = lists.iterator();

		System.out.println("��---------------------------��");
		while(ov.hasNext()) {
			OrderVO vo = ov.next();

			System.out.println(vo.toString());
		}
		System.out.println("��---------------------------��");
		
	}
	

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
		System.out.print("�޴��� �����ϼ��� : ");
		String coffee = null;
		
		coffee = sc.next();
		String[] menu = {"a","b","c"};
		
			if(coffee.equals(menu[0])) {
				coffee = "coldbrew";
			}else if(coffee.equals(menu[1])) {
				coffee = "americano";
			}else if(coffee.equals(menu[2])) {
				coffee = "javachipfrappuchino";
			}else{
				System.out.println("�޴��� �ٽ� ������ �ּ���");
			}
		return coffee;
	}
	
	public String cake() {
		System.out.println("��---------------------------��");
		System.out.println("��(a) redvelvetcake          ��");
		System.out.println("��---------------------------��");
		System.out.println();
		System.out.print("�޴��� �����ϼ��� : ");
		String cake = null;
		cake = sc.next();
		String[] menu = {"a"};
		if(cake.equals(menu[0])) {
			cake = "redvelvetcake";
		}
		return cake;
	}
	public String Size() {
		
		String size = null;	
		System.out.println("��---------------------------��");
		System.out.println("��(a) Regular                ��");
		System.out.println("��(b) Large                  ��");	
		System.out.println("��---------------------------��");
		System.out.print("Size �� �����ϼ��� : ");
		String[] menu = {"a","b"};
		size = sc.next();
		
		if(size.equals(menu[0])) {
			size = "R";
		}
		if(size.equals(menu[1])) {
			size = "L";
		}else {
			System.out.println("����� �ٽ� �Է��ϼ��� ");
		}
		return size;
	}
	public String temperature() {
		
		String temperature = null;	
		System.out.println("��---------------------------��");
		System.out.println("��(a) ice                    ��");
		System.out.println("��(b) hot                    ��");	
		System.out.println("��---------------------------��");
		System.out.print("�µ��� �����ϼ��� : ");
		String[] menu = {"a","b"};
		temperature = sc.next();
		if(temperature.equals(menu[0])) {
			temperature = "ice";
		}else if(temperature.equals(menu[1])) {
			temperature = "hot";
		}else {
			System.out.println("����� �ٽ� �Է��ϼ��� ");
		}
		return temperature;
	}
	

}
