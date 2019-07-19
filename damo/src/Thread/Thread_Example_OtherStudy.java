package Thread;

//발표자 인원수 뽑기
//28명
//무작위 랜덤
//랜덤과 배열의 숫자를 래핑
//발표자 인원수?
//고민중.....//0.2초에 한번씩 점을 찍는다 20개 정도
//축하합니다!! 발표자 입니다
//1번 발표자 : 김홍희

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class MyThread18 extends Thread{
	
	@Override
	public void run() {
		//고민중.....//0.2초에 한번씩 점을 찍는다 20개 정도
		System.out.print("고민중");
		
		for(int i=0;i<=20;i++) {
			System.out.print("*");
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				
			}
		}
	}
}

public class Thread_Example_OtherStudy {
	
	private static String[] name = 
		{"오  훈","김동철","유호준","박제선","김혜미",
		"나현수","송태호","홍정화","김연주","왕명지",
		"김홍희","장영섭","김종철","구예림","안용우",
		"신준석","조유록","박난주","김태환","김희우",
		"서진교","이광봉","이승은","김은혜","최효은",
		"여다솜","신은총","이경도"};

	public static void main(String[] args) {
		
		int inwon,su;
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		MyThread18 t1 = new MyThread18();
		ArrayList<Integer> ob = new ArrayList<>();
		
		System.out.println("발표자 인원수? ");
		inwon = sc.nextInt();
		
		for(int i=0;i<inwon;i++) {
			
			while(true) {
				
				su = rd.nextInt(name.length);
				
				if(!ob.contains(su)) {//중복처리	
					ob.add(i,su);
					break;
				}
			}
		}
		t1.setDaemon(true);//필요없음?
		t1.start();
		try {
			t1.join();//메인아 t1이 끝날 때 까지 죽지마
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println();
		System.out.println("\n★축하합니다~ 발표자 입니다★\n");
		
		for(int i=0;i<ob.size();i++) {
			System.out.println((i+1) + "번째 발표자 : " + name[ob.get(i)]) ;
		}
	}
}





