package com.project3;

//네이버 검색
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
 * 네이버 쇼핑 랭킹순으로 보여줌 (top10개)
 *  + 최저가로 보여줌 
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

			//System.out.println("debug]"+id+"의 파일이 존재합니다");
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
			//System.out.println("debug]"+id+"의 파일이 존재하지 않습니다");
			lists = new ArrayList<>();
		}
	} //......end MarketSearch() 


	public void set(String food) {

		this.foods = food; 

	}

	public void Searching() {
		
		Scanner sc = new Scanner(System.in);

		String clientId = "VkXABDBOJykvMlDZslTj"; //애플리케이션 클라이언트 아이디값";
		String clientSecret = "UZkgvBSz8k"; //애플리케이션 클라이언트 시크릿값";

		System.out.println();
		
		try {
			
			String text = URLEncoder.encode(foods, "UTF-8");
			//String apiURL = "https://openapi.naver.com/v1/search/shop?query="+ text; // json 결과
			String apiURL = "https://openapi.naver.com/v1/search/shop.xml?query="+ text; // xml 결과
			//파싱할 url 지정(api키 포함해서)

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

			//GET 호출 제대로 갔는지 확인 
			int responseCode = con.getResponseCode();
			BufferedReader br;

			if(responseCode==200) { // 정상 호출
				xmlDoc = parser.parse(con.getInputStream());
			} else {  // 에러 발생
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}

			Element root = xmlDoc.getDocumentElement(); //최상위 노드

			NodeList items =  //item node들 불러옴
					root.getElementsByTagName("item");
			
			List<MarketVO> imsi = new ArrayList<>(); //결과데이터 담을 리스트 (나중에 리스트로 해야할 것 같으면 이거로 하기)
			String str = "";
			String newText = ""; 

			for(int i=0; i<items.getLength(); i++) {

				Node node = items.item(i); // <item>[0] 번부터 불러오기
				NodeList nodeList = node.getChildNodes();
				//NamedNodeMap map = node.getAttributes();

				MarketVO vo = new MarketVO();

				System.out.print("["+ (i+1) + "번 상품] ");

				for(int j=0; j<nodeList.getLength(); j++) { //<title>,<lprice>...불러오기
					Node e = nodeList.item(j);
					String value = e.getNodeName(); // <title 나와야함>


					if(value.equals("title")) {
						str = e.getTextContent();
						newText = str .replaceAll("<(/)?([a-zA-Z]*)(\\s[a-zA-Z]*=[^>]*)?(\\s)*(/)?>", ""); 
						//<br></br>제거
						vo.setTitle(newText);
					}

					if(value.equals("link")) vo.setLink(e.getTextContent());
					if(value.equals("mallName")) vo.setMallName(e.getTextContent());
					if(value.equals("lprice")) vo.setLprice(e.getTextContent());

				}

				imsi.add(vo);
				System.out.println(vo.toString());
			}

			//*******장바구니로 잇기********
			System.out.print("-----> 장바구니에 담을 상품: ");
			int su= sc.nextInt(); // 1~10사이만 입력 가능하게끔 처리
			//2번 입력

			int n=0, tot=0;

			Iterator<MarketVO> it = imsi.iterator();  

			while (it.hasNext()) {
				n++;
				MarketVO vo = it.next();

				if(n==su) {
					writeFile(vo);
					//System.out.println("debug] 총 가격: "+Integer.parseInt(vo.getLprice()));
					Cart c = new Cart(id);
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	} //....end main
	
	public void writeFile(MarketVO vo) {	//파일저장

		try {

			if(lists!=null) {
			    lists.add(vo);
			    
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);

				oos.writeObject(lists);

				fos.close();
				oos.close();

				System.out.println("장바구니에 담기 성공!");

			}

		} catch (Exception e) {
			
		}
	} //...end writeFile
}