//여기까지 day7수업

package Array;  //편의상 여러개의 클래스를 만들수 도 있다

import java.util.Scanner;

class Hap{//클래스 안에 클래스를 만들때는 public을 없애준다
	
	int su,sum;//인스턴스 변수//데이터는 여기에 저장되어있다
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("정수 입력?");
		su = sc.nextInt();//su는 바깥의 int su;에 저장되어있다		
	}	
	public int cnt() {		
		for(int i=1;i<=su;i++) {
			sum +=i;//sum = sum+i 메소드 밖에 있는 인스턴스 변수는 자료형에 맞게 초기화 되어있다
		}		
		return sum;//바깥의 int sum;을 반환해줌		
	}	
	public void print(int i) {
		System.out.println("1~" + su + "까지의 합계" + i);		
	}
	
}

public class Class_Object_Sum_Example {

	public static void main(String[] args) {//메인 메소드가 있는 클래스만 public이 있다
		
		Hap h = new Hap();
		
		h.input();
		int cnt = h.cnt();//cnt는 옆집에서 절대 알수가 없다
		h.print(cnt);

	}//메인절에서 분해해서 클래스로 만들었다
	 //실제로 컴파일 하게되면 클래스는 별도로 만들어진다
}
