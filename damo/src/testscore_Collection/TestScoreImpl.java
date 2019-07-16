package testscore_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestScoreImpl implements TestScore {
	
	List<TestScoreVO> lists = new ArrayList<TestScoreVO>();
	
	// 학번 이름 점수 입학 하는 공간 
	@Override
	public int input() {
		
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		TestScoreVO vo = new TestScoreVO();
		
		System.out.print("학번을 입력하세요 ");
		vo.setHak(sc.next());
		System.out.print("이름을 입력하세요 ");
		vo.setName(sc.next());
		System.out.print("리눅스 점수를 입력하세요 ");
		vo.setLinux(sc.nextInt());
		System.out.print("c언어 점수를 입력하세요 ");
		vo.setClang(sc.nextInt());
		System.out.print("자바 점수를 입력하세요 ");
		vo.setJava(sc.nextInt());
		
		lists.add(vo);
		
		return result;
	}

	@Override
	public void print() {
		

	Iterator<TestScoreVO> it = lists.iterator(); 
	
	while(it.hasNext()) {
		
		TestScoreVO vo1 = it.next();
		
		System.out.print(vo1.toString());
		
		}
	}

	@Override
	public void searchHak() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ascSortHak() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decsSorttot() {
		// TODO Auto-generated method stub
		
	}

	
	
}
