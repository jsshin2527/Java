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
	private int priceamea;
	private int pricecode;
	private int pricejava;
	private int pricecake;
	
	public int getPriceamea() {
		return priceamea;
	}
	public void setPriceamea(int priceamea) {
		this.priceamea = 2500*priceamea;
	}
	public int getPricecode() {
		return pricecode;
	}
	public void setPricecode(int pricecode) {
		this.pricecode = 3000*pricecode;
	}
	public int getPricejava() {
		return pricejava;
	}
	public int getPricecake() {
		return pricecake;
	}
	public void setPricecake(int pricecake) {
		this.pricecake = 3000*pricecake;
	}
	public void setPricejava(int pricejava) {
		this.pricejava = 3500*pricejava;
	}
	public int getTot() {	
		tot += priceamea+pricecode+pricejava+pricecake;
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
		if(size==null || mode==null) 
			return String.format("  %s %d %d", drink, su, price);
		return String.format("  %s %s %s %d %d",drink, size, mode, su);
	}
	public String print() {
		return String.format(" %s %s %s %d %d",drink, size, mode, su);
	}
	
	/*//일단 회원정보? 출력부분
	public String toStringH() { 
		String genderformat = "";

		if(gender == 1) {
			genderformat = "남";
		}else {
			genderformat = "여";
		}
		String str;

		str = String.format("%6s %3s %3d %5s %5s %5s ",id,name,age,genderformat,phone,email);

		return str;
	}
*/
}
