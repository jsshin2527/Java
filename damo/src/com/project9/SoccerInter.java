package com.project9;

import java.io.IOException;

public interface SoccerInter {
	

	public void playerList();//�÷��̾� ���� ���
	//���� ���� ���
	public void comList(int[] com);
	
	//���� ����
	public void PlayerC(int human[]);
	
	//���ӽ���
	public void play(int []com, MemberVO member);
	
	//15�� �߰�
	public void result(MemberVO member);
	
	
	//0730 ����
	public void toto(MemberVO member);
	//
	//�º�����
	public void shooter(MemberVO member);
}
