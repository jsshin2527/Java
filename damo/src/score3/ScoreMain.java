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
				System.out.println();
				System.out.print("1. 입력 \n2. 출력 \n3. 학번 검색 \n4. 이름 검색  \n5. 총점내림정렬  \n6. 학번올림정렬 \n7. 종료: \n");
				System.out.println();
				System.out.print("메뉴얼을 선택하세요 ");
				
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
				System.exit(0); //종료를 가지고 있는 고유값 
			}
		}
	}
}
