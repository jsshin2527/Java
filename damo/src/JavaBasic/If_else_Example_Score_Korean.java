/*
	제어문 if 관련 예제 
	
	국어 점수를 입력을 받아 수우미양가 점수를 표시하는 프로그램 
*/
package JavaBasic;
import java.util.Scanner;
class If_else_Example_Score_Korean 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name; 
		int kor;
		System.out.print("너의 이름이 무엇이냐 ? " );
		name = sc.next(); //String값 으로 읽어옴 
    	System.out.print("국어점수가 무엇이니  ?" );
		kor = sc.nextInt(); //형 변환
		String pan; 
		if (kor>=90)
		{
			pan = "수";
		}else if (kor>=80)
		{
			pan = "우";
		}else if (kor >=70)
		{
			pan = "미";
		}else if (kor >=60)
		{
			pan = "양";
		
		}else{
			pan = "가";
		}
		System.out.println(name+":"+pan);
	}
}
