package Thread;

//��ǥ�� �ο��� �̱�
//28��
//������ ����
//������ �迭�� ���ڸ� ����
//��ǥ�� �ο���?
//�����.....//0.2�ʿ� �ѹ��� ���� ��´� 20�� ����
//�����մϴ�!! ��ǥ�� �Դϴ�
//1�� ��ǥ�� : ��ȫ��

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class MyThread18 extends Thread{
	
	@Override
	public void run() {
		//�����.....//0.2�ʿ� �ѹ��� ���� ��´� 20�� ����
		System.out.print("�����");
		
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
		{"��  ��","�赿ö","��ȣ��","������","������",
		"������","����ȣ","ȫ��ȭ","�迬��","�ո���",
		"��ȫ��","�念��","����ö","������","�ȿ��",
		"���ؼ�","������","�ڳ���","����ȯ","�����",
		"������","�̱���","�̽���","������","��ȿ��",
		"���ټ�","������","�̰浵"};

	public static void main(String[] args) {
		
		int inwon,su;
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		MyThread18 t1 = new MyThread18();
		ArrayList<Integer> ob = new ArrayList<>();
		
		System.out.println("��ǥ�� �ο���? ");
		inwon = sc.nextInt();
		
		for(int i=0;i<inwon;i++) {
			
			while(true) {
				
				su = rd.nextInt(name.length);
				
				if(!ob.contains(su)) {//�ߺ�ó��	
					ob.add(i,su);
					break;
				}
			}
		}
		t1.setDaemon(true);//�ʿ����?
		t1.start();
		try {
			t1.join();//���ξ� t1�� ���� �� ���� ������
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println();
		System.out.println("\n�������մϴ�~ ��ǥ�� �Դϴ١�\n");
		
		for(int i=0;i<ob.size();i++) {
			System.out.println((i+1) + "��° ��ǥ�� : " + name[ob.get(i)]) ;
		}
	}
}





