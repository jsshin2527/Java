package com.project8;

import java.io.IOException;

public interface Bank {
	
	public BankVO input();//���»���(����?)
	public void print() throws IOException; //ȸ����ü���
	
	public void searchbal(BankVO voo);//�����ܾ���ȸ( ���¹�ȣ ��� �Է¹޾Ƽ�  �ܾ�)
	public void deposit(BankVO voo);//�Ա�
	public void withdraw(BankVO voo);//���
	public void transfer(BankVO voo);
	
	public void savings();//���ݰ���?
	public void estimate();// ���� �����?


	
	
	
	

	
	
}
