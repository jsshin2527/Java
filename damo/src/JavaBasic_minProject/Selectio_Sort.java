package JavaBasic_minProject;

public class Selectio_Sort {
	
	public static void main(String[] args) {
		//����
		//��������(1,2,3,4)
		//��������(4,3,2,1)	
		//Selection Sort���� ���� ���� ���Ĺ��
		int[] num = {28,30,56,12,5};
		int i,j,temp;
		System.out.print("Source Data: ");
		for(i=0;i<num.length;i++) {//=�� ������ArrayIndexOutOfBoundsException �迭�� �ε����� ������ ���
			System.out.printf("%4d",num[i]);
		}
		System.out.println();
		//Selection sort
		for(i=0;i<num.length-1;i++) {//�ϳ����ְ�
			for(j=i+1;j<num.length;j++) {//�ϳ������ְ�
		//System.out.println(i + "+" + j);
			if(num[i]>num[j]) {//<��������		
				temp=num[i];
				num[i] = num[j];
				num[j] = temp;									
				}
			}
		}
		//�����۾� Selection Sort
		//�����Ѱ� ���
		System.out.print("Sorted Data: ");
		for(int n : num) {//Ȯ��for��. �迭���� ��������
			              //���������� ���������� �Ǿ��ִ� ���� �о�ö� ����
			System.out.printf("%4d",n);
		}
	}
}
