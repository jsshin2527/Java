package JavaBasic_minProject;

import java.util.Scanner;

public class RandomNumberGame {
	

   //2. 1~10사이의 난수를 발생시켜 발생시킨 난수를 3번안에 알아 맞추는 게임
   //(3번안에 알아맞추지 못하면 발생된 난수를 출력)

	public static void main(String[] args){
	
		int[] su = new int[5];
		int i,max,min;

		Scanner sc = new Scanner(System.in);

		for(i=0;i<su.length;i++){

			System.out.print("정수?[5개]");
			su[i] = sc.nextInt();
		}
		//max와 min구할때 사용
		//값을 넣어놓고 다른 수와 비교
		max=min=su[0];

		for(i=1;i<su.length;i++){
			if(max<su[i])
				max=su[i];
			if(min>su[i])
				min=su[i];
		}
			System.out.printf("가장 작은수 : %d, 가장 큰수 %d",min,max);	
			System.out.println();
	}
}
