package Scanner;
import java.util.Scanner;

public class For_Exmaple_gugudan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dan,sum;
		
		System.out.print("�� �Է� :");
		dan = sc.nextInt();
		System.out.println(dan+" �� ");
		System.out.println("-----for �� ������ ���α׷�-----\n");
		for(int i =1;i<10;i++) {
			System.out.printf("%d X %d = %d \n",dan,i,dan*i);
		}
		System.out.println("\n");
		//while �� 
		//while���� Ư���� ��찡 �ƴϸ� 0���� �����մϴ�.
		System.out.println("-----while �� ������ ���α׷�-----\n");
		int j=0 ;
		while (j<9) {
			System.out.printf("%d X %d = %d \n",dan,j+1,dan*(j+1));
			j++;
		}
		System.out.println("\n");
		System.out.println("-----do~while �� ������ ���α׷�-----\n");
		//do[]while(�ִ�)
		int k = 0;
		do {
			System.out.printf("%d X %d = %d \n",dan,k+1,dan*(k+1));
			k++;
		}while (k<9);
		
	}
}
