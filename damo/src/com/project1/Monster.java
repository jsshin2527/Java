package com.project1;

import java.io.*;
import java.util.*;

public class Monster implements Motion, Serializable {
	private int HP;
	private int MaxHP;
	private int attack;
	private int evasion;
	private String status;
	private boolean alive;


	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getMaxHP() {
		return MaxHP;
	}

	public void setMaxHP(int maxHP) {
		MaxHP = maxHP;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getEvasion() {
		return evasion;
	}

	public void setEvasion(int evasion) {
		this.evasion = evasion;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean getIsAlive() {
		return alive;
	}

	public void setIsAlive(boolean isAlive) {
		this.alive = isAlive;
	}

	@Override
	public void print(Object o) {
	}

	@Override
	public void useItem(Object o1, Object o2, List<String> item) {
	}

	@Override
	public void getItemByMonster(Object o1, List<String> item) {
	}

	@Override
	public boolean criticalJudgement(int critical) {
		return false;
	}

	@Override
	public void attack(Object o1, Object o2) {
	}

	@Override
	public void attackJudgement(Object o1, Object o2) {
	}

	@Override
	public void skill(Object o1, Object o2) {
	}

	@Override
	public void isAlive(Object o) {	
	}
}
