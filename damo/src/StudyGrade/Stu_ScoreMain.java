package StudyGrade;

import java.util.Scanner;

public class Stu_ScoreMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Stu_ScoreImpl so = new Stu_ScoreImpl();
		
		int meun;
		
		System.out.println("컴퓨터 공학과 학생부 성적 입력 시스템 ");

		while(true) {
			
			System.out.print("1. 입력 \n2. 출력 \n3. 삭제 \n4. 수정 \n5. 학번검색 \n6. 이름검색 \n7. 종료");
			System.out.print("\n메뉴얼을 선택하세요 :");
			System.out.println();
			meun = Integer.parseInt(sc.nextLine());
			
			switch(meun) {
			
			case 1 :
				so.input();break;
			case 2 :
				so.print();break;
			case 3 : 
				so.delete();break;
			case 4 :
				so.updata();break;
			case 5 :
				so.findHak();break;
			case 6 :
				so.findName();break;
			case 7 :
				System.exit(0);
			}	
		}
	}
}
