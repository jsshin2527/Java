package JavaBasic_minProject;

import java.util.Random;

public class Selection_Sort_Example2 {
	
	public static void main(String[] args) {
		//�ζ����α׷�
		//1~45������ ���� 6���� ������ �߻����� ũ������� ����	
		Random rd = new Random();
		int[] num = new int[6];
		int i,j,n,temp;	
		n=0;
		while(n<6) {
			num[n] = rd.nextInt(45)+1;//copy�� ����
			for(i=0;i<n;i++) {//�ݺ���//�ߺ��� ���ڰ� �������� ���ο� ����
				if(num[i]==num[n]) {
					n--;
					break;
				}
			}
			n++;								
		}
		//Selection sort����
		for(i=0;i<num.length-1;i++) {//�ϳ����ְ�
			for(j=i+1;j<num.length;j++) {//�ϳ������ְ�
		//		System.out.println(i + "+" + j);
				if(num[i]>num[j]) {		
					temp=num[i];
					num[i] = num[j];
					num[j] = temp;
				}			
			}
		}
		for(int su: num) {
			System.out.printf("%4d",su);
		}
		System.out.println();
	}
}
