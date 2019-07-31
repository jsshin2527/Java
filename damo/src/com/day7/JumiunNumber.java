package com.day7;

import java.util.Scanner;

public class JumiunNumber {
	
	//배열
	
	public static void main(String[] args) {	
		
		//주민번호 검색
		//921010-2123456 //jumin
		//234567 892345 //chk //각각의 숫자당 부여되는 고유번호
		
		//연산방법
		//합 = (9*2)+(2*3)+...+(5*5) 
		//합 = 11-합%11
		//합 = 합%10
		//합 == 6(정상)
		
		Scanner sc = new Scanner(System.in);
		String jumin;
		int[] chk = {2,3,4,5,6,7,8,9,2,3,4,5};
		
		int i,tot,su;
		
		System.out.print("주민번호[xxxxxx-xxxxxxx]?");
		jumin = sc.next();
		
		if(jumin.length()!=14) {//length에 괄호있음 배열의length에만 괄호없음
			
			System.out.println("입력 오류!!");
			return; //stop		
		}
		
		tot = 0;		
		//index : 01234567890123
		//sumin : 921010-2123456	- 14
		//chk :   234567 892345     - 13
		for(i=0;i<12;i++) {		
			if(i>=6) {//주민번호 뒷자리		
				tot+= chk[i]*Integer.parseInt(jumin.substring(i+1,i+2));//-때문에+1			
			}else {//생년월일
				tot+= chk[i]*Integer.parseInt(jumin.substring(i,i+1));			
			}	
		}		
		su = 11 - tot % 11;
		su = su % 10;	
		if(su==Integer.parseInt(jumin.substring(13))) {
			System.out.println("정확한 주민번호!");
		}else {
			System.out.println("넌! 누구냐?");
		}
	
		
/*		String str = "seoul korea";
		//            01234567890 //자동으로 구현되는 인덱스가 생김
		
		System.out.println(str.substring(0,3));//substring문자추출 메소드
		System.out.println(str.substring(6,8));
		System.out.println(str.substring(6));//6번째 자리부터 끝까지
*/		
		
		
		
	}

}
