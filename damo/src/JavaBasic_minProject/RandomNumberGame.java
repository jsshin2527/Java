package JavaBasic_minProject;

import java.util.Scanner;

public class RandomNumberGame {
	

   //2. 1~10������ ������ �߻����� �߻���Ų ������ 3���ȿ� �˾� ���ߴ� ����
   //(3���ȿ� �˾Ƹ����� ���ϸ� �߻��� ������ ���)

	public static void main(String[] args){
	
		int[] su = new int[5];
		int i,max,min;

		Scanner sc = new Scanner(System.in);

		for(i=0;i<su.length;i++){

			System.out.print("����?[5��]");
			su[i] = sc.nextInt();
		}
		//max�� min���Ҷ� ���
		//���� �־���� �ٸ� ���� ��
		max=min=su[0];

		for(i=1;i<su.length;i++){
			if(max<su[i])
				max=su[i];
			if(min>su[i])
				min=su[i];
		}
			System.out.printf("���� ������ : %d, ���� ū�� %d",min,max);	
			System.out.println();
	}
}
