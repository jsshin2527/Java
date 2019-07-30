package com.JavaProject;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class OrderImpl implements Order {

	List<OrderVO> lists = new ArrayList<OrderVO>();
	Scanner sc = new Scanner(System.in);
	
	String m1 = "coldbrew"; 			//콜드브루
	String m2 = "americano"; 			//아메리카노
	String m3 = "javachipfrappuchino"; 	//자바칩
	String m4 = "redvelvetcake"; 		//레드벨벳
	List<OrderVO> priceList = new ArrayList<OrderVO>();
	//2.메뉴와 가격 붙이기
	@Override
	public void order() {
		
		ButtonClass btn = new ButtonClass();
		OrderVO vo = new OrderVO();
		System.out.println();
		System.out.print(" ① 음료 주문 ② 케이크 주문 : ");
		int o = sc.nextInt();

		if(o==1) {

			//주문 받는 내용
			System.out.println("\n음료수를 선택해주세요! ");
			vo.setDrink(btn.coffee());
			System.out.println(vo.getDrink() + "를 선택하셨습니다");		
			System.out.println("\n사이즈를 선택하세요! ");
			vo.setSize(btn.Size());
			System.out.println(vo.getSize()+"를 선택하셨습니다");
			System.out.println("ICE/HOT? ");
			vo.setMode(btn.temperature());
			System.out.println(vo.getMode()+ "를 선택하셨습니다");
			System.out.print("수량을 말해주세요![ex: 1] ");
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
			System.out.println("│① 추가주문 │② 주문종료 │③ 주문취소  │");
			System.out.println("└──────┻──────┷──────┘");
			System.out.print("메뉴를 선택하세요 : ");
			
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

			vo.setDrink(btn.cake());
			System.out.println("케이크를 선택해주세요! ");

			System.out.print("수량을 말해주세요![ex: 1] ");
			vo.setSu(sc.nextInt());
			
			if(vo.getDrink().equals(m4)) {
				vo.setPricecake(vo.getSu());
			}

			lists.add(vo);
			//케이크 출력형식 다르게
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("┌──────┯──────┳──────┐");
			System.out.println("│① 추가주문 │② 주문종료 │③ 주문취소 │");
			System.out.println("└──────┻──────┷──────┘");
			System.out.print("메뉴를 선택하세요 : ");
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

		System.out.print("계속 주문하시겠습니까?");
		System.out.println();
		
		System.out.print(" ① 음료 주문 ② 케이크 주문 ");
		int o = sc.nextInt();

		OrderVO vo = new OrderVO();
		ButtonClass btn = new ButtonClass();
		
		if(o==1) {
			
			System.out.println("\n음료수를 선택해주세요! ");
			vo.setDrink(btn.coffee());
			System.out.println(vo.getDrink() + "를 선택하셨습니다");		
			System.out.println("\n사이즈를 선택하세요! ");
			vo.setSize(btn.Size());
			System.out.println(vo.getSize()+"를 선택하셨습니다");
			System.out.println("ICE/HOT? ");
			vo.setMode(btn.temperature());
			System.out.println(vo.getMode()+ "를 선택하셨습니다");
			System.out.print("수량을 말해주세요![ex: 1] ");
			vo.setSu(sc.nextInt());
			
			/*//주문 받는 내용
			System.out.println("\n음료수를 선택해주세요! ");
			String drink = btn.coffee();

			System.out.println("사이즈를 선택하세요! ");
			String size = btn.Size();

			System.out.println("ICE/HOT? ");
			String mode = btn.temperature();
			 */
/*
			System.out.println("수량을 말해주세요![ex: 1] ");
			int su = sc.nextInt();
			*/
			if(vo.getDrink().equals(m1)) { //콜드브루
				//가격 추가 영역
				//vo.setPrice(3000*vo.getSu()); 
				vo.setPricecode(vo.getSu());
			}
			if(vo.getDrink().equals(m2)) { //아메리카노
				//vo.setPrice(2500*vo.getSu());
				vo.setPriceamea(vo.getSu());
			}
			if(vo.getDrink().equals(m3)) { //자바칩프라프치노
				//vo.setPrice(3500*vo.getSu());
				vo.setPricejava(vo.getSu());
			}

			lists.add(vo);
			//리턴?은 형식..?
			System.out.println();
			System.out.println(" ① 음료 주문 ② 케이크 주문 : ");
		
		}
		else if(o==2) {
			System.out.println("케이크를 선택해주세요! ");
			vo.setDrink(btn.cake());
			System.out.print("수량을 말해주세요![ex: 1] ");
			vo.setSu(sc.nextInt());
			if(vo.getDrink().equals(m4)) {
				vo.setPricecake(vo.getSu());
				}
			}
			lists.add(vo);

			System.out.println();
			System.out.println();
			System.out.println("┌──────┯──────┳──────┐");
			System.out.println("│① 추가주문 │② 주문종료 │③ 주문취소 │");
			System.out.println("└──────┻──────┷──────┘");
			System.out.print("메뉴를 선택하세요 : ");
			
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
			System.out.println(vo.toString());
			System.out.println("└------------------------------┘");
	
		}
		while(true) {
			System.out.println();
			System.out.print("맞으면 ① 아니면 ② 눌러주세요!");
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
		System.out.println("  	               ※MENU※			         		");
		System.out.println(" ┌-----------------------------------------------┐");
		System.out.println(" │[Coffee]                                       │");
		System.out.println(" │                      	                      │");
		System.out.println(" │ --------------------------- : 3,000원 │");
		System.out.println(" │                                               │"); //ㅂ+한자
		System.out.println(" │americano -------------------------- : 2,500원 │");		
		System.out.println(" │                                               │");
		System.out.println(" │Lotte ------------------------------ : 3,500원 │");
		System.out.println(" │                                               │");
		System.out.println(" │[Cake]                                         │");
		System.out.println(" │                                               │");
		System.out.println(" │redvelvetcake ---------------------- : 3,000원 │");
		System.out.println(" │                                               │");
		System.out.println(" └-----------------------------------------------┘");

	}
	@Override
	public int price() {
		
	/*	String m1 = "coldbrew"; //콜드브루 3.0
		String m2 = "americano"; //아메리카노 2.5
		String m3 = "javachipfrappuchino"; //자바칩 3.5
		String m4 = "redvelvetcake"; //레드벨벳 3.0
		*/
		//가격 출력
		
		int total=0;
		OrderVO vo = new OrderVO();
		try {
			
			int c = 0, d1 = 0, d2 = 0, d3 = 0; //cake, drink
			
			if(vo.getDrink().equals(m1)) {
				d1 = 1;
			}
			//The method setPrice(int) in the type OrderVO is not applicable for the arguments ()
			//-> OrderVO 형식의 메서드 집합Price(int)가 인수()에 적용되지 않음
			if(vo.getDrink().equals(m2)) {
				d2 = 1;
			}
			if(vo.getDrink().equals(m3)) {
				d3 = vo.getPrice();
			}
			if(vo.getDrink().equals(m4)) {
				c = vo.getPrice();
			}
			
			total = d1 + d2 + d3 + c;
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return total;
	}
	/*public void menu() {
		//메뉴 부분
		for (int i = 0; i < 2; i++) {
			
			System.out.println();
		}
		System.out.println("\t\t  	        ※MENU※						");
		System.out.println(" ┌--------------------------------------------------------------------┐");
		System.out.println(" │                                                                    │");
		System.out.println(" │                      	coldbrew : 3,000원                     │");
		System.out.println(" │                                                                    │"); //ㅂ+한자
		System.out.println(" │                                                                    │");
		System.out.println(" │                        americano : 2,500원                         │");
		System.out.println(" │                                                                    │");
		System.out.println(" │                                                                    │");
		System.out.println(" │                   javachipfrappuchino : 3,500원                    │");
		System.out.println(" │                                                                    │");
		System.out.println(" │                                                                    │");
		System.out.println(" │                       redvelvetcake : 3,000원                      │");
		System.out.println(" │                                                                    │");
		System.out.println(" │                                                                    │");
		System.out.println(" └--------------------------------------------------------------------┘");

	}*/
	@Override
	public void chul() {
		//영수증 출력?
		//price끼리 더하기? 각각 메뉴일때 셋팅한 int 값을 더하기
		//수량에 따라서 가격변동
		//리스트 그대로 출력하기!!
		//배열에 들어간 내용 출력
		Iterator<OrderVO> ov = lists.iterator();

		System.out.println("===========================================");
		System.out.println("                영수증 출력               ");
		System.out.println("                                         ");
		System.out.printf("   %1$tF         %1$tT \n", Calendar.getInstance());
		System.out.println("-------------------------------------------");
		System.out.println();
		while(ov.hasNext()) {
			OrderVO vo = ov.next();	
			System.out.println("   "+vo.toString()+"   ");
		}
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println(price());
		//가격 출력 부분
		//if(케이크) { 받은 price} + if(음료) { 받은 price} => 변수하나를 줘서 출력?
		OrderVO vo = (OrderVO) ov.next();
		System.out.println(vo.getTot());
		System.out.println("===========================================");
		
		}
	
		//테스트 코드 
		/*Iterator<OrderVO> ov = lists.iterator();
	
		System.out.println("┌---------------------------┐");
		while(ov.hasNext()) {
			OrderVO vo = ov.next();
			System.out.println(vo.toString());
			System.out.println("테스트 총합 가격"+vo.getTot());
		}
		System.out.println("└---------------------------┘");	
	}*/
}


class ButtonClass {
	
	Scanner sc = new Scanner(System.in);
	public String coffee() {
		
		System.out.println("┌---------------------------┐");
		System.out.println("┃(a) coldbrew               │");
		System.out.println("┃(b) americano              │");
		System.out.println("┃(c) javachipfrappuchino    │");
		System.out.println("└---------------------------┘");
		System.out.println();
		String coffee = null;
		while(true) {
			
			System.out.print("메뉴를 선택하세요 : ");
			coffee = sc.next();
			String[] menu = {"a","b","c"};
			
			if(coffee.equals(menu[0])) {
				coffee = "coldbrew";
				break;
			}else if(coffee.equals(menu[1])) {
				coffee = "americano";
				break;
			}else if(coffee.equals(menu[2])) {
				coffee = "javachipfrappuchino";
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
		System.out.println("└---------------------------┘");
		System.out.println();
		String cake = null;
		
		while(true) {
			System.out.print("메뉴를 선택하세요 : ");
			cake = sc.next();
			String[] menu = {"a"};
			if(cake.equals(menu[0])) {
				cake = "redvelvetcake";
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
			System.out.print("Size 를 선택하세요 : ");
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

