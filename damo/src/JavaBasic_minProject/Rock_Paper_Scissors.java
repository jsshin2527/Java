package JavaBasic_minProject;

import java.util.Scanner;

public class Rock_Paper_Scissors {
	
	public static void main(String[] args) {
		
		//	3. 1~3������ ������ �߻����� ����,����,�� ���� ���α׷� �ۼ�
		//  1:����, 2:����, 3:��
		
		int user;
		int com;
		Scanner sc = new Scanner(System.in);
		System.out.println("1:���� 2:���� 3:�� ?");
		user = sc.nextInt();
		while(true) {
			if(user==1||user==2||user==3) {
				
				break;
				
			}else {
				System.out.println("��Ȯ�� ��ȣ�� �Է��ϼ���");
				user = sc.nextInt();
			}
		}
		
		com=(int)(Math.random() * 3) +1;
		if(com==user)
		System.out.println("�����ϴ�");		
		else if(com-user==1||com-user==-2)
		System.out.println("����� �̰���ϴ�");	
		else
		System.out.println("����� �����ϴ�");
	}
}
