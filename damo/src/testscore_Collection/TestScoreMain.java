package testscore_Collection;

import java.util.Scanner;

public class TestScoreMain {

	public static void main(String[] args) {
	
		TestScoreImpl ob = new TestScoreImpl();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
		System.out.print("\n1. �Է� \n2. ��� \n3. ���� \n");
		System.out.print("�޴����� �Է��ϼ��� ");
		
		int ch;
	
		ch = sc.nextInt();
		
		switch(ch) {
		
		case 1 :
			ob.input(); break;
		case 2 :
			ob.print(); break;
		default :
			System.exit(0);
			}		
		}
	}
	

}
