package BMI;

import java.util.Scanner;

public class BMI_Impl implements Information_Method {

	private int custom;
	private Record[] rec;
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void set() {
		do{
			System.out.print("회원수 : ");
			custom = sc.nextInt();
		}while(custom< 1 || custom > 10);
		
		this.rec = new Record[custom];
	}
	@Override
	public void input() {
		for (int i = 0; i < custom; i++) {
			
			
			rec[i] = new Record(); // record 객체생성 
			
			System.out.print("회원 번호 : ");
			
			do {
			rec[i].cumstomid = sc.nextInt();
			}while(rec[i].cumstomid <= 0);
			System.out.print("이름 : ");
			rec[i].name= sc.next();
			System.out.print("키: ");
			rec[i].tall = sc.nextInt();
			System.out.print("몸무게: ");
			rec[i].kg = sc.nextInt();	
			rec[i].bmi = rec[i].kg/((rec[i].tall/100)*(rec[i].tall/100));
		}
	}
	private String panjung(double bmi) {		
		
		String pan ="";
		
		if( bmi >=35) {
			pan ="*3단계 비만*입니다.";
		}else if(bmi <= 35 && bmi > 30) {
			pan ="*2단계 비만*입니다";
		}else if(bmi <= 30 && bmi > 25) {
			pan ="*1단계 비만*입니다";
		}else if(bmi <= 25 && bmi > 23) {
			pan ="*정상*입니다";		
		}else if(18.5<= bmi && bmi>23) {
			pan ="*저체중*입니다.";
		}else {
		}
		return pan;
	}		
	@Override
	public void print() {
		for (int i = 0; i < custom; i++) {
			System.out.printf("%2s %4s  %4.0f(cm) %.0f(kg) %4.2f(bmi) %2s \n",rec[i].cumstomid,
								rec[i].name,rec[i].tall,rec[i].kg,rec[i].bmi,panjung(rec[i].bmi));
		}
	}	

}
