package com.score4;

public interface Score {
	
	public void input(); 
	public void print(); 
	public boolean searchHak(String hak); // 학번이 있는지 없는지 확인 boolean 은 if으로 받으면 됩니다. 
	public void delete(); //삭제
	public void updata(); //수정 
	public void findHak();//학번검색
	public void findName();//이름검색
	
}
