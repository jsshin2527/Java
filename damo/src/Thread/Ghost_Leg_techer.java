package Thread;

import java.util.Random;
import java.util.Scanner;

class MyThread extends Thread{
		//rd.nexInt skstn todtjd 
	/*
	 * while(n<inwon){
	 * num[n] =
	 * while(true){
	 * 
	 * cnt++; 
	 *  if(cnt == 20)
	 *  	return;
	 * } 
	 *  
 	 */
	
	int cnt = 0;
	String str ="";
	
	@Override
	public void run() {
		while(true) {
			System.out.print('.');
			
			try {
				sleep(300);
				if(cnt == 20)
					break;
				
				cnt++;
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	}
	
	
	
}

public class Ghost_Leg_techer {
	
	private static String [] name =  
		{"��  ��","�赿ö","��ȣ��","������","������",
		"������","����ȣ","ȫ��ȭ","�迬��","�ո���",
		"��ȫ��","�念��","����ö","������","�ȿ��",
		"���ؼ�","������","�ڳ���","����ȯ","�����",
		"������","�̱���","�̽���","������","��ȿ��",
		"���ټ�","������","�̰浵"};
	
	private final static int saram = name.length;
	

	public static void main(String[] args) {
		
		Thread ob = new MyThread();
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int[] num;
		int inwon,i,n;
		
		do {
			System.out.print("��ǥ�� �ο��� : ");
			inwon = sc.nextInt();
		}while(inwon<1||inwon>saram);
		
		num = new int[inwon];
		n=0;
		
		while(n<inwon) {
			num[n] = rd.nextInt(saram);
			for (i = 0; i < n ; i++) {
				if(num[i] == num[n]) {
					n--;
					break;
				}
			}
			n++;
		}
		System.out.print("�����");
		ob.start();
		
		try {
			ob.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println();
		System.out.println();
		System.out.println("���� �մϴ�. !!, ��ǥ�� �Դϴ�.");
		System.out.println();
		
		int cnt = 1;
		for (int su : num){
			System.out.printf(cnt + "�� ��ǥ�� : %5s \n",name[su-1]);
			cnt++;
		}
		System.out.println();
	}

}
