package com.day7;

import java.util.Scanner;

public class Test12 {
	
	public static void main(String[] args) {
		

		
		Scanner sc = new Scanner(System.in);
		String jumin;
		int[] chk = {2,3,4,5,6,7,8,9,2,3,4,5};
		
		int i,tot,su;
		
		System.out.print("�ֹι�ȣ[xxxxxx-xxxxxxx]?");
		jumin = sc.next();
		
		if(jumin.length()!=14) {
			
			System.out.println("�Է¿���!");
			return;
			
		}
		tot=0;
		
		for(i=0;i<12;i++) {
			if(i>=6) {
				
				tot+= chk[i]*Integer.parseInt(jumin.substring(i+1,i+2));
				
			}else {
				
				tot+= chk[i]*Integer.parseInt(jumin.substring(i,i+1));
				
			}
		}
		
		su = 11-tot%11;
		su = su%10;
		
		if(su==Integer.parseInt(jumin.substring(13))) {
			System.out.println("��Ȯ�� �ֹι�ȣ!");
		}else {
			System.out.println("��! ������?");
		}
		
		
	}

}
