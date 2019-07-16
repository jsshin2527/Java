package testscore_Collection;

import java.util.Scanner;

public class TestScoreMain {

	public static void main(String[] args) {
	
		TestScoreImpl ob = new TestScoreImpl();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
		System.out.print("\n1. 입력 \n2. 출력 \n3. 정렬 \n");
		System.out.print("메뉴얼을 입력하세요 ");
		
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
