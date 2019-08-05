package com.project9;

import java.io.Serializable;

public class MemberVO implements Serializable{
	private String pw;
	private int playCount,winCount,loseCount;
	private int coin;
	private int []player = null;
	
	public int getPlayCount() {
		return playCount;
	}

	public void setPlayCount(int playCount) {
		this.playCount = playCount;
	}

	public int getWinCount() {
		return winCount;
	}

	public void setWinCount(int winCount) {
		this.winCount = winCount;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getLoseCount() {
		return loseCount;
	}

	public void setLoseCount(int loseCount) {
		this.loseCount = loseCount;
	}

	public int getCoin() {
		return coin;
	}

	public void setCoin(int coin) {
		this.coin = coin;
	}

	public int [] getPlayer() {
		return player;
	}

	public void setPlayer(int [] player) {
		this.player = player;
	}

}
