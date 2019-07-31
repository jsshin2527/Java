package Scanner;
import java.util.Scanner;

public class For_Exmaple_gugudan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dan,sum;
		
		System.out.print("단 입력 :");
		dan = sc.nextInt();
		System.out.println(dan+" 단 ");
		System.out.println("-----for 문 구구단 프로그램-----\n");
		for(int i =1;i<10;i++) {
			System.out.printf("%d X %d = %d \n",dan,i,dan*i);
		}
		System.out.println("\n");
		//while 문 
		//while문은 특별한 경우가 아니면 0부터 시작합니다.
		System.out.println("-----while 문 구구단 프로그램-----\n");
		int j=0 ;
		while (j<9) {
			System.out.printf("%d X %d = %d \n",dan,j+1,dan*(j+1));
			j++;
		}
		System.out.println("\n");
		System.out.println("-----do~while 문 구구단 프로그램-----\n");
		//do[]while(최댓값)
		int k = 0;
		do {
			System.out.printf("%d X %d = %d \n",dan,k+1,dan*(k+1));
			k++;
		}while (k<9);
		
	}
}
