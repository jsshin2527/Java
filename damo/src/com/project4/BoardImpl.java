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

		System.out.print("\n대기자 번호 : ");
		rn = sc.next();

		if (searchRn(rn)) {

			System.out.println("▷ 번호가 이미 존재합니다. 추가 실패 ◁");
			return;
		}

		System.out.print("대기자 이름 : ");
		vo.setName(sc.next());

		hMap.put(rn, vo);
		System.out.println("\n ▷ 추가 완료 ◁");
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

		System.out.println(" [삭제] 대기번호 입력 : ");
		rn = sc.nextLine();

		if (searchRn(rn)) {
			hMap.remove(rn);
			System.out.println("\n▷ 삭제 완료 ◁");
			System.out.println();
		} else {
			System.out.println("\n▷ 데이터가 없습니다. 삭제 실패 ◁");
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
			System.out.println("대기번호      성명");
			System.out.println("   " + key + "     " + vo.toString() + " 님");

		}
		System.out.println();
		System.out.println("\n   [" + hMap.size() + " 명 대기중]");
		System.out.println("\n 찾아주셔서 감사합니다.");
		System.out.println(" 업데이트 시각 : " + s);
		System.out.println();

	}

	@Override
	public void update() {

		try {
			Calendar cal = Calendar.getInstance();
			String s = String.format("%tF %tT", cal, cal);

			System.out.println();
			System.out.println("진료중 : " + hMap.values().toArray()[0] + " 님");
			System.out.println();

			String firstKey = hMap.keySet().iterator().next();

			hMap.remove(firstKey);

			// ------------------------------------------------------------------
			Iterator<String> it = hMap.keySet().iterator();

			while (it.hasNext()) {

				String key = it.next();
				BoardVO vo = hMap.get(key);
				System.out.println("대기번호   성명");
				System.out.println("   " + key + "     " + vo.toString() + " 님");

			}
			System.out.println();
			System.out.println("\n  [" + hMap.size() + " 명 대기중]");
			System.out.println("\n 찾아주셔서 감사합니다.");
			System.out.println(" 업데이트 시각 : " + s);
			System.out.println();

		} catch (Exception e) {

			Calendar cal = Calendar.getInstance();
			String s = String.format("%tF %tT", cal, cal);

			System.out.println();
			System.out.println("   [0 명 대기중]");
			System.out.println("\n 찾아주셔서 감사합니다.");
			System.out.println(" 업데이트 시각 : " + s);
			System.out.println();

		}

	}

	@Override
	public void treat() { // review
		System.out.println("진료중 : " + hMap.values().toArray()[0] + " 님");

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

			System.out.println(" ▷ 대기자 명단 저장 완료 ◁");
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

				System.out.println(" ▷ 불러올 명단이 없습니다. ◁");
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
