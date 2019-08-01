package com.project3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Cart {

	//public static File f;
	static File f;
	List<MarketVO> lists = null;
	static String id = "";
	Scanner sc = new Scanner(System.in);
	static int i;

	Market m;

	@SuppressWarnings("unchecked")
	public Cart(String id) throws IOException {
		this.id = id;
		f = new File("C:\\Users\\stu\\Desktop\\"+id+".txt");

		if(f.exists()) {

			try {

				//System.out.println("debug] "+id+"�� ������ �����մϴ�");

				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				// ȸ���������ϰ� ����

				lists = new ArrayList<MarketVO>();
				lists = (List<MarketVO>) ois.readObject();
				
				fis.close();
				ois.close();

			} catch (Exception e) {
				// TODO: handle exception
			}

		} else {

			System.out.println("��ٱ��Ͽ� ��� ����� �����ϴ�!");
			System.out.println();
			Main ob = new Main();
			System.exit(0);
		}

		print();

	} //......������ �� 

	public  void print()  throws IOException{
		// print()�� �Դٴ°� ��ü�� ������ �����Ѵٴ°���
		System.out.println("\n<<<< "+id+"���� ��ٱ��� ��� >>>>");
		i=0;
		int tot=0;
		
		if(lists!=null) {
			
			Iterator<MarketVO> it = lists.iterator(); 
			while (it.hasNext()) {
				i++;
				MarketVO vo = it.next();
				System.out.print("["+i+"��° ��ǰ] ");
				System.out.println(vo.getTitle());
				System.out.println(Integer.parseInt(vo.getLprice())+"��");
				tot += Integer.parseInt(vo.getLprice());
			}
		} 
		

		System.out.println("----------------->  �� ����: "+tot+"��\n");
		
		System.out.print("1.��Ӽ��� 2.��ǰ���� 3.����ȭ�� => ");
		int su = sc.nextInt();
		if(su==1) {
			Market m = new Market(id);
			m.main(null);
		}else if (su==2) {
			delete();
		}else if (su==3) {
			Main ob = new Main();
		}
//		else if (su==3)
//			m  = new Market(id);
		
	} //...end print()
	
	public void delete() throws IOException {	//���ϻ���
		
	
		while(true) {
			
		System.out.print("\n�� ��° ��ǰ�� �����Ͻðڽ��ϱ�: ");
		
		int n = sc.nextInt();
		
		
		if(0<n && n<=i) {
			

			lists.remove(n-1);
				
			writeFile();	
			
			print();
			
			break;
			
		} // if���� ����
		
		else
			System.out.println(n+"��° ��ǰ�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
		
		}
		
		
	}
	
	public void writeFile() {	//��������
		
		try {
			
			if(lists!=null) {
				
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(lists);
				
				fos.close();
				oos.close();
				//System.out.println("debug] ��ٱ��� ������ �Ϸ�");
				
			}
						
		} catch (Exception e) {
			
		}
	}
}



/*package project1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Cart {

	//public static File f;
	static File f;
	List<MarketVO> lists = null;
	static String id = "";
	Scanner sc = new Scanner(System.in);
	static int i;

	Market m;

	@SuppressWarnings("unchecked")
	public Cart(String id) throws IOException {
		this.id = id;
		f = new File("C:\\Users\\stu\\Desktop\\"+id+".txt");

		if(f.exists()) {

			try {

				//System.out.println("debug] "+id+"�� ������ �����մϴ�");

				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				// ȸ���������ϰ� ����

				lists = new ArrayList<MarketVO>();
				lists = (List<MarketVO>) ois.readObject();
				
				fis.close();
				ois.close();

			} catch (Exception e) {
				// TODO: handle exception
			}

		} else {

			System.out.println("��ٱ��Ͽ� ��� ����� �����ϴ�!");
			System.out.println();
			Main ob = new Main();
			System.exit(0);
		}

		print();

	} //......������ �� 

	public  void print()  throws IOException{
		// print()�� �Դٴ°� ��ü�� ������ �����Ѵٴ°���
		System.out.println("\n<<<< "+id+"���� ��ٱ��� ��� >>>>");
		int i=0, tot=0;
		
		if(lists!=null) {
			
			Iterator<MarketVO> it = lists.iterator(); 
			while (it.hasNext()) {
				i++;
				MarketVO vo = it.next();
				System.out.print("["+i+"��° ��ǰ] ");
				System.out.println(vo.getTitle());
				System.out.println(Integer.parseInt(vo.getLprice())+"��");
				tot += Integer.parseInt(vo.getLprice());
			}
		} 
		

		System.out.println("----------------->  �� ����: "+tot+"��\n");
		
		System.out.print("1.��Ӽ��� 2.��ǰ���� 3.����ȭ�� => ");
		int su = sc.nextInt();
		
		if(su==1) {
			Market m = new Market(id);
			m.main(null);
		}else if (su==2) {
			delete();
		}else if (su==3) {
			Main ob = new Main();
		}
//		else if (su==3)
//			m  = new Market(id);
		
	} //...end print()
	
	public void delete() throws IOException {	//���ϻ���
		
		System.out.print("\n�� ��° ��ǰ�� �����Ͻðڽ��ϱ�: ");
		int n = sc.nextInt();
		
		if(0<n && n<i+1) {
			lists.remove(n-1);
			System.out.println(n+"��° ��Ḧ �����Ͽ����ϴ�");
		}else {
			System.out.println(n+"��° ��ᰡ �������� �ʽ��ϴ�");
		}
			
		writeFile();	
		
		print();
		
	}
	
	public void writeFile() {	//��������
		
		try {
			
			if(lists!=null) {
				
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(lists);
				
				fos.close();
				oos.close();
				//System.out.println("debug] ��ٱ��� ������ �Ϸ�");
				
			}
						
		} catch (Exception e) {
			
		}
	}
}
*/