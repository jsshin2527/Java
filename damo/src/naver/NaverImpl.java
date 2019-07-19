package naver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//List Collection �� �̿��Ͽ� naver admin ȸ�� ���� ��� ���� 

public class NaverImpl implements Naver {

	List<NaverVO> nlists = new ArrayList<NaverVO>();
	
	Scanner sc = new Scanner(System.in);
	
	//ȸ�� ���� 
	@Override
	public void naverInput() {
	
		NaverVO nvo = new NaverVO();
		
		char checkid;
		
		System.out.println("ȸ�� ���� ������ �Է��� �ּ��� ");
		
		int countnumber = 0;
		
		int countchar = 0;
		
		System.out.print("���̹� ID  :");
		nvo.setNaverid(sc.next());
		
		if(nvo.getNaverid().length() < 8 || nvo.getNaverid().length() >15) {		
			
			System.out.println("���̵� ���̴� 8�̻� �Ǵ� 15���� �̿��� �մϴ�.");	
			return;
		
		}
		
		for(int i = 0;i<nvo.getNaverid().length();i++) {
			checkid =nvo.getNaverid().charAt(i);
			
			if(((checkid >=65) && (checkid <= 90)) || ((checkid >= 97) && (checkid <= 122))){
				countchar++;
			}else if(((checkid >=48) && (checkid <= 57))){
				countnumber++;
			}else {
				System.out.println("�߸��� ���� ���� �ԷµǾ����ϴ�. ");
				System.out.println("������,���� �θ� �Է��ϼ���");
			}
		}	
		if(countnumber == nvo.getNaverid().length()) {
			System.out.print("�����ڿ� ���ڸ� ȥ�տ��� ����Ͽ��� �մϴ�.");
			return;
		}
		if(countchar == nvo.getNaverid().length()) {
			System.out.print("�����ڿ� ���ڸ� ȥ�տ��� ����Ͽ��� �մϴ�.");
			return;
		}
		
		System.out.println("!! ���̵� ���� üũ Ȯ�� !! ");
		
		//���̵� �ߺ� üũ 
		/*
		if(!naveridSearch(nvo.getNaverid())){
			System.out.println("�ߺ��� ID �� �ֽ��ϴ�. " );
			return;
		}
		*/
		naveroverlapcheckid(nvo.getNaverid());
		/*
		Iterator<NaverVO> searchvo = nlists.iterator();
		
		while(searchvo.hasNext()) {
			NaverVO no = searchvo.next();
			if(no.getNaverid().equals(nvo.getNaverid())) {
				System.out.println("�ߺ��� ID �� �ֽ��ϴ�. " );
				return;
			}
		}
		*/
		System.out.println("ID�ߺ� üũ !! Ȯ��" );
		System.out.print("���̹� Password :");
		nvo.setNaverpassword1(sc.next());
		System.out.print("���̹� Password Ȯ�� :");
		nvo.setNaverpassword2(sc.next());
	
		// �н����尡 ���� ������� ȸ�������� �㰡 ���� �ʽ��ϴ�
		// �ߺ�üũ 
		if(!nvo.getNaverpassword1().equals(nvo.getNaverpassword2())) {
			System.out.println("��й�ȣ�� �ٸ��ϴ�.");
			return;
		}
		System.out.println("!! ��й�ȣ ��ġ Ȯ�� !! ");
		
		System.out.print("���̹� ȸ�� Name :");
		nvo.setNavername(sc.next());
		System.out.print("���̹� ���� 1. ���� 2 ����:");
		nvo.setNavergender(sc.nextInt());
		
		//1 ���� 2 ����  ������ ǥ�� 
		if(nvo.getNavergender()== 1) {
			nvo.setNavergenderHangul("��");
		}else {
			nvo.setNavergenderHangul("����");
		}
		System.out.print("���̹� ȸ�� email :");
		nvo.setNaveremail(sc.next());
		System.out.print("���̹� ������� (-���� �Է��ϼ���) :");
		nvo.setNaverbirth(sc.next());
		System.out.print("���̹� TEL (-���� �Է��ϼ���) :");
		nvo.setNavertel(sc.next());
	
		nlists.add(nvo);
	}

	@Override
	public void naverPrint() {
		
		NaverVO naverprint;
		Iterator<NaverVO> nit = nlists.iterator();
		
		//System.out.println("ȸ��id ȸ��name  ȸ��gender  ȸ��email     ȸ��Birth   ȸ��TEL  ");
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
				System.out.println("�˻��� ���̵� �����ϴ�. ");
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
				System.out.println("�˻��� �̸��� �����ϴ�. ");
				return false;
			}			
			//System.out.println(nvoid.toString());
		}
		return true;
	}

	@Override
	public void naverupdate() {
		
		Iterator<NaverVO> nit = nlists.iterator();
		
		System.out.print("������ ID �� �Է��ϼ��� ");
		
		String nid = sc.next();
		
		NaverVO nvo = new NaverVO();
		
		while(nit.hasNext()) {
			nvo = nit.next();
			if(nvo.getNaverid().equals(nid)){
				break;
			}
		}
		
		if(naveridSearch(nid)) {	
			
			System.out.print("������ ID�� Password�� �Է��ϼ��� : ");
			String passwordcheck;
			passwordcheck = sc.next();
			
			if(naverpasswordcheck(passwordcheck)) {
				System.out.println("!!������ ��ġ �մϴ�!!");
				System.out.println("���� ������ �����ϼ���");
				System.out.print("Passowrd �� �����ϰڽ��ϱ� ?? 1.�� 2.�ƴϿ�");
				int qureypassword  = sc .nextInt();
				
				if(qureypassword == 1) {
					System.out.println("�н����������� �����ϼ��� ");
					System.out.print("���̹� Password :");
					nvo.setNaverpassword1(sc.next());
					System.out.print("���̹� Password Ȯ�� :");
					nvo.setNaverpassword2(sc.next());
					
					if(!nvo.getNaverpassword1().equals(nvo.getNaverpassword2())) {
						System.out.println("��й�ȣ�� �ٸ��ϴ�.");
						return;
					}
					System.out.println("!! ��й�ȣ ��ġ Ȯ�� !! ");
					System.out.println("!! ������ ���� �Ǿ����ϴ�. !!");
				
				}else {
					System.out.println("������ ���� �ϰڽ��ϴ�.");
				}
			
			}else {
				System.out.println("�н����尡 Ʋ���ϴ�.");
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
		
		System.out.print("ã�� ID�� �Է��ϼ��� ");
		searchid = sc.next();
		//����Ʈ�� id ���� �ִ��� true false�� Ȯ�� 
		if(naveridSearch(searchid)) {
			nit.next().getNaverid().equals(searchid);
		}
	}

	@Override
	public void naverfindname() {
		String searchname;
		
		Iterator<NaverVO> nit = nlists.iterator();
		System.out.println("ã�� �̸��� �Է��ϼ��� ");
		searchname = sc.next();
		//����Ʈ�� id ���� �ִ��� true false�� Ȯ�� 
		if(navernameSearch(searchname)) {
			nit.next().getNaverid().equals(searchname);
		}	
	}
	public void naveroverlapcheckid(String checkid) {
		Iterator<NaverVO> searchvo = nlists.iterator();
		
		while(searchvo.hasNext()) {
			NaverVO no = searchvo.next();
			if(no.getNaverid().equals(checkid)) {
				System.out.println("�ߺ��� ID �� �ֽ��ϴ�. " );
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
