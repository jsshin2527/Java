/*
 * ��ٸ� Ÿ�� ���α׷� 
 * �Է� �� : ��ǥ�� �ο��� 
 * ��� �� : ����� .......
 * 			 �����մϴ�. 
 * 			 ��ǥ�� ������������ �Դϴ� ��� ��� 
 * 
 * 1. ����� ...  -> ������� ó�� 
 * 1�ʸ��� �� 1���� ����Ͽ� 10�� �Ŀ� ���α׷� ���� 
 * 
 * 2. ��ǥ�� ���� = > 
 * �迭�� �����ϰ� �迭�� �ε����� ������ �����Ͽ� �迭�� �ε��� ���� 
 * 
 * 3. ��� => 
 *  ������ ������ ������ for������ ���� ����� �մϴ�. 
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
				//�ݺ������� �۾��� �� �ڵ� 
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
		
		System.out.print("��ǥ�� �ο��� ? ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		String[] itwillname = new String[]{"��  ��","�赿ö","��ȣ��","������","������",
				"������","����ȣ","ȫ��ȭ","�迬��","�ո���",
				"��ȫ��","�念��","����ö","������","�ȿ��",
				"���ؼ�","������","�ڳ���","����ȯ","�����",
				"������","�̱���","�̽���","������","��ȿ��",
				"���ټ�","������","�̰浵"};;
		
		System.out.println("");
		
		System.out.print("�����");
		
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
		System.out.println("���� �մϴ�. ��ǥ�� �Դϴ�.");
		System.out.println();
		
		for(int i = 1; i<randomre.length ; i++) {
			System.out.println(i+"�� ��ǥ�� "+ itwillname[randomre[i]]);
		}
		
	}
}
