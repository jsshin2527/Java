package com.project8;

import java.io.IOException;

public interface Bank {
	
	public BankVO input();//계좌생성(랜덤?)
	public void print() throws IOException; //회원전체출력
	
	public void searchbal(BankVO voo);//개인잔액조회( 계좌번호 비번 입력받아서  잔액)
	public void deposit(BankVO voo);//입금
	public void withdraw(BankVO voo);//출금
	public void transfer(BankVO voo);
	
	public void savings();//적금가입?
	public void estimate();// 적금 예상액?


	
	
	
	

	
	
}
