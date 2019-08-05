package com.project8;

import java.io.Serializable;

public class BankVO implements Serializable {
	
	
	private String name;//
	private int pw;//비밀번호 6자리
	private String pw1;
	private String account;//계좌번호 10자리
	private int balance;//잔액
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String getPw1() {
		return pw1;
	}
	public void setPw1(String pw1) {
		this.pw1 = pw1;
	}
	
	
	@Override
	public String toString() {
		
		//String str =  String.format("%10s %12s %8s %10d", name,account,pw1,balance);
		String str =  String.format("%9s %19s %8s %10d", name,account,pw1,balance);
		return str;
	}
	
	
	public String toString1() {
		
		String str = String.format("%10s %12s %8s", name,account,pw1);
		
		return str;
		
	}
	
	
	

}
