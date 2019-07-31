package JavaBasic_minProject;

import java.util.Scanner;

public class Rock_Paper_Scissors {
	
	public static void main(String[] args) {
		
		//	3. 1~3사이의 난수를 발생시켜 가위,바위,보 게임 프로그램 작성
		//  1:가위, 2:바위, 3:보
		
		int user;
		int com;
		Scanner sc = new Scanner(System.in);
		System.out.println("1:가위 2:바위 3:보 ?");
		user = sc.nextInt();
		while(true) {
			if(user==1||user==2||user==3) {
				
				break;
				
			}else {
				System.out.println("정확한 번호를 입력하세요");
				user = sc.nextInt();
			}
		}
		
		com=(int)(Math.random() * 3) +1;
		if(com==user)
		System.out.println("비겼습니다");		
		else if(com-user==1||com-user==-2)
		System.out.println("당신이 이겼습니다");	
		else
		System.out.println("당신이 졌습니다");
	}
}
