package Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//���� �ݺ��� ���α׷� 
//���α׷��� ������� �ʰ� ����� �ϰ� �ʹ� 
//���� ���ϴ� ���� �Է��� �ؾ� ���α׷��� �����ϰ� �ʹ� 

public class Scanner_Sum_Yes_or_No {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int su,sum=0;
		char ch;
	
		while(true){
			
			//���� ���� �׽�Ʈ 
			/*
			System.out.print("�� �Է� : ");
			su = Integer.parseInt(br.readLine());
			System.out.println("�Է��Ͻ� ���� "+su+"�Դϴ�.");
			System.out.println("���α׷��� �ٽ� �����ϰڽ��ϴ�. ");
			*/
			
			sum =0;
			do{
				System.out.print("�� �Է� : ");
				su = Integer.parseInt(br.readLine());
			}while(su<1||su>5000);
			//1~su������ �� 
			for (int i=1;i<=su;i++) {
				sum+=i;//sum = sum+i;
			}
			System.out.println("1~"+su+"������ �� : "+sum);
			
			//��� �����Ұ����� ���� ����
			 System.out.print("��� �ҷ�?[Y/N] : "); //y,Y,n,N..
			 ch = (char)System.in.read();
			 
			 if(ch != 'y' && ch != 'Y'){
				 System.out.println("���α׷��� �����ϰڽ��ϴ�. ");
				 break;
			 	//while , do~while,for,switch   
			 }
			System.out.println("���α׷��� �ٽ� �����ϰڽ��ϴ�. ");
			System.in.skip(2);
			//�ٽ� �����ϴ� �ڵ�  
			
		}
		
	}
}
