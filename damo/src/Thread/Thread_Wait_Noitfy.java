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
			System.out.println(Thread.currentThread().getName() + ", ���� : " + m+ ", �ܾ� : "+ bank);
		}else {
			m=0;
			System.out.println(Thread.currentThread().getName() + ", �ܾ� ���� !!");
		}
		return m;
	}
	
	public void run() {
		synchronized (this) {
			for (int i = 0; i <= 10; i++) {
				if(getBank() <=0) {
				
					this.notifyAll(); //��� �����带 �� �츳�ϴ�.
					
					break;
				}
				drawMoney(1000); //1000�� ���� 
				
				if(getBank() == 2000 || getBank() == 4000 || getBank() == 6000 || getBank() == 8000) {
					try {					
						wait(); //�����尡 ���߸鼭 synchronized ���� ���� �˴ϴ�. 
						
					} catch (Exception e) {
						// TODO: handle exception
					}
				}else {
					notify(); // Thread�� ������ 
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
