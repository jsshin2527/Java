package Thread;

import java.util.Calendar;

//Thread Synchroized 

class TestThread implements Runnable {
	
	private int bank = 10000;
	
	private int getBank() { //잔액 확인 메소드 
		return bank;
	}
			
	private int drawMoney(int m) {
		bank -= m;
		return m;
	}
	
	@Override
	public void run() {
	
		int money_need = 6000;
		int money;
		String msg = "";
		
		try {
			synchronized (this) {
				if(getBank() >= money_need) {
					Thread.yield(); //CPU 자원을 다른 스레드에 양보 
					money = drawMoney(money_need);
					msg = "인출 성공"; 
				}else {
					money = 0;
					msg = "인출 실패";
				}
			}
			System.out.println(Thread.currentThread().getName()+msg+", 인출금액 :"+money+", 잔고 "+getBank());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}	
	

public class Thread_Test {

	public static void main(String[] args) {
		
		TestThread ob = new TestThread();
		
		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob);
		
		t1.start();
		t2.start();

	}
}
