package testscore_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestScoreImpl implements TestScore {
	
	List<TestScoreVO> lists = new ArrayList<TestScoreVO>();
	
	// �й� �̸� ���� ���� �ϴ� ���� 
	@Override
	public int input() {
		
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		TestScoreVO vo = new TestScoreVO();
		
		System.out.print("�й��� �Է��ϼ��� ");
		vo.setHak(sc.next());
		System.out.print("�̸��� �Է��ϼ��� ");
		vo.setName(sc.next());
		System.out.print("������ ������ �Է��ϼ��� ");
		vo.setLinux(sc.nextInt());
		System.out.print("c��� ������ �Է��ϼ��� ");
		vo.setClang(sc.nextInt());
		System.out.print("�ڹ� ������ �Է��ϼ��� ");
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
