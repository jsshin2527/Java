package Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//무한 반복문 프로그램 
//프로그램이 종료되지 않게 사용을 하고 싶다 
//내가 원하는 값을 입력을 해야 프로그램을 종료하고 싶다 

public class Scanner_Sum_Yes_or_No {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int su,sum=0;
		char ch;
	
		while(true){
			
			//무한 루프 테스트 
			/*
			System.out.print("수 입력 : ");
			su = Integer.parseInt(br.readLine());
			System.out.println("입력하신 수는 "+su+"입니다.");
			System.out.println("프로그램을 다시 실행하겠습니다. ");
			*/
			
			sum =0;
			do{
				System.out.print("수 입력 : ");
				su = Integer.parseInt(br.readLine());
			}while(su<1||su>5000);
			//1~su까지의 합 
			for (int i=1;i<=su;i++) {
				sum+=i;//sum = sum+i;
			}
			System.out.println("1~"+su+"까지의 합 : "+sum);
			
			//계속 진행할건지에 대한 유무
			 System.out.print("계속 할래?[Y/N] : "); //y,Y,n,N..
			 ch = (char)System.in.read();
			 
			 if(ch != 'y' && ch != 'Y'){
				 System.out.println("프로그램을 종료하겠습니다. ");
				 break;
			 	//while , do~while,for,switch   
			 }
			System.out.println("프로그램을 다시 실행하겠습니다. ");
			System.in.skip(2);
			//다시 실행하는 코드  
			
		}
		
	}
}
