package com.project9;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Member {
	public void memJoin() throws IOException;
	public MemberVO login();
	
	
	public void write() throws IOException;
	
	public void memRemove() throws IOException;

}
