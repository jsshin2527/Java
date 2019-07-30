package com.JavaProject;

import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XML_Paring {

	public static void main(String[] args) {
		
		try {

			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = f.newDocumentBuilder();
			Document xmlDoc = null;
			
			
			String key = "434a45646674623038316472435579";
			
			//출력할 리스트 갯수 
			String listCount = "1000";
			String url = "http://openapi.seoul.go.kr:8088/"+key+"/xml/coffeeShopInfo/1/"+listCount;
			//xmlDoc = parser.parse(url);

			if(url.indexOf("http://") != -1) {
				URL u = new URL(url);
				InputStream is = u.openStream();
				xmlDoc = parser.parse(is);
			}else {
				xmlDoc = parser.parse(url);
			}
			
			//System.out.println("Root Element : "+xmlDoc.getDocumentElement().getNodeName());
			
			String[] str = new String[1001];
			String[] out1 = new String[1001];
			String[] out2 = new String[1001];
			
			Element root = xmlDoc.getDocumentElement();
			
			NodeList nmlist = root.getElementsByTagName("NM");
			NodeList wherelist = root.getElementsByTagName("ADDR_OLD");
			System.out.println("커피숍 이름       가게위치 ");
			
			for (int i = 0; i < nmlist.getLength(); i++) {
				Node node1 = nmlist.item(i);
				Node node2 = wherelist.item(i);
				out1[i] = node1.getFirstChild().getNodeValue();	
				out2[i] = node2.getFirstChild().getNodeValue();
				//System.out.println(out1);
				System.out.println(out1[i]+" :  "+out2[i]);	
			}
			for (int i = 0; i < nmlist.getLength(); i++) {
				
			}		
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}
