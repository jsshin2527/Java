package com.project4;

public interface Reservation {
	
	public void allprint();
	public void reseradd();
	public void reserupdate();
	public void reserdel();
	boolean searchPrn(int prn);
	public void check();
	public void end() throws Exception;
	
}
