/*
	5.단가 15,800원짜리 상품을 일정 수량 이상 구입시 할인을 해줍니다.
	할인율은 다음과 같습니다.
	10개 이상 -> 10%
	20개 이상 -> 15%
	30개 이상 -> 20%
	판매금액을 계산해봅니다.
	예) 구입수량 15개인 경우 -> 구입수량: 15개, 판매총금액: 213300원
 */

package Scanner;

import java.util.Scanner;

public class Discount_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int number;
		double sum =0;
		System.out.println("단가 15,800원짜리 상품을 일정 수량 이상 구입시 할인을 해줍니다");
		System.out.print("상품을 구매할 개수를 입력하세요 : ");
		number = sc.nextInt();
		
		if(number >=30) {
			sum = (15800*number)-(15800*number)*0.2;	
			//sum = (15800*number)*(1-0.2); 다음 코드도 가능 	
			
		}else if(number>=20) {
			sum = (15800*number)-(15800*number)*0.15;
			//sum = (15800*number)*(1-0.15); 다음 코드도 가능 	
			
		}else if(number>=10) {
			sum = (15800*number)-(15800*number)*0.10;	
			//sum = (15800*number)*(1-0.1); 다음 코드도 가능 	
		}else{
			sum = 15800*number;
		}
	System.out.println("총 개수는 "+number+"이고 금액은 "+sum+"입니다.");
	}
}
