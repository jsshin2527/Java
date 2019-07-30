package JavaTest;

import java.io.Serializable;

public class OrderVO implements Serializable{

	private static final long serialVersionUID = 1L;

	//ī�� �ֹ� ����
	private String drink; //���� ����
	private String size; //������
	private String mode; //HOT/ICE
	private int su; //����
	private int price;

	//ȸ������ ����
	

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
		if(size==null || mode==null) 
			return String.format("  %s %d %d", drink, su, price);

		return String.format("  %s %s %s %d %d",drink, size, mode, su, price);
	}
	public String print() {
		
		return String.format(" %s %s %s %d %d",drink, size, mode, su, price);
	}
	
	/*//�ϴ� ȸ������? ��ºκ�
	public String toStringH() { 
		
		String genderformat = "";

		if(gender == 1) {
			genderformat = "��";
		}else {
			genderformat = "��";
		}
		String str;

		str = String.format("%6s %3s %3d %5s %5s %5s ",id,name,age,genderformat,phone,email);

		return str;
	}
*/
}
