package com.project6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


public class Play {

	Scanner sc = new Scanner(System.in);
	
	//메뉴
	String[] menu = {"아메리카노","카페라떼","캬라멜마끼아또","카페모카","녹차라떼","핫초코"};
	String[] cake = {"꾸덕꾸덕 초코퍼지","먹다가 5개 순삭 마카롱","찐하다 찐해 뉴욕치케","빨간맛 궁굼해 레드벨벳"};
	
	//손님
	String [] easy = {"황태용 강사님 ★☆☆","친절한 여사님 ★☆☆","백발의 할아버지 ★☆☆"};
	String [] normal = {"삼성맨 ★★☆" , "호호 할머니 ★★☆", "온화한 그녀 ★★☆"};
	String [] hard = {"예민보스 여고생 ★★★", "참을성 없는 꼬마 ★★★", "술주정뱅이 ★★★"};
	Thread th;

	Map<Integer, String[]> map = new HashMap<>();   //메뉴맵
	Map<Integer, String[]> map2 = new HashMap<>();  //게스트맵
	Map<Integer, String[]> map3 = new HashMap<>();  //케�躍�
	Map<String, Integer> map4 = new HashMap<>();    //랭킹 맵

	Player player;

	String[] ame = {"물","원두"};
	String[] latte = {"우유","원두"};
	String[] cal = {"우유","원두","캬라멜"};
	String[] mo = {"우유","원두","초코"};
	String[] green = {"우유","녹차"};
	String[] choco = {"우유","코코아"};
	String[] fudge = {"초콜렛","밀가루","버터","우유"};
	String[] maca = {"슈가파우더","아몬드파우더","달걀흰자"};
	String[] cheese = {"치즈","밀가루","버터","우유"};
	String[] red = {"웬디","아이린","슬기","조이","예린"};

	String[] guest;
	Random rd = new Random(); 

	int num1;                                    //손님이 주문할 메뉴 인덱스를 받음
	int num2;                                    //난이도 인덱스
	int num3;                                    //손님 인덱스
	int num4;
	int s;
	int count;
	boolean flag = false;

	//시작
	public void start(){
		int num;
		map.put(0, ame);
		map.put(1, latte);
		map.put(2, cal);
		map.put(3, mo);
		map.put(4, green);
		map.put(5, choco);

		map2.put(2,easy);
		map2.put(1,normal);
		map2.put(0,hard);

		map3.put(0, fudge);
		map3.put(1, maca);
		map3.put(2, cheese);
		map3.put(3, red);


		System.out.println("\t\t\t\t\t환영합니다!");
		System.out.println("\t\t\t\t\t ┌────────────────┐");
		System.out.println("\t\t\t\t\t │ 1.새로시작하기   2.이어서하기  │");
		System.out.println("\t\t\t\t\t └────────────────┘");
		System.out.print("=>");
		num= sc.nextInt();

		if(num == 1) {
			player = new Player();
			player.setHp(5);
			player.setBean(5);
			System.out.println("사용자의 성함을 입력하세요.");
			System.out.print("=>");
			player.setName(sc.next());

			System.out.println("\t\t\t\t\t"+player.getName()+" 님 환영합니다!");
			th = new Thread(new GuestThread());
			tutorial();
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			th.start();


		}

		if(num == 2) {
			try {
				FileInputStream fis = new FileInputStream("d:\\doc\\player.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);
				player = (Player)ois.readObject();
				fis.close();
				ois.close();

				System.out.println("\t\t\t\t\t오픈!!");


				th = new Thread(new GuestThread());
				th.start();

			} catch (Exception e) {			
				e.printStackTrace();
			}
		}

	}
	//도움말
	public synchronized void tutorial(){

		try {
			System.out.println();
			System.out.println("\t\t\t\t\t< 게임방법 >");
			System.out.println();
			System.out.println("\t\t\t\t게임 시작 후 레시피보기를 누르면 전 메뉴에 필요한 재료를 볼 수 있습니다.");
			System.out.println("\t\t\t\t손님이 입장하고 주문을 받으면 필요한 재료를 입력합니다. ");
			System.out.println();
			Thread.sleep(1000);
			System.out.println("\t\t\t\t등장 손님 이름 옆에 '★' 은 손님의 난이도를 의미하며, ");
			System.out.println("\t\t\t\t손님의 난이도는 기다리는 손님의 인내심과 같습니다.");
			Thread.sleep(1000);
			System.out.println("\t\t\t\t반복적인 오답으로 커피를 만들지 못하면, 손님은 화를 내며 퇴장하고 HP가 줄어듭니다.");
			System.out.println("\t\t\t\tHP 가 0이 되면 게임은 종료됩니다.");
			Thread.sleep(1000);
			System.out.println();
			System.out.println("\t\t\t\t커피를 잘 만들어 판매에 성공하면 돈을 받을 수 있으며, 모은 돈으로 상품을 구매할 수 있습니다.");
			System.out.println();
			System.out.println("\t\t\t\t10000원이 모일 때마다 바리스타 테스트를 볼 수 있으며, 레벨이 오르면 케익메뉴가 열립니다.");
			System.out.println();
			System.out.println("\t\t\t\t카페 오픈!!");

			Thread.sleep(1000);
		}catch(Exception e) {}
	}

	//종료
	public void end(){
		System.out.println("Game Over");
		System.exit(0);
	}

	//주문처리
	public void serve(){

		String[]answer;
		String[]answer2;
		String[] q;
		String[] q2;

		q = map.get(num1);
		q2 = map3.get(num4);

		answer = new String [q.length];
		answer2 = new String [q2.length];

		System.out.println("(커피)입력해주세요.");
		System.out.print("=>");
		for(int i = 0; i < q.length; i++){

			answer[i] = sc.next().trim();
		}
		Arrays.sort(q);
		Arrays.sort(answer);
		
		if(player.getLevel() >= 3){
			
			System.out.println("(케익)입력해주세요.");
			System.out.print("=>");
			for(int j = 0; j <q2.length; j++) {

				answer2[j] = sc.next().trim();
			}

			Arrays.sort(q2);
			Arrays.sort(answer2);
			
		}
		
		System.out.print("음료 준비중 입니다");
		try {
			for(int i = 0; i < 4; i++){
				System.out.print(".");
				Thread.sleep(200);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println();
		
		if(count != 0){
			count--;
			if(!(Arrays.equals(q,answer))){

				System.out.println("틀렸습니다. 다시입력하세요");
				serve();

				return;

			}

		}
		if(player.getLevel() >= 3){
			
			if(count != 0){
				count--;
				if(!(Arrays.equals(q2, answer2))) {

					System.out.println("틀렸습니다. 다시입력하세요");
					serve();

					return;
				}

			}
		}
		

		if(Arrays.equals(q,answer)){

			//점수획득
			System.out.println();
			System.out.println("맞았습니다.");
			System.out.println();
			if(num1 == 0){
				player.setScore(player.getScore()+3000);
			}
			else if(num1 == 1){
				player.setScore(player.getScore()+3500);
			}
			else if(num1 == 2){
				player.setScore(player.getScore()+3800);
			}
			else if(num1 == 3){
				player.setScore(player.getScore()+3800);
			}
			else if(num1 == 4){
				player.setScore(player.getScore()+3500);
			}
			else if(num1 == 5){
				player.setScore(player.getScore()+3500);
			}

			flag = true;
		}

		if(Arrays.equals(q2, answer2)) {

			if(num4 == 0) {
				player.setScore(player.getScore()+5000);
			}
			else if(num4 == 1){
				player.setScore(player.getScore()+2500);
			}
			else if(num4 == 2){
				player.setScore(player.getScore()+6000);
			}
			else if(num4 == 3){
				player.setScore(player.getScore()+10000);
			}
		}

		int t = 10000*(player.getLevel()+1);
		if(player.getScore()>=t && t<=100000) {									
			test();	
			t += 10000;
		}


		if(num1<=3) {
			player.setBean(player.getBean()-1);			
		}

		if(player.getBean()==1) {
			System.out.println("\t\t\t\t\t커피콩이 한알 남았습니다. 주문하시겠습니까? ");	 ///////**************************
			System.out.println();
			beanOrder();	
		}

		if(flag == true){
			System.out.println("["+guest[num3]+"] 만족하면서 나갔습니다.");
			System.out.println();


		} //만족 if
	}

	public void test() {

		String[] jungdap;
		String[] yoso;
		String[] imruk;
		int ch;

		try {
			System.out.println("바리스타 레벨업 시험 보시겠습니까? [1.Y / 2.N] => "); //레벨업 승진?
			ch = sc.nextInt();

			if(ch == 1) {

				jungdap = menu;
				int n= rd.nextInt(6);
				String c = jungdap[n];

				yoso = map.get(n);

				System.out.println(jungdap[n]+"의 재료를 입력해주세요.");
				System.out.print("=>");

				imruk = new String[yoso.length];

				for(int i = 0; i < yoso.length; i++){
					imruk[i] = sc.next().trim();
				}

				Arrays.sort(yoso);
				Arrays.sort(imruk);

				if(!(Arrays.equals(yoso,imruk))){
					System.out.println("불합격하였습니다.");
					return ;
				}
				else {
					player.setLevel(player.getLevel()+1);
					System.out.println("\t\t\t\tLevel Up! ");
					System.out.println();
					
					if(player.getLevel() == 3 ){
						System.out.println("\t\t\t\t레벨 3을 달성하여 케익메뉴를 주문받을 수 있습니다.");
					}
					return ;			
				}


			}
			else if (ch== 2){
				return;
			}

		}catch (Exception e) {
			System.out.println("숫자를 입력하세요.");
			ch = sc.nextInt();
			test();
		}

		return ;
	}



	//메뉴
	public void menu(){
		String hp="";
		System.out.println();
		for(int i = 0; i < player.getHp(); i++){
			hp += "●";
		}
		for(int i = 0; i < 5-player.getHp(); i++){
			hp += "○";
		}
		System.out.println("\t\t\t\t	                     	        		Player : "+player.getName()+", Money : "+player.getScore()+", HP : "+hp   );
		System.out.println("\t\t\t\t ┌──────────────────────┐       Level : " + player.getLevel()+ ", 남은 커피콩 : " + player.getBean());
		System.out.println("\t\t\t\t │ 1.주문처리   2.레시피 보기  3.저장 후 종료 │");
		System.out.println("\t\t\t\t └──────────────────────┘");
		System.out.print("=>");
		s = sc.nextInt();

		if(s == 1){
			serve();
		}else if(s == 2){
			viewRecipe();
			menu();
		}
		else if(s == 3){
			try {
				System.out.println("\t\t\t\t저장 후 종료합니다.");

				map4.put(player.getName(), player.getScore());

				FileOutputStream fos = new FileOutputStream("d:\\doc\\player.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);

				FileOutputStream fos2 = new FileOutputStream("d:\\doc\\rank.txt");
				ObjectOutputStream oos2 = new ObjectOutputStream(fos2);

				oos.writeObject(player);
				oos2.writeObject(map4);

				fos.close();
				oos.close();

				fos2.close();
				oos2.close();

				System.exit(0);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}


	//레시피출력
	public void viewRecipe(){

		System.out.println("\t\t\t\t\t[RECIPE]");
		System.out.println();
		for(int i = 0; i < menu.length;i++) {

			System.out.print("\t\t\t\t"+menu[i] + " 레시피: ");

			String[] str = map.get(i);
			for(int j = 0; j < str.length; j++) {
				System.out.print("["+str[j]+"]");
			}
			System.out.println();
		}
		for(int j = 0; j < cake.length;j++) {

			System.out.print("\t\t\t\t"+cake[j] + " 레시피: ");

			String[] str = map3.get(j);
			for(int i=0; i< str.length; i++) {
				System.out.print("["+str[i]+"]");				
			}
			System.out.println();
		}



	}
	//랭킹확인
	public void rankView(){
		System.out.println();
		System.out.println("\t\t\t\t\t< 판매성적 >");
		System.out.println();
		try {
			FileInputStream fis2 = new FileInputStream("d:\\doc\\rank.txt");
			ObjectInputStream ois2 = new ObjectInputStream(fis2);
			map4 = (Map<String, Integer>)ois2.readObject();



			Iterator<String> it = sortByValue(map4).iterator();

			while(it.hasNext()){

				String key = it.next();
				Integer value = map4.get(key);
				System.out.println("\t\t\t\t[ Player ] : "+key + " [ Score ] : "+value);
			}


			fis2.close();
			ois2.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println();
	}
	//MapSort
	public static List sortByValue(Map map){
		List<String> list = new ArrayList();
		list.addAll(map.keySet());

		Collections.sort(list,new Comparator() {

			@Override
			public int compare(Object o1,Object o2){
				Object v1 = map.get(o1);
				Object v2 = map.get(o2);

				return ((Comparable) v1).compareTo(v2);
			}

		});
		Collections.reverse(list); // 주석시 오름차순
		return list;
	}



	//원두주문
	public void beanOrder() {

		System.out.println("\t\t\t\t1.에티오피아(6000원) 2.케냐(6000원) 3.라오스(5500원) 4.베트남(5000원) 5.브라질(9000원)");
		int ch = sc.nextInt();

		if(ch==1) {
			player.setScore(player.getScore()-6000);	
			System.out.println("\t\t\t\t다크초콜릿향이 부드럽고 둥글게 감싸 안는 산미의 에티오피아 원두를 구매하였다.");
			player.setBean(player.getBean()+5);
		}
		if(ch==2) {
			player.setScore(player.getScore()-6000);	
			System.out.println("\t\t\t\t묵직한 바디감과 과일향, 알싸한 신맛의 케냐 원두를 구매하였다.");
			player.setBean(player.getBean()+5);
		}
		if(ch==3) {
			player.setScore(player.getScore()-5000);	
			System.out.println("\t\t\t\t중간 정도의 바디와 단맛의 후미가 특징의 라오스 원두를 구매하였다.");
			player.setBean(player.getBean()+5);
		}
		if(ch==4) {
			player.setScore(player.getScore()-6000);
			System.out.println("\t\t\t\t진한 풍미를 가진 베트남 원두를 구매하였다.");
			player.setBean(player.getBean()+5);
		}
		if(ch==5) {
			player.setScore(player.getScore()-9000);	
			System.out.println("\t\t\t\t바디감이 강하고 단맛이 좋은 브라질 원두를 구매하였다.");
			player.setBean(player.getBean()+5);
		}


	}


	//손님 쓰레드
	class GuestThread implements Runnable{

		@Override
		public void run() {
			try{
				for(int i = 3; i >= 1; i--){
					Thread.sleep(1000);
					System.out.println("\t\t\t\t\t"+i);
				}

			}catch(Exception e){

			}

			while(true){
				num1 = rd.nextInt(6);  //메뉴인덱스
				num2 = rd.nextInt(3);  //난이도인덱스
				num3 = rd.nextInt(3);  //손님인덱스
				num4 = rd.nextInt(4);  //케익 인덱스
				guest = map2.get(num2);
				flag = false;
				count = num2+1;
				try{

					Thread.sleep(1000);


				}catch(Exception e){

				}
				System.out.println();
				System.out.println("["+guest[num3]+"] 이 들어왔습니다.");

				if(guest[num3].equals("황태용 강사님 ★☆☆")) {

					try {
						System.out.println("오늘 벌써 금요일이네요 일주일 금방이죠?");
						Thread.sleep(1000);
						System.out.println("여기 요즘 잘나가나봐요?");	
						Thread.sleep(1000);
						System.out.println("박카스면 충분하다니깐 제 지난 기수 학생이 여기 기프티콘을 보내줬어요(하하)");			
						Thread.sleep(1000);
					} catch (Exception e) { 
						// TODO: handle exception
					}

				}else if(guest[num3].equals("친절한 여사님 ★☆☆")) {

					try {
						System.out.println("어머머 여기 너무 시원하네요!!");
						Thread.sleep(1000);
						System.out.println("밖에 너무 더웠는데 이제야 살 것 같아요");
						Thread.sleep(1000);
						System.out.println("여기서 음료 마시면서 더위 좀 식히고 갈게요~ (홍홍)");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}else if(guest[num3].equals("백발의 할아버지 ★☆☆")) {

					try {
						System.out.println("젊은이, 나 여기 음료 좀 줘. ");
						Thread.sleep(1000);
						System.out.println("뭐? 뭐라고?? 안들려~");
						Thread.sleep(1000);
						System.out.println("아이고 내 보청기가 고장났나 어찌 이리 안들리누~ 그냥 젊은이 마음대로 아무거나 줘~~ ");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}else if(guest[num3].equals("삼성맨 ★★☆")) {

					try {
						System.out.println("(전화중) 네 팀장님 저 지금 잠깐 외근 나왔다가 이제 들어가려고합니다. ");
						Thread.sleep(1000);
						System.out.println("(전화를 끊고) 에잇, 커피 한잔 마실 시간이 없네 정말!");
						Thread.sleep(1000);
						System.out.println("회사를 그만두던지해야지! 아.. 당장 이번달 카드 할부값이 산더미지.. ");
						Thread.sleep(1000);
						System.out.println("그래.. 커피 한잔 마시고 다시 일하자!!");
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}else if(guest[num3].equals("호호 할머니 ★★☆")) {

					try {
						System.out.println("(호호호)");
						Thread.sleep(1000);
						System.out.println("(호호호) (호호호)");
						Thread.sleep(1000);
						System.out.println("(호호호) (호호호) (호호호)");
						Thread.sleep(1000);

					} catch (Exception e) {
						// TODO: handle exception
					}
				}else if(guest[num3].equals("온화한 그녀 ★★☆")) {

					try {
						System.out.println("안녕하세요~ 날씨가 정말 좋아요.");
						Thread.sleep(1000);
						System.out.println("여기 커피가 맛있다는 소문 듣고 왔어요~");
						Thread.sleep(1000);
						System.out.println("맛있게 만들어주세요 부탁드릴게요~");
						Thread.sleep(1000);

					} catch (Exception e) {
						// TODO: handle exception
					}
				}else if(guest[num3].equals("예민보스 여고생 ★★★")) {

					try {
						System.out.println("아 짱나! 아 날씨 완전 더워!");
						Thread.sleep(1000);
						System.out.println("(띠리링) 어? 민식이냐?");
						Thread.sleep(1000);
						System.out.println("아 열라 짱나. 담탱이가 수업중에 컵라면 먹었다고 뭐라했잖아");
						Thread.sleep(1000);
						System.out.println("미쳤냐? 당근 도망나왔지(허허)");
						Thread.sleep(1000);
						System.out.println("여기로 얼른와~ 오늘 이 누나가 산다! 아빠 지갑 털었어(허허)");
						Thread.sleep(1000);	
					} catch (Exception e) {
						// TODO: handle exception
					}
				}else if(guest[num3].equals("참을성 없는 꼬마 ★★★" )) {

					try {
						System.out.println("여기 딸기우유 있어요?");
						Thread.sleep(1000);
						System.out.println("그럼 바나나 우유는요?");
						Thread.sleep(1000);
						System.out.println("그럼 초코 우유는요?");
						Thread.sleep(1000);
						System.out.println("(으아앙) 그럼 여기에 있는게 뭐에요 으아앙");
						Thread.sleep(1000);
						System.out.println("우리 엄마한테 다 이를꺼야!");	
					} catch (Exception e) {
						// TODO: handle exception
					}
				}else if(guest[num3].equals("술주정뱅이 ★★★" )) {

					try {
						System.out.println("(딸꾹) 으아 취한다");
						Thread.sleep(1000);
						System.out.println("여기 소주 한병 더! (딸꾹)");
						Thread.sleep(1000);
						System.out.println("(딸꾹) 뭐? 여기 술 안판다고?? (딸꾹)");
						Thread.sleep(1000);	
					} catch (Exception e) {
						// TODO: handle exception
					}

				}

				System.out.println("");
				System.out.print("["+menu[num1]+"]"+"주세요");

				if(player.getLevel() >= 3){
					System.out.println(", ["+cake[num4]+"]"+"도 주세요.");
				}

				System.out.println("");
				
				Play.this.menu();

				if(flag == false ){
					player.setHp(player.getHp()-1);
					System.out.println("["+guest[num3]+"] 불만족 하면서 나갔습니다.");
				}
				if(player.getHp()==0){
					end();

				}

			}
		}

	}

}
