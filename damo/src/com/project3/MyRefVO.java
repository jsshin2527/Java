package com.project3;

import java.io.Serializable;

public class MyRefVO implements Serializable{

	private String name;	//����
	private String buyDate;	//���Գ�¥
	private String num;		//����
	private String endDate;	//�������
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBuyDate() {
		return buyDate;
	}
	public void setBuyDate(String buyDate) {
		this.buyDate = buyDate;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	
	public String toString(int i) {
		
		String str = null;
		
		str =  String.format("%4d %8s %10s %8s %10s",
				i,name,buyDate,num,endDate);

		return str;
		
	}
}
