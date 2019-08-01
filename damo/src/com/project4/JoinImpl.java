package com.project4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class JoinImpl implements Joining {

	Scanner sc = new Scanner(System.in);

	Map<String, JoinVO> hMap = new HashMap<>();

	String str = "d:\\doc\\hospital\\login.txt";

	String id, pw;

	@Override
	public void join() throws Exception { // ȸ������

		try {
		
			System.out.println("\n[ȸ������]\n");

			JoinVO vo = new JoinVO();

			File f = new File(str);

			if (!f.exists()) {
				if (f.getParentFile().exists())
					f.getParentFile().mkdirs();
			}

			FileOutputStream fos = new FileOutputStream(str);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			do {
				System.out.print("���̵�: ");
				id = sc.next();

			} while (check(id));

			System.out.print("��й�ȣ: ");
			vo.setPw1(sc.next());

			System.out.print("��й�ȣȮ��: ");
			vo.setPw2(sc.next());

			while (!vo.getPw2().equals(vo.getPw1())) {

				System.out.println(" �� �ٽ� �Է��Ͻÿ� ��");
				System.out.print("��й�ȣȮ��: ");
				vo.setPw2(sc.next());
			}

			System.out.print("�̸�: ");
			vo.setName(sc.next());

			System.out.print("����[����/����]: ");
			vo.setGender(sc.next());

			System.out.print("����[000000]: ");
			vo.setBirth(sc.next());

			System.out.print("�̸���: ");
			vo.setEmail(sc.next());

			System.out.print("��ȭ��ȣ: ");
			System.out.println();
			vo.setTel(sc.next());

			hMap.put(id, vo);

			oos.writeObject(hMap);

			fos.close();
			oos.close();

		} catch (Exception e) {
			
		}

	}

	private boolean check(String id) {

		try {

			FileInputStream fis = new FileInputStream(str);
			ObjectInputStream ois = new ObjectInputStream(fis);

			hMap = (Map<String, JoinVO>) ois.readObject();

			Iterator<String> it = hMap.keySet().iterator();

			while (it.hasNext()) {
				String key = it.next();

				if (id.equals(key))
					return true;
				return false;
			}

		} catch (Exception e) {
			
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	private boolean logincheck(String id, String pw) throws Exception {

		FileInputStream fis = new FileInputStream(str);
		ObjectInputStream ois = new ObjectInputStream(fis);

		hMap = (Map<String, JoinVO>) ois.readObject();

		Iterator<String> it = hMap.keySet().iterator();

		while (it.hasNext()) {
			String key = it.next();

			if (id.equals(key) && pw.equals(hMap.get(key).getPw1()))
				return true;
			return false;
		}
		return false;
	}

	@Override
	public void login() {

		try {
			
			System.out.println("\n[�α���]\n");
			
			do {
				System.out.print("���̵�?");
				id = sc.next();

				System.out.print("��й�ȣ?");
				pw = sc.next();

			} while (!logincheck(id, pw));

			
			System.out.println("\n �� �α��οϷ� ��");
			new Main();
		} catch (Exception e) {
			
		}

	}

}
