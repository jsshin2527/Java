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
				System.out.print("1. �Է� 2. ��� 3. ���� : ");
				ch = sc.nextInt();
			}while(ch<1);
			switch(ch) {
			case 1 :
				ob.input(); break;
			case 2 : 
				ob.print(); break;
			default:
				System.exit(0); //���Ḧ ������ �ִ� ������ 
			}
		}
	}
}
