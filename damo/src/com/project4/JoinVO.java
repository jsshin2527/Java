package com.project4;

import java.io.Serializable;

public class JoinVO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String Pw1;
	private String Pw2;
	private String Name;
	private String Gender;
	private String Birth;
	private String Email;
	private String Tel;

	public String getPw1() {
		return Pw1;
	}
	public void setPw1(String pw1) {
		Pw1 = pw1;
	}
	public String getPw2() {
		return Pw2;
	}
	public void setPw2(String pw2) {
		Pw2 = pw2;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getBirth() {
		return Birth;
	}
	public void setBirth(String birth) {
		Birth = birth;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}
	
	public String toString() {
		
		String str = String.format("%4s %4s %4s %4s %4s %4s",Pw2,Name,Gender,Birth,Email,Tel);
	
			return str;
	}

}
