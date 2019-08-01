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

		System.out.println("1.환자 등록번호(Patient Registration Number) : ");
		prn = sc.next();

		if (searchPrn(prn)) {

			System.out.println("▷ 등록번호 존재. 추가 실패 ◁");
			System.out.println();
			return;
		}

		ChartVO vo = new ChartVO();

		System.out.println("2.환자 이름(Patient Name) : ");
		vo.setName(sc.next());

		System.out.println("3.주민등록번호(Resident Registration Number) : ");
		vo.setRrn(sc.next());

		System.out.println("4.병력(Medical History) : ");
		vo.setMedhis(sc.next());

		System.out.println("5.가족병력(Family Medical History) : ");
		vo.setFamhis(sc.next());

		System.out.println("6.치료력(Treatment History) : ");
		vo.setTrthis(sc.next());

		System.out.println("7.의료지침서(Medical Directives) : ");
		vo.setMeddir(sc.next());

		System.out.println("8. 주치의 : ");
		vo.setDoc(sc.next());

		System.out.println("9. 입원기간 : ");
		vo.setPeriod(sc.nextInt());

		hMap.put(prn, vo);
		System.out.println("추가 완료");
		System.out.println();
	}

	@Override
	public void print() {

		Iterator<String> it = hMap.keySet().iterator();

		while (it.hasNext()) {

			String key = it.next();
			ChartVO vo = hMap.get(key);
			System.out.println("1.환자 등록번호(Patient Registration Number)");
			System.out.println(" " + key);
			System.out.println("2.성명(Patient Name)");
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

		System.out.println("[삭제] 환자등록번호(Patient Registration Number)입력 : ");
		prn = sc.next();

		if (searchPrn(prn)) {
			hMap.remove(prn);
			System.out.println("▷ 삭제 완료 ◁");
			System.out.println();
		} else {
			System.out.println("▷ 데이터가 없습니다. 삭제 실패 ◁");
			System.out.println();
		}
	}

	@Override
	public void update() {

		System.out.println("[수정] 환자등록번호(Patient Registration Number)입력 : ");
		String prn = sc.next();

		if (!searchPrn(prn)) { // false

			System.out.println("▷데이터가 없습니다. 수정 실패◁");
			System.out.println();
			return; // do not execute true below
		}


		ChartVO vo = hMap.get(prn);

		System.out.println("4.[수정] 병력(Medical History)입력 : ");
		vo.setMedhis(sc.next());

		System.out.println("5.[수정] 가족병력(Family Medical History)입력 : ");
		vo.setFamhis(sc.next());
	
		System.out.println("6.[수정] 치료력(Treatment History)입력 : ");
		vo.setTrthis(sc.next());

		System.out.println("7.[수정] 의료지침서(Medical Directives)입력 : ");
		vo.setMeddir(sc.next());
		
		System.out.println("▷ 수정 성공 ◁\n");
		System.out.println();
	}

	@Override
	public void searchPrn() {

		System.out.println("찾고자하는 환자 등록번호(Patient Registration Number)입력 : ");
		String prn = sc.next();
		// method1
		if (!searchPrn(prn)) {
			System.out.println("▷ 환자 등록번호가 존재하지 않습니다. 검색 실패 ◁");
			System.out.println();
			return;
		}

		ChartVO vo = hMap.get(prn);

		System.out.println("1.환자 등록번호(Patient Registration Number)");
		System.out.println(" " + prn);
		System.out.println("2.성명(Patient Name)");
		System.out.println(" " + vo.toString());
		System.out.println();
		

	}

	@Override
	public void searchName() {

		System.out.println("찾을 환자 이름(Patient Name)입력: ");
		String name = sc.next();

		// comparison
		Iterator<String> it = hMap.keySet().iterator();

		boolean flag = false;
		while (it.hasNext()) {

			String key = it.next();
			ChartVO vo = hMap.get(key); // find data thru keys

			if (vo.getName().equals(name)) {

				System.out.println("1.환자 등록번호(Patient Registration Number)");
				System.out.println(" " + prn);
				System.out.println("2.성명(Patient Name)");
				System.out.println(" " + vo.toString());
				System.out.println();

				flag = true;
			}

		}

		if (!flag) {
			System.out.println("▷ 이름이 존재하지 않습니다. 검색 실패 ◁");
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

			System.out.println("▷ 차트 저장 완료 ◁");
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

				System.out.println("▷ 불러올 차트가 없습니다. ◁");
				System.out.println();
			}
		} catch (Exception e) {
		
		}

		return 0;
	}// end restore

}// end chartimpl
