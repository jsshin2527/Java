package StudentInfomationScore;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		System.out.println("�л����� �ý��� ");
		
		
		
		ScoreImpl sim = new ScoreImpl();

		
		int menu;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("1. �Է� \n2. ���  \n3. ���� \n4. ���� ");			
			
			System.out.print("\n�޴��� �����ϼ��� ");
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
