package com.project2;

public class ClientVO {
	// 메뉴, 사이즈, HOT/ICE, 수량 선택을 담는 변수
	private String coffee;
	private String hotice;
	private String size;
	private String quantity;

	// 가격을담는 변수
	private int coffeeprice;
	private int hoticeprice;
	private int sizeprice;
	private int lastprice;

	private String[] coffeeMenu = { "에스프레소(2000)", "아메리카노(3000)", "카페라떼(4000)", "카라멜마키아또(5000)", "취소" };
	private String[] hoticeMenu = { "HOT", "ICE(+500)" };
	private String[] sizeMenu = { "Tall", "Grande(+500)", "Venti(+1000)" };

	// 기본가격 및 사이즈 ,HOT/ICE선택에따른 추가요금
	private int[] arrPrice = { 2000, 3000, 4000, 5000 };
	private int[] arrSizeprice = { 0, 500, 1000 };
	private int[] arrHoticepreice = { 0, 500 };

	public String getCoffee() {
		return coffee;
	}

	public void setCoffee(int coffee) {
		this.coffeeprice = arrPrice[coffee - 1];
		this.coffee = coffeeMenu[coffee - 1];
	}

	public String getHotice() {
		return hotice;
	}

	public void setHotice(int hotice) {
		this.hotice = hoticeMenu[hotice - 1];
		this.hoticeprice = arrHoticepreice[hotice - 1];

	}

	public String getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = sizeMenu[size - 1];
		this.sizeprice = arrSizeprice[size - 1];

	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public int getCoffeeprice() {
		return coffeeprice;
	}

	public void setCoffeeprice(int coffeeprice) {
		this.coffeeprice = coffeeprice;
	}

	public int getHoticeprice() {
		return hoticeprice;
	}

	public void setHoticeprice(int hoticeprice) {
		this.hoticeprice = hoticeprice;
	}

	public int getSizeprice() {
		return sizeprice;
	}

	public void setSizeprice(int sizeprice) {
		this.sizeprice = sizeprice;
	}

	public int getLastprice() {
		return lastprice;
	}

	public void setLastprice() {
		this.lastprice = (coffeeprice + sizeprice + hoticeprice) * Integer.parseInt(quantity);
	}

	public String[] getCoffeeMenu() {
		return coffeeMenu;
	}

	public void setCoffeeMenu(String[] coffeeMenu) {
		this.coffeeMenu = coffeeMenu;
	}

	public String[] getHoticeMenu() {
		return hoticeMenu;
	}

	public void setHoticeMenu(String[] hoticeMenu) {
		this.hoticeMenu = hoticeMenu;
	}

	public String[] getSizeMenu() {
		return sizeMenu;
	}

	public void setSizeMenu(String[] sizeMenu) {
		this.sizeMenu = sizeMenu;
	}

	public int[] getArrPrice() {
		return arrPrice;
	}

	public void setArrPrice(int[] arrPrice) {
		this.arrPrice = arrPrice;
	}

	public int[] getArrSizeprice() {
		return arrSizeprice;
	}

	public void setArrSizeprice(int[] arrSizeprice) {
		this.arrSizeprice = arrSizeprice;
	}

	public int[] getArrHoticepreice() {
		return arrHoticepreice;
	}

	public void setArrHoticepreice(int[] arrHoticepreice) {
		this.arrHoticepreice = arrHoticepreice;
	}

	public String toString() {

		String str = String.format("메뉴:%s ,HOT/ICE:%s ,SIZE:%s ,수량:%s ,가격:%d", coffee, hotice, size, quantity,
				lastprice);

		return str;

	}

	public void setCoffee(String string) {
		this.coffee = string;
	}

	public void setHotice(String string) {
		this.hotice = string;
	}

	public void setSize(String string) {
		this.size = string;
	}

	public void setLastprice(String string) {
		this.lastprice = Integer.parseInt(string);
	}

}
