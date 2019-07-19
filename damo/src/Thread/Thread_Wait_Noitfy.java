package Thread;

//wait,notify()  
//

class MyThread9 implements Runnable{
	private int bank = 10000;
	
	private int getBank() {
		return bank;
	}
	
	
	private int drawMoney(int m) {
		
		if(getBank()>0) {
			
			bank -= m;
			System.out.println(Thread.currentThread().getName() + ", 인출 : " + m+ ", 잔액 : "+ bank);
		}else {
			m=0;
			System.out.println(Thread.currentThread().getName() + ", 잔액 부족 !!");
		}
		return m;
	}
	
	public void run() {
		synchronized (this) {
			for (int i = 0; i <= 10; i++) {
				if(getBank() <=0) {
				
					this.notifyAll(); //모든 스레드를 다 살립니다.
					
					break;
				}
				drawMoney(1000); //1000원 인출 
				
				if(getBank() == 2000 || getBank() == 4000 || getBank() == 6000 || getBank() == 8000) {
					try {					
						wait(); //스레드가 멈추면서 synchronized 블럭을 열게 됩니다. 
						
					} catch (Exception e) {
						// TODO: handle exception
					}
				}else {
					notify(); // Thread를 깨워라 
				}
			}
		}
	}
}

public class Thread_Wait_Noitfy {

	public static void main(String[] args) {
		
		MyThread9 ob =new MyThread9();
		
		
		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob);
			
		t1.start();
		t2.start();
	}

}
