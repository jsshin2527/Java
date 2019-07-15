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
	
	//ScoreVO 가 지갑 
	
	@Override
	public int input() {	
		
		int result = 0;
		
		//Scanner sc = new Scanner(System.in);
		
		ScoreVO vo = new ScoreVO();
		
		System.out.print("학번 : ");
		vo.setHak(sc.next());
		System.out.print("이름 : ");
		vo.setName(sc.next());
		System.out.print("국어 : ");
		vo.setKor(sc.nextInt());
		System.out.print("영어 : ");
		vo.setEng(sc.nextInt());
		System.out.print("수학 : ");
		vo.setMat(sc.nextInt());
		
		lists.add(vo);
		//db 와 연동이 될때는 
		//제대로 값이 반환이 될때는 1
		//제대로 반환이 안될때는 0
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
	public void searchHak() { //학번 검색 
		
		//lists 에 있는 모든 학번을 가져 와 보자 
		
		System.out.print("검색할 학번을 입력하세요 ");	
		String searchHak = sc.next(); //문자열 변수 생성 
		
		Iterator<ScoreVO> it = lists.iterator();
		String str;
		
		while(it.hasNext()){
			
			ScoreVO vo = it.next();
					
			if(vo.getHak().equals(searchHak)){
				System.out.println(vo.toString());
				break;
			}
		}
		//System.out.println("검색할 학번을 입력하세요 : ");
		//String search = sc.next();
		
		//lists.indexOf(search);
		/*
		while() {
			
			if() {
				System.out.println("검색 성공 " + search);
			}else {
				System.out.println("검색 실패 " + search);
			}
		}
		/*
		if(index != -1 /* 보통 -1이 아니면을 많이 사용합니다. ) {
			System.out.println("검색 성공 :" + index);//3
		}else {
			System.out.println("검색 실패 :" + index);//-1
		}
		*/

	}
	@Override
	public void searchName() { //이름 검색 
		//lists 에 있는 모든 학번을 가져 와 보자 
		
		System.out.print("검색할 이름을 입력하세요 ");	
		String searchname = sc.next(); //문자열 변수 생성 
		
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
			
				return vo1.getTot() < vo2.getTot()?1:-1; //방법 너가 주는 방법으로 정렬을 하겠다라는 의미 
			}
		};	
		Collections.sort(lists,comp);
		print();
	}
	@Override
	public void ascSortHak() { //compare 로 비교 
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
