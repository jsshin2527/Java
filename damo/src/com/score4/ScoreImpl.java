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
	
	private Map<String,ScoreVO> hMap = new TreeMap<>(); //TreeMap�� ������������ �����͸� �����ݴϴ�. 
	
	Scanner sc = new Scanner(System.in);
	
	String hak;

	
	@Override
	public void input() {
	
		System.out.print("�й� ?");
		hak = sc.next();
		
		if(searchHak(hak)) { //T True F False
			System.out.println("�й��� �����մϴ�.:");
			System.out.println("�߰� ����");
			return; // �������� ���ƶ� 
		}
		ScoreVO vo = new ScoreVO();
		
		System.out.print("�̸�?: ");
		vo.setName(sc.next());
		System.out.print("����? : ");
		vo.setKor(sc.nextInt());
		System.out.print("����? : ");
		vo.setEng(sc.nextInt());
		System.out.print("����? : ");
		vo.setMat(sc.nextInt());
		
		hMap.put(hak,vo);
		System.out.println("�߰� ���� ! ");
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
		System.out.print("������ �й��� �Է��ϼ��� :" );
		hak = sc.next();
		
		if(searchHak(hak)) {
			hMap.remove(hak);
			System.out.println("���� ���� !! ");
		}else {
			System.out.println("���� ���� !! ");
			System.out.println("�й��� �����ϴ�. !!");
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
		   Test ob2 = ob; // call by reference -> �� �ڵ�� ���� �ڵ� 
		*/
		
		System.out.print("������ �й� ? :");
		
		hak =sc.next();
		
		ScoreVO vo = hMap.get(hak);
		
		if(!searchHak(hak)) {
			System.out.println("���� ���� ");
			System.out.println("�й��� �����ϴ�.");
			return;
		}	
		
		System.out.print("������ ���� ����");
		vo.setKor(sc.nextInt());
		System.out.print("������ ���� ����");
		vo.setEng(sc.nextInt());
		System.out.print("������ ���� ����");
		vo.setMat(sc.nextInt());	
		
		hMap.put(hak,vo);
		System.out.println("���� ���� ! ");
		//null �� ���ɴϴ� .
		//������ �ϴ� �ڵ��� �ϸ� �˴ϴ�.
		
	}

	@Override
	public void findHak() {
		System.out.println("�˻��� �й� : ");
		hak = sc.next();
		if(!searchHak(hak)) {
			System.out.println("�й��� �����ϴ�. ");
			return;
		}
		ScoreVO vo = hMap.get(hak); // �ּҰ��� �̾ƿ� call by reference 
		System.out.println(hak+" "+vo.toString());
		/*
		 * searchHak�� ������� �ʰ� �й� �˻��ϱ� 
		 * ScoreVO vo = hMap.get(hak);
		 * if(vo==null){
		 * 	System.out.println("�й��� �����ϴ�.");
		 * 	return;
		 * }
		 * 
		 */
	}

	@Override
	public void findName() {
		String name;
		System.out.println("�˻��� �̸� : ");
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
		//�̸��� ���ٸ� ������ ����ؾ��մϴ�. 
		if(!flag) {
			System.out.println("�̸��� �����ϴ�. �˻� ���� ");
		}
		
		ScoreVO vo = hMap.get(name); // �ּҰ��� �̾ƿ� 
		System.out.println(hak+" "+vo.toString());
	}	
}
	

