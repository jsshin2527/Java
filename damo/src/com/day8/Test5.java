package com.day8;

import java.util.Calendar;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Data ob = new Data(); //�޸𸮿� ���� 
		//ob.print(); �Ϲ� ��ü ȣ�� 
		
		//static �޼ҵ带 ȣ���Ҷ� Ŭ���� �̸��� �տ� �ٿ��� ������ �ϴ°��� �߿��ϴ�
		//��� ���� static ������ ǥ�ð� �ȴ� 
		Data.getPrint();
		Data.name = "����";
		
		Calendar now = Calendar.getInstance(); //�ý����� ���ڸ� �����ϰ��ִ� static ����
											   // �̹� �޸𸮻� �÷��� �ִ� 
	}

}
