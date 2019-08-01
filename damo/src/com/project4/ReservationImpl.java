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
		
		
		System.out.print("환자 번호: ");
		prn = sc.nextInt();

		ReservationVO vo = new ReservationVO();

		System.out.print("환자 이름: ");
		vo.setName(sc.next());

		System.out.print("환자 주민등록번호[000000-0000000]: ");
		vo.setRrn(sc.next());

		System.out.print("예약 날짜[0000-00-00]: ");
		vo.setDate(sc.next());

		System.out.print("예약 시간[00:00]: ");
		vo.setTime(sc.next());

		System.out.print("병명: ");
		vo.setIll(sc.next());

		System.out.print("담당 의사: ");
		vo.setDoc(sc.next());

		hMap.put(prn, vo);

		System.out.println();
		System.out.println("  ▷ 예약성공 ◁ ");
		System.out.println();

	}

	@Override
	public void reserupdate() {

		System.out.print("[수정] 환자 번호: ");
		prn = sc.nextInt();

		if (!searchPrn(prn)) {
			System.out.println("  ▷ 환자 정보가 존재하지 않습니다. ◁");
			return;
		}

		ReservationVO vo = hMap.get(prn);

		System.out.print("예약 날짜[0000-00-00]: ");
		vo.setDate(sc.next());

		System.out.print("예약 시간[00:00]: ");
		vo.setTime(sc.next());

		hMap.put(prn, vo);

		System.out.println("  ▷ 예약 정보를 변경했습니다. ◁");

	}

	@Override
	public void reserdel() {

		System.out.print("[삭제] 환자 번호?");
		prn = sc.nextInt();

		if (searchPrn(prn)) {
			hMap.remove(prn);
			System.out.println();
			System.out.println("  ▷ 예약 정보를 삭제했습니다. ◁  ");
			System.out.println();
		}

	}

	@Override
	public void allprint() {
		
		Iterator<Integer> it = hMap.keySet().iterator();

		if (it.hasNext() == true) {

			System.out.println();
			System.out.println("-------------------------※예약 현황※-----------------------");
			System.out.println("등록번호  이름   주민등록번호  날짜   시간   병명   주치의");
	
			while (it.hasNext()) {
				int key = it.next();
				ReservationVO vo = hMap.get(key);
				System.out.println(key + " " + vo.toString());
				System.out.println();
			}
		} else if(it.hasNext() == false) {
			System.out.println();
			System.out.println(" ▷ 현재 예약 정보가 존재하지 않습니다. ◁ ");
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
		System.out.println(" ▷ 예약 현황 파일 저장 ◁ ");
		new Main();
		
	}
	
	

}
