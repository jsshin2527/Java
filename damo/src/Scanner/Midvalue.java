// �ټ����� ���� �Է� �޾� �߰����� ���ϴ� ���α׷� 
// ��� ó�� ���� 
package Scanner;

import java.util.Scanner;;

public class Midvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�ټ����� ���� �Է� �޾� �߰����� ���ϴ� ���α׷� ");
		// num�迭 5���� �����Ѵ�,
		int num[] = new int[5];
		int num1[] = new int[5];
		for(int i=0;i<5;i++) {
			System.out.printf("%d���� ������ �Է��ϼ��� : ",i+1);
			num[i] = sc.nextInt();
		}
		
		System.out.println("���� ���� �Է� �޾ҽ��ϴ�. ");
		
		for(int i=0;i<5;i++) {
			System.out.printf("%4d",num[i]);
		}
		
		//�Է°� Ȯ�� 
		int temp;
		System.out.println();
		System.out.println("������ �����ϰڽ��ϴ�.");
		
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
