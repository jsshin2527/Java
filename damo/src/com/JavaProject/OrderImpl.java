package com.JavaProject;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class OrderImpl implements Order {

	List<OrderVO> lists = new ArrayList<OrderVO>();
	Scanner sc = new Scanner(System.in);
	
	String m1 = "americano"; 			//�Ƹ޸�ī��
	String m2 = "caffeaate"; 			//ī���
	String m3 = "cappuccino"; 	        //īǪġ��
	String m4 = "redvelvetcake"; 		//���座��
	String m5 = "tiramisu";				//Ƽ��̽�
	List<OrderVO> priceList = new ArrayList<OrderVO>();
	
	//2.�޴��� ���� ���̱�
	@Override
	public void order() {
		
		ButtonClass btn = new ButtonClass();
		OrderVO vo = new OrderVO();
		System.out.println();
		System.out.println("��������������������������������");
		System.out.println("���� �����ֹ� ��������ũ �ֹ� ��");
		System.out.println("��������������������������������");
		System.out.print("�޴����� �����ϼ��� : ");
		int o = sc.nextInt();

		if(o==1) {
			//�ֹ� �޴� ����
			//System.out.println("\n������� �������ּ���! ");
			vo.setDrink(btn.coffee());
			System.out.println(vo.getDrink() + "�� �����ϼ̽��ϴ�");		
			//System.out.println("\n����� �����ϼ���! ");
			vo.setSize(btn.Size());
			System.out.println(vo.getSize()+"�� �����ϼ̽��ϴ�");
			//System.out.println("ICE/HOT? ");
			vo.setMode(btn.temperature());
			System.out.println(vo.getMode()+ "�� �����ϼ̽��ϴ�");
			System.out.print("������ �Է����ּ��� [ex: 1] : ");
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
			System.out.println("���� �߰��ֹ� ���� �ֹ����� ���� �ֹ���� ��");
			System.out.println("��������������������������������������������");
			System.out.print("�޴����� �������ּ��� : ");
			
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

			vo.setSetmakecake(btn.cake());
			System.out.println("����ũ�� �������ּ���! ");
			
			System.out.print("������ �Է����ּ��� [ex: 1] : ");
			vo.setSu(sc.nextInt());
			
			if(vo.getSetmakecake().equals(m4)) {
				vo.setPriceredcake(vo.getSu());
			}else if(vo.getSetmakecake().equals(m5)){
				vo.setPricetiracake(vo.getSu());
			}
			lists.add(vo);
			
			System.out.println();
			System.out.println("��������������������������������������������");
			System.out.println("���� �߰��ֹ� ���� �ֹ����� ���� �ֹ���� ��");
			System.out.println("��������������������������������������������");
			System.out.print("�޴����� �����ϼ��� : ");
			System.out.println();
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
		
		System.out.println("��������������������������������");
		System.out.println("���� �����ֹ� ��������ũ �ֹ� ��");
		System.out.println("��������������������������������");
		System.out.print("�޴��� �����ϼ��� : ");
		int o = sc.nextInt();

		OrderVO vo = new OrderVO();
		ButtonClass btn = new ButtonClass();
		
		if(o==1) {
			//System.out.println("\n������� �������ּ���! ");
			vo.setDrink(btn.coffee());
			System.out.println(vo.getDrink() + "�� �����ϼ̽��ϴ�");		
			//System.out.println("\n����� �����ϼ���! ");
			vo.setSize(btn.Size());
			System.out.println(vo.getSize()+"�� �����ϼ̽��ϴ�");
			//System.out.println("ICE/HOT? ");
			vo.setMode(btn.temperature());
			System.out.println(vo.getMode()+ "�� �����ϼ̽��ϴ�");
			System.out.print("������ �Է��ϼ���![ex: 1] ");
			vo.setSu(sc.nextInt());
			
			if(vo.getDrink().equals(m1)) { 
				//���� �߰� ����
				//vo.setPrice(3000*vo.getSu()); 
				vo.setPricecode(vo.getSu());
			}else if(vo.getDrink().equals(m2)) {
				//vo.setPrice(2500*vo.getSu());
				vo.setPriceamea(vo.getSu());
			}else{ 
				//vo.setPrice(3500*vo.getSu());
				vo.setPricejava(vo.getSu());
			}
			lists.add(vo);
		}else if(o==2) {
			vo.setSetmakecake(btn.cake());
			System.out.println("����ũ�� �������ּ��� : ");
			
			System.out.print("������ �Է����ּ��� [ex: 1] : ");
			vo.setSu(sc.nextInt());
			if(vo.getSetmakecake().equals(m4)) {
				vo.setPriceredcake(vo.getSu());
			}else if(vo.getSetmakecake().equals(m5)) {
				vo.setPricetiracake(vo.getSu());
			}
			lists.add(vo);
		}else{
			System.out.println("�߸����� �Ͽ����ϴ�. ");
			return;
		}
		
			System.out.println("��������������������������������������������");
			System.out.println("���� �߰��ֹ� ���� �ֹ��Ϸ� ���� �ֹ���� ��");
			System.out.println("��������������������������������������������");
			System.out.print("�޴����� �����ϼ��� : ");
			
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
			System.out.println("    "+vo.toString());
			System.out.println("��------------------------------��");	
		}
		while(true) {
			System.out.println();
			System.out.println("�Է��� ������ �����Ű��� ? ");
			System.out.println();
			System.out.println("����������������������");
			System.out.println("���� �� ���� �ƴϿ� ��");
			System.out.println("����������������������");
			System.out.print(": ");
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
		System.out.println("\t\t  	         ��MENU��						");
		System.out.println(" ��--------------------------------------------------------------------��");
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��    ��Coffee��           Americano     : 2,500��                    ��");
		System.out.println(" ��                                                                    ��"); //��+����
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��                         Caffe Late    : 3,000��                    ��");
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��                         Cappuccino    : 3,000��                    ��");
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��    ��Cake��             RedvelvetCake : 3,000��                    ��");
		System.out.println(" ��                                                                    ��");
		System.out.println(" ��                         Tiramisu	  : 5,000��	                   ��");
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
		int tot = 0;

		System.out.println("===========================================");
		System.out.println("                ������ ���               ");
		System.out.println("                                         ");
		System.out.printf("  %1$tF    %1$tT \n", Calendar.getInstance());
		System.out.println("-------------------------------------------");
		System.out.println();
		while(ov.hasNext()) {
			OrderVO vo = ov.next();	
			System.out.println(vo.toString());
			tot += vo.getTot();
			System.out.println();
		}
		System.out.println("===========================================");
		System.out.println("�� �� : "+tot);
		System.out.println("===========================================");
		//���� ��� �κ�
		//if(����ũ) { ���� price} + if(����) { ���� price} => �����ϳ��� �༭ ���?
		}
		public void MakeCoffee() {
		MakeCoffee1 mc1= new MakeCoffee1();
		MakeCoffee2 mc2= new MakeCoffee2();
		MakeCoffee3 mc3= new MakeCoffee3();
		MakeCoffee4 mc4= new MakeCoffee4();
		BodyThread bt1 = new BodyThread();


		try {
			mc4.start();
			mc4.join();

			mc1.start();
			mc1.join();

			mc2.start();
			mc2.join();

			mc3.start();
			mc3.join();

		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("\n\n�ڡ����ᰡ �غ� �Ǿ����ϴ�!�ڡ�\n\n");
	}	
}

class ButtonClass {
	
	Scanner sc = new Scanner(System.in);
	public String coffee() {
		
		System.out.println();
		System.out.println("��---------------------------��");
		System.out.println("��(a) Americano              ��");
		System.out.println("��(b) Caffe Late             ��");
		System.out.println("��(c) Cappuccino             ��");
		System.out.println("��---------------------------��");
		String coffee = null;
		while(true) {
			
			System.out.print("���Ḧ �������ּ��� : ");
			coffee = sc.next();
			String[] menu = {"a","b","c"};
			
			if(coffee.equals(menu[0])) {
				coffee = "americano";
				break;
			}else if(coffee.equals(menu[1])) {
				coffee = "caffelate";
				break;
			}else if(coffee.equals(menu[2])) {
				coffee = "cappuccino ";
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
		System.out.println("��(b) tiramisu               ��");
		System.out.println("��---------------------------��");
		System.out.println();
		String cake = null;
		
		while(true) {
			System.out.print("�޴��� �����ϼ��� : ");
			cake = sc.next();
			String[] menu = {"a","b"};
			if(cake.equals(menu[0])) {
				cake = "redvelvetcake";
				break;
			}else if(cake.equals(menu[1])){
				cake = "tiramisu";
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
			System.out.print("����� �����ϼ��� : ");
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

