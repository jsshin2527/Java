package com.project9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.io.FileInputStream;

public class SoccerMain {

	private static String[] list = {"������", "�����", "ȣ����", "�޽�", "���̸���", 
			"���Ʒ���", "����", "Ȳ�¿�", "���ź", "����",
			"ȣ�����","����","������","�躴��","���󵵳�",
			"�緹","�����ĳ�","����","�̽¿�","������",
			"������","�Ӹ�","�̰浵","�߷��ڸ�","����",
			"�����","�̰���","������","������","����"};
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
	
		
		//�α���, ȸ�� ����
		int menu=0,fmenu=0;
		//���⼭ 1���� ����ȭ�� ���� �α��ΰ� ȸ�� ����
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
				System.out.println("  ������ �º�(����)");
				for(int i=1;i<27;i++)	{		
					System.out.print("=");

					try {
						Thread.sleep(8);
					} catch (Exception e) {

					}
				}
				System.out.println();//
				System.out.println("������������������������������������������");
				System.out.println("��1. �α��� ��2. ȸ������ ��3. ȸ��Ż�� ��");
			    System.out.println("������������������������������������������");
			    
			    System.out.print("=>");
			    try {
			    	menu = sc.nextInt();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("�Է� ����");
					System.out.println("�Է��� 1~3 ���� ���� �����մϴ�.");
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
			System.out.print("��");

			try {
				Thread.sleep(6); 
			} catch (Exception e) {

			}
		}
		System.out.println();
		System.out.println("��                    �� ");
		System.out.println("��  �޴��� �����ϼ��� ��");
		System.out.println("��                    �� ");
		for(int i=1;i<13;i++)	{		
			System.out.print("��");

			try {
				Thread.sleep(11); 
			} catch (Exception e) {

			}
		}

		System.out.println();
		System.out.println("����������������������������");
		System.out.println("��1.�����ϱ⦢ 2.����Ȯ�� ��");
		System.out.println("����������������������������");
		System.out.print("=>");

		try {
			fmenu =  sc.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�Է� ����");
			System.out.println("�Է��� 1~2 ���� ���� �����մϴ�.");
			sc = new Scanner(System.in);
			fmenu=0;
		}

			  	
			if(fmenu==1) {
				
				while(true) {
					do {
						//�� �籸�� ���� ����>>�۵�
						//���� ���� �� ������ �� ����
						
						System.out.println("\n������������������������������������������������������������������������");
						System.out.println("��1.ǲ����(��������)��2.�º����⦢3.���ھ���߱⦢4.����Ȯ�Φ�5.���ᦢ");
						System.out.println("��    ������ 10����   ��   25���� ��     30����   ��          ��      �� ");
						System.out.println("������������������������������������������������������������������������");
						System.out.print("=>");
						//menu = sc.nextInt();
						try {
							menu =sc.nextInt();
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("�Է� ����");
							System.out.println("�Է��� 1~5 ���� ���� �����մϴ�.");
							sc = new Scanner(System.in);
							menu=0;
							continue;
						}
						//menu =sc.nextInt();
						if(member.getPlayer()!=null && menu==1) {
							int A = member.getCoin();
							if(A<10) { //���ӵ��� ������ �����϶�
								System.out.println("����� �Ļ��ϼ̽��ϴ�.��_��");
								sim.add_coin(member);
								menu = 0;
								continue;
							}
							int menu2 = 0;
							System.out.println("����������������������������������");
							System.out.println("������ �缱��?  ��1.YES �� 2.NO ��");
							System.out.println("����������������������������������");
							System.out.print("=>");
							try {
								menu2 =sc.nextInt();
							} catch (Exception e) {
								// TODO: handle exception
								System.out.println("�Է� ����");
								System.out.println("�Է��� 1~2 ���� ���� �����մϴ�.");
								sc = new Scanner(System.in);
								menu=0;
								
							}
							if(menu == 0) continue;
							
							if(menu2 == 1 && member.getPlayer() != null) menu = 1;
							else if(menu2 == 2 && member.getPlayer() != null){
								System.out.println("\n�ޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡ�");
								System.out.println("��                                ��");
								System.out.println("��        ǲ   ��   ��   ��       ��");
								System.out.println("��                                ��");
						        System.out.println("�ޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡ�\n");
								
								System.out.println("\n ��  ��  ��  ��  ��");
								System.out.println(" ��  ��  ��  ��  ��");
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
						if(A<10) { //���ӵ��� ������ �����϶�
							System.out.println("����� �Ļ��ϼ̽��ϴ�.��_��");
							sim.add_coin(member);
							break;
						}
						sim.playerList();
						sim.PlayerC(human);
						
						//System.out.println("���Ȯ�ο�");
						for(int a:human) {
							System.out.println(list[a]+" "+(a+1));
						}
						
						member.setPlayer(human);
						
						System.out.println();
						//��ǻ�� ���� ����
						sim.comList(com);
						sim.play(com,member);
						m.write();
						break;
					case 2:
						//�º�����
						sim.shooter(member);
						m.write();
						break;
					case 3:
						//���ھ���߱�
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
						System.out.println("    ���� �� �����մϴ�.");
						p.ball();
						for(int i=1;i<5;i++)	{		
							System.out.println("�ܢݢ�GOOD - BYE!!�ܢݢ�");
							

							try {
								Thread.sleep(8); // .������ �ð� ���� 1/1000��
							} catch (Exception e) {

							}
						}

						System.exit(0);
					}
				}
				}else if(fmenu==2){
					//2.����Ȯ��
					sim.result(member);
				}	
		}
	}

}