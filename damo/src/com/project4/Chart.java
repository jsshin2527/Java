package com.project4;

import java.io.IOException;

public interface Chart {

	public void input();
	public void print();
	public void searchPrn();
	public boolean searchPrn(String prn);
	public void searchName();
	public void update();
	public void delete();	
	public int store() throws IOException;
	public int restore() throws IOException;
	
}
