/*
 3. �� ���� ������ �Է� �ް�, ���� ū ���ڿ� ���� ���� ���ڸ� �����ؼ� ���.(if�� �̿�)
	��) 20, 30, 40, 50 �Է½� -> ���� ū ���� 50, ���� ���� ���� 20
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
			System.out.print("���� "+(i+1)+"�Է��ϼ��� :");
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
		System.out.println("�ִ� ����" +max+"�Դϴ� ");
		System.out.println("�ּ� ����" +min+"�Դϴ� ");
		*/
		
		//�迭�� �̿����� �ʰ� �ִ� �ּڰ� ���α׷� �ۼ��ϱ� 
		System.out.println("=========================================");
		System.out.println("�迭�� �̿����� �ʰ� �ִ� �ּҰ� ���ϱ� \n");
		System.out.println("=========================================");
		
		
		int num1,num2,num3,num4;
		//max =0;
		//min = Integer.MAX_VALUE;
		System.out.print("���� 1�� �Է��� �ϼ��� : ");
		num1 = sc.nextInt();
		System.out.print("���� 2�� �Է��� �ϼ��� : ");
		num2 = sc.nextInt();
		System.out.print("���� 3�� �Է��� �ϼ��� : ");
		num3 = sc.nextInt();
		System.out.print("���� 4�� �Է��� �ϼ��� : ");
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
		
		System.out.println("�Է��� ���� �ִ� ���� "+max+" �Դϴ�.");
		System.out.println("�Է��� ���� �ּ� ���� "+min+" �Դϴ�.");				
	}
}
