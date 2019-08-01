package com.project4;

import java.io.IOException;

public interface Board {

	public void print();
	public void input();
	public void delete();
	public void update();
	public void treat();
	public int size();
	boolean searchRn(String rn);
	public int store() throws IOException;
	public int restore() throws IOException;

	

}
