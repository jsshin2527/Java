/*
	��� if ���� ���� 
	
	���� ������ �Է��� �޾� ����̾簡 ������ ǥ���ϴ� ���α׷� 
*/
package JavaBasic;
import java.util.Scanner;
class If_else_Example_Score_Korean 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name; 
		int kor;
		System.out.print("���� �̸��� �����̳� ? " );
		name = sc.next(); //String�� ���� �о�� 
    	System.out.print("���������� �����̴�  ?" );
		kor = sc.nextInt(); //�� ��ȯ
		String pan; 
		if (kor>=90)
		{
			pan = "��";
		}else if (kor>=80)
		{
			pan = "��";
		}else if (kor >=70)
		{
			pan = "��";
		}else if (kor >=60)
		{
			pan = "��";
		
		}else{
			pan = "��";
		}
		System.out.println(name+":"+pan);
	}
}
