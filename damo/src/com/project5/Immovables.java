package com.project5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class Immovables {
	public static ArrayList<ImmovablesVO> lists = new ArrayList();
	static int resultmoney = 0;
	String pristr = "";
	
	
	//URL을 이용한 검색 메소드
	public ImmovablesVO immovables() {
		ImmovablesVO immovablesVO = new ImmovablesVO();
		
		try {
			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = f.newDocumentBuilder();
			Document xmlDoc = null;
			String xmlresult = null;

			String url="http://data.ipohang.org/openapi/service/officialLandPriceSvc/getNamguOfficialLandPriceList?ServiceKey="
					+ "RPVBoPbFg8Q58GgQbc1H4UhTPveYrxKqx%2FeqqrKJSzP%2Fr5NEtH7SoonHfgPeI5ahmiujMMomq1AdcC5Jg4LZVg%3D%3D" + 
					"&pageNo=1&numOfRows=1";
			
			Scanner sc=new Scanner(System.in);
			String result="";
			String fullres="포항시 남구 ";
			System.out.println("                                      '읍/면/동'을 입력하세요                                       ");			
			System.out.print("=> ");
			result=sc.nextLine();
			if(!(result=="" && result==null))
			{
				url += "&dong=" + URLEncoder.encode(result,"UTF-8");
			}
			immovablesVO.dong=result;
			fullres += result;
			fullres += " ";
			
			System.out.println("                                 '리'를 입력하세요(없을시 공백 입력)                                ");			
			System.out.print("=> ");
			result=sc.nextLine();
			if(!(result=="" && result==null))
				url += "&ri=" + URLEncoder.encode(result,"UTF-8");
			immovablesVO.ri = result;
			fullres += result;
			fullres += " ";
			
			System.out.println("                                        '지번'을 입력하세요                                         ");			
			System.out.print("=> ");
			result = sc.nextLine();
			if(!(result=="" && result==null))
				url += "&jibun=" + result;
			immovablesVO.jibun = result;
			fullres += result;
			// fullres += "-";
			
			System.out.println("                                        '부번'을 입력하세요                                         ");			
			System.out.print("=> ");
			result = sc.nextLine();
			immovablesVO.bubun = result;
			if(!(result=="" && result==null))
			url += "&bubun=" + result;
			fullres += result;
			fullres += "번지 ";
			
			System.out.println("                                    '면적'을 입력해 주세요(m²)                                     ");			
			System.out.print("=> ");
			int rs = sc.nextInt();
			immovablesVO.setArea(rs);
			
			new MenuBar().start();
			Thread.sleep(1000);
			System.out.println();
			System.out.println("                  /*/ "+fullres + "/*/ "+" 공시지가를 확인합니다.");
			Thread.sleep(1000);
			
			
			try {
					new Considering().start();
		            URL url1 = new URL(url);
		            URLConnection conn = url1.openConnection();
		            InputStream is = conn.getInputStream();
		            BufferedReader br = new BufferedReader(new InputStreamReader(is,Charset.forName("UTF-8")));
	
		            char[] buff = new char[1024];
		            int len = -1;
	
		            while( (len = br.read(buff)) != -1) {
		                xmlresult += new String(buff);
		            }
		            br.close();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
			
			xmlDoc=parser.parse(url);
			
			String str = "";
			Element root = xmlDoc.getDocumentElement();
			Node total = root.getElementsByTagName("price").item(0);
			
			if(total!=null) {
			str = total.getFirstChild().getNodeValue();
			
			int resultprice = Integer.parseInt(str)*rs*8/10;
			
			System.out.println("                                  대출 가능 금액 : " + changeToWon(resultprice)+ "원");
			System.out.println();
			System.out.println("+= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = +");
		
			immovablesVO.setResult(resultprice);
			resultmoney += resultprice;
			
			return immovablesVO; // 최종값 return
			
			}else {
				System.out.println("                        해당 주소 값이 없습니다. 다시 입력하세요!");
				return null;
			}
			
		}catch (Exception e) {
			System.out.println("                        해당 주소 값이 없습니다. 다시 입력하세요!");
			return null;
		}
	}
	
	//부동산 관련 진입 메소드
	public void Immovablesset() {
		boolean ss=true;
		while(ss) {
			System.out.println();
			System.out.println("                      1.부동산 추가  2.부동산 확인  3.부동산 삭제  4.대출 진행                       ");			Scanner sc=new Scanner(System.in);
			System.out.print("=> ");
			int k=sc.nextInt();
			switch (k){
			case 1:
				ImmovablesVO imm= this.immovables();
				if(imm!=null) {
				lists.add(imm);
				}
				break;
			case 2:
				viewlists();
				break;
			case 3:
				deletelists();
				break;
			case 4:
				ss=false;
				break;
			}
		}
	}
	
	//삭제하기
	private void deletelists() {
		viewlists();
		
		System.out.println("                           몇번을 삭제하시겠습니까? (0 : 뒤로가기)                                  ");		
		System.out.print("=> ");
		Scanner sc=new Scanner(System.in);

		int k=sc.nextInt();
		if(k!=0) {
			ImmovablesVO vo=(ImmovablesVO) lists.get(k-1);
			resultmoney=resultmoney-vo.getResult();
			lists.remove(k-1);
		}
	}
	
	//보여주기
	private void viewlists() {
		resultmoney=0;
		if(lists!=null) {
			for(int i=0;i<lists.size();i++) {
				ImmovablesVO vo=(ImmovablesVO) lists.get(i);
				System.out.println("              "+(i+1)+"번  "+vo.dong+"(동/읍/리)  "+vo.ri+"(리)  "+vo.jibun+"(지번)  "
						+vo.bubun+"(부번)  "+vo.area+"(면적)  "+vo.result+"(원)");				
				resultmoney+=vo.result;
			}
			System.out.println("                              부동산 합산 가격은 "+changeToWon(resultmoney)+"원 입니다.");
			System.out.println();
			System.out.println("+= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = +");

		}
	}
	private String changeToWon(int money) {
		pristr = "";
		pristr = Integer.toString(money);
		
		StringBuffer sb = new StringBuffer();
		sb.append(pristr);
		int cnt=0;
		int len = sb.length();
		for(int i=len-1; i>=0; i--) // 돈(원화)에 3자리수마다 ,로 표시
		{
			cnt++;
			if(cnt==3 && i != 0)
			{
				sb.insert(i, ",");
				cnt=0;
			}
		}
		pristr = sb.toString();
		return pristr;
	}
	public int getResMon()
	{
		return resultmoney;
	}
}
