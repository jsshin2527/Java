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

	} // ���⼭ main���� ��������


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] recipe_nm= new String[100];
		try{
			while(true){

				System.out.println("�˻��� ������?");
				String search = sc.nextLine();
				search = search.replace(" ","");
				search = search.replaceAll("�Ұ��","����"); 

				//(�Ʒ�)�ù�
				//String search1 = search.substring(0, 2); 

				//�丶�佺�İ�Ƽ->�丶���ػ깰���İ�Ƽ

				//���ġŲ -> ���ڼ� �´°ɷ� �ִ��� �� 
				//���������, �κξ������,�����䱸��


				String url = "http://211.237.50.150:7080/openapi/abee26697630ba27152152bec571b1ca6bc010152484b554cbe036e00b5d4c65/"
						+"xml/Grid_20150827000000000226_1/1/500"; 

				//				String url = "http://211.237.50.150:7080/openapi/abee26697630ba27152152bec571b1ca6bc010152484b554cbe036e00b5d4c65/xml/"
				//					+"Grid_20150827000000000226_1/1/5?RECIPE_NM_KO=�ᳪ����";



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
				Node rowNode = n1.item(0); // item(1) => 1��° row�� ������! ,              2�� �����ϸ� 2��° row
				Element rowElement = (Element)rowNode;
				//	System.out.println("debug]  " + rowElement.getTagName()); // <row> ���� ��



				int j=0;

				for (int i=0; i<n1.getLength(); i++) { // <row> �±� ������ŭ �ҷ��Ͷ� 

					Node bNode = n1.item(i); // row1���� row���������� ����

					Element bElement = (Element)bNode;

					//System.out.print(bElement.getElementsByTagName("RECIPE_ID").item(0).getTextContent()+". ");
					String str= bElement.getElementsByTagName("RECIPE_NM_KO").item(0).getTextContent(); // �������̺���

					if (str.contains(search)) {


						System.out.print((j+1)+". ");
						System.out.println(str);

						recipe_nm[j] = bElement.getElementsByTagName("RECIPE_ID").item(0).getTextContent(); // �ڵ��ȣ

						j++;

					}
					//				
					//				//�丶�佺�İ�Ƽ -> �丶���ػ깰���İ�Ƽ
					//				
					//				//���ġŲ -> ���ڼ� �´°ɷ� �ִ��� �� 
					//				//���������, �κξ������,�����䱸��
					//				else if (str.contains(search1)) { //str�� ����ڰ� �Է��Ѱ�
					//					
					//					String s = str.substring(str.length()-2, str.length()); // �ѹ� �� ����
					//					if (str.contains(s)) {
					//					
					//					System.out.print((j+1)+". ");
					//					System.out.println(str);
					//
					//					recipe_nm[j] = bElement.getElementsByTagName("RECIPE_ID").item(0).getTextContent(); // �ڵ��ȣ
					//
					//					j++;
					//					}
					//				}



				}

				if(recipe_nm[0]==null) {
					System.out.println("�˻��Ͻ� �����ǰ� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.\n");
					main(null); //�ٽ� ���� 
				}


				break;
			} //..end while

			System.out.println("\n �����Ǹ� ������� ��ȣ�� �Է����ּ��� : ");
			int search = sc.nextInt();

			RecipeImpl ob = new RecipeImpl(recipe_nm[search-1]);



			//Recipe p = new Recipe(recipe_nm[su]); // r�ڸ��� ����su


		} catch (Exception e){	
			e.printStackTrace();
		}	// try~catch end
	}	// main end



}

