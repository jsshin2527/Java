package com.project9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.io.FileInputStream;

public class SoccerMain {

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
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		
		Pattern p = new Pattern();
		for(int i=0;i<5;i++) p.player();
	
		
		//로그인, 회원 가입
		int menu=0,fmenu=0;
		//여기서 1차로 직렬화를 통해 로그인과 회원 가입
		MemberImpl m;
		MemberVO member;
		while(true) {
			
			do {
				for(int i=1;i<27;i++)	{		
					System.out.print("=");

					try {
						Thread.sleep(8); 
					} catch (Exception e) {

					}
				}
				System.out.println();//
				System.out.println("  건전한 승부(도신)");
				for(int i=1;i<27;i++)	{		
					System.out.print("=");

					try {
						Thread.sleep(8);
					} catch (Exception e) {

					}
				}
				System.out.println();//
				System.out.println("┌─────┬──────┬──────┐");
				System.out.println("│1. 로그인 │2. 회원가입 │3. 회원탈퇴 │");
			    System.out.println("└─────┴──────┴──────┘");
			    
			    System.out.print("=>");
			    try {
			    	menu = sc.nextInt();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("입력 오류");
					System.out.println("입력은 1~3 사이 수만 가능합니다.");
					sc = new Scanner(System.in);
				}
			    
			  	
				
				
			}while(menu<1 || menu>3);
			if(menu==1) {
				m = new MemberImpl();
				member = m.login();
				
				
				if(member!=null)
				break;
			}
			else if(menu==2) {
				m = new MemberImpl();
				m.memJoin();
				
			}
			else if(menu==3) {
				m = new MemberImpl();
				m.memRemove();
			}
		}
		SoccerImpl g = new SoccerImpl();
		
		SoccerImpl sim = new SoccerImpl();

		int com[]= new int[5];
		int human[] = new int[5];
		
		while(true) {for(int i=1;i<13;i++)	{		
			System.out.print("■");

			try {
				Thread.sleep(6); 
			} catch (Exception e) {

			}
		}
		System.out.println();
		System.out.println("■                    ■ ");
		System.out.println("■  메뉴를 선택하세요 ■");
		System.out.println("■                    ■ ");
		for(int i=1;i<13;i++)	{		
			System.out.print("■");

			try {
				Thread.sleep(11); 
			} catch (Exception e) {

			}
		}

		System.out.println();
		System.out.println("┌─────┬──────┐");
		System.out.println("│1.게임하기│ 2.전적확인 │");
		System.out.println("└─────┴──────┘");
		System.out.print("=>");

		try {
			fmenu =  sc.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("입력 오류");
			System.out.println("입력은 1~2 사이 수만 가능합니다.");
			sc = new Scanner(System.in);
			fmenu=0;
		}

			  	
			if(fmenu==1) {
				
				while(true) {
					do {
						//팀 재구성 여부 질문>>작동
						//이전 선택 팀 유지할 수 있음
						
						System.out.println("\n┌──────────┬─────┬───────┬─────┬───┐");
						System.out.println("│1.풋살경기(선수선택)│2.승부차기│3.스코어맞추기│4.전적확인│5.종료│");
						System.out.println("│    참가비 10코인   │   25코인 │     30코인   │          │      │ ");
						System.out.println("└──────────┴─────┴───────┴─────┴───┘");
						System.out.print("=>");
						//menu = sc.nextInt();
						try {
							menu =sc.nextInt();
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("입력 오류");
							System.out.println("입력은 1~5 사이 수만 가능합니다.");
							sc = new Scanner(System.in);
							menu=0;
							continue;
						}
						//menu =sc.nextInt();
						if(member.getPlayer()!=null && menu==1) {
							int A = member.getCoin();
							if(A<10) { //게임도중 참가비 이하일때
								System.out.println("당신은 파산하셨습니다.ㅠ_ㅠ");
								sim.add_coin(member);
								menu = 0;
								continue;
							}
							int menu2 = 0;
							System.out.println("┌───────┬───┬───┐");
							System.out.println("│선수 재선택?  │1.YES │ 2.NO │");
							System.out.println("└───────┴───┴───┘");
							System.out.print("=>");
							try {
								menu2 =sc.nextInt();
							} catch (Exception e) {
								// TODO: handle exception
								System.out.println("입력 오류");
								System.out.println("입력은 1~2 사이 수만 가능합니다.");
								sc = new Scanner(System.in);
								menu=0;
								
							}
							if(menu == 0) continue;
							
							if(menu2 == 1 && member.getPlayer() != null) menu = 1;
							else if(menu2 == 2 && member.getPlayer() != null){
								System.out.println("\n◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇");
								System.out.println("◇                                ◇");
								System.out.println("◇        풋   살   게   임       ◇");
								System.out.println("◇                                ◇");
						        System.out.println("◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇\n");
								
								System.out.println("\n ○  ○  ○  ○  ○");
								System.out.println(" △  △  △  △  △");
								for(int a:member.getPlayer()) {
									System.out.println(list[a]+" "+(a+1));
								}
								menu=6;																
								sim.comList(com);
								
								sim.play(com,member);
							}
							else menu=6;
						}
						
						
					}while(menu<1||menu>5);
					
					
					
					switch(menu) {
					case 1:
						int A = member.getCoin();
						if(A<10) { //게임도중 참가비 이하일때
							System.out.println("당신은 파산하셨습니다.ㅠ_ㅠ");
							sim.add_coin(member);
							break;
						}
						sim.playerList();
						sim.PlayerC(human);
						
						//System.out.println("출력확인용");
						for(int a:human) {
							System.out.println(list[a]+" "+(a+1));
						}
						
						member.setPlayer(human);
						
						System.out.println();
						//컴퓨터 선수 선택
						sim.comList(com);
						sim.play(com,member);
						m.write();
						break;
					case 2:
						//승부차기
						sim.shooter(member);
						m.write();
						break;
					case 3:
						//스코어맞추기
						sim.toto(member);
						m.write();
						break;
					case 4:
						sim.result(member);
						break;
					case 5:
						m.write();
						//0730
						for(int i=1;i<26;i++)	{		
							System.out.print("=");

							try {
								Thread.sleep(8); 
							} catch (Exception e) {

							}
						}

						System.out.println();
						System.out.println("    저장 후 종료합니다.");
						p.ball();
						for(int i=1;i<5;i++)	{		
							System.out.println("♪♬♩GOOD - BYE!!♪♬♩");
							

							try {
								Thread.sleep(8); // .나오는 시간 조절 1/1000초
							} catch (Exception e) {

							}
						}

						System.exit(0);
					}
				}
				}else if(fmenu==2){
					//2.전적확인
					sim.result(member);
				}	
		}
	}

}