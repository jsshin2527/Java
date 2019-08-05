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
	
	
	//URL�� �̿��� �˻� �޼ҵ�
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
			String fullres="���׽� ���� ";
			System.out.println("                                      '��/��/��'�� �Է��ϼ���                                       ");			
			System.out.print("=> ");
			result=sc.nextLine();
			if(!(result=="" && result==null))
			{
				url += "&dong=" + URLEncoder.encode(result,"UTF-8");
			}
			immovablesVO.dong=result;
			fullres += result;
			fullres += " ";
			
			System.out.println("                                 '��'�� �Է��ϼ���(������ ���� �Է�)                                ");			
			System.out.print("=> ");
			result=sc.nextLine();
			if(!(result=="" && result==null))
				url += "&ri=" + URLEncoder.encode(result,"UTF-8");
			immovablesVO.ri = result;
			fullres += result;
			fullres += " ";
			
			System.out.println("                                        '����'�� �Է��ϼ���                                         ");			
			System.out.print("=> ");
			result = sc.nextLine();
			if(!(result=="" && result==null))
				url += "&jibun=" + result;
			immovablesVO.jibun = result;
			fullres += result;
			// fullres += "-";
			
			System.out.println("                                        '�ι�'�� �Է��ϼ���                                         ");			
			System.out.print("=> ");
			result = sc.nextLine();
			immovablesVO.bubun = result;
			if(!(result=="" && result==null))
			url += "&bubun=" + result;
			fullres += result;
			fullres += "���� ";
			
			System.out.println("                                    '����'�� �Է��� �ּ���(m��)                                     ");			
			System.out.print("=> ");
			int rs = sc.nextInt();
			immovablesVO.setArea(rs);
			
			new MenuBar().start();
			Thread.sleep(1000);
			System.out.println();
			System.out.println("                  /*/ "+fullres + "/*/ "+" ���������� Ȯ���մϴ�.");
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
			
			System.out.println("                                  ���� ���� �ݾ� : " + changeToWon(resultprice)+ "��");
			System.out.println();
			System.out.println("+= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = +");
		
			immovablesVO.setResult(resultprice);
			resultmoney += resultprice;
			
			return immovablesVO; // ������ return
			
			}else {
				System.out.println("                        �ش� �ּ� ���� �����ϴ�. �ٽ� �Է��ϼ���!");
				return null;
			}
			
		}catch (Exception e) {
			System.out.println("                        �ش� �ּ� ���� �����ϴ�. �ٽ� �Է��ϼ���!");
			return null;
		}
	}
	
	//�ε��� ���� ���� �޼ҵ�
	public void Immovablesset() {
		boolean ss=true;
		while(ss) {
			System.out.println();
			System.out.println("                      1.�ε��� �߰�  2.�ε��� Ȯ��  3.�ε��� ����  4.���� ����                       ");			Scanner sc=new Scanner(System.in);
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
	
	//�����ϱ�
	private void deletelists() {
		viewlists();
		
		System.out.println("                           ����� �����Ͻðڽ��ϱ�? (0 : �ڷΰ���)                                  ");		
		System.out.print("=> ");
		Scanner sc=new Scanner(System.in);

		int k=sc.nextInt();
		if(k!=0) {
			ImmovablesVO vo=(ImmovablesVO) lists.get(k-1);
			resultmoney=resultmoney-vo.getResult();
			lists.remove(k-1);
		}
	}
	
	//�����ֱ�
	private void viewlists() {
		resultmoney=0;
		if(lists!=null) {
			for(int i=0;i<lists.size();i++) {
				ImmovablesVO vo=(ImmovablesVO) lists.get(i);
				System.out.println("              "+(i+1)+"��  "+vo.dong+"(��/��/��)  "+vo.ri+"(��)  "+vo.jibun+"(����)  "
						+vo.bubun+"(�ι�)  "+vo.area+"(����)  "+vo.result+"(��)");				
				resultmoney+=vo.result;
			}
			System.out.println("                              �ε��� �ջ� ������ "+changeToWon(resultmoney)+"�� �Դϴ�.");
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
		for(int i=len-1; i>=0; i--) // ��(��ȭ)�� 3�ڸ������� ,�� ǥ��
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
