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
		{"¿À  ÈÆ","±èµ¿Ã¶","À¯È£ÁØ","¹ÚÁ¦¼±","±èÇý¹Ì",
		"³ªÇö¼ö","¼ÛÅÂÈ£","È«Á¤È­","±è¿¬ÁÖ","¿Õ¸íÁö",
		"±èÈ«Èñ","Àå¿µ¼·","±èÁ¾Ã¶","±¸¿¹¸²","¾È¿ë¿ì",
		"½ÅÁØ¼®","Á¶À¯·Ï","¹Ú³­ÁÖ","±èÅÂÈ¯","±èÈñ¿ì",
		"¼­Áø±³","ÀÌ±¤ºÀ","ÀÌ½ÂÀº","±èÀºÇý","ÃÖÈ¿Àº",
		"¿©´Ù¼Ø","½ÅÀºÃÑ","ÀÌ°æµµ"};
	
	private final static int saram = name.length;
	

	public static void main(String[] args) {
		
		Thread ob = new MyThread();
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int[] num;
		int inwon,i,n;
		
		do {
			System.out.print("¹ßÇ¥ÀÚ ÀÎ¿ø¼ö : ");
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
		System.out.print("°í¹ÎÁß");
		ob.start();
		
		try {
			ob.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println();
		System.out.println();
		System.out.println("ÃàÇÏ ÇÕ´Ï´Ù. !!, ¹ßÇ¥ÀÚ ÀÔ´Ï´Ù.");
		System.out.println();
		
		int cnt = 1;
		for (int su : num){
			System.out.printf(cnt + "¹ø ¹ßÇ¥ÀÚ : %5s \n",name[su-1]);
			cnt++;
		}
		System.out.println();
	}

}
