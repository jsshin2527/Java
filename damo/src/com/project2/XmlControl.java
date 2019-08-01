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

			// for - id ��ġ Ȯ��
			for (int i = 0; i < items.getLength(); i++) {

				Node node = items.item(i);

				NamedNodeMap map = node.getAttributes();

				out = map.getNamedItem("id").getNodeValue();

				// �Է¹��� �ֹ���ȣ�� xml�� ����� id�� ��ġ�ϸ� ����
				if (removeOrderNO == Integer.parseInt(out)) {

					if (Completeflag)
						resultXmlCreate(node);

					root.removeChild(node);
					// System.out.println("���� : " + out + " " + removeOrderNO);

					// ����� ���� ����
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
			doc.setXmlStandalone(true); // standalone="no" �� �����ش�.

			// orderlist ������Ʈ
			Element orderlist = doc.createElement("orderlist");
			doc.appendChild(orderlist);

			Iterator<ClientVO> it = list.iterator();

			int i = 1;

			while (it.hasNext()) {

				ClientVO vo = it.next();

				// System.out.println(vo.toString());
				// order ������Ʈ
				Element order = doc.createElement("order");
				orderlist.appendChild(order);

				// �Ӽ��� ���� (id:1)
				order.setAttribute("id", Integer.toString(i));

				// menu ������Ʈ
				Element menu = doc.createElement("menu");
				menu.appendChild(doc.createTextNode(vo.getCoffee()));
				// menu.appendChild(doc.createTextNode("�ƾ�"));
				order.appendChild(menu);

				// hotice ������Ʈ
				Element hotice = doc.createElement("hotice");
				hotice.appendChild(doc.createTextNode(vo.getHotice()));
				// hotice.appendChild(doc.createTextNode("hot"));
				order.appendChild(hotice);

				// size ������Ʈ
				Element size = doc.createElement("size");
				size.appendChild(doc.createTextNode(vo.getSize()));
				// size.appendChild(doc.createTextNode("tall"));
				order.appendChild(size);

				// count ������Ʈ
				Element count = doc.createElement("count");
				count.appendChild(doc.createTextNode(vo.getQuantity()));
				// count.appendChild(doc.createTextNode("3"));
				order.appendChild(count);

				// price ������Ʈ
				Element price = doc.createElement("price");
				price.appendChild(doc.createTextNode(Integer.toString(vo.getLastprice())));
				// price.appendChild(doc.createTextNode("5000"));
				order.appendChild(price);

				i++;
			}

			// XML ���Ϸ� ����
			TransformerFactory transformerFactory = TransformerFactory.newInstance();

			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4"); // ���� �����̽�4ĭ
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes"); // �鿩����
			transformer.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC, "yes"); // doc.setXmlStandalone(true); ������ �پ
																				// ��µǴºκ� ����

			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new FileOutputStream(new File(createPath)));

			transformer.transform(source, result);

			// System.out.println("=========END=========");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
