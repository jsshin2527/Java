package score3;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		
		// ���� �����ö��� getter 
		// ���� ���� �Ҷ��� setter �Դϴ�. 
		Scanner sc = new Scanner(System.in);
		Score ob = new ScoreImpl();
		/*
		ob.input();
		ob.print(); //1���� �����͸� �����ݴϴ�. 		
		*/
		int ch;
		while(true) {
			
			do{
				System.out.println();
				System.out.print("1. �Է� \n2. ��� \n3. �й� �˻� \n4. �̸� �˻�  \n5. ������������  \n6. �й��ø����� \n7. ����: \n");
				System.out.println();
				System.out.print("�޴����� �����ϼ��� ");
				
				ch = sc.nextInt();
			
			}while(ch<1);
			switch(ch) {
			case 1 :
				ob.input(); break;
			case 2 : 
				ob.print(); break;
			case 3 :
				ob.searchHak(); break;
			case 4 :
				ob.searchName();break;
			case 5 : 
				ob.descSortTot(); break;
			case 6 : 
				ob.ascSortHak(); break;
			default:
				System.exit(0); //���Ḧ ������ �ִ� ������ 
			}
		}
	}
}
