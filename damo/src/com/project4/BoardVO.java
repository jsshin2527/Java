package com.project4;

import java.io.Serializable;

public class BoardVO implements Serializable {

	private String name;
	private int num;
	private String rn;
//--------------------------------------	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//--------------------------------------	
	public String getRn() {
		return rn;
	}
	public void setNum(String rn) {
		this.rn = rn;
	}
//--------------------------------------	

	@Override
	public String toString() {
		
		String str;
		str = String.format("%s",name);
		
		return str;
	}
	
	
	
	
}
