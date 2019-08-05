package com.project9;

import java.io.IOException;

public interface SoccerInter {
	

	public void playerList();//플레이어 선수 목록
	//컴터 선수 목록
	public void comList(int[] com);
	
	//선수 선택
	public void PlayerC(int human[]);
	
	//게임시작
	public void play(int []com, MemberVO member);
	
	//15시 추가
	public void result(MemberVO member);
	
	
	//0730 수정
	public void toto(MemberVO member);
	//
	//승부차기
	public void shooter(MemberVO member);
}
