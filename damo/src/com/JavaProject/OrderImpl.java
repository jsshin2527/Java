package com.JavaProject;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class OrderImpl implements Order {

	List<OrderVO> lists = new ArrayList<OrderVO>();
	Scanner sc = new Scanner(System.in);
	
	String m1 = "americano"; 			//아메리카노
	String m2 = "caffeaate"; 			//카페라떼
	String m3 = "cappuccino"; 	        //카푸치노
	String m4 = "redvelvetcake"; 		//레드벨벳
	String m5 = "tiramisu";				//티라미슈
	List<OrderVO> priceList = new ArrayList<OrderVO>();
	
	//2.메뉴와 가격 붙이기
	@Override
	public void order() {
		
		ButtonClass btn = new ButtonClass();
		OrderVO vo = new OrderVO();
		System.out.println();
		System.out.println("┌──────┯───────┐");
		System.out.println("│① 음료주문 │②케이크 주문 │");
		System.out.println("└──────┻───────┘");
		System.out.print("메뉴얼을 선택하세요 : ");
		int o = sc.nextInt();

		if(o==1) {
			//주문 받는 내용
			//System.out.println("\n음료수를 선택해주세요! ");
			vo.setDrink(btn.coffee());
			System.out.println(vo.getDrink() + "를 선택하셨습니다");		
			//System.out.println("\n사이즈를 선택하세요! ");
			vo.setSize(btn.Size());
			System.out.println(vo.getSize()+"를 선택하셨습니다");
			//System.out.println("ICE/HOT? ");
			vo.setMode(btn.temperature());
			System.out.println(vo.getMode()+ "를 선택하셨습니다");
			System.out.print("수량을 입력해주세요 [ex: 1] : ");
			vo.setSu(sc.nextInt());
			
			//가격 부분
			//받은 스트링이 저장해둔 스트링과 같으면 vo에 해당하는 값 추가?\
			//로직: if문으로 받은 스트링과 메뉴에 있는 스트링 비교후 가격을 출력? 보여줌?
			//만약 다르게 썼으면 다시 써달라는 메세지? 띄우기
			
			if(vo.getDrink().equals(m1)) { //콜드브루
				//가격 추가 영역
				//vo.setPrice(3000*vo.getSu()); 
				vo.setPricecode(vo.getSu());
			}
			if(vo.getDrink().equals(m2)) { //아메리카노
				//vo.setPrice(2500*vo.getSu());
				vo.setPriceamea(vo.getSu());
			}
			if(vo.getDrink().equals(m3)) { //자바칩ㅋㅋㅋㅋ
				//vo.setPrice(3500*vo.getSu());
				vo.setPricejava(vo.getSu());
			}
			lists.add(vo);
			//리턴?은 형식..?
			System.out.println();
			System.out.println("┌──────┯──────┳──────┐");
			System.out.println("│① 추가주문 │② 주문완료 │③ 주문취소 │");
			System.out.println("└──────┻──────┷──────┘");
			System.out.print("메뉴얼을 선택해주세요 : ");
			
			int resu = sc.nextInt();

			if(resu==1) {
				reOrder();
			}
			else if(resu==2) {
				keep();
			}
			else if(resu==3) {
				cancel();
			}
		}
		else if(o==2) {

			vo.setSetmakecake(btn.cake());
			System.out.println("케이크를 선택해주세요! ");
			
			System.out.print("수량을 입력해주세요 [ex: 1] : ");
			vo.setSu(sc.nextInt());
			
			if(vo.getSetmakecake().equals(m4)) {
				vo.setPriceredcake(vo.getSu());
			}else if(vo.getSetmakecake().equals(m5)){
				vo.setPricetiracake(vo.getSu());
			}
			lists.add(vo);
			
			System.out.println();
			System.out.println("┌──────┯──────┳──────┐");
			System.out.println("│① 추가주문 │② 주문완료 │③ 주문취소 │");
			System.out.println("└──────┻──────┷──────┘");
			System.out.print("메뉴얼을 선택하세요 : ");
			System.out.println();
			int resu = sc.nextInt();

			if(resu==1) {
				reOrder();
			}
			else if(resu==2) {
				keep();
			}
			else if(resu==3) {
				cancel();
			}
		}
	}
	@Override
	public void reOrder() {
		
		System.out.println("┌──────┯───────┐");
		System.out.println("│① 음료주문 │②케이크 주문 │");
		System.out.println("└──────┻───────┘");
		System.out.print("메뉴얼를 선택하세요 : ");
		int o = sc.nextInt();

		OrderVO vo = new OrderVO();
		ButtonClass btn = new ButtonClass();
		
		if(o==1) {
			//System.out.println("\n음료수를 선택해주세요! ");
			vo.setDrink(btn.coffee());
			System.out.println(vo.getDrink() + "를 선택하셨습니다");		
			//System.out.println("\n사이즈를 선택하세요! ");
			vo.setSize(btn.Size());
			System.out.println(vo.getSize()+"를 선택하셨습니다");
			//System.out.println("ICE/HOT? ");
			vo.setMode(btn.temperature());
			System.out.println(vo.getMode()+ "를 선택하셨습니다");
			System.out.print("수량을 입력하세요![ex: 1] ");
			vo.setSu(sc.nextInt());
			
			if(vo.getDrink().equals(m1)) { 
				//가격 추가 영역
				//vo.setPrice(3000*vo.getSu()); 
				vo.setPricecode(vo.getSu());
			}else if(vo.getDrink().equals(m2)) {
				//vo.setPrice(2500*vo.getSu());
				vo.setPriceamea(vo.getSu());
			}else{ 
				//vo.setPrice(3500*vo.getSu());
				vo.setPricejava(vo.getSu());
			}
			lists.add(vo);
		}else if(o==2) {
			vo.setSetmakecake(btn.cake());
			System.out.println("케이크를 선택해주세요 : ");
			
			System.out.print("수량을 입력해주세요 [ex: 1] : ");
			vo.setSu(sc.nextInt());
			if(vo.getSetmakecake().equals(m4)) {
				vo.setPriceredcake(vo.getSu());
			}else if(vo.getSetmakecake().equals(m5)) {
				vo.setPricetiracake(vo.getSu());
			}
			lists.add(vo);
		}else{
			System.out.println("잘못선택 하였습니다. ");
			return;
		}
		
			System.out.println("┌──────┯──────┳──────┐");
			System.out.println("│① 추가주문 │② 주문완료 │③ 주문취소 │");
			System.out.println("└──────┻──────┷──────┘");
			System.out.print("메뉴얼을 선택하세요 : ");
			
			while(true) {
				//System.out.print("  ");
				int resu = sc.nextInt();
				if(resu==1) {
					reOrder();
					break;
				}
				else if(resu==2) {
					keep();
					break;
				}
				else if(resu==3){
					cancel();
					break;
				}else {
			
				}System.out.println("잘못입력하였습니다. ");
			}
		}
	

	@Override
	public void keep() {
		System.out.println("이대로 주문하시겠습니까?");
		//배열에 들어간 내용 출력
		Iterator<OrderVO> ov = lists.iterator();
		while(ov.hasNext()) {
			OrderVO vo = ov.next();
			System.out.println("┌------------------------------┐");
			System.out.println("    "+vo.toString());
			System.out.println("└------------------------------┘");	
		}
		while(true) {
			System.out.println();
			System.out.println("입력한 정보가 맞으신가요 ? ");
			System.out.println();
			System.out.println("┌───┯─────┐");
			System.out.println("│① 예 │② 아니요 │");
			System.out.println("└───┴─────┘");
			System.out.print(": ");
			int ssu = sc.nextInt();
			if(ssu==1) {
				chul();//출력하는 부분으로 넘어감
				break;
			}
			else if(ssu==2) {
				order();
				break;
			}else {
				System.out.println("잘못선택하였습니다.");
			}		
		}
	}
	@Override
	public void cancel() {
		//취소
		System.out.println("주문 시스템을 종료합니다.");
		System.exit(0);
	}
	@Override
	public void menu() {
		//메뉴 부분
		for (int i = 0; i < 2; i++) {
			
			System.out.println();
		}
		System.out.println("\t\t  	         ※MENU※						");
		System.out.println(" ┌--------------------------------------------------------------------┐");
		System.out.println(" │                                                                    │");
		System.out.println(" │                                                                    │");
		System.out.println(" │    【Coffee】           Americano     : 2,500원                    │");
		System.out.println(" │                                                                    │"); //ㅂ+한자
		System.out.println(" │                                                                    │");
		System.out.println(" │                         Caffe Late    : 3,000원                    │");
		System.out.println(" │                                                                    │");
		System.out.println(" │                                                                    │");
		System.out.println(" │                         Cappuccino    : 3,000원                    │");
		System.out.println(" │                                                                    │");
		System.out.println(" │                                                                    │");
		System.out.println(" │                                                                    │");
		System.out.println(" │    【Cake】             RedvelvetCake : 3,000원                    │");
		System.out.println(" │                                                                    │");
		System.out.println(" │                         Tiramisu	  : 5,000원	                   │");
		System.out.println(" │                                                                    │");
		System.out.println(" └--------------------------------------------------------------------┘");

	}
	
	@Override
	public void chul() {
		//영수증 출력?
		//price끼리 더하기? 각각 메뉴일때 셋팅한 int 값을 더하기
		//수량에 따라서 가격변동
		//리스트 그대로 출력하기!!
		//배열에 들어간 내용 출력
		Iterator<OrderVO> ov = lists.iterator();
		int tot = 0;

		System.out.println("===========================================");
		System.out.println("                영수증 출력               ");
		System.out.println("                                         ");
		System.out.printf("  %1$tF    %1$tT \n", Calendar.getInstance());
		System.out.println("-------------------------------------------");
		System.out.println();
		while(ov.hasNext()) {
			OrderVO vo = ov.next();	
			System.out.println(vo.toString());
			tot += vo.getTot();
			System.out.println();
		}
		System.out.println("===========================================");
		System.out.println("총 합 : "+tot);
		System.out.println("===========================================");
		//가격 출력 부분
		//if(케이크) { 받은 price} + if(음료) { 받은 price} => 변수하나를 줘서 출력?
		}
		public void MakeCoffee() {
			MakeCoffee1 mc1= new MakeCoffee1();
			MakeCoffee2 mc2= new MakeCoffee2();
			MakeCoffee3 mc3= new MakeCoffee3();
			MakeCoffee4 mc4= new MakeCoffee4();
			BodyThread bt1 = new BodyThread();
			Cakeicon cakethread = new Cakeicon();
			
			Iterator<OrderVO> oit = lists.iterator();
			
			boolean countingdrink = false;
			boolean countingcake = false;
			
			while(oit.hasNext()) {
				
				OrderVO ov = oit.next();
				
				if(ov.getDrink() != null && ov.getSetmakecake() == null) {
					countingdrink = true;
				}else if(ov.getSetmakecake() != null && ov.getSetmakecake() != null) {
					countingcake = true;
				}else {
					countingdrink = true;
					countingcake = true;
				}
			}
			if(countingdrink && !countingcake) {
				
				try {
					mc4.start();
					mc4.join();
					
					mc1.start();
					mc1.join();
					
					mc2.start();
					mc2.join();
					
					mc3.start();
					mc3.join();
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				System.out.println("\n\n★★음료가 준비 되었습니다!★★\n\n");
			}else if(countingcake && !countingdrink) {
				
				try {
					cakethread.start();
					cakethread.join();
				} catch (Exception e) {
					// TODO: handle exception
				}
				System.out.println("\n\n★★케이크가 준비 되었습니다!★★\n\n");
			}else {
				try {
					mc4.start();
					mc4.join();
					
					mc1.start();
					mc1.join();
					
					mc2.start();
					mc2.join();
					
					mc3.start();
					mc3.join();
					
					cakethread.start();
					cakethread.join();
				} catch (Exception e) {
					// TODO: handle exception
				}
			System.out.println("\n\n★★음료와 케익이 준비 되었습니다!★★\n\n");
		}
	}	
}

class ButtonClass {
	
	Scanner sc = new Scanner(System.in);
	public String coffee() {
		
		System.out.println();
		System.out.println("┌---------------------------┐");
		System.out.println("┃(a) Americano              │");
		System.out.println("┃(b) Caffe Late             │");
		System.out.println("┃(c) Cappuccino             │");
		System.out.println("└---------------------------┘");
		String coffee = null;
		while(true) {
			
			System.out.print("음료를 선택해주세요 : ");
			coffee = sc.next();
			String[] menu = {"a","b","c"};
			
			if(coffee.equals(menu[0])) {
				coffee = "americano";
				break;
			}else if(coffee.equals(menu[1])) {
				coffee = "caffelate";
				break;
			}else if(coffee.equals(menu[2])) {
				coffee = "cappuccino ";
				break;
			}else{
				System.out.println("메뉴를 다시 선택해 주세요");
				continue;
			}
		}
		return coffee;
	}
	
	public String cake() {
		System.out.println("┌---------------------------┐");
		System.out.println("┃(a) redvelvetcake          │");
		System.out.println("┃(b) tiramisu               │");
		System.out.println("└---------------------------┘");
		System.out.println();
		String cake = null;
		
		while(true) {
			System.out.print("메뉴를 선택하세요 : ");
			cake = sc.next();
			String[] menu = {"a","b"};
			if(cake.equals(menu[0])) {
				cake = "redvelvetcake";
				break;
			}else if(cake.equals(menu[1])){
				cake = "tiramisu";
				break;
			}else{
				System.out.println("잘못입력하였습니다. ");
				continue;
			}
		}
		return cake;
	}
	public String Size() {
		
		String size = null;	
		System.out.println("┌---------------------------┐");
		System.out.println("┃(a) Regular                │");
		System.out.println("┃(b) Large                  │");	
		System.out.println("└---------------------------┘");
	
		while(true) {
			System.out.print("사이즈를 선택하세요 : ");
			String[] menu = {"a","b"};
			size = sc.next();
			if(size.equals(menu[0])) {
				size = "R";
				break;
			}
			if(size.equals(menu[1])) {
				size = "L";
				break;
			}else {
				System.out.println("잘못입력하였습니다. ");
				continue;
			}
		}
		return size;
	}
	public String temperature() {
		
		String temperature = null;	
		System.out.println("┌---------------------------┐");
		System.out.println("┃(a) ice                    │");
		System.out.println("┃(b) hot                    │");	
		System.out.println("└---------------------------┘");
		
		while(true) {
			System.out.print("온도를 선택하세요 : ");
			String[] menu = {"a","b"};
			temperature = sc.next();
			if(temperature.equals(menu[0])) {
				temperature = "ice";
				break;
			}else if(temperature.equals(menu[1])) {
				temperature = "hot";
				break;
			}else {
				System.out.println("잘못입력하였습니다. ");
				continue;
			}
		}
		return temperature;
	}
	
	
}

