package com.score4;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import score3.ScoreVO;

public class ScoreImpl implements Score{

	//private Map<String,ScoreVO> hmap = new HashMap<>();
	
	private Map<String,ScoreVO> hMap = new TreeMap<>(); //TreeMap은 오름차순으로 데이터를 보여줍니다. 
	
	Scanner sc = new Scanner(System.in);
	
	String hak;

	
	@Override
	public void input() {
	
		System.out.print("학번 ?");
		hak = sc.next();
		
		if(searchHak(hak)) { //T True F False
			System.out.println("학번이 존재합니다.:");
			System.out.println("추가 실패");
			return; // 실행하지 말아라 
		}
		ScoreVO vo = new ScoreVO();
		
		System.out.print("이름?: ");
		vo.setName(sc.next());
		System.out.print("국어? : ");
		vo.setKor(sc.nextInt());
		System.out.print("영어? : ");
		vo.setEng(sc.nextInt());
		System.out.print("수학? : ");
		vo.setMat(sc.nextInt());
		
		hMap.put(hak,vo);
		System.out.println("추가 성공 ! ");
	}

	@Override
	public void print() {
		
		Iterator<String> it = hMap.keySet().iterator();
		
		while(it.hasNext()) {
			
			String key = it.next();
			ScoreVO vo = hMap.get(key);
			System.out.println(key+" "+vo.toString());
			System.out.print(vo.getName());
			System.out.print(vo.getKor());
			System.out.print(vo.getEng());
			System.out.print(vo.getMat());
		}
	}
	@Override
	public boolean searchHak(String hak) {	
		if(hMap.containsKey(hak)) {
			return true;
		}	
		return false;	
		//return hMap.containsKey(hak);
	}

	@Override
	public void delete() {
		System.out.print("삭제할 학번을 입력하세요 :" );
		hak = sc.next();
		
		if(searchHak(hak)) {
			hMap.remove(hak);
			System.out.println("삭제 성공 !! ");
		}else {
			System.out.println("삭제 실패 !! ");
			System.out.println("학번이 없습니다. !!");
		}		
	}
	@Override
	public void updata() {
	
		/*
		ScoreVO prevo = new ScoreVO();
		String prename = prevo.getName();
		ScoreVO vo = new ScoreVO();
		vo.setHak(prename);
		*/
		
		/*
		   Test ob = new Test();
		   Test ob2 = ob; // call by reference -> 위 코드와 같은 코드 
		*/
		
		System.out.print("수정할 학번 ? :");
		
		hak =sc.next();
		
		ScoreVO vo = hMap.get(hak);
		
		if(!searchHak(hak)) {
			System.out.println("수정 실패 ");
			System.out.println("학번이 없습니다.");
			return;
		}	
		
		System.out.print("수정할 국어 점수");
		vo.setKor(sc.nextInt());
		System.out.print("수정할 영어 점수");
		vo.setEng(sc.nextInt());
		System.out.print("수정할 수학 점수");
		vo.setMat(sc.nextInt());	
		
		hMap.put(hak,vo);
		System.out.println("수정 성공 ! ");
		//null 이 나옵니다 .
		//수정을 하는 코딩을 하면 됩니다.
		
	}

	@Override
	public void findHak() {
		System.out.println("검색할 학번 : ");
		hak = sc.next();
		if(!searchHak(hak)) {
			System.out.println("학번이 없습니다. ");
			return;
		}
		ScoreVO vo = hMap.get(hak); // 주소값을 뽑아옴 call by reference 
		System.out.println(hak+" "+vo.toString());
		/*
		 * searchHak을 사용하지 않고 학번 검색하기 
		 * ScoreVO vo = hMap.get(hak);
		 * if(vo==null){
		 * 	System.out.println("학번이 없습니다.");
		 * 	return;
		 * }
		 * 
		 */
	}

	@Override
	public void findName() {
		String name;
		System.out.println("검색할 이름 : ");
		name = sc.next();
		Iterator<String> it = hMap.keySet().iterator();
		
		boolean flag = false;
		while(it.hasNext()) {
			String key = it.next();
			ScoreVO vo =hMap.get(key);
			
			if(vo.getName().equals(name)) {
				System.out.println(key+" "+vo.toString());
				flag = true;
			}
			
		}
		//이름이 없다면 다음을 출력해야합니다. 
		if(!flag) {
			System.out.println("이름이 없습니다. 검색 실패 ");
		}
		
		ScoreVO vo = hMap.get(name); // 주소값을 뽑아옴 
		System.out.println(hak+" "+vo.toString());
	}	
}
	

