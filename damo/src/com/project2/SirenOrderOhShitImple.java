package com.project2;

import java.awt.Menu;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SirenOrderOhShitImple extends Thread implements SirenOrderOhShitInter{

	Scanner sc = new Scanner(System.in);
	XmlControl xmlCon = new XmlControl();
	List<ClientVO> lists = new ArrayList<>();
	

	@Override
	public void input() {

		Scanner sc = new Scanner(System.in);

		ClientVO cv = new ClientVO();
		
		SirenorderThread st = new SirenorderThread();
		
		try {
			
			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();

			DocumentBuilder parser = f.newDocumentBuilder();

			Document xmlDoc = null;

			String url = "D:\\doc\\order.xml";

			if (url.indexOf("http://") != -1) {

				URL u = new URL(url);
				InputStream is = u.openStream();
				xmlDoc = parser.parse(is);

			}
			else {

				xmlDoc = parser.parse(url);

			}

			String str = "";
			String out = "";

			Element root = xmlDoc.getDocumentElement();

			// 진교형 파일 =============================

			NodeList orders = root.getElementsByTagName("order");

			int num = 0;

				System.out.println("                      =====Ready For Order=====");
				System.out.println();

				for (int i = 0; i < orders.getLength(); i++) {

					Node order = orders.item(i);

					str = order.getNodeName();

					// ===============================================

					NamedNodeMap orderMap = order.getAttributes();

					str = orderMap.getNamedItem("id").getNodeValue();

					out += "\nN0." + str;
					out += "\n";
					
					
					NodeList elementList = order.getChildNodes();

					// ================================================

					for (int j = 0; j < elementList.getLength(); j++) {

						Node e = elementList.item(j);

						str = "";

						if (e.getNodeType() == Node.ELEMENT_NODE) {

							str = "  " + e.getNodeName();
							out += str + ":";
							out += e.getChildNodes().item(0).getNodeValue();
							
						}
						// 요부분????????????????????????????????????????????????????????
					}
					
					out += "\n";
				}

				System.out.println("                      1. Making 2. Exit");
				num = sc.nextInt(                      );
				
				if(num > 2) {
					
					System.out.println("                             You Got A Wrong Number");
					System.out.println();
					
				}//else if(out == "") {
					
					//System.out.println("Wrong Number");
					
				//}
				
				else if(out != "") {
					
					System.out.println("                      ================================");
					
					System.out.println(out);

					System.out.println("                      =====Starting Order Number=====");
					num = sc.nextInt(                      );
					
					// 스레드로 주문완료되는 것 보여줄거임===================================
					
					System.out.println("\t\t\t " + num + " :" + " Numbe" + "r Coffee Making");
					System.out.println();

					st.sirenorderThread();
					
					//System.out.print("Please Wait");
					//for (int i = 0; i < 3; i++) {
						//System.out.print("...");
						//Thread.sleep(777);
					
					//////////////////////////
					
					xmlCon.removeXml(url, num, true);
					
					//////////////////////////
					System.out.println();
					System.out.println("                      Pick Up Your Coffee");
					System.out.println();

					for (int i = 0; i < 3; i++) {
						System.out.print("");
						Thread.sleep(100);
					
					}
			
				}else if (out == ""){
					
					System.out.println();
					System.out.println("                      =========No Order=========");
					System.out.println();
					
				}

		} catch (Exception e) {

			
			
		}
	}

	@Override
	public void print() {
		
		System.out.println("                      ========Work Done!========");
			
		}
		
	}

