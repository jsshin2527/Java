package com.project3;

import java.util.Random;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Recipe_name {

	public Recipe_name() {

		main(null);

	} // 여기서 main으로 보내야함


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] recipe_nm= new String[100];
		try{
			while(true){

				System.out.println("검색할 레시피?");
				String search = sc.nextLine();
				search = search.replace(" ","");
				search = search.replaceAll("소고기","쇠고기"); 

				//(아래)시범
				//String search1 = search.substring(0, 2); 

				//토마토스파게티->토마토해산물스파게티

				//양념치킨 -> 글자수 맞는걸로 최대한 비교 
				//묵과양념장, 두부양념조림,고등어양념구이


				String url = "http://211.237.50.150:7080/openapi/abee26697630ba27152152bec571b1ca6bc010152484b554cbe036e00b5d4c65/"
						+"xml/Grid_20150827000000000226_1/1/500"; 

				//				String url = "http://211.237.50.150:7080/openapi/abee26697630ba27152152bec571b1ca6bc010152484b554cbe036e00b5d4c65/xml/"
				//					+"Grid_20150827000000000226_1/1/5?RECIPE_NM_KO=콩나물밥";



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
				Node rowNode = n1.item(0); // item(1) => 1번째 row로 설정됨! ,              2로 설정하면 2번째 row
				Element rowElement = (Element)rowNode;
				//	System.out.println("debug]  " + rowElement.getTagName()); // <row> 까지 옴



				int j=0;

				for (int i=0; i<n1.getLength(); i++) { // <row> 태그 갯수만큼 불러와라 

					Node bNode = n1.item(i); // row1부터 row마지막까지 돌려

					Element bElement = (Element)bNode;

					//System.out.print(bElement.getElementsByTagName("RECIPE_ID").item(0).getTextContent()+". ");
					String str= bElement.getElementsByTagName("RECIPE_NM_KO").item(0).getTextContent(); // 쇠고기양송이볶음

					if (str.contains(search)) {


						System.out.print((j+1)+". ");
						System.out.println(str);

						recipe_nm[j] = bElement.getElementsByTagName("RECIPE_ID").item(0).getTextContent(); // 코드번호

						j++;

					}
					//				
					//				//토마토스파게티 -> 토마토해산물스파게티
					//				
					//				//양념치킨 -> 글자수 맞는걸로 최대한 비교 
					//				//묵과양념장, 두부양념조림,고등어양념구이
					//				else if (str.contains(search1)) { //str이 사용자가 입력한거
					//					
					//					String s = str.substring(str.length()-2, str.length()); // 한번 더 필터
					//					if (str.contains(s)) {
					//					
					//					System.out.print((j+1)+". ");
					//					System.out.println(str);
					//
					//					recipe_nm[j] = bElement.getElementsByTagName("RECIPE_ID").item(0).getTextContent(); // 코드번호
					//
					//					j++;
					//					}
					//				}



				}

				if(recipe_nm[0]==null) {
					System.out.println("검색하신 레시피가 존재하지 않습니다. 다시 입력해주세요.\n");
					main(null); //다시 메인 
				}


				break;
			} //..end while

			System.out.println("\n 레시피를 보고싶은 번호를 입력해주세요 : ");
			int search = sc.nextInt();

			RecipeImpl ob = new RecipeImpl(recipe_nm[search-1]);



			//Recipe p = new Recipe(recipe_nm[su]); // r자리에 랜덤su


		} catch (Exception e){	
			e.printStackTrace();
		}	// try~catch end
	}	// main end



}

