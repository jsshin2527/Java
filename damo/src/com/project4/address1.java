package com.project4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class address1 {

	public void address() {

		try {

			BufferedReader br = null;
			ArrayList<String> list = new ArrayList<>();

			// String urlstr =
			// "http://apis.data.go.kr/B552657/HsptlAsembySearchService/getHsptlMdcncListInfoInqire?"
			// +
			// "Q0=%EC%84%9C%EC%9A%B8%ED%8A%B9%EB%B3%84%EC%8B%9C&Q1=%EC%A2%85%EB%A1%9C%EA%B5%AC&QZ=A&ORD=ADDR&pageNo=1&numOfRows=30"+
			// "&ServiceKey=8C6CKbKyCJVytbJ7cGiWgM%2BudEtym9v0%2F%2BVmp3pqU4XftEcEJaRNmjNVFFFEIx8PZxgVgA%2BifIi6UK1UzkL2mA%3D%3D";

			String urlstr = "http://apis.data.go.kr/B552657/HsptlAsembySearchService/getHsptlMdcncFullDown?"
					+ "pageNo=1&numOfRows=500"
					+ "&ServiceKey=8C6CKbKyCJVytbJ7cGiWgM%2BudEtym9v0%2F%2BVmp3pqU4XftEcEJaRNmjNVFFFEIx8PZxgVgA%2BifIi6UK1UzkL2mA%3D%3D";

			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = f.newDocumentBuilder();

			Document xmlDoc = null;

			if (urlstr.indexOf("http://") != -1) {

				URL u = new URL(urlstr);
				InputStream is = u.openStream();
				xmlDoc = parser.parse(is);

			} else {
				xmlDoc = parser.parse(urlstr); // url 주소를 파싱한다

			}

			String out = "";

			Element root = xmlDoc.getDocumentElement();


			NodeList itemlist = root.getElementsByTagName("item");

			for (int i = 0; i < itemlist.getLength(); i++) { // item 총 갯수

				Node item = itemlist.item(i);

				NodeList elementList = item.getChildNodes();

				for (int j = 0; j < elementList.getLength(); j++) {

					Node e = elementList.item(j);

					if (e.getNodeName().equals("dutyAddr")) {

						if (e.getNodeType() == Node.ELEMENT_NODE) {

							out += e.getChildNodes().item(0).getNodeValue();
						}
					}
					if (e.getNodeName().equals("dutyName")) {

						if (e.getNodeType() == Node.ELEMENT_NODE) {
							out += " 이름: " + e.getChildNodes().item(0).getNodeValue();
						}
					} else
						continue;
					list.add(out);
					out = "";
				}

			}

			File ff = new File("d:\\doc\\hospital\\address.txt");

			if (!ff.exists()) {
				if (!ff.getParentFile().exists())
					ff.getParentFile().mkdirs();
			}

			FileOutputStream fos = new FileOutputStream("d:\\doc\\hospital\\address.txt", true);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(list);

		} catch (Exception e) {
			// System.out.println(e.getMessage());
		}

	}

	public void name() {

		try {

			ArrayList<String> list = new ArrayList<>();

			String file = "d:\\doc\\hospital\\address.txt";
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);

			list = (ArrayList<String>) ois.readObject();

			String str;

			Scanner sc = new Scanner(System.in);

			System.out.print("주소를 입력하세요: ");
			str = sc.nextLine(); // 주소(시구)

			Iterator<String> it = list.iterator();

			while (it.hasNext()) {

				String ss = it.next();
				if (ss.startsWith(str)) {
					System.out.println(ss+"\n");
				}

			}
			
			new Main();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
