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
			
			if(((checkid >=65) && (checkid <= 90)) || ((checkid >= 97) && (checkid <= 122))){
				countchar++;
			}else if(((checkid >=48) && (checkid <= 57))){
				countnumber++;
			}else {
				System.out.println("잘못된 패턴 값이 입력되었습니다. ");
				System.out.println("영문자,숫자 로만 입력하세요");
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
		
		//아이뒤 중복 체크 
		/*
		if(!naveridSearch(nvo.getNaverid())){
			System.out.println("중복된 ID 가 있습니다. " );
			return;
		}
		*/
		naveroverlapcheckid(nvo.getNaverid());
		/*
		Iterator<NaverVO> searchvo = nlists.iterator();
		
		while(searchvo.hasNext()) {
			NaverVO no = searchvo.next();
			if(no.getNaverid().equals(nvo.getNaverid())) {
				System.out.println("중복된 ID 가 있습니다. " );
				return;
			}
		}
		*/
		System.out.println("ID중복 체크 !! 확인" );
		System.out.print("네이버 Password :");
		nvo.setNaverpassword1(sc.next());
		System.out.print("네이버 Password 확인 :");
		nvo.setNaverpassword2(sc.next());
	
		// 패스워드가 맞지 않을경우 회원가입을 허가 하지 않습니다
		// 중복체크 
		if(!nvo.getNaverpassword1().equals(nvo.getNaverpassword2())) {
			System.out.println("비밀번호가 다릅니다.");
			return;
		}
		System.out.println("!! 비밀번호 일치 확인 !! ");
		
		System.out.print("네이버 회원 Name :");
		nvo.setNavername(sc.next());
		System.out.print("네이버 성별 1. 남자 2 여자:");
		nvo.setNavergender(sc.nextInt());
		
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
			//System.out.println(nvoid.toString());
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
			//System.out.println(nvoid.toString());
		}
		return true;
	}

	@Override
	public void naverupdate() {
		
		Iterator<NaverVO> nit = nlists.iterator();
		
		System.out.print("수정할 ID 를 입력하세요 ");
		
		String nid = sc.next();
		
		NaverVO nvo = new NaverVO();
		
		while(nit.hasNext()) {
			nvo = nit.next();
			if(nvo.getNaverid().equals(nid)){
				break;
			}
		}
		
		if(naveridSearch(nid)) {	
			
			System.out.print("수정할 ID의 Password를 입력하세요 : ");
			String passwordcheck;
			passwordcheck = sc.next();
			
			if(naverpasswordcheck(passwordcheck)) {
				System.out.println("!!정보가 일치 합니다!!");
				System.out.println("다음 정보를 수정하세요");
				System.out.print("Passowrd 를 수정하겠습니까 ?? 1.네 2.아니요");
				int qureypassword  = sc .nextInt();
				
				if(qureypassword == 1) {
					System.out.println("패스워드정보를 수정하세요 ");
					System.out.print("네이버 Password :");
					nvo.setNaverpassword1(sc.next());
					System.out.print("네이버 Password 확인 :");
					nvo.setNaverpassword2(sc.next());
					
					if(!nvo.getNaverpassword1().equals(nvo.getNaverpassword2())) {
						System.out.println("비밀번호가 다릅니다.");
						return;
					}
					System.out.println("!! 비밀번호 일치 확인 !! ");
					System.out.println("!! 정보가 수정 되었습니다. !!");
				
				}else {
					System.out.println("수정을 종료 하겠습니다.");
				}
			
			}else {
				System.out.println("패스워드가 틀립니다.");
				return;
			}
		}
	}
	@Override
	public void naverdelete() {

	}
	@Override
	public void naverfindid() {
		
		String searchid;
		
		Iterator<NaverVO> nit = nlists.iterator();
		
		System.out.print("찾을 ID을 입력하세요 ");
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
	public void naveroverlapcheckid(String checkid) {
		Iterator<NaverVO> searchvo = nlists.iterator();
		
		while(searchvo.hasNext()) {
			NaverVO no = searchvo.next();
			if(no.getNaverid().equals(checkid)) {
				System.out.println("중복된 ID 가 있습니다. " );
				return;
			}
		}
	}
	
	public boolean naverpasswordcheck(String password) {
		Iterator<NaverVO> nit = nlists.iterator();
	
		
		while(nit.hasNext()) {	
			NaverVO nob  = nit.next();
			if(!nob.getNaverpassword1().equals(password)) {
				return false;
			}
		}
		return true;
	}
}
