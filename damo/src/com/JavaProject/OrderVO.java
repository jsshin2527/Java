package com.JavaProject;

import java.io.Serializable;

public class OrderVO implements Serializable{

	private static final long serialVersionUID = 1L;

	//카페 주문 영역
	private String drink; //음료 선택
	private String size; //사이즈
	private String mode; //HOT/ICE
	private int su; //수량
	private int price;
	private int tot;
	private int priceamea;//카페라떼
	private int pricecode;//아메리카노 가격 
	private int pricejava;//카푸치노
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
	public void setPriceamea(int priceamea) {//카페라떼
		this.priceamea = 3000*priceamea;
	}
	public int getPricecode() {
		return pricecode;
	}
	public void setPricecode(int pricecode) {//아메리카노
		this.pricecode = 2500*pricecode;
	}
	public int getPricejava() {
		return pricejava;
	}
	
	public void setPricejava(int pricejava) {//카푸치노
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
		//만약 케이크면, 케이크는 핫 이런거 없음
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
