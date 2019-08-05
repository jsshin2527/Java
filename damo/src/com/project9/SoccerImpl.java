//통합용

package com.project9;

import java.awt.image.ShortLookupTable;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class SoccerImpl implements SoccerInter{
	private static String[] list = {"음바페", "손흥민", "호날두", "메시", "네이마르", 
			"수아레즈", "페페", "황태용", "즐라탄", "외질",
			"호나우두","지단","김혜미","김병지","마라도나",
			"펠레","스테파노","오훈","이승우","류현진",
			"선동렬","앙리","이경도","발로텔리","베컴",
			"김희우","이강인","나현수","차범근","케인"};

	private static int[] stat= {2,6,3,3,5,
								3,1,7,6,5,
								2,6,9,2,8,
								2,4,10,6,4,
								3,1,2,5,3,
								1,2,3,4,1};
	private static String grade[]= {"이병","일병","상병","병장"};
	
	Scanner sc = new Scanner(System.in);
	Pattern p =new Pattern();
	public void add_coin(MemberVO member) {
		int menu;
		System.out.println("┌─────┬───┬───┐");
		System.out.println("│코인충전? │1.YES │ 2.NO │");
		System.out.println("└─────┴───┴───┘");
		System.out.print("=>");
		menu = sc.nextInt();
		if(menu==2) {
			return;
		}
		else if(menu==1) {
			int coin = member.getCoin();
			System.out.println("┌───┬───┬───┬───┐");
			System.out.println("│1.100 │2.300 │ 3.700│4.1000│");
			System.out.println("└───┴───┴───┴───┘");
			System.out.print("=>");
		
			int add = sc.nextInt();
			switch(add) {
			case 1:
				member.setCoin(coin+100);
				break;
			case 2:
				member.setCoin(coin+300);
				break;
			case 3:
				member.setCoin(coin+700);
				break;
			case 4:
				member.setCoin(coin+1000);
				break;
			}
			//member.setCoin(coin+add);
		}
	}
	
	//선수 전부 출력
	@Override	
	public void playerList() {
		
		System.out.println("############################################");
		System.out.println("#                                          #");
		System.out.println("#         P L A Y E R    L I S T           #");
		System.out.println("#                                          #");
		System.out.println("############################################");
		for(int i =0;i<10;i++) {
			for(int j=1;j<2;j++) {
			System.out.printf("%d%s %4s",i+1,".",list[i]+"\t");
			System.out.printf("%d%s %4s",i+11,".",list[i+10]+"\t");
			System.out.printf("%d%s %4s",i+21,".",list[i+20]+"\t");
		}System.out.println();

		}System.out.println();
	}

	//컴퓨터 선택 선수
	public void comList(int[] a) {
		Random rd = new Random();
		int inwon = 5; //뽑을선수 5명
		
		System.out.print("\n상대팀 선수 구성중");//보여주기식 
		
		for(int i=1;i<6;i++)	{		
			System.out.print("■");

			try {
				Thread.sleep(250);
			} catch (Exception e) {

			}
		}
		System.out.println("\n ○  ○  ○  ○  ○");
		System.out.println(" ▲  ▲  ▲  ▲  ▲");
		System.out.println();//

		
		for(int i=0;i<inwon;i++) {//선수 선택과 중복 방지		
			a[i] = rd.nextInt(30);
			for(int j=0;j<i;j++) {
				if(a[i]==a[j])
					i--;
			}
		}

		for(int i=0;i<inwon;i++) { // 선수 출력
			System.out.printf("%s\n", list[a[i]]);
		}
	}
	
	//사람 선택 선수
	public void PlayerC(int human[]) {
		System.out.println("\n◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇");
		System.out.println("◇                                ◇");
		System.out.println("◇        풋   살   게   임       ◇");
		System.out.println("◇                                ◇");
        System.out.println("◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇\n");
		Scanner sc = new Scanner(System.in);
		int o;
		System.out.print("5명의 선수 숫자를 입력하세요 => ");
		System.out.println("\n ○  ○  ○  ○  ○");
		System.out.println(" △  △  △  △  △");
		String[] name = { "", "", "", "", "" };

		for (int i = 0; i < name.length; i++) {
			o = sc.nextInt();
			if (o>30 || o<1) {//선수 번호 초과 시에 재 선택
				System.out.println("없는 선수번호입니다");
				i--;
				continue;
			}
			name[i] = list[o - 1];
			human[i] = o - 1;
			for (int j = 0; j < i; j++) {//선수 중복 확인
				if (name[i].equals(name[j])) {
					System.out.println("중복된 선수를 선택하셨습니다");
					i--;
				} 
			}

		}
	}
	
	//0730 수정
	//승패결정--시작
	//3. 랜덤 함수 사용>>능력치에 따라 확률 다르게
	@Override
	public void play(int []com, MemberVO member) {
		
		int A = member.getCoin();
		/*
		if(A<10) { //게임도중 참가비 이하일때
			System.out.println("당신은 파산하셨습니다.ㅠ_ㅠ");
			add_coin(member);
			return;
		}
		*/
		
		member.setCoin(A-10); // 참가비 
		int a = member.getPlayCount();
		a++;
		member.setPlayCount(a);
		int human[] = member.getPlayer();
		int sum_h=0,sum_c=0;//플레이어가 이긴 횟수, 컴퓨터가 이긴 횟수
		Random r;
		int who_win=0;
		for(int i=0;i<5;i++) {//선수 능력치와 랜덤 메소드 사용으로
			//승패 결정
			r = new Random();
			who_win = r.nextInt(stat[human[i]]+stat[com[i]]+5); // 숫자가 높으면 무승부 확률 높아짐
			if(who_win<stat[human[i]]) {
				sum_h++;				
			}
			else if(who_win>=stat[human[i]]&& who_win<stat[human[i]]+stat[com[i]]+1) { //숫자가 커지면 컴퓨터 승률이 높아짐
				sum_c++;				
			}
		}
		
		if(sum_h>sum_c) {
			System.out.println("\n당신은 " + sum_h+" VS "+sum_c +  " ☆승리☆하였습니다");
			int win = member.getWinCount();
			win++;
			member.setWinCount(win);
			A = member.getCoin();
			member.setCoin(A+30); // 승리시 지급코인
			System.out.println("현재코인(" + member.getCoin() + ")");
		}
		else if(sum_h<sum_c) {
			System.out.println("\n당신은 " + sum_h+" VS "+sum_c + " ★패배★하였습니다");
			System.out.println("현재코인(" + member.getCoin() + ")");
			int lose = member.getLoseCount();
			lose++;
			member.setLoseCount(lose);
			A = member.getCoin();
			member.setCoin(A-5);//패배시 차감 코인
		}
		else { 
		System.out.println("\n" + sum_h+" VS "+sum_c + "으로 무승부입니다");
		System.out.println("현재코인(" + member.getCoin() + ")");
		}
//		System.out.println(sum_h+" VS "+sum_c);
		
	}
	
	//전적 출력
	@Override
	public void result(MemberVO member) {
		
		System.out.println("-------------------");
		System.out.println(member.getPlayCount()+"전, "+member.getWinCount()+"승, "
				+member.getLoseCount()+"패, "+(member.getPlayCount()-member.getWinCount()-member.getLoseCount())+
				"무");
		System.out.println("보유 코인=> "+member.getCoin());
		
		int coin = member.getCoin();
		if(coin <= 300) System.out.println("계급: "+grade[0]);
		else if(coin <= 600) System.out.println("계급: "+grade[1]);
		else if(coin <= 1200) System.out.println("계급: "+grade[2]);
		else  System.out.println("계급: "+grade[3]);
		System.out.println("-------------------");
	
	}
	
	//0730 수정
	//스코어 맞추기
	@Override
	public void toto(MemberVO member) {
		int coin = member.getCoin();
		if(coin<30) {// 참가비 부족시 출력
			System.out.println("코인이 부족합니다");
			add_coin(member);
			return;
		}	
		System.out.println("\n◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇");
		System.out.println("◇                                ◇");
		System.out.println("◇   스  코  어    맞  추  기     ◇");
		System.out.println("◇                                ◇");
		System.out.println("◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇\n");
		//0730 1700 수정
		coin -= 30;
		member.setCoin(coin); // 참가비
		int h,c;
		System.out.println("현재코인(" + member.getCoin() + ")" + " - &&: 7배, ||: 15, else: -15\n");
		System.out.println();
		System.out.println("\n ○  ○  ○  ○  ○");
		System.out.println(" △  △  △  △  △");
		System.out.print("\nK-STARS 예상득점을 입력해주세요\n=>");
		h = sc.nextInt();
		System.out.println();
		System.out.println("\n ○  ○  ○  ○  ○");
		System.out.println(" ▲  ▲  ▲  ▲  ▲");
		System.out.print("\n유벤투스 예상득점을 입력해주세요(호날두는 미출전)\n=>");
		c = sc.nextInt();
		
		
	
		int sum_h=0,sum_c=0;
		Random r,hP,cP;
		int hStat,cStat;
		int who_win=0;
		for(int i=0;i<7;i++) {
			r = new Random();
			hP = new Random(); cP = new Random();
			hStat = hP.nextInt(30);
			cStat = cP.nextInt(30);
			who_win = r.nextInt(stat[hStat]+stat[cStat]+5);
			if(who_win<	stat[hStat]) {
				sum_h++;				
			}
			else if(who_win>=stat[hStat]&& who_win<stat[hStat]+stat[cStat]) {
				sum_c++;				
			}
		}
		
		
				
		if(h==sum_h && c == sum_c) {
			p.jockpot();
			System.out.println("\nK-STARS  " + sum_h+" VS "+sum_c + "  유벤투스");
			//p.jockpot();
			System.out.println("\n 잭팟!!!!!!!!!!!! 참가코인*7배!!!");
			member.setCoin(coin+210); //둘다 맞췄을때 지급 코인
		}
		else if(h==sum_h || c == sum_c) {
			System.out.println("\nK-STARS  " + sum_h+" VS "+sum_c + "  유벤투스");
			System.out.println("\n 한개만 맞춰서 15코인 겟!아쉽네요 한게임더?");
			member.setCoin(coin+15); // 하나만 맞췄을때 지급 코인
		}
		else {
			//p.player();
			System.out.println("\nK-STARS  " + sum_h+" VS "+sum_c + "  유벤투스");
			System.out.println("\n사요나라~");
			member.setCoin(coin-15);// 둘다 못맞췄을때 차감 코인
			
		}
		System.out.println("현재코인(" + member.getCoin() + ")\n");
	}
	
	//승부차기. 0730 모두수정
	@Override
	public void shooter(MemberVO member) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int player,com;
		String str = null;
		
		String[] a ={"◁왼쪽","가운데△","오른쪽▷"};
        System.out.println("\n◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇");
        System.out.println("◇                                ◇");
        System.out.println("◇      승    부    차    기      ◇");
        System.out.println("◇                                ◇");
        System.out.println("◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇\n");

		System.out.println("현재코인(" + member.getCoin() + ")" + " - 골: 15코인, 노골: -5코인");

		int A = member.getCoin();
		if(A<25) { //참가비 이하면 알림. 참가비 수정때 같이 수정
			System.out.println("코인이 부족합니다 $$$Show me the Money$$$");
			add_coin(member);
			return;
		}
		A-=25; //승부차기 참가비
		member.setCoin(A);


		for(int i=0;i<5;i++) {
			com = rd.nextInt(3);
			System.out.println("");
			System.out.println("\n남은기회  " + " ☞☞☞ "+(5-i)); // 몇번 남았는지 알려주기
						
			//0731
			System.out.print(" 1.◁왼쪽, 2.가운데△, 3.오른쪽▷\n=>");
			player = sc.nextInt()-1;
			
			
			if(player<0 || player >2) {
				System.out.println("공을 찰수 없는 위치 입니다");
				i--;
				continue;
			}

			//end...0731
			
			
			System.out.println();
			System.out.print("공 차는 중");
			for(int j=0;j<5-i;j++)	{		
				System.out.print("◎");
				try {
					Thread.sleep(200);
				} catch (Exception e) {

				}
			}
			System.out.println();
			//System.out.println();

			//골키퍼,플레이어 이동위치 한번더 알려주기
			System.out.println("골키퍼 :" + a[com] + ", 플레이어 :" + a[player]);
			System.out.println();
			if(com-player==2 || com-player==-1) {
				A-=5; //못넣으면 코인 수거
				if(A<0) {
					System.out.println("당신은 파산하셨습니다.>▽<");
					add_coin(member);
					break;
				}
				member.setCoin(A);
				str="→ 골키퍼가 막았습니다..." + " 현재 코인: " + member.getCoin();
			}else if(com-player==1 || com-player==-2){ //골 넣으면 15코인 제공
				A+=20; //골 넣으면 코인 지급
				member.setCoin(A);
				str = "★☆ 골 !!!!  G  O  A  L  !!!! ☆★" + " 현재 코인: " + member.getCoin();
			}else if(com-player==0) {
				A-=5; //못넣으면 코인 수거
				if(A<0) {
					System.out.println("당신은 파산하셨습니다.^▽^데헷");	
					add_coin(member);
					break;
				}
				member.setCoin(A);
				str = "→ 공이 우주로 날아갔습니다...★☆" + " 현재 코인: " + member.getCoin();
			}
			System.out.println(str);
			System.out.println();
		}

	}

}
