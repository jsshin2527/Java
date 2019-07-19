/*
 * 사다리 타기 프로그램 
 * 입력 값 : 발표자 인원수 
 * 출력 값 : 고민중 .......
 * 			 축하합니다. 
 * 			 발표자 누구누구누구 입니다 명수 출력 
 * 
 * 1. 고민중 ...  -> 스레드로 처리 
 * 1초마다 점 1개씩 출력하여 10초 후에 프로그램 종료 
 * 
 * 2. 발표자 선별 = > 
 * 배열을 선언하고 배열의 인덱스를 난수로 생성하여 배열의 인덱스 매핑 
 * 
 * 3. 출력 => 
 *  뽑혀진 난수의 개수를 for문으로 돌려 출력을 합니다. 
 *  
 * 
 */

package Thread;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import com.day6.RandomNumberGame;

class MyThreadLeg extends Thread{
	
	private int zum =1; 
	/*
	public MyThreadLeg() {
	
		Timer ta = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				//반복적으로 작업을 할 코딩 
				zum = 1;
			}
		};
		Timer ta = new Timer();
		ta.schedule(task,1000);
	}
	*/
	
	@Override
	public void run() {
	
		while(true) {
			zum++;
			System.out.print(".");
			
			if(zum == 20)
				return;
			try {
				sleep(300);
			}catch(Exception e){

			}
		}	
	}
}

public class Ghost_Leg_My {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int number=0;
		
		System.out.print("발표자 인원수 ? ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		String[] itwillname = new String[]{"오  훈","김동철","유호준","박제선","김혜미",
				"나현수","송태호","홍정화","김연주","왕명지",
				"김홍희","장영섭","김종철","구예림","안용우",
				"신준석","조유록","박난주","김태환","김희우",
				"서진교","이광봉","이승은","김은혜","최효은",
				"여다솜","신은총","이경도"};;
		
		System.out.println("");
		
		System.out.print("고민중");
		
		Thread th = new Thread();
		
		new MyThreadLeg().start();
		
		try {
			th.currentThread().sleep(10000);
			
		} catch (Exception e) {
	}	

		
		System.out.println();
		
		int []randomre = new int[number];
		
		
		
		for(int i = 0; i < number ; i++) {		
			randomre[i] = (int)(Math.random()*27);
			
			for(int j = i+1 ; j > 0 ; j--) {
				
				if(randomre[i] == randomre[j])
					i--;
				//System.out.println(randomre[i]);
			}
		}
		
		System.out.println();
		System.out.println("축하 합니다. 발표자 입니다.");
		System.out.println();
		
		for(int i = 1; i<randomre.length ; i++) {
			System.out.println(i+"번 발표자 "+ itwillname[randomre[i]]);
		}
		
	}
}
