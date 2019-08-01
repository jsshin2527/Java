package com.project4;

import java.io.Serializable;

public class ReservationVO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String rrn;
	private String date;
	private String time;
	private String ill;
	private String doc;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRrn() {
		return rrn;
	}
	public void setRrn(String rrn) {
		this.rrn = rrn;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getIll() {
		return ill;
	}
	public void setIll(String ill) {
		this.ill = ill;
	}
	public String getDoc() {
		return doc;
	}
	public void setDoc(String doctor) {
		this.doc = doctor;
	}

	
	public String toString() {
		
		String str;
		str = String.format("%8s   %6s   %6s   %6s  %6s  %6s", name,rrn,date,time,ill,doc);
		
		return str;
	}
	
}
