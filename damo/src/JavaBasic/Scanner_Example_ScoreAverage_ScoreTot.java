/* 
	java에서 문자를 저장하는 자료형 String 
	
	Scanner 클래스를 이용하여 국어 영어 수학 점수를 입력받아 각각의 점수와 함께 총점과 평균점수를 출력하는 프로그램 
*/
package JavaBasic;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;

class Scanner_Example_ScoreAverage_ScoreTot  
{
	public static void main (String[] args) throws IOException
	//이거 에러가 날수가 있어 (try~catch 예외 처리)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name; //초기화를 하지 않을 경우 null 값이 들어 있습니다.
		int kor,eng,math,tot,average; //아무것도 값을 넣지 않은경우 쓰레기 값이 들어있습니다.
		System.out.print("이름이 무엇인가요 : "); // suzi 
		name = br.readLine(); //문자로 읽어 드리기 때문에 형변환이 따로 필요 없습니다. 
		System.out.print("국어 점수가 무엇입니까? : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어 점수가 무엇입니까? : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학 점수가 무엇입니까? : ");
		math = Integer.parseInt(br.readLine());
		tot = kor+eng+math;
		average = kor+eng+math/3;
		String a = name+"방가방가~~";
		System.out.println(name+"의 국어 점수는 "+kor+" 입니다.");
		System.out.println(a);
		System.out.println(name+"의 영어 점수는 "+eng+"입니다.");
		System.out.println(name+"의 수학 점수는 "+math+"입니다.");
		System.out.println(name+"의 총   점수는 "+tot+"입니다.");
		System.out.println(name+"의 평준 점수는 "+average+"입니다.");
	}
}
