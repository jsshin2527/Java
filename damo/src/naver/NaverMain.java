// 1. �� ���  �׽�Ʈ 

package naver;

import java.util.Scanner;

public class NaverMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		NaverImpl nimpl = new NaverImpl();
		
		int navermeun = 0;
		
		while(true) {
			
			System.out.print("\n1. ȸ������ \n2. ��ü ȸ�� ��� \n3. ���̵� �˻� \n4. �̸� �˻� \n5. ȸ������ ���� \n6.ȸ�� ���� \n7. ���� ");
			
			System.out.print("\n�޴����� �Է��ϼ��� : ");
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
