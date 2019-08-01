package com.project4;

import java.io.Serializable;

public class ChartVO implements Serializable {

	private String name; // �̸�
	private String rrn; // �ֹε�Ϲ�ȣ resident registration number
	private String medhis; // ���� medical history
	private String famhis; // ���� ���� family medical history
	private String trthis; // ġ��� treatment history
	private String meddir; // �Ƿ���ħ�� medical directives
	private String doc; // ��ġ��
	private int period; // �Կ��Ⱓ

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

	public String getMedhis() {
		return medhis;
	}

	public void setMedhis(String medhis) {
		this.medhis = medhis;
	}

	public String getFamhis() {
		return famhis;
	}

	public void setFamhis(String famhis) {
		this.famhis = famhis;
	}

	public String getTrthis() {
		return trthis;
	}

	public void setTrthis(String trthis) {
		this.trthis = trthis;
	}

	public String getMeddir() {
		return meddir;
	}

	public void setMeddir(String meddir) {
		this.meddir = meddir;
	}

	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public void print() {

		System.out.println("-------------��ȯ��������---------------");
		System.out.printf("�̸�: %4s\n", name);
		System.out.printf("�ֹε�Ϲ�ȣ: %4s\n", rrn);
		System.out.printf("����: %4s\n", medhis);
		System.out.printf("���� ����: %4s\n", trthis);
		System.out.printf("�Ƿ���ħ��: %4s\n", meddir);
		System.out.printf("��ġ��: %4s\n", doc);
		System.out.printf("�Կ��Ⱓ: %4d\n", period);
		System.out.println();
	}

	@Override
	public String toString() {

		String str;

		str = String.format("%s %n3.�ֹε�Ϲ�ȣ(Resident Registration Number)%n %s %n4.����(Medical History)%n %s %n5.��������(Family Medical History)%n %s %n6.ġ���(Treatment History)%n %s %n7.�Ƿ���ħ��(Medical Directives)%n %s %n8.��ġ��%n %s %n9.�Կ��Ⱓ%n %d %n",name,rrn,medhis,famhis,trthis,meddir,doc,period);
		
		return str;
	}

}
