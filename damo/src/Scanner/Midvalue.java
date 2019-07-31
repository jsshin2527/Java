// 다섯개의 수를 입력 받아 중간값을 구하는 프로그램 
// 장애 처리 파일 
package Scanner;

import java.util.Scanner;;

public class Midvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("다섯개의 수를 입력 받아 중간값을 구하는 프로그램 ");
		// num배열 5개를 선언한다,
		int num[] = new int[5];
		int num1[] = new int[5];
		for(int i=0;i<5;i++) {
			System.out.printf("%d번재 정수를 입력하세요 : ",i+1);
			num[i] = sc.nextInt();
		}
		
		System.out.println("다음 값을 입력 받았습니다. ");
		
		for(int i=0;i<5;i++) {
			System.out.printf("%4d",num[i]);
		}
		
		//입력값 확인 
		int temp;
		System.out.println();
		System.out.println("정렬을 시작하겠습니다.");
		
		for(int i =0;i<5;i++){
			int max=0,index = 0;
			for(int j=i;j<5;j++){
				if( max < num[j]) {
					max = num[j];
					index =j;
			//	System.out.printf("\n index : %2d",index);
				}
				temp = num[i];
				num[i] = num[index];
				num[index] = temp;
			System.out.printf("\n num[index] : %4d",num[index]);
			}
			System.out.println();
			for (int j = 0; j < num1.length; j++) {
				System.out.printf("%4d",num[j]);
			}
			System.out.println();	
		}
		for(int i=0;i<5;i++) {
			System.out.printf("%4d",num[i]);
		}
	}

}
