/* 
	java���� ���ڸ� �����ϴ� �ڷ��� String 
	
	Scanner Ŭ������ �̿��Ͽ� ���� ���� ���� ������ �Է¹޾� ������ ������ �Բ� ������ ��������� ����ϴ� ���α׷� 
*/
package JavaBasic;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;

class Scanner_Example_ScoreAverage_ScoreTot  
{
	public static void main (String[] args) throws IOException
	//�̰� ������ ������ �־� (try~catch ���� ó��)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name; //�ʱ�ȭ�� ���� ���� ��� null ���� ��� �ֽ��ϴ�.
		int kor,eng,math,tot,average; //�ƹ��͵� ���� ���� ������� ������ ���� ����ֽ��ϴ�.
		System.out.print("�̸��� �����ΰ��� : "); // suzi 
		name = br.readLine(); //���ڷ� �о� �帮�� ������ ����ȯ�� ���� �ʿ� �����ϴ�. 
		System.out.print("���� ������ �����Դϱ�? : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("���� ������ �����Դϱ�? : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("���� ������ �����Դϱ�? : ");
		math = Integer.parseInt(br.readLine());
		tot = kor+eng+math;
		average = kor+eng+math/3;
		String a = name+"�氡�氡~~";
		System.out.println(name+"�� ���� ������ "+kor+" �Դϴ�.");
		System.out.println(a);
		System.out.println(name+"�� ���� ������ "+eng+"�Դϴ�.");
		System.out.println(name+"�� ���� ������ "+math+"�Դϴ�.");
		System.out.println(name+"�� ��   ������ "+tot+"�Դϴ�.");
		System.out.println(name+"�� ���� ������ "+average+"�Դϴ�.");
	}
}
