/*
 3. 네 개의 정수를 입력 받고, 제일 큰 숫자와 제일 작은 숫자를 구분해서 출력.(if문 이용)
	예) 20, 30, 40, 50 입력시 -> 제일 큰 숫자 50, 제일 작은 숫자 20
*/

package Scanner;


import java.util.Scanner;

public class Scanner_Max_Min {

	private static final int MAX_VALUE = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] num;
		num = new int[4];
		int max,min;
		
		max = 0;
		min = Integer.MAX_VALUE;
		/*
		for(int i=0;i<4;i++) {
			System.out.print("정수 "+(i+1)+"입력하세요 :");
			num[i] = sc.nextInt();
			if(max < num[i]) {
				max = num[i];
			}
		}
		for(int i=0;i<4;i++) {
			if(min > num[i]) {
				min = num[i];
			}
		}
		System.out.println("최대 값은" +max+"입니다 ");
		System.out.println("최소 값은" +min+"입니다 ");
		*/
		
		//배열을 이용하지 않고 최댓값 최솟값 프로그램 작성하기 
		System.out.println("=========================================");
		System.out.println("배열을 이용하지 않고 최댓값 최소값 구하기 \n");
		System.out.println("=========================================");
		
		
		int num1,num2,num3,num4;
		//max =0;
		//min = Integer.MAX_VALUE;
		System.out.print("정수 1을 입력을 하세요 : ");
		num1 = sc.nextInt();
		System.out.print("정수 2을 입력을 하세요 : ");
		num2 = sc.nextInt();
		System.out.print("정수 3을 입력을 하세요 : ");
		num3 = sc.nextInt();
		System.out.print("정수 4을 입력을 하세요 : ");
		num4 = sc.nextInt();
		
		max =0;
		min = Integer.MAX_VALUE;
		
		if (max < num1) {
			max = num1;
		}
		if (max < num2) {
			max = num2;
		}
		if (max < num3) {
			max = num4;
		}
		if (max < num4) {
			max = num4;
		}
		if (min > num1) {
			min = num1;
		}
		if (min > num2) {
			min = num2;
		}
		if (min > num3) {
			min = num4;
		}
		if (min > num4) {
			min = num4;
		}
		
		System.out.println("입력한 수의 최댓 값은 "+max+" 입니다.");
		System.out.println("입력한 수의 최소 값은 "+min+" 입니다.");				
	}
}
