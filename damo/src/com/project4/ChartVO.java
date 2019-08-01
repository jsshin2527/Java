package com.project4;

import java.io.Serializable;

public class ChartVO implements Serializable {

	private String name; // 이름
	private String rrn; // 주민등록번호 resident registration number
	private String medhis; // 병력 medical history
	private String famhis; // 가족 병력 family medical history
	private String trthis; // 치료력 treatment history
	private String meddir; // 의료지침서 medical directives
	private String doc; // 주치의
	private int period; // 입원기간

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

		System.out.println("-------------※환자정보※---------------");
		System.out.printf("이름: %4s\n", name);
		System.out.printf("주민등록번호: %4s\n", rrn);
		System.out.printf("병력: %4s\n", medhis);
		System.out.printf("가족 병력: %4s\n", trthis);
		System.out.printf("의료지침서: %4s\n", meddir);
		System.out.printf("주치의: %4s\n", doc);
		System.out.printf("입원기간: %4d\n", period);
		System.out.println();
	}

	@Override
	public String toString() {

		String str;

		str = String.format("%s %n3.주민등록번호(Resident Registration Number)%n %s %n4.병력(Medical History)%n %s %n5.가족병력(Family Medical History)%n %s %n6.치료력(Treatment History)%n %s %n7.의료지침서(Medical Directives)%n %s %n8.주치의%n %s %n9.입원기간%n %d %n",name,rrn,medhis,famhis,trthis,meddir,doc,period);
		
		return str;
	}

}
