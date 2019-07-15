package score3;

import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score {
	
	Scanner sc = new Scanner(System.in);
	
	List<ScoreVO> lists = new ArrayList<>();
	
	//ScoreVO �� ���� 
	
	@Override
	public int input() {	
		
		int result = 0;
		
		//Scanner sc = new Scanner(System.in);
		
		ScoreVO vo = new ScoreVO();
		
		System.out.print("�й� : ");
		vo.setHak(sc.next());
		System.out.print("�̸� : ");
		vo.setName(sc.next());
		System.out.print("���� : ");
		vo.setKor(sc.nextInt());
		System.out.print("���� : ");
		vo.setEng(sc.nextInt());
		System.out.print("���� : ");
		vo.setMat(sc.nextInt());
		
		lists.add(vo);
		//db �� ������ �ɶ��� 
		//����� ���� ��ȯ�� �ɶ��� 1
		//����� ��ȯ�� �ȵɶ��� 0
		return result;
	}
	@Override
	public void print() {
		Iterator<ScoreVO> it = lists.iterator();
		while(it.hasNext()) {
			ScoreVO vo = it.next();
			//System.out.printf("%6s %6s %4d %4d %4d %4d %.2f \n",vo.getName(),vo.getHak(),vo.getKor(),
					//vo.getEng(),vo.getMat(),(vo.getKor()+vo.getEng()+vo.getMat()),(vo.getKor()+vo.getEng()+vo.getMat())/3.0);			
			System.out.print(vo.toString());
		}
		
	}
	@Override
	public void searchHak() { //�й� �˻� 
		
		//lists �� �ִ� ��� �й��� ���� �� ���� 
		
		System.out.print("�˻��� �й��� �Է��ϼ��� ");	
		String searchHak = sc.next(); //���ڿ� ���� ���� 
		
		Iterator<ScoreVO> it = lists.iterator();
		String str;
		
		while(it.hasNext()){
			
			ScoreVO vo = it.next();
					
			if(vo.getHak().equals(searchHak)){
				System.out.println(vo.toString());
				break;
			}
		}
		//System.out.println("�˻��� �й��� �Է��ϼ��� : ");
		//String search = sc.next();
		
		//lists.indexOf(search);
		/*
		while() {
			
			if() {
				System.out.println("�˻� ���� " + search);
			}else {
				System.out.println("�˻� ���� " + search);
			}
		}
		/*
		if(index != -1 /* ���� -1�� �ƴϸ��� ���� ����մϴ�. ) {
			System.out.println("�˻� ���� :" + index);//3
		}else {
			System.out.println("�˻� ���� :" + index);//-1
		}
		*/

	}
	@Override
	public void searchName() { //�̸� �˻� 
		//lists �� �ִ� ��� �й��� ���� �� ���� 
		
		System.out.print("�˻��� �̸��� �Է��ϼ��� ");	
		String searchname = sc.next(); //���ڿ� ���� ���� 
		
		Iterator<ScoreVO> it = lists.iterator();
		
		String str;
		
		while(it.hasNext()){
			
			ScoreVO vo = it.next();
					
			if(vo.getHak().equals(searchname)){
				System.out.println(vo.toString());
				break;
			}
		}
	}	
	
	@Override
	public void descSortTot() {
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {				
			
				return vo1.getTot() < vo2.getTot()?1:-1; //��� �ʰ� �ִ� ������� ������ �ϰڴٶ�� �ǹ� 
			}
		};	
		Collections.sort(lists,comp);
		print();
	}
	@Override
	public void ascSortHak() { //compare �� �� 
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				//return Integer.parseInt(vo1.getHak()) > Integer.parseInt(vo2.getHak())?1:-1;
				return vo1.getHak().compareTo(vo2.getHak());
			}
		};
		Collections.sort(lists,comp);
		print();
	}
}
