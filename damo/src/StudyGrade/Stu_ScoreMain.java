package StudyGrade;

import java.util.Scanner;

public class Stu_ScoreMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Stu_ScoreImpl so = new Stu_ScoreImpl();
		
		int meun;
		
		System.out.println("��ǻ�� ���а� �л��� ���� �Է� �ý��� ");

		while(true) {
			
			System.out.print("1. �Է� \n2. ��� \n3. ���� \n4. ���� \n5. �й��˻� \n6. �̸��˻� \n7. ����");
			System.out.print("\n�޴����� �����ϼ��� :");
			System.out.println();
			meun = Integer.parseInt(sc.nextLine());
			
			switch(meun) {
			
			case 1 :
				so.input();break;
			case 2 :
				so.print();break;
			case 3 : 
				so.delete();break;
			case 4 :
				so.updata();break;
			case 5 :
				so.findHak();break;
			case 6 :
				so.findName();break;
			case 7 :
				System.exit(0);
			}	
		}
	}
}
