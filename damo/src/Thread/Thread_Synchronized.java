package Thread;

//������ ����ȭ 
//

class Mythread8 implements Runnable{
	private int bank = 10000;

	private int getBack() { //�ܾ� Ȯ�� 
		return bank;
		
	}
	
	private int drawMoney(int m) {
		bank -= m;  	//����  
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
				Thread.yield(); //CPU�� �ٸ� �����忡�� �纸 
				money = drawMoney(money_need);
				msg = "���� ����";
			}else {
				money = 0;
				msg = "���� ����";
			}
		}
			System.out.println(Thread.currentThread().getName()+msg+",���� �ݾ� : "+money+" , �ܰ�" + getBack());
			
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
