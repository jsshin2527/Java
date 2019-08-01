package com.project3;


import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class RecipeImpl {
	
	static String search="";
	
	public RecipeImpl() {
	}
	
	public RecipeImpl(String s) {
		search = s;
		main(null);
	}
	


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		try{
			while(true){
				//http://211.237.50.150:7080/openapi/abee26697630ba27152152bec571b1ca6bc010152484b554cbe036e00b5d4c65
				//      /xml/Grid_20150827000000000228_1/1/5?RECIPE_ID=3
				String url = "http://211.237.50.150:7080/openapi/"
						+"abee26697630ba27152152bec571b1ca6bc010152484b554cbe036e00b5d4c65/xml/Grid_20150827000000000228_1/1/5?"
						+"RECIPE_ID="+search;


				DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
				DocumentBuilder parser = f.newDocumentBuilder(); //DOM �ļ��κ��� �Է¹��� ������ �Ľ��ϵ��� ��û 
				Document xmlDoc = null; 

				//DOM �ļ��κ��� �Է¹��� ������ �Ľ��ϵ��� ��û
				xmlDoc = parser.parse(url);

				//��Ʈ ������Ʈ ����
				Element root = xmlDoc.getDocumentElement();
				//	System.out.println("debug]  " + root.getTagName()); // Grid ����

				//���� ������Ʈ ����
				NodeList n1 = root.getElementsByTagName("row"); //                  row > RECIPE_ID
				Node rowNode = n1.item(1); // item(1) => 1��° row�� ������! ,              2�� �����ϸ� 2��° row
				Element rowElement = (Element)rowNode;
				//System.out.println("debug]  " + rowElement.getTagName()); // <row> ���� ��


				//�Ӽ� ���� ���ص� �� �Ӽ� ����

				//				//�ؽ�Ʈ ���(ROW_NUM) ����
				//				NodeList rowN1 = rowNode.getChildNodes(); 
				//				Node ROW_NUM_Node = rowN1.item(1); // <ROW_NUM>
				//				Element ROW_NUM_Element = (Element)ROW_NUM_Node;
				//				System.out.println(ROW_NUM_Element.getTagName());  // <ROW_NUM>
				//				System.out.println(ROW_NUM_Element.getTextContent()); // 2

				//���� 1��° row�� ����������!
				String a = rowElement.getElementsByTagName("RECIPE_ID").item(0).getTextContent(); // <RECIPE_ID>�� content ������
				//	System.out.println(rowElement.getElementsByTagName("COOKING_DC").item(0).getTextContent());

				for (int i=0; i<n1.getLength(); i++) { // <row> �±� ������ŭ �ҷ��Ͷ� 

					Node bNode = n1.item(i); // row1���� row���������� ����
					Element bElement = (Element)bNode;
					System.out.println(i+1+"�ܰ�> "+bElement.getElementsByTagName("COOKING_DC").item(0).getTextContent());



				}

				break;
			}

			int ch;
			while(true) {

				do {
					System.out.println("\n1.�ٽ� �˻��ϱ� 2.�������� ����\n");
					ch = sc.nextInt();
				}while(ch<1 || ch>2);
				
				switch(ch) {

				case 1: 
					Recipe_name ob1 = new Recipe_name();
					break;
				/*case 2: 
					Market ob2 = new Market();
					break;*/
				case 2:
					Main ob3 = new Main();
					break;
				//case 3: ob.save(); System.exit(0); break;

				}

			} //..end while

		} catch (Exception e){	
			e.printStackTrace();
		}	// try~catch end
	}	// main end
}
