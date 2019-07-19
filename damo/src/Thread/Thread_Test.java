package Thread;

import java.util.Calendar;

//Thread Synchroized 

class TestThread implements Runnable {
	
	private int bank = 10000;
	
	private int getBank() { //�ܾ� Ȯ�� �޼ҵ� 
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
					Thread.yield(); //CPU �ڿ��� �ٸ� �����忡 �纸 
					money = drawMoney(money_need);
					msg = "���� ����"; 
				}else {
					money = 0;
					msg = "���� ����";
				}
			}
			System.out.println(Thread.currentThread().getName()+msg+", ����ݾ� :"+money+", �ܰ� "+getBank());
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
