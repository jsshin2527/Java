//5~10�� �̳��� ���ڿ��� �Է¹޾� ��� 
//��ҹ��� ���� ���� 
//���ڿ� �Է��ض� ? abc 
//���ڿ��� ���̴� 5~10�� �� �Դϴ�. 
//���ڿ� ? abc1, 123 
//�����ڸ� �����մϴ� .

package Exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exception_Example_Charater {

	
	public static String getchar() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			
			String str = null;
			
			System.out.print("���ڿ��� �Է��ϼ��� : ");
			
			str = br.readLine();
			char ch = 0;
			
			for (int i = 0; i < str.length(); i++) {
				 ch = str.charAt(i);
			}
			
			for (int i = 0; i < str.length(); i++) {
				System.out.println(ch);
			}			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		 
		
		try {
			
			System.out.print("���ڿ��� �Է��ϼ��� : ");
			
			
			String str = null;
			for(int i = 0;i<str.length();i++) {
				
				char ch = str.charAt(i);
			
		
			
			if(((ch<65) || (ch>90)) && ((ch<97) || (ch>122))) {
				
				}
			}
			
			//���ڿ��� ���̰� 5���� �۰� 10���� ũ�� error�� ǥ���� �ݴϴ�. 
			
			if(true) {
				throw new Exception("���ڿ��� 5���� �۰ų� 10���� Ů�ϴ�. ");
			
			}
			
	
		
		} catch (Exception e) {
			System.out.println("���ڿ��� 5���� �۰ų� 10���� Ů�ϴ�. ");
		}
		
		return null;
	}
	
	public static void main(String[] args) {

		Exception_Example_Charater ex = new Exception_Example_Charater();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String checkcharter;
		
		try {
		
			//checkcharter = br.readLine();
			
			//checkcharter = Exception_Example_Charater.getchar();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
}
