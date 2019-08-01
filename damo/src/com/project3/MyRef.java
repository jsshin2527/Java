package com.project3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MyRef {
	
	private List<MyRefVO> lists = null;
	private static int n;
	Scanner sc = new Scanner(System.in);
	
	File f;
		
	@SuppressWarnings("unchecked")
	public MyRef(String id){
		
		f = new File("C:\\Users\\stu\\Desktop\\"+ id +"ref.txt");
		
		try {
			
			if(f.exists()) {
				
				//System.out.println("�����־��");
				
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				lists = (ArrayList<MyRefVO>)ois.readObject();
				
				n = lists.size();	//����ǥ�� -> ���ϰ�Ӻҷ��;�...
				
				fis.close();
				ois.close();
				
			} else {
				//System.out.println("���Ͼ����");
				n = 0;
				
			}
			
		} catch (Exception e) {
			
		}
	}
	
	public void input() {	//�����Է�
		
		MyRefVO vo = new MyRefVO();
				
		System.out.print("����: ");
		vo.setName(sc.next());
		
		System.out.print("���Գ�¥[yyyyMMdd]: ");
		vo.setBuyDate(sc.next());
		
		System.out.print("����: ");
		vo.setNum(sc.next());
		
		System.out.print("�������[yyyyMMdd]: ");
		vo.setEndDate(sc.next());
		
		if(lists==null) {
			lists = new ArrayList<>();
		}
		
		lists.add(vo);
		
		writeFile();	//��������
	}
	
	
	public void writeFile() {	//��������
		
		try {
			
			if(lists!=null) {
				
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(lists);
				
				fos.close();
				oos.close();
				//System.out.println("��Ḧ �����߽��ϴ�");
			}
						
		} catch (Exception e) {
			
		}
	}
	
	public void delete() {	//���ϻ���

		MyRefVO vo = new MyRefVO();
		
		System.out.print("\n���° ��� ����? ");
		//n = sc.nextInt();
		//lists.remove(n-1);
		
		int i = sc.nextInt();
		
		if(0<i && i<n+1) {
			lists.remove(i-1);
			System.out.println(i+"��° ��Ḧ �����Ͽ����ϴ�");
		}else {
			System.out.println(i+"��° ��ᰡ �������� �ʽ��ϴ�");
		}
		writeFile();	//��������
		
	}
	
	public void print() {	//�������

		System.out.println("\n-----------------  ����� ��� ���  ----------------");
		System.out.println(" ��ȣ     ����   ���Գ�¥      ����   �������");

		try {
			
			Iterator<MyRefVO> it = lists.iterator();

			int i = 0;
			
			while(it.hasNext()) {
				i++;
				MyRefVO vo = it.next();
				System.out.println(vo.toString(i));
			}
			
		} catch (Exception e) {
			System.out.println("�Էµ� �����Ͱ� �����ϴ�");
		}
	}
	
	public void compare() {	//���糯¥�� ������� ��
		
		try {
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			
			Date today = new Date();
			
			for(int i=0;i<n;i++) {
				
				String start = sdf.format(today);
				String end = lists.get(i).getEndDate();
				
				Date beginDate = sdf.parse(start);
		        Date endDate = sdf.parse(end);
		        
		        long diff = endDate.getTime() - beginDate.getTime();
		        long diffDays = diff / (24 * 60 * 60 * 1000);
		        
				if(diffDays<=5 && diffDays>0) {
					System.out.println(lists.get(i).getName() + 
							"�� ��������� " + diffDays + "�� ���ҽ��ϴ�");
				}else if(diffDays==0) {
					System.out.println(lists.get(i).getName() + "�� ��������� ���ñ��� �Դϴ�");
				}else if(diffDays<0) {
					System.out.println(lists.get(i).getName() + "�� ��������� �������ϴ�");
				}
			}
		} catch (Exception e) {
			
		}
	}
}
