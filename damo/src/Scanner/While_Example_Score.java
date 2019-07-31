/*
6. 이름과 3과목의 점수를 입력 받아 다음조건에 따라 출력
	모든 과목의 점수가 40점 이상이고 평균이 60점 이상이면 합격
	한과목이라도 40점 미만이고 평균이 60점 이상이면 과락
	평균이 60점 미만이면 불합격
	이름 ? 홍길동
	세과목 점수 ? 60 70 80
	이름 : 홍길동
	총점 : 210, 평균 : 70, 판정 :합격
 */
package Scanner;

import java.util.Scanner;

public class While_Example_Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score1,score2,score3,average;
		
		String name;
		
		System.out.print("이름을 입력하세요 :");
		name = sc.nextLine();
		do {
		System.out.println("점수의 범위는 0크거나 같고 100보다 작거나 같아야 합니다.");
		System.out.print("점수 1을 입력하세요 : ");
		score1 = sc.nextInt();
		System.out.print("점수 2을 입력하세요 : ");
		score2 = sc.nextInt();
		System.out.print("점수 3을 입력하세요 : ");
		score3 = sc.nextInt();
		}while((score1<0 || score1>100) || (score2<0 || score2>100) || (score3<0 || score3>100));
		
		average = (score1+score2+score3)/3;
		
		if((score1 <40 || score2 <40 || score3 <40) && average > 60) {
			System.out.println(name+"님은 한 과목 이상이 40점 보다 낮으므로 과락 되었습니다.");
		}else if(average < 60) {
			System.out.println(name+"님은 평균이 60점 보다 낮으므로 과락 되었습니다.");
		}else {
			System.out.println(name+"님 합격입니다");
		}
	}
}
