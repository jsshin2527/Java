package com.project2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlControl {

	public void removeXml(String removeXmlAddress, int removeOrderNO, boolean Completeflag) {

		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document xmlDoc = null;

			String url = removeXmlAddress;

			if (url.indexOf("http://") != -1) {
				URL u = new URL(url);
				InputStream is = u.openStream();
				xmlDoc = docBuilder.parse(is);
			} else {
				xmlDoc = docBuilder.parse(url);
			}

			Element root = xmlDoc.getDocumentElement();
			NodeList items = root.getElementsByTagName("order");
			String out = "";

			// for - id 일치 확인
			for (int i = 0; i < items.getLength(); i++) {

				Node node = items.item(i);

				NamedNodeMap map = node.getAttributes();

				out = map.getNamedItem("id").getNodeValue();

				// 입력받은 주문번호와 xml에 저장된 id가 일치하면 지움
				if (removeOrderNO == Integer.parseInt(out)) {

					if (Completeflag)
						resultXmlCreate(node);

					root.removeChild(node);
					// System.out.println("삭제 : " + out + " " + removeOrderNO);

					// 변경된 내용 적용
					TransformerFactory transformerFactory = TransformerFactory.newInstance();
					Transformer transformer = transformerFactory.newTransformer();
					DOMSource source = new DOMSource(xmlDoc);
					StreamResult result = new StreamResult(new File(removeXmlAddress));
					transformer.transform(source, result);
				}

			}
			
			items = root.getElementsByTagName("order");

			if (items.getLength() == 0) {
				File file = new File(removeXmlAddress);
				if (file.exists()) {
					file.delete();
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void resultXmlCreate(Node n) {

		String id = "";
		List<String> nodeValueList = new ArrayList<String>();
		ClientVO vo = new ClientVO();
		List<ClientVO> list = new ArrayList<>();

		NodeList nodeList = n.getChildNodes();
		NamedNodeMap map = n.getAttributes();

		id = map.getNamedItem("id").getNodeValue();

		for (int j = 0; j < nodeList.getLength(); j++) {

			Node e = nodeList.item(j);

			if (e.getNodeType() == Node.ELEMENT_NODE) {

				nodeValueList.add(e.getChildNodes().item(0).getNodeValue());

			}
		}

		vo.setCoffee(nodeValueList.get(0));
		vo.setHotice(nodeValueList.get(1));
		vo.setSize(nodeValueList.get(2));
		vo.setQuantity(nodeValueList.get(3));
		vo.setLastprice(nodeValueList.get(4));

		list.add(vo);

		xmlCreate(list, "D:\\doc\\result" + id + ".xml");
	}

	public void xmlCreate(List<ClientVO> list, String createPath) {

		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.newDocument();
			doc.setXmlStandalone(true); // standalone="no" 를 없애준다.

			// orderlist 엘리먼트
			Element orderlist = doc.createElement("orderlist");
			doc.appendChild(orderlist);

			Iterator<ClientVO> it = list.iterator();

			int i = 1;

			while (it.hasNext()) {

				ClientVO vo = it.next();

				// System.out.println(vo.toString());
				// order 엘리먼트
				Element order = doc.createElement("order");
				orderlist.appendChild(order);

				// 속성값 정의 (id:1)
				order.setAttribute("id", Integer.toString(i));

				// menu 엘리먼트
				Element menu = doc.createElement("menu");
				menu.appendChild(doc.createTextNode(vo.getCoffee()));
				// menu.appendChild(doc.createTextNode("아아"));
				order.appendChild(menu);

				// hotice 엘리먼트
				Element hotice = doc.createElement("hotice");
				hotice.appendChild(doc.createTextNode(vo.getHotice()));
				// hotice.appendChild(doc.createTextNode("hot"));
				order.appendChild(hotice);

				// size 엘리먼트
				Element size = doc.createElement("size");
				size.appendChild(doc.createTextNode(vo.getSize()));
				// size.appendChild(doc.createTextNode("tall"));
				order.appendChild(size);

				// count 엘리먼트
				Element count = doc.createElement("count");
				count.appendChild(doc.createTextNode(vo.getQuantity()));
				// count.appendChild(doc.createTextNode("3"));
				order.appendChild(count);

				// price 엘리먼트
				Element price = doc.createElement("price");
				price.appendChild(doc.createTextNode(Integer.toString(vo.getLastprice())));
				// price.appendChild(doc.createTextNode("5000"));
				order.appendChild(price);

				i++;
			}

			// XML 파일로 쓰기
			TransformerFactory transformerFactory = TransformerFactory.newInstance();

			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4"); // 정렬 스페이스4칸
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes"); // 들여쓰기
			transformer.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC, "yes"); // doc.setXmlStandalone(true); 했을때 붙어서
																				// 출력되는부분 개행

			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new FileOutputStream(new File(createPath)));

			transformer.transform(source, result);

			// System.out.println("=========END=========");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
