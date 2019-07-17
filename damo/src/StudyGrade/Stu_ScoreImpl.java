package StudyGrade;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import org.omg.PortableServer.ServantActivatorHelper;

public class Stu_ScoreImpl implements Stu_Score {

	Map<String,Stu_ScoreVO> hasMap = new TreeMap<String,Stu_ScoreVO>();
	
	String stdnumber;
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void input() {
		
		System.out.print("�й� : ");
		stdnumber = sc.next();
		
		// �й��� ������ return; �� ��ȯ�ϴ� �ڵ� �ۼ� 
		
		Stu_ScoreVO vo = new Stu_ScoreVO();
				
		System.out.print("�̸� :");
		vo.setName(sc.next());
		System.out.print("C���:");
		vo.setClang(sc.nextInt());
		System.out.print("�ڹ� :");
		vo.setJava(sc.nextInt());
		System.out.print("������ :");
		vo.setLinux(sc.nextInt());
		System.out.print("C++ :");
		vo.setCpp(sc.nextInt());
		
		hasMap.put(stdnumber,vo);		
		System.out.println("���� �߰� ���� !!");
	}

	@Override
	public void print() {
		
		Iterator<String> so = hasMap.keySet().iterator();
		
		while(so.hasNext()) {
			
			String key = so.next();
			
			Stu_ScoreVO vo = hasMap.get(key);
			
			System.out.println(key+" "+vo.toString());
			
		}
	}
	@Override
	public boolean searchHak(String hak) {
		hak = sc.next();
		if(hasMap.containsKey(hak)) {
			return true;
		}
		return false;
	}
	@Override
	public void delete() {
		System.out.print("������ �й��� �Է��ϼ��� : ");
		stdnumber = sc.next();
		hasMap.remove(stdnumber);
	}

	@Override
	public void updata() {
		
		System.out.print("������ �й��� �Է��ϼ��� :");
		stdnumber = sc.next();
		Stu_ScoreVO vo = hasMap.get(stdnumber);
		
		System.out.print("C���:");
		vo.setClang(sc.nextInt());
		System.out.print("�ڹ� :");
		vo.setJava(sc.nextInt());
		System.out.print("������ :");
		vo.setLinux(sc.nextInt());
		System.out.print("C++ :");
		vo.setCpp(sc.nextInt());
		hasMap.put(stdnumber,vo);		
		System.out.println("���� ���� ���� !!");
		
		hasMap.get(stdnumber);
	}
	@Override
	public void findHak() {
		
		Iterator<String> so = hasMap.keySet().iterator();
		
		System.out.print("ã�� �й��� �Է��ϼ��� : ");
			
		stdnumber = sc.next();
		
		String key = so.next();

		Stu_ScoreVO vo = hasMap.get(stdnumber);
		
		if(searchHak(stdnumber)) {
			System.out.print(key+" "+so.toString());
		}
	}
	@Override
	public void findName() {
	
		Iterator<String> so = hasMap.keySet().iterator();
		
		System.out.print("ã�� �̸��� �˻��ϼ��� ");
		String searchName = sc.next();
		
		boolean flag = false;
		
		while(so.hasNext()) {
			
			String key = so.next();
			Stu_ScoreVO vo = hasMap.get(key);
			
			if(vo.getName().equals(searchName)) {
				System.out.print(key+" "+vo.toString());
			}	
		}
	}

}
