package com.day7;

import java.util.Scanner;

public class JumiunNumber {
	
	//�迭
	
	public static void main(String[] args) {	
		
		//�ֹι�ȣ �˻�
		//921010-2123456 //jumin
		//234567 892345 //chk //������ ���ڴ� �ο��Ǵ� ������ȣ
		
		//������
		//�� = (9*2)+(2*3)+...+(5*5) 
		//�� = 11-��%11
		//�� = ��%10
		//�� == 6(����)
		
		Scanner sc = new Scanner(System.in);
		String jumin;
		int[] chk = {2,3,4,5,6,7,8,9,2,3,4,5};
		
		int i,tot,su;
		
		System.out.print("�ֹι�ȣ[xxxxxx-xxxxxxx]?");
		jumin = sc.next();
		
		if(jumin.length()!=14) {//length�� ��ȣ���� �迭��length���� ��ȣ����
			
			System.out.println("�Է� ����!!");
			return; //stop		
		}
		
		tot = 0;		
		//index : 01234567890123
		//sumin : 921010-2123456	- 14
		//chk :   234567 892345     - 13
		for(i=0;i<12;i++) {		
			if(i>=6) {//�ֹι�ȣ ���ڸ�		
				tot+= chk[i]*Integer.parseInt(jumin.substring(i+1,i+2));//-������+1			
			}else {//�������
				tot+= chk[i]*Integer.parseInt(jumin.substring(i,i+1));			
			}	
		}		
		su = 11 - tot % 11;
		su = su % 10;	
		if(su==Integer.parseInt(jumin.substring(13))) {
			System.out.println("��Ȯ�� �ֹι�ȣ!");
		}else {
			System.out.println("��! ������?");
		}
	
		
/*		String str = "seoul korea";
		//            01234567890 //�ڵ����� �����Ǵ� �ε����� ����
		
		System.out.println(str.substring(0,3));//substring�������� �޼ҵ�
		System.out.println(str.substring(6,8));
		System.out.println(str.substring(6));//6��° �ڸ����� ������
*/		
		
		
		
	}

}
