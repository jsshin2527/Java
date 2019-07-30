package com.JavaProject;

import java.io.Serializable;

public class OrderVO implements Serializable{

	private static final long serialVersionUID = 1L;

	//ī�� �ֹ� ����
	private String drink; //���� ����
	private String size; //������
	private String mode; //HOT/ICE
	private int su; //����
	private int price;
	private int tot;
	private int priceamea;//ī���
	private int pricecode;//�Ƹ޸�ī�� ���� 
	private int pricejava;//īǪġ��
	private int priceredcake;
	private int pricetiracake;
	private String setmakecake;
	
	public String getSetmakecake() {
		return setmakecake;
	}
	public void setSetmakecake(String setmakecake) {
		this.setmakecake = setmakecake;
	}
	public int getPriceamea() {
		return priceamea;
	}
	public void setPriceamea(int priceamea) {//ī���
		this.priceamea = 3000*priceamea;
	}
	public int getPricecode() {
		return pricecode;
	}
	public void setPricecode(int pricecode) {//�Ƹ޸�ī��
		this.pricecode = 2500*pricecode;
	}
	public int getPricejava() {
		return pricejava;
	}
	
	public void setPricejava(int pricejava) {//īǪġ��
		this.pricejava = 3000*pricejava;
	}
	public int getPriceredcake() {
		return priceredcake;
	}
	public void setPriceredcake(int priceredcake) {
		this.priceredcake = 3000*priceredcake;
	}
	public int getPricetiracake() {
		return pricetiracake;
	}
	public void setPricetiracake(int pricetiracake) {
		this.pricetiracake = 5000*pricetiracake;
	}
	public int getTot() {	
		tot += priceamea+pricecode+pricejava+priceredcake+pricetiracake;
		return tot;
	}
	public String getDrink() {
		return drink;
	}
	public void setDrink(String drink) {
		this.drink = drink;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}	
	@Override
	public String toString() { 
		//���� ����ũ��, ����ũ�� �� �̷��� ����
		if(size==null || mode==null) {
			return String.format("%s %dea ", setmakecake, su);
		}
		if(setmakecake == null) {
			return String.format("%s %s %s %dea",drink, size, mode, su);	
		}else if (drink == null) {
			return String.format("%s %s %s %dea",setmakecake, size, mode, su);
		}else {
			return String.format("%s %s %s %s %dea",drink,setmakecake, size, mode, su);
		}
		
	}
}
