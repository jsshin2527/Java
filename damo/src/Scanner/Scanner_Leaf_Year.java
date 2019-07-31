/*
	Scanner를 이용하여 윤년을 구하는 프로그램 
	4.년도를 입력받고, 윤년인지 아닌지를 출력.
	예) 2010 입력시 -> 2010 => 평년
    2012 입력시 -> 2012 => 윤년
*/

package Scanner;

import java.util.Scanner;

public class Scanner_Leaf_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int year;
		System.out.print("년도를 입력을 하세요 : ");
		year = sc.nextInt();
		
		if (year%4 ==0 && year%100 != 0 || year%400 == 0) {
			System.out.println(year+"년도는 윤년입니다.");
		}else {
			System.out.println(year+"년도는 평년입니다.");
		}
	}

}
