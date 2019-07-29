package JavaProjectTest;

import java.io.Serializable;

public class AccountVO  implements Serializable{

	private static final long serialVersionUID = 1L;

	private String name;
	private String age;
	private String gender;
	private String phone;
	private String email;
	private String id;
	private String password;
	 
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
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
	@Override
	public String toString() {
		String str;
		str = String.format("%6s %6s %6s %6s %6s %6s",id,name,age,gender,phone,email);
		return str;
	}
}
