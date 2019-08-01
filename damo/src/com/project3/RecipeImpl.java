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
				DocumentBuilder parser = f.newDocumentBuilder(); //DOM 파서로부터 입력받은 파일을 파싱하도록 요청 
				Document xmlDoc = null; 

				//DOM 파서로부터 입력받은 파일을 파싱하도록 요청
				xmlDoc = parser.parse(url);

				//루트 엘리먼트 접근
				Element root = xmlDoc.getDocumentElement();
				//	System.out.println("debug]  " + root.getTagName()); // Grid 나와

				//하위 엘리먼트 접근
				NodeList n1 = root.getElementsByTagName("row"); //                  row > RECIPE_ID
				Node rowNode = n1.item(1); // item(1) => 1번째 row로 설정됨! ,              2로 설정하면 2번째 row
				Element rowElement = (Element)rowNode;
				//System.out.println("debug]  " + rowElement.getTagName()); // <row> 까지 옴


				//속성 접근 안해도 됨 속성 없음

				//				//텍스트 노드(ROW_NUM) 접근
				//				NodeList rowN1 = rowNode.getChildNodes(); 
				//				Node ROW_NUM_Node = rowN1.item(1); // <ROW_NUM>
				//				Element ROW_NUM_Element = (Element)ROW_NUM_Node;
				//				System.out.println(ROW_NUM_Element.getTagName());  // <ROW_NUM>
				//				System.out.println(ROW_NUM_Element.getTextContent()); // 2

				//현재 1번째 row로 설정돼있음!
				String a = rowElement.getElementsByTagName("RECIPE_ID").item(0).getTextContent(); // <RECIPE_ID>의 content 가져옴
				//	System.out.println(rowElement.getElementsByTagName("COOKING_DC").item(0).getTextContent());

				for (int i=0; i<n1.getLength(); i++) { // <row> 태그 갯수만큼 불러와라 

					Node bNode = n1.item(i); // row1부터 row마지막까지 돌려
					Element bElement = (Element)bNode;
					System.out.println(i+1+"단계> "+bElement.getElementsByTagName("COOKING_DC").item(0).getTextContent());



				}

				break;
			}

			int ch;
			while(true) {

				do {
					System.out.println("\n1.다시 검색하기 2.메인으로 가기\n");
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
