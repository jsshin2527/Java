package naver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//List Collection 을 이용하여 naver admin 회원 관리 기능 구현 

public class NaverImpl implements Naver {

	List<NaverVO> nlists = new ArrayList<NaverVO>();
	
	Scanner sc = new Scanner(System.in);
	
	//회원 가입 
	@Override
	public void naverInput() {
	
		NaverVO nvo = new NaverVO();
		
		char checkid;
		
		System.out.println("회원 가입 형식을 입력해 주세요 ");
		
		int countnumber = 0;
		
		int countchar = 0;
		
		System.out.print("네이버 ID  :");
		nvo.setNaverid(sc.next());
		
		if(nvo.getNaverid().length() < 8 || nvo.getNaverid().length() >15) {		
			System.out.println("아이디 길이는 8이상 또는 15이하 이여야 합니다.");	
			return;
		}
		for(int i = 0;i<nvo.getNaverid().length();i++) {
			checkid =nvo.getNaverid().charAt(i);
			
			if(((checkid >='a') || (checkid <= 'z')) && ((checkid >= 'A') || (checkid <='Z'))){
				countchar++;
			}
			if(((checkid >='1') || (checkid <= '9'))){
				countnumber++;
			}
		}
		
		if(countnumber == nvo.getNaverid().length()) {
			System.out.print("영문자와 숫자를 혼합여여 사용하여야 합니다.");
			return;
		}
		if(countchar == nvo.getNaverid().length()) {
			System.out.print("영문자와 숫자를 혼합여여 사용하여야 합니다.");
			return;
		}
		
		System.out.println("!! 아이디 형식 체크 확인 !! ");
		
		System.out.print("네이버 Password :");
		nvo.setNaverpassword1(sc.next());
		System.out.print("네이버 Password 확인 :");
		nvo.setNaverpassword2(sc.next());
		
		// 패스워드가 맞지 않을경우 회원가입을 허가 하지 않습니다
		if(!nvo.getNaverpassword1().equals(nvo.getNaverpassword2())) {
			System.out.println("비밀번호가 다릅니다.");
			return;
		}
		
		System.out.print("네이버 회원 Name :");
		nvo.setNavername(sc.next());
		System.out.print("네이버 성별 1. 남자 2 여자:");
		nvo.setNavergender(sc.nextInt());
		System.out.println("!! 비밀번호 일치 확인 !! ");
		
		//1 남자 2 여자  값으로 표시 
		if(nvo.getNavergender()== 1) {
			nvo.setNavergenderHangul("남");
		}else {
			nvo.setNavergenderHangul("여자");
		}
		System.out.print("네이버 회원 email :");
		nvo.setNaveremail(sc.next());
		System.out.print("네이버 생년월일 (-없이 입력하세요) :");
		nvo.setNaverbirth(sc.next());
		System.out.print("네이버 TEL (-없이 입력하세요) :");
		nvo.setNavertel(sc.next());
	
		nlists.add(nvo);

	}

	@Override
	public void naverPrint() {
		
		NaverVO naverprint;
		Iterator<NaverVO> nit = nlists.iterator();
		
		//System.out.println("회원id 회원name  회원gender  회원email     회원Birth   회원TEL  ");
		while(nit.hasNext()) {		
			naverprint = nit.next();
			System.out.println(naverprint.toString());
		}
	}
	@Override
	public boolean naveridSearch(String serarch) {
		
		Iterator<NaverVO> nit = nlists.iterator();

		while(nit.hasNext()) {		
			
			NaverVO nvoid = nit.next();
			
			if(!serarch.equals(nvoid.getNaverid())){
				System.out.println("검색한 아이디가 없습니다. ");
				return false;
			}
			System.out.println(nvoid.toString());
		}
		return true;
	}
	

	@Override
	public boolean navernameSearch(String search) {
		
		Iterator<NaverVO> nit = nlists.iterator();
		
		while(nit.hasNext()) {		
			
			NaverVO nvoid = nit.next();
			
			if(!search.equals(nvoid.getNavername())){
		
				System.out.println("검색한 이름이 없습니다. ");
				return false;
			}			
			System.out.println(nvoid.toString());
		}
		return true;
	}

	@Override
	public void naverupdate() {
		
		System.out.println("수정할 ID 를 입력하세요 ");
		
		String nid = sc.next();
		

		
	}
	@Override
	public void naverdelete() {
		
		
	}

	@Override
	public void naverfindid() {
		
		String searchid;
		
		Iterator<NaverVO> nit = nlists.iterator();
		
		System.out.println("찾을 학번을 입력하세요 ");
		searchid = sc.next();
		//리스트에 id 값이 있는지 true false로 확인 
		if(naveridSearch(searchid)) {
			nit.next().getNaverid().equals(searchid);
		}
	}

	@Override
	public void naverfindname() {
		String searchname;
		
		Iterator<NaverVO> nit = nlists.iterator();
		System.out.println("찾을 이름을 입력하세요 ");
		searchname = sc.next();
		//리스트에 id 값이 있는지 true false로 확인 
		if(navernameSearch(searchname)) {
			nit.next().getNaverid().equals(searchname);
		}	
	}
}
