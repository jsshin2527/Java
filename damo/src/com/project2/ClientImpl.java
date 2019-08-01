package com.project2;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
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

public class ClientImpl extends Thread implements Client, FileFilter {

	Scanner sc = new Scanner(System.in);

	List<ClientVO> lists = new ArrayList<>();
	XmlControl xmlCon = new XmlControl();
	SirenorderThread st = new SirenorderThread();
	SirenorderThread1 st1 = new SirenorderThread1();

	File file;

	public ClientImpl() {
		file = new File("d:\\doc");
	}

	@Override
	public void input() throws Exception {

		int num = 0;
		ClientVO vo = new ClientVO();

		try {
			
			while (true) {
				
				System.out.print("A.메뉴\n\n 1.에스프레소(2000), 2.아메리카노(3000), 3.카페라떼(4000), 4.카라멜마키아또(5000), 0.취소");
				num = sc.nextInt();
				if(num>=5) {
					throw new Exception();
					
				}
				
				if (num < 5 && num > 0) {
					vo.setCoffee(num);
				} else if (num == 0) {
					continue;
				}
				
				System.out.print("\n\nB.HOT/ICE\n\n 1.HOT, 2.ICE(+500) 0.취소");
				num = sc.nextInt();
				if(num>=3) {
					throw new Exception();
				}
				if (num < 3 && num > 0)
					vo.setHotice(num);
				if (num == 0)
					continue;

				System.out.print("\n\nC.SIZE\n\n 1.Tall, 2.Grande(+500), 3.Venti(+1000), 0.취소");
				num = sc.nextInt();
				if(num>=4) {
					throw new Exception();
				}
				if (num < 4 && num > 0)
					vo.setSize(num);
				if (num == 0)
					continue;

				System.out.print("\n\n수량\n\n 1.수량입력, 0.취소");
				num = sc.nextInt();
				if(num>=2) {
					throw new Exception();
				}
				if (num == 0)
					continue;
				System.out.print("\n수량: ");
				vo.setQuantity(sc.next());

				System.out.println("\n\n주문완료 하시겠습니까? 1.주문완료 0.취소");
				num = sc.nextInt();
				if (num == 0)
					continue;

				break;

			}

		} catch (Exception e) {
			System.out.println("정확한 숫자를 입력하세요");
			return;
		}

		vo.setLastprice();
		lists.add(vo);

		xmlCon.xmlCreate(lists, "d:\\doc\\order.xml");

		return;
	}

	@Override
	public void print() {

		try {

			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = f.newDocumentBuilder();
			Document xmlDoc = null;

			String str = "";
			String id = "";
			int num = 0;
			
			if (file.isDirectory()) {

				File[] lists = file.listFiles(this);
				for (int i = 0; i < lists.length; i++) {

					if (lists[i].getName().indexOf("result") > -1) {
						xmlDoc = parser.parse("D:\\doc\\" + lists[i].getName());
						num++;
						
						
						Element root = xmlDoc.getDocumentElement();
						NodeList items = root.getElementsByTagName("order");

						for (int l = 0; l < items.getLength(); l++) {

							Node node = items.item(l);
							NodeList nodeList = node.getChildNodes();

							NamedNodeMap map = node.getAttributes();

							//id += map.getNamedItem("id").getNodeValue();
							id+= num;
							for (int j = 0; j < nodeList.getLength(); j++) {

								Node e = nodeList.item(j);

								if (e.getNodeType() == node.ELEMENT_NODE) {

									str = e.getChildNodes().item(0).getNodeValue();
									id += " " + str;

								}
							}

							id += "\n";

						}
					}
				}

				System.out.println(id);

			}

		} catch (Exception e) {

		}

	}

	@Override
	public boolean accept(File pathname) {
		return pathname.isFile() || pathname.isDirectory();
	}

	@Override
	public void write() {

		Iterator<ClientVO> it = lists.iterator();

		while (it.hasNext()) {

			ClientVO vo = it.next();

			System.out.println(vo.toString());

		}

	}

}