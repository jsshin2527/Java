package com.project4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ReservationImpl implements Reservation {

	private Map<Integer, ReservationVO> hMap = new HashMap<>();
	
	Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int prn;
	
	String str = "d:\\doc\\hospital\\reserinfo.txt";
	
	@Override
	public void reseradd() {
		
		
		System.out.print("ȯ�� ��ȣ: ");
		prn = sc.nextInt();

		ReservationVO vo = new ReservationVO();

		System.out.print("ȯ�� �̸�: ");
		vo.setName(sc.next());

		System.out.print("ȯ�� �ֹε�Ϲ�ȣ[000000-0000000]: ");
		vo.setRrn(sc.next());

		System.out.print("���� ��¥[0000-00-00]: ");
		vo.setDate(sc.next());

		System.out.print("���� �ð�[00:00]: ");
		vo.setTime(sc.next());

		System.out.print("����: ");
		vo.setIll(sc.next());

		System.out.print("��� �ǻ�: ");
		vo.setDoc(sc.next());

		hMap.put(prn, vo);

		System.out.println();
		System.out.println("  �� ���༺�� �� ");
		System.out.println();

	}

	@Override
	public void reserupdate() {

		System.out.print("[����] ȯ�� ��ȣ: ");
		prn = sc.nextInt();

		if (!searchPrn(prn)) {
			System.out.println("  �� ȯ�� ������ �������� �ʽ��ϴ�. ��");
			return;
		}

		ReservationVO vo = hMap.get(prn);

		System.out.print("���� ��¥[0000-00-00]: ");
		vo.setDate(sc.next());

		System.out.print("���� �ð�[00:00]: ");
		vo.setTime(sc.next());

		hMap.put(prn, vo);

		System.out.println("  �� ���� ������ �����߽��ϴ�. ��");

	}

	@Override
	public void reserdel() {

		System.out.print("[����] ȯ�� ��ȣ?");
		prn = sc.nextInt();

		if (searchPrn(prn)) {
			hMap.remove(prn);
			System.out.println();
			System.out.println("  �� ���� ������ �����߽��ϴ�. ��  ");
			System.out.println();
		}

	}

	@Override
	public void allprint() {
		
		Iterator<Integer> it = hMap.keySet().iterator();

		if (it.hasNext() == true) {

			System.out.println();
			System.out.println("-------------------------�ؿ��� ��Ȳ��-----------------------");
			System.out.println("��Ϲ�ȣ  �̸�   �ֹε�Ϲ�ȣ  ��¥   �ð�   ����   ��ġ��");
	
			while (it.hasNext()) {
				int key = it.next();
				ReservationVO vo = hMap.get(key);
				System.out.println(key + " " + vo.toString());
				System.out.println();
			}
		} else if(it.hasNext() == false) {
			System.out.println();
			System.out.println(" �� ���� ���� ������ �������� �ʽ��ϴ�. �� ");
			System.out.println();
		}
	}
	
	@Override
	public boolean searchPrn(int prn) {

		if (hMap.containsKey(prn)) {
			return true;
		}

		return false;
	}


	public void check() {

		try {

			File f = new File(str);

			if (f.exists()) {

				FileInputStream fis = new FileInputStream(str);
				ObjectInputStream ois = new ObjectInputStream(fis);
		
				hMap = (Map<Integer, ReservationVO>) ois.readObject();
			
				fis.close();
				ois.close();

			} else {
				
				if (!f.getAbsoluteFile().exists())
					f.getParentFile().mkdir();

				FileOutputStream fos = new FileOutputStream(f);

				fos.close();
			}
		} catch (Exception e) {

		}
	}

	@Override
	public void end() throws Exception {
			
		try {
			
			if(hMap != null) {
			FileOutputStream fos = new FileOutputStream(str);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(hMap);
		
			fos.close();
			oos.close();
			
			}
		} catch (Exception e) {
		}
		
		System.out.println();
		System.out.println(" �� ���� ��Ȳ ���� ���� �� ");
		new Main();
		
	}
	
	

}
