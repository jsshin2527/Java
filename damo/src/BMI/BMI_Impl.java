package BMI;

import java.util.Scanner;

public class BMI_Impl implements Information_Method {

	private int custom;
	private Record[] rec;
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void set() {
		do{
			System.out.print("ȸ���� : ");
			custom = sc.nextInt();
		}while(custom< 1 || custom > 10);
		
		this.rec = new Record[custom];
	}
	@Override
	public void input() {
		for (int i = 0; i < custom; i++) {
			
			
			rec[i] = new Record(); // record ��ü���� 
			
			System.out.print("ȸ�� ��ȣ : ");
			
			do {
			rec[i].cumstomid = sc.nextInt();
			}while(rec[i].cumstomid <= 0);
			System.out.print("�̸� : ");
			rec[i].name= sc.next();
			System.out.print("Ű: ");
			rec[i].tall = sc.nextInt();
			System.out.print("������: ");
			rec[i].kg = sc.nextInt();	
			rec[i].bmi = rec[i].kg/((rec[i].tall/100)*(rec[i].tall/100));
		}
	}
	private String panjung(double bmi) {		
		
		String pan ="";
		
		if( bmi >=35) {
			pan ="*3�ܰ� ��*�Դϴ�.";
		}else if(bmi <= 35 && bmi > 30) {
			pan ="*2�ܰ� ��*�Դϴ�";
		}else if(bmi <= 30 && bmi > 25) {
			pan ="*1�ܰ� ��*�Դϴ�";
		}else if(bmi <= 25 && bmi > 23) {
			pan ="*����*�Դϴ�";		
		}else if(18.5<= bmi && bmi>23) {
			pan ="*��ü��*�Դϴ�.";
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
