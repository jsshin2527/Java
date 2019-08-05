package XML;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*
 * XML 
 * 만드는 목적은 하드웨어의 영향을 받지않는 언어의 표준을 만들었습니다. 
 * 
 */
public class XML_Define {

	public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
	
		 DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
		 DocumentBuilder parser = f.newDocumentBuilder();
		 
		 Document xmlDoc = null;
		 String url = "book.xml";
		 
		 if(url.indexOf("http://")!= -1) {
			 
			 URL u = new URL(url);
			 InputStream is = u.openStream();
			 xmlDoc = parser.parse(is); 
		 }else {
			 xmlDoc = parser.parse(url);
		 }
		 
	    // Element : xml 에서 문서를읽어오기 위해 사용 
		 Element root = xmlDoc.getDocumentElement();
		 System.out.println(root.getTagName());
		 
		 // Node : 각 요소를 읽고 쓰기위해 사용
		 Node book1 = root.getElementsByTagName("book").item(0);
		 System.out.println(((Element)book1).getAttribute("kind"));
		 
		 Node title = book1.getFirstChild();
		 //System.out.println("tset123 "+title.getNodeValue());
		 //System.out.println(((Element)title).getNodeValue());
		 Node title1 = title.getNextSibling();
		 Node title1_1 = title1.getFirstChild();
		 System.out.println(title1_1.getNodeValue());
		 
		 //------------------------------------------------------------------
		 
		 NodeList books = root.getElementsByTagName("book");
		 
		 String str = "";
		 String out = "";
		 for (int i = 0; i < books.getLength(); i++) {
			 Node book = books.item(i);	 
			 str = book.getNodeName();
			 out += "노드명: "+str;
			 NamedNodeMap bookMap = book.getAttributes();
			 str = bookMap.getNamedItem("kind").getNodeValue();
			 out+=" kind :" + str;
			 NodeList elementList = book.getChildNodes();
			 for (int j = 0; j < elementList.getLength(); j++) {
				Node e = elementList.item(j);
				str = "";
				if(e.getNodeType() == Node.ELEMENT_NODE) {
					str = "," + e.getNodeName();
					out += str + ":";
					out += e.getChildNodes().item(0).getNodeValue();
				}
			 }
			 out += "\n";
			 
		 }
		 System.out.println(out);	 
	}
}
