package score3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score {
	
	
	List<ScoreVO> lists = new ArrayList<>();
	
	//ScoreVO 가 지갑 
	
	@Override
	public int input() {	
		
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
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
	
}
