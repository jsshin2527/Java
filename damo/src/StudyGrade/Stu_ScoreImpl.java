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
		
		System.out.print("학번 : ");
		stdnumber = sc.next();
		
		// 학번이 있을때 return; 을 반환하는 코드 작성 
		
		Stu_ScoreVO vo = new Stu_ScoreVO();
				
		System.out.print("이름 :");
		vo.setName(sc.next());
		System.out.print("C언어:");
		vo.setClang(sc.nextInt());
		System.out.print("자바 :");
		vo.setJava(sc.nextInt());
		System.out.print("리눅스 :");
		vo.setLinux(sc.nextInt());
		System.out.print("C++ :");
		vo.setCpp(sc.nextInt());
		
		hasMap.put(stdnumber,vo);		
		System.out.println("정보 추가 성공 !!");
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
		System.out.print("삭제할 학번을 입력하세요 : ");
		stdnumber = sc.next();
		hasMap.remove(stdnumber);
	}

	@Override
	public void updata() {
		
		System.out.print("수정할 학번을 입력하세요 :");
		stdnumber = sc.next();
		Stu_ScoreVO vo = hasMap.get(stdnumber);
		
		System.out.print("C언어:");
		vo.setClang(sc.nextInt());
		System.out.print("자바 :");
		vo.setJava(sc.nextInt());
		System.out.print("리눅스 :");
		vo.setLinux(sc.nextInt());
		System.out.print("C++ :");
		vo.setCpp(sc.nextInt());
		hasMap.put(stdnumber,vo);		
		System.out.println("정보 수정 성공 !!");
		
		hasMap.get(stdnumber);
	}
	@Override
	public void findHak() {
		
		Iterator<String> so = hasMap.keySet().iterator();
		
		System.out.print("찾을 학번을 입력하세요 : ");
			
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
		
		System.out.print("찾을 이름을 검색하세요 ");
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
