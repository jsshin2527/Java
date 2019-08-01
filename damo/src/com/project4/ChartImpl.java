package com.project4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class ChartImpl implements Chart {

	private Map<String, ChartVO> hMap = new HashMap<>();

	Scanner sc = new Scanner(System.in);
	String name, rrn, medhis, famhis, trthis, meddir;
	String prn;

	@Override
	public void input() {

		System.out.println("1.ȯ�� ��Ϲ�ȣ(Patient Registration Number) : ");
		prn = sc.next();

		if (searchPrn(prn)) {

			System.out.println("�� ��Ϲ�ȣ ����. �߰� ���� ��");
			System.out.println();
			return;
		}

		ChartVO vo = new ChartVO();

		System.out.println("2.ȯ�� �̸�(Patient Name) : ");
		vo.setName(sc.next());

		System.out.println("3.�ֹε�Ϲ�ȣ(Resident Registration Number) : ");
		vo.setRrn(sc.next());

		System.out.println("4.����(Medical History) : ");
		vo.setMedhis(sc.next());

		System.out.println("5.��������(Family Medical History) : ");
		vo.setFamhis(sc.next());

		System.out.println("6.ġ���(Treatment History) : ");
		vo.setTrthis(sc.next());

		System.out.println("7.�Ƿ���ħ��(Medical Directives) : ");
		vo.setMeddir(sc.next());

		System.out.println("8. ��ġ�� : ");
		vo.setDoc(sc.next());

		System.out.println("9. �Կ��Ⱓ : ");
		vo.setPeriod(sc.nextInt());

		hMap.put(prn, vo);
		System.out.println("�߰� �Ϸ�");
		System.out.println();
	}

	@Override
	public void print() {

		Iterator<String> it = hMap.keySet().iterator();

		while (it.hasNext()) {

			String key = it.next();
			ChartVO vo = hMap.get(key);
			System.out.println("1.ȯ�� ��Ϲ�ȣ(Patient Registration Number)");
			System.out.println(" " + key);
			System.out.println("2.����(Patient Name)");
			System.out.println(" " + vo.toString());
			System.out.println();
		}

	}

	@Override
	public boolean searchPrn(String prn) {

		if (hMap.containsKey(prn)) {
			return true;
		}

		return false;
	}

	@Override
	public void delete() {

		System.out.println("[����] ȯ�ڵ�Ϲ�ȣ(Patient Registration Number)�Է� : ");
		prn = sc.next();

		if (searchPrn(prn)) {
			hMap.remove(prn);
			System.out.println("�� ���� �Ϸ� ��");
			System.out.println();
		} else {
			System.out.println("�� �����Ͱ� �����ϴ�. ���� ���� ��");
			System.out.println();
		}
	}

	@Override
	public void update() {

		System.out.println("[����] ȯ�ڵ�Ϲ�ȣ(Patient Registration Number)�Է� : ");
		String prn = sc.next();

		if (!searchPrn(prn)) { // false

			System.out.println("�������Ͱ� �����ϴ�. ���� ���Т�");
			System.out.println();
			return; // do not execute true below
		}


		ChartVO vo = hMap.get(prn);

		System.out.println("4.[����] ����(Medical History)�Է� : ");
		vo.setMedhis(sc.next());

		System.out.println("5.[����] ��������(Family Medical History)�Է� : ");
		vo.setFamhis(sc.next());
	
		System.out.println("6.[����] ġ���(Treatment History)�Է� : ");
		vo.setTrthis(sc.next());

		System.out.println("7.[����] �Ƿ���ħ��(Medical Directives)�Է� : ");
		vo.setMeddir(sc.next());
		
		System.out.println("�� ���� ���� ��\n");
		System.out.println();
	}

	@Override
	public void searchPrn() {

		System.out.println("ã�����ϴ� ȯ�� ��Ϲ�ȣ(Patient Registration Number)�Է� : ");
		String prn = sc.next();
		// method1
		if (!searchPrn(prn)) {
			System.out.println("�� ȯ�� ��Ϲ�ȣ�� �������� �ʽ��ϴ�. �˻� ���� ��");
			System.out.println();
			return;
		}

		ChartVO vo = hMap.get(prn);

		System.out.println("1.ȯ�� ��Ϲ�ȣ(Patient Registration Number)");
		System.out.println(" " + prn);
		System.out.println("2.����(Patient Name)");
		System.out.println(" " + vo.toString());
		System.out.println();
		

	}

	@Override
	public void searchName() {

		System.out.println("ã�� ȯ�� �̸�(Patient Name)�Է�: ");
		String name = sc.next();

		// comparison
		Iterator<String> it = hMap.keySet().iterator();

		boolean flag = false;
		while (it.hasNext()) {

			String key = it.next();
			ChartVO vo = hMap.get(key); // find data thru keys

			if (vo.getName().equals(name)) {

				System.out.println("1.ȯ�� ��Ϲ�ȣ(Patient Registration Number)");
				System.out.println(" " + prn);
				System.out.println("2.����(Patient Name)");
				System.out.println(" " + vo.toString());
				System.out.println();

				flag = true;
			}

		}

		if (!flag) {
			System.out.println("�� �̸��� �������� �ʽ��ϴ�. �˻� ���� ��");
			System.out.println();
		}

	}// end searchName
	// ------------------------------------------------------------------------

	@Override
	public int store() throws IOException {

		FileOutputStream fostream;
		try {
			fostream = new FileOutputStream("d:\\doc\\hospital\\patinfo.txt");

			ObjectOutputStream oostream = new ObjectOutputStream(fostream);

			oostream.writeObject(hMap);

			oostream.close();
			fostream.close();

			System.out.println("�� ��Ʈ ���� �Ϸ� ��");
			System.out.println();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return 0;
	}// end store
//------------------------------------------------------------------------------

	@Override
	public int restore() throws IOException {

		try {

			String str = "d:\\doc\\hospital\\patinfo.txt";

			File f = new File(str);

			if (f.exists()) {

				FileInputStream fistream = new FileInputStream(str);
				ObjectInputStream oistream = new ObjectInputStream(fistream);

				hMap = (Map<String, ChartVO>) oistream.readObject();

				fistream.close();
				oistream.close();

			} else {

				if (!f.getAbsoluteFile().exists())
					f.getParentFile().mkdir();

				FileOutputStream fostream = new FileOutputStream(f);

				fostream.close();

				System.out.println("�� �ҷ��� ��Ʈ�� �����ϴ�. ��");
				System.out.println();
			}
		} catch (Exception e) {
		
		}

		return 0;
	}// end restore

}// end chartimpl
