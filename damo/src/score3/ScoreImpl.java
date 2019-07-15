package score3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score {
	
	
	List<ScoreVO> lists = new ArrayList<>();
	
	//ScoreVO �� ���� 
	
	@Override
	public int input() {	
		
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
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
	
}
