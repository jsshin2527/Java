package com.day;
/* 
    회원 입력 프로그램 생성하기 
	가장 먼저 변수 명을 생각을 해야 합니다. 
	회원명,성명,나이,사는곳 
	출력값 
	회원명,성명,나이,사는곳 변수 값을 출력해야 한다. 
	입력 값을 받기위해 BufferedReader 클레스에서 member라는 인스턴스(객체를) 생성 합니다.
	변수명 
	name    : 회원 이름 
	sex     : 성별 
	address : 주소 
	age     : 나이 
	email   : 이메일 주소
	Tip 코딩을 할때에는 들여쓰기를 해야한다 
*/

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;

class PrivacyAccount 
{
	public static void main(String[] args) throws IOException
	{

	String membername,memberaddress,membersex,memberemail;
	int memberage;
	BufferedReader member = new BufferedReader (new InputStreamReader(System.in));
	System.out.print("**** 안녕하세요 회원정보를 입력하세요 ****\n");
	System.out.print("회원 명을 입력하세요 : ");
	membername = member.readLine();
	System.out.print("성별 입력하세요 : ");
	membersex = member.readLine();
	System.out.print("주소를 입력하세요 : ");
	memberaddress = member.readLine();
	System.out.print("나이를 입력하세요 : ");
	memberage  = Integer.parseInt(member.readLine());
	System.out.print("이메일 주소를 입력하세요 : ");
	memberemail = member.readLine();
	System.out.println("");
	System.out.println("****입력하신 회원 정보 입니다.****");
	System.out.println(membername+"의 성별은 "+membersex+"입니다.");
	System.out.println(membername+"의 주소는 "+memberaddress+"입니다.");
	System.out.println(membername+"의 나이는 "+memberage+"입니다.");
	System.out.println(membername+"의 이메일 주소는 "+memberemail+"입니다.");
	}
}
