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

	//ȸ������ ����
	private String name;
	private int age;
	private int gender;
	private String phone;
	private String email;
	private String id;
	private String password;

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
	
	
	//ȸ������ �� �α���
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
