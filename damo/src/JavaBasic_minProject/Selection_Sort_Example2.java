package JavaBasic_minProject;

import java.util.Random;

public class Selection_Sort_Example2 {
	
	public static void main(String[] args) {
		//로또프로그램
		//1~45사이의 수중 6개의 난수를 발생시켜 크기순으로 정렬	
		Random rd = new Random();
		int[] num = new int[6];
		int i,j,n,temp;	
		n=0;
		while(n<6) {
			num[n] = rd.nextInt(45)+1;//copy의 개념
			for(i=0;i<n;i++) {//반복문//중복된 숫자가 나왔을때 새로운 값을
				if(num[i]==num[n]) {
					n--;
					break;
				}
			}
			n++;								
		}
		//Selection sort정렬
		for(i=0;i<num.length-1;i++) {//하나빼주고
			for(j=i+1;j<num.length;j++) {//하나더해주고
		//		System.out.println(i + "+" + j);
				if(num[i]>num[j]) {		
					temp=num[i];
					num[i] = num[j];
					num[j] = temp;
				}			
			}
		}
		for(int su: num) {
			System.out.printf("%4d",su);
		}
		System.out.println();
	}
}
