package Thread;

//스레드 동기화 
//

class Mythread8 implements Runnable{
	private int bank = 10000;

	private int getBack() { //잔액 확인 
		return bank;
		
	}
	
	private int drawMoney(int m) {
		bank -= m;  	//인출  
		return m;
	}

	@Override
	public void run() {
		int money_need = 6000;
		int money;
		String msg = "";
		try {
			synchronized (this) {		
				
			if(getBack() >= money_need) {
				Thread.yield(); //CPU를 다른 스레드에게 양보 
				money = drawMoney(money_need);
				msg = "인출 성공";
			}else {
				money = 0;
				msg = "인출 실패";
			}
		}
			System.out.println(Thread.currentThread().getName()+msg+",인출 금액 : "+money+" , 잔고" + getBack());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
public class Thread_Synchronized {

	public static void main(String[] args) {
		
	//	Thread ob = new MyThread8(ob);
		
		Mythread8 ob = new Mythread8();
		
		Thread t1 = new Thread(ob);
		
		Thread t2 = new Thread(ob);
		
		t1.start();
		t2.start();
	}

}
