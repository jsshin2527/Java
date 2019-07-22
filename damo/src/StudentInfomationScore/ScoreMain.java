package StudentInfomationScore;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		System.out.println("학생정보 시스템 ");
		
		
		
		ScoreImpl sim = new ScoreImpl();

		
		int menu;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("1. 입력 \n2. 출력  \n3. 저장 \n4. 종료 ");			
			
			System.out.print("\n메뉴를 선택하세요 ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 : 
				sim.input(); break;
			case 2 :
				sim.output(); break;
			case 3 :
				sim.store(); break;
			case 4 :
				sim.store();
				System.exit(0);
			}
			
		}
	

	}

}
