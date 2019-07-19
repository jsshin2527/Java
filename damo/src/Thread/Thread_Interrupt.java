package Thread;
//*�߿�*
//���ͷ�Ʈ : �켱������ ���� ���α׷��� ���� �����Ű�� �ٽ� ���ƿ��� ���α׷� 
//���� -> �� -> �ù� -> �� -> ��� 
//A -> B -> C -> D -> A
class MyThread7 extends Thread{
	
	private Thread next;
	
	public void setNext(Thread next) {
		this.next = next;
	}
	@Override
	public void run() {
	
		for (int i = 0; i < 20; i++) {
			try {
				sleep(2000);
				
			} catch (Exception e) {
				
			}
			System.out.println(getName() + " : " +i);
			//�����尡 ��� ������ ���� �����带 ���� 
			if(next.isAlive()) {
				next.interrupt(); //stop 
			}
		}
	}
}

public class Thread_Interrupt {

	public static void main(String[] args) {
		
		MyThread7 t1 = new MyThread7();
		MyThread7 t2 = new MyThread7();
		MyThread7 t3 = new MyThread7();
		MyThread7 t4 = new MyThread7();
		
		t1.setNext(t2);// ���� �����尡 t1 �����尡 ����ȴٸ� ���߰� t2 ���� 
		t2.setNext(t3);// ���� �����尡 t2 �����尡 ����ȴٸ� ���߰� t3 ����
		t3.setNext(t1);// ���� �����尡 t3 �����尡 ����ȴٸ� ���߰� t1 ����
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.interrupt(); //���ͷ�Ʈ : ������ �����ϴ� 
		//�����带 ������ ������� ��������� ���ư��� �ϴ°� 
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}