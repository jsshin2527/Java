package Thread;

//������ ���� �ֱ� 


class MyThread6 extends Thread {
	
	@Override
	public void run() {
		
		try {
			System.out.println("������ ���� .. ");
			System.out.println("�켱���� : " + getPriority());
			System.out.println("������ �̸� : " + this.getName());
			//0.5�� 
			sleep(500);	
			//�켱���� ���� 
			setPriority(2);
			System.out.println("����� �켱 ���� : "+getPriority());
			System.out.println("������ ���� ... ");
		} catch (Exception e) {
				
		}
	}
}

public class Thread_Lifecycle {

	public static void main(String[] args) {
		
		Thread t1 = Thread.currentThread();
		Thread t2 = new MyThread6();
		
		System.out.println("���� ������ �켱���� :" + t1.getPriority());
		System.out.println("���� ������ �̸� : " + t1.getName());
		System.out.println("t2 ������ isAlive : "+ t2.isAlive()); //������ ���� ���� 
		
		t2.start();
		//t2�� �켱����  
		System.out.println("t2 �켱���� ���� ��" + t2.getPriority());
		
		//t2�� �켱���� 
		t2.setPriority(1);
		
		System.out.println("t2 �켱���� ���� �� :" + t2.getPriority());
		
		
		try {
			
			Thread.sleep(100);; //main thread�� ���� �ֽ��ϴ�. 
			System.out.println("t2 ��� �ֳ��� ? " + t2.isAlive());
			
			//Thread.sleep(100);
			System.out.println("0.1���� t2 ��� �ֳ��� ? " + t2.isAlive());
			
			//t2.join();
			//System.out.println("join�� ���� ������ t2 ��� �ֳ��� ? " + t2.isAlive());	
			System.out.println("join�� t2 ��� �ֳ��� ? " + t2.isAlive());
					
		} catch (Exception e) {
			
			
		}
		
	}
	
}
