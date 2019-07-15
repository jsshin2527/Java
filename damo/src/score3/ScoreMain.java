package score3;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		
		// 값을 가져올때는 getter 
		// 값을 정의 할때는 setter 입니다. 
		Scanner sc = new Scanner(System.in);
		Score ob = new ScoreImpl();
		/*
		ob.input();
		ob.print(); //1명의 데이터를 보여줍니다. 		
		*/
		int ch;
		while(true) {
			
			do{
				System.out.print("1. 입력 2. 출력 3. 종료 : ");
				ch = sc.nextInt();
			}while(ch<1);
			switch(ch) {
			case 1 :
				ob.input(); break;
			case 2 : 
				ob.print(); break;
			default:
				System.exit(0); //종료를 가지고 있는 고유값 
			}
		}
	}
}
