package com.project3;

//���̹� �˻�
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLEventFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
/*
 * ���̹� ���� ��ŷ������ ������ (top10��)
 *  + �������� ������ 
 */

public class MarketSearch {

	private static String id = "";
	private static String foods = "";

	List<MarketVO> lists = null;
	File f; 

	@SuppressWarnings("unchecked")
	public MarketSearch(String id) {

		this.id = id; 

		f = new File("C:\\Users\\stu\\Desktop\\"+id+".txt");

		if(f.exists()) {

			//System.out.println("debug]"+id+"�� ������ �����մϴ�");
			try {
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);

				lists = new ArrayList<MarketVO>();  
				lists = (ArrayList<MarketVO>)ois.readObject();

				fis.close();
				ois.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}else {
			//System.out.println("debug]"+id+"�� ������ �������� �ʽ��ϴ�");
			lists = new ArrayList<>();
		}
	} //......end MarketSearch() 


	public void set(String food) {

		this.foods = food; 

	}

	public void Searching() {
		
		Scanner sc = new Scanner(System.in);

		String clientId = "VkXABDBOJykvMlDZslTj"; //���ø����̼� Ŭ���̾�Ʈ ���̵�";
		String clientSecret = "UZkgvBSz8k"; //���ø����̼� Ŭ���̾�Ʈ ��ũ����";

		System.out.println();
		
		try {
			
			String text = URLEncoder.encode(foods, "UTF-8");
			//String apiURL = "https://openapi.naver.com/v1/search/shop?query="+ text; // json ���
			String apiURL = "https://openapi.naver.com/v1/search/shop.xml?query="+ text; // xml ���
			//�Ľ��� url ����(apiŰ �����ؼ�)

			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);

			DocumentBuilderFactory dom =
					DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = 
					dom.newDocumentBuilder();
			Document xmlDoc = null;

			//GET ȣ�� ����� ������ Ȯ�� 
			int responseCode = con.getResponseCode();
			BufferedReader br;

			if(responseCode==200) { // ���� ȣ��
				xmlDoc = parser.parse(con.getInputStream());
			} else {  // ���� �߻�
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}

			Element root = xmlDoc.getDocumentElement(); //�ֻ��� ���

			NodeList items =  //item node�� �ҷ���
					root.getElementsByTagName("item");
			
			List<MarketVO> imsi = new ArrayList<>(); //��������� ���� ����Ʈ (���߿� ����Ʈ�� �ؾ��� �� ������ �̰ŷ� �ϱ�)
			String str = "";
			String newText = ""; 

			for(int i=0; i<items.getLength(); i++) {

				Node node = items.item(i); // <item>[0] ������ �ҷ�����
				NodeList nodeList = node.getChildNodes();
				//NamedNodeMap map = node.getAttributes();

				MarketVO vo = new MarketVO();

				System.out.print("["+ (i+1) + "�� ��ǰ] ");

				for(int j=0; j<nodeList.getLength(); j++) { //<title>,<lprice>...�ҷ�����
					Node e = nodeList.item(j);
					String value = e.getNodeName(); // <title ���;���>


					if(value.equals("title")) {
						str = e.getTextContent();
						newText = str .replaceAll("<(/)?([a-zA-Z]*)(\\s[a-zA-Z]*=[^>]*)?(\\s)*(/)?>", ""); 
						//<br></br>����
						vo.setTitle(newText);
					}

					if(value.equals("link")) vo.setLink(e.getTextContent());
					if(value.equals("mallName")) vo.setMallName(e.getTextContent());
					if(value.equals("lprice")) vo.setLprice(e.getTextContent());

				}

				imsi.add(vo);
				System.out.println(vo.toString());
			}

			//*******��ٱ��Ϸ� �ձ�********
			System.out.print("-----> ��ٱ��Ͽ� ���� ��ǰ: ");
			int su= sc.nextInt(); // 1~10���̸� �Է� �����ϰԲ� ó��
			//2�� �Է�

			int n=0, tot=0;

			Iterator<MarketVO> it = imsi.iterator();  

			while (it.hasNext()) {
				n++;
				MarketVO vo = it.next();

				if(n==su) {
					writeFile(vo);
					//System.out.println("debug] �� ����: "+Integer.parseInt(vo.getLprice()));
					Cart c = new Cart(id);
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	} //....end main
	
	public void writeFile(MarketVO vo) {	//��������

		try {

			if(lists!=null) {
			    lists.add(vo);
			    
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);

				oos.writeObject(lists);

				fos.close();
				oos.close();

				System.out.println("��ٱ��Ͽ� ��� ����!");

			}

		} catch (Exception e) {
			
		}
	} //...end writeFile
}