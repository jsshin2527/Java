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
			
			if(((checkid >='a') || (checkid <= 'z')) && ((checkid >= 'A') || (checkid <='Z'))){
				countchar++;
			}
			if(((checkid >='1') || (checkid <= '9'))){
				countnumber++;
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
		
		System.out.print("���̹� Password :");
		nvo.setNaverpassword1(sc.next());
		System.out.print("���̹� Password Ȯ�� :");
		nvo.setNaverpassword2(sc.next());
		
		// �н����尡 ���� ������� ȸ�������� �㰡 ���� �ʽ��ϴ�
		if(!nvo.getNaverpassword1().equals(nvo.getNaverpassword2())) {
			System.out.println("��й�ȣ�� �ٸ��ϴ�.");
			return;
		}
		
		System.out.print("���̹� ȸ�� Name :");
		nvo.setNavername(sc.next());
		System.out.print("���̹� ���� 1. ���� 2 ����:");
		nvo.setNavergender(sc.nextInt());
		System.out.println("!! ��й�ȣ ��ġ Ȯ�� !! ");
		
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
		
				System.out.println("�˻��� �̸��� �����ϴ�. ");
				return false;
			}			
			System.out.println(nvoid.toString());
		}
		return true;
	}

	@Override
	public void naverupdate() {
		
		System.out.println("������ ID �� �Է��ϼ��� ");
		
		String nid = sc.next();
		

		
	}
	@Override
	public void naverdelete() {
		
		
	}

	@Override
	public void naverfindid() {
		
		String searchid;
		
		Iterator<NaverVO> nit = nlists.iterator();
		
		System.out.println("ã�� �й��� �Է��ϼ��� ");
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
}
