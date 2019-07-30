package JavaTest;

import java.io.Serializable;

public class AccountVO implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String password;
	private String name;

	/*
	private int age;
	private int gender;
	private String phone;
	private String email;
    */	
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*public int getAge() {
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
	}	*/
	@Override
	public String toString() {
		/*String genderformat = "";
		
		if(gender == 1) {
			genderformat = "³²";
		}else {
			genderformat = "¿©";
		}
		String str;
		*/
		return String.format("%6s %3s %3d %5s %5s %5s",id,name,password.substring(3)+"****");
	}
}

