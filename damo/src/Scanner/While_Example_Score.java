/*
6. �̸��� 3������ ������ �Է� �޾� �������ǿ� ���� ���
	��� ������ ������ 40�� �̻��̰� ����� 60�� �̻��̸� �հ�
	�Ѱ����̶� 40�� �̸��̰� ����� 60�� �̻��̸� ����
	����� 60�� �̸��̸� ���հ�
	�̸� ? ȫ�浿
	������ ���� ? 60 70 80
	�̸� : ȫ�浿
	���� : 210, ��� : 70, ���� :�հ�
 */
package Scanner;

import java.util.Scanner;

public class While_Example_Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score1,score2,score3,average;
		
		String name;
		
		System.out.print("�̸��� �Է��ϼ��� :");
		name = sc.nextLine();
		do {
		System.out.println("������ ������ 0ũ�ų� ���� 100���� �۰ų� ���ƾ� �մϴ�.");
		System.out.print("���� 1�� �Է��ϼ��� : ");
		score1 = sc.nextInt();
		System.out.print("���� 2�� �Է��ϼ��� : ");
		score2 = sc.nextInt();
		System.out.print("���� 3�� �Է��ϼ��� : ");
		score3 = sc.nextInt();
		}while((score1<0 || score1>100) || (score2<0 || score2>100) || (score3<0 || score3>100));
		
		average = (score1+score2+score3)/3;
		
		if((score1 <40 || score2 <40 || score3 <40) && average > 60) {
			System.out.println(name+"���� �� ���� �̻��� 40�� ���� �����Ƿ� ���� �Ǿ����ϴ�.");
		}else if(average < 60) {
			System.out.println(name+"���� ����� 60�� ���� �����Ƿ� ���� �Ǿ����ϴ�.");
		}else {
			System.out.println(name+"�� �հ��Դϴ�");
		}
	}
}
