//������� day7����

package Array;  //���ǻ� �������� Ŭ������ ����� �� �ִ�

import java.util.Scanner;

class Hap{//Ŭ���� �ȿ� Ŭ������ ���鶧�� public�� �����ش�
	
	int su,sum;//�ν��Ͻ� ����//�����ʹ� ���⿡ ����Ǿ��ִ�
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("���� �Է�?");
		su = sc.nextInt();//su�� �ٱ��� int su;�� ����Ǿ��ִ�		
	}	
	public int cnt() {		
		for(int i=1;i<=su;i++) {
			sum +=i;//sum = sum+i �޼ҵ� �ۿ� �ִ� �ν��Ͻ� ������ �ڷ����� �°� �ʱ�ȭ �Ǿ��ִ�
		}		
		return sum;//�ٱ��� int sum;�� ��ȯ����		
	}	
	public void print(int i) {
		System.out.println("1~" + su + "������ �հ�" + i);		
	}
	
}

public class Class_Object_Sum_Example {

	public static void main(String[] args) {//���� �޼ҵ尡 �ִ� Ŭ������ public�� �ִ�
		
		Hap h = new Hap();
		
		h.input();
		int cnt = h.cnt();//cnt�� �������� ���� �˼��� ����
		h.print(cnt);

	}//���������� �����ؼ� Ŭ������ �������
	 //������ ������ �ϰԵǸ� Ŭ������ ������ ���������
}
