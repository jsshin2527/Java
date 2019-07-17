// 1. 입 출력  테스트 

package naver;

import java.util.Scanner;

public class NaverMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		NaverImpl nimpl = new NaverImpl();
		
		int navermeun = 0;
		
		while(true) {
			
			System.out.print("\n1. 회원가입 \n2. 전체 회원 출력 \n3. 아이디 검색 \n4. 이름 검색 \n5. 회원정보 수정 \n6.회원 삭제 \n7. 종료 ");
			
			System.out.print("\n메뉴얼을 입력하세요 : ");
			navermeun = sc.nextInt();
			
			switch(navermeun){
			
			case 1 :
				nimpl.naverInput();break;
			case 2 :
				nimpl.naverPrint();break;
			case 3 : 
				nimpl.naverfindid();break;
			case 4 :
				nimpl.naverfindname();break;
			case 5 :
				nimpl.naverupdate();break;
			case 6 :
				nimpl.naverdelete();break;
			case 7 :
				System.exit(0);	
			}
		}	
	}
}
