package com.project4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BoardImpl implements Board {

	Scanner sc = new Scanner(System.in);

	String name;
	int num;
	String rn;

	List<BoardVO> lists = new ArrayList<>();

	private Map<String, BoardVO> hMap = new HashMap<>();

	@Override
	public void input() {

		BoardVO vo = new BoardVO();

		System.out.print("\n����� ��ȣ : ");
		rn = sc.next();

		if (searchRn(rn)) {

			System.out.println("�� ��ȣ�� �̹� �����մϴ�. �߰� ���� ��");
			return;
		}

		System.out.print("����� �̸� : ");
		vo.setName(sc.next());

		hMap.put(rn, vo);
		System.out.println("\n �� �߰� �Ϸ� ��");
		System.out.println();

	}

	@Override
	public boolean searchRn(String rn) {

		if (hMap.containsKey(rn)) {
			return true;
		}
		return false;
	}

	@Override
	public void delete() {

		System.out.println(" [����] ����ȣ �Է� : ");
		rn = sc.nextLine();

		if (searchRn(rn)) {
			hMap.remove(rn);
			System.out.println("\n�� ���� �Ϸ� ��");
			System.out.println();
		} else {
			System.out.println("\n�� �����Ͱ� �����ϴ�. ���� ���� ��");
			System.out.println();
		}
	}

	@Override
	public void print() {

		Calendar cal = Calendar.getInstance();
		String s = String.format("%tF %tT", cal, cal);

		Iterator<String> it = hMap.keySet().iterator();

		while (it.hasNext()) {
			String key = it.next();
			BoardVO vo = hMap.get(key);
			System.out.println();
			System.out.println("����ȣ      ����");
			System.out.println("   " + key + "     " + vo.toString() + " ��");

		}
		System.out.println();
		System.out.println("\n   [" + hMap.size() + " �� �����]");
		System.out.println("\n ã���ּż� �����մϴ�.");
		System.out.println(" ������Ʈ �ð� : " + s);
		System.out.println();

	}

	@Override
	public void update() {

		try {
			Calendar cal = Calendar.getInstance();
			String s = String.format("%tF %tT", cal, cal);

			System.out.println();
			System.out.println("������ : " + hMap.values().toArray()[0] + " ��");
			System.out.println();

			String firstKey = hMap.keySet().iterator().next();

			hMap.remove(firstKey);

			// ------------------------------------------------------------------
			Iterator<String> it = hMap.keySet().iterator();

			while (it.hasNext()) {

				String key = it.next();
				BoardVO vo = hMap.get(key);
				System.out.println("����ȣ   ����");
				System.out.println("   " + key + "     " + vo.toString() + " ��");

			}
			System.out.println();
			System.out.println("\n  [" + hMap.size() + " �� �����]");
			System.out.println("\n ã���ּż� �����մϴ�.");
			System.out.println(" ������Ʈ �ð� : " + s);
			System.out.println();

		} catch (Exception e) {

			Calendar cal = Calendar.getInstance();
			String s = String.format("%tF %tT", cal, cal);

			System.out.println();
			System.out.println("   [0 �� �����]");
			System.out.println("\n ã���ּż� �����մϴ�.");
			System.out.println(" ������Ʈ �ð� : " + s);
			System.out.println();

		}

	}

	@Override
	public void treat() { // review
		System.out.println("������ : " + hMap.values().toArray()[0] + " ��");

	}

	@Override
	public int size() {
		return hMap.size();
	}

	@Override
	public int store() throws IOException {

		FileOutputStream fostream;
		try {
			fostream = new FileOutputStream("d:\\doc\\hospital\\waitlist.txt");

			ObjectOutputStream oostream = new ObjectOutputStream(fostream);

			oostream.writeObject(hMap);

			oostream.close();
			fostream.close();

			System.out.println(" �� ����� ��� ���� �Ϸ� ��");
			System.out.println();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public int restore() throws IOException {

		try {

			String str = "d:\\doc\\hospital\\waitlist.txt";

			File f = new File(str);

			if (!f.exists()) {

				if (!f.getParentFile().exists())
					f.getParentFile().mkdirs();

				FileOutputStream fostream = new FileOutputStream(f);

				fostream.close();

				System.out.println(" �� �ҷ��� ����� �����ϴ�. ��");
				System.out.println();

			}

			FileInputStream fistream = new FileInputStream(str);
			ObjectInputStream oistream = new ObjectInputStream(fistream);

			hMap = (Map<String, BoardVO>) oistream.readObject();

			fistream.close();
			oistream.close();

		} catch (Exception e2) {
			//e2.printStackTrace();
		}

		return 0;
	}

}
