//���տ�

package com.project9;

import java.awt.image.ShortLookupTable;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class SoccerImpl implements SoccerInter{
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
	private static String grade[]= {"�̺�","�Ϻ�","��","����"};
	
	Scanner sc = new Scanner(System.in);
	Pattern p =new Pattern();
	public void add_coin(MemberVO member) {
		int menu;
		System.out.println("������������������������������");
		System.out.println("����������? ��1.YES �� 2.NO ��");
		System.out.println("������������������������������");
		System.out.print("=>");
		menu = sc.nextInt();
		if(menu==2) {
			return;
		}
		else if(menu==1) {
			int coin = member.getCoin();
			System.out.println("����������������������������������");
			System.out.println("��1.100 ��2.300 �� 3.700��4.1000��");
			System.out.println("����������������������������������");
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
	
	//���� ���� ���
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

	//��ǻ�� ���� ����
	public void comList(int[] a) {
		Random rd = new Random();
		int inwon = 5; //�������� 5��
		
		System.out.print("\n����� ���� ������");//�����ֱ�� 
		
		for(int i=1;i<6;i++)	{		
			System.out.print("��");

			try {
				Thread.sleep(250);
			} catch (Exception e) {

			}
		}
		System.out.println("\n ��  ��  ��  ��  ��");
		System.out.println(" ��  ��  ��  ��  ��");
		System.out.println();//

		
		for(int i=0;i<inwon;i++) {//���� ���ð� �ߺ� ����		
			a[i] = rd.nextInt(30);
			for(int j=0;j<i;j++) {
				if(a[i]==a[j])
					i--;
			}
		}

		for(int i=0;i<inwon;i++) { // ���� ���
			System.out.printf("%s\n", list[a[i]]);
		}
	}
	
	//��� ���� ����
	public void PlayerC(int human[]) {
		System.out.println("\n�ޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡ�");
		System.out.println("��                                ��");
		System.out.println("��        ǲ   ��   ��   ��       ��");
		System.out.println("��                                ��");
        System.out.println("�ޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡ�\n");
		Scanner sc = new Scanner(System.in);
		int o;
		System.out.print("5���� ���� ���ڸ� �Է��ϼ��� => ");
		System.out.println("\n ��  ��  ��  ��  ��");
		System.out.println(" ��  ��  ��  ��  ��");
		String[] name = { "", "", "", "", "" };

		for (int i = 0; i < name.length; i++) {
			o = sc.nextInt();
			if (o>30 || o<1) {//���� ��ȣ �ʰ� �ÿ� �� ����
				System.out.println("���� ������ȣ�Դϴ�");
				i--;
				continue;
			}
			name[i] = list[o - 1];
			human[i] = o - 1;
			for (int j = 0; j < i; j++) {//���� �ߺ� Ȯ��
				if (name[i].equals(name[j])) {
					System.out.println("�ߺ��� ������ �����ϼ̽��ϴ�");
					i--;
				} 
			}

		}
	}
	
	//0730 ����
	//���а���--����
	//3. ���� �Լ� ���>>�ɷ�ġ�� ���� Ȯ�� �ٸ���
	@Override
	public void play(int []com, MemberVO member) {
		
		int A = member.getCoin();
		/*
		if(A<10) { //���ӵ��� ������ �����϶�
			System.out.println("����� �Ļ��ϼ̽��ϴ�.��_��");
			add_coin(member);
			return;
		}
		*/
		
		member.setCoin(A-10); // ������ 
		int a = member.getPlayCount();
		a++;
		member.setPlayCount(a);
		int human[] = member.getPlayer();
		int sum_h=0,sum_c=0;//�÷��̾ �̱� Ƚ��, ��ǻ�Ͱ� �̱� Ƚ��
		Random r;
		int who_win=0;
		for(int i=0;i<5;i++) {//���� �ɷ�ġ�� ���� �޼ҵ� �������
			//���� ����
			r = new Random();
			who_win = r.nextInt(stat[human[i]]+stat[com[i]]+5); // ���ڰ� ������ ���º� Ȯ�� ������
			if(who_win<stat[human[i]]) {
				sum_h++;				
			}
			else if(who_win>=stat[human[i]]&& who_win<stat[human[i]]+stat[com[i]]+1) { //���ڰ� Ŀ���� ��ǻ�� �·��� ������
				sum_c++;				
			}
		}
		
		if(sum_h>sum_c) {
			System.out.println("\n����� " + sum_h+" VS "+sum_c +  " �ٽ¸����Ͽ����ϴ�");
			int win = member.getWinCount();
			win++;
			member.setWinCount(win);
			A = member.getCoin();
			member.setCoin(A+30); // �¸��� ��������
			System.out.println("��������(" + member.getCoin() + ")");
		}
		else if(sum_h<sum_c) {
			System.out.println("\n����� " + sum_h+" VS "+sum_c + " ���й���Ͽ����ϴ�");
			System.out.println("��������(" + member.getCoin() + ")");
			int lose = member.getLoseCount();
			lose++;
			member.setLoseCount(lose);
			A = member.getCoin();
			member.setCoin(A-5);//�й�� ���� ����
		}
		else { 
		System.out.println("\n" + sum_h+" VS "+sum_c + "���� ���º��Դϴ�");
		System.out.println("��������(" + member.getCoin() + ")");
		}
//		System.out.println(sum_h+" VS "+sum_c);
		
	}
	
	//���� ���
	@Override
	public void result(MemberVO member) {
		
		System.out.println("-------------------");
		System.out.println(member.getPlayCount()+"��, "+member.getWinCount()+"��, "
				+member.getLoseCount()+"��, "+(member.getPlayCount()-member.getWinCount()-member.getLoseCount())+
				"��");
		System.out.println("���� ����=> "+member.getCoin());
		
		int coin = member.getCoin();
		if(coin <= 300) System.out.println("���: "+grade[0]);
		else if(coin <= 600) System.out.println("���: "+grade[1]);
		else if(coin <= 1200) System.out.println("���: "+grade[2]);
		else  System.out.println("���: "+grade[3]);
		System.out.println("-------------------");
	
	}
	
	//0730 ����
	//���ھ� ���߱�
	@Override
	public void toto(MemberVO member) {
		int coin = member.getCoin();
		if(coin<30) {// ������ ������ ���
			System.out.println("������ �����մϴ�");
			add_coin(member);
			return;
		}	
		System.out.println("\n�ޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡ�");
		System.out.println("��                                ��");
		System.out.println("��   ��  ��  ��    ��  ��  ��     ��");
		System.out.println("��                                ��");
		System.out.println("�ޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡ�\n");
		//0730 1700 ����
		coin -= 30;
		member.setCoin(coin); // ������
		int h,c;
		System.out.println("��������(" + member.getCoin() + ")" + " - &&: 7��, ||: 15, else: -15\n");
		System.out.println();
		System.out.println("\n ��  ��  ��  ��  ��");
		System.out.println(" ��  ��  ��  ��  ��");
		System.out.print("\nK-STARS ��������� �Է����ּ���\n=>");
		h = sc.nextInt();
		System.out.println();
		System.out.println("\n ��  ��  ��  ��  ��");
		System.out.println(" ��  ��  ��  ��  ��");
		System.out.print("\n�������� ��������� �Է����ּ���(ȣ���δ� ������)\n=>");
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
			System.out.println("\nK-STARS  " + sum_h+" VS "+sum_c + "  ��������");
			//p.jockpot();
			System.out.println("\n ����!!!!!!!!!!!! ��������*7��!!!");
			member.setCoin(coin+210); //�Ѵ� �������� ���� ����
		}
		else if(h==sum_h || c == sum_c) {
			System.out.println("\nK-STARS  " + sum_h+" VS "+sum_c + "  ��������");
			System.out.println("\n �Ѱ��� ���缭 15���� ��!�ƽ��׿� �Ѱ��Ӵ�?");
			member.setCoin(coin+15); // �ϳ��� �������� ���� ����
		}
		else {
			//p.player();
			System.out.println("\nK-STARS  " + sum_h+" VS "+sum_c + "  ��������");
			System.out.println("\n��䳪��~");
			member.setCoin(coin-15);// �Ѵ� ���������� ���� ����
			
		}
		System.out.println("��������(" + member.getCoin() + ")\n");
	}
	
	//�º�����. 0730 ��μ���
	@Override
	public void shooter(MemberVO member) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int player,com;
		String str = null;
		
		String[] a ={"������","�����","�����ʢ�"};
        System.out.println("\n�ޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡ�");
        System.out.println("��                                ��");
        System.out.println("��      ��    ��    ��    ��      ��");
        System.out.println("��                                ��");
        System.out.println("�ޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡ�\n");

		System.out.println("��������(" + member.getCoin() + ")" + " - ��: 15����, ���: -5����");

		int A = member.getCoin();
		if(A<25) { //������ ���ϸ� �˸�. ������ ������ ���� ����
			System.out.println("������ �����մϴ� $$$Show me the Money$$$");
			add_coin(member);
			return;
		}
		A-=25; //�º����� ������
		member.setCoin(A);


		for(int i=0;i<5;i++) {
			com = rd.nextInt(3);
			System.out.println("");
			System.out.println("\n������ȸ  " + " �ѢѢ� "+(5-i)); // ��� ���Ҵ��� �˷��ֱ�
						
			//0731
			System.out.print(" 1.������, 2.�����, 3.�����ʢ�\n=>");
			player = sc.nextInt()-1;
			
			
			if(player<0 || player >2) {
				System.out.println("���� ���� ���� ��ġ �Դϴ�");
				i--;
				continue;
			}

			//end...0731
			
			
			System.out.println();
			System.out.print("�� ���� ��");
			for(int j=0;j<5-i;j++)	{		
				System.out.print("��");
				try {
					Thread.sleep(200);
				} catch (Exception e) {

				}
			}
			System.out.println();
			//System.out.println();

			//��Ű��,�÷��̾� �̵���ġ �ѹ��� �˷��ֱ�
			System.out.println("��Ű�� :" + a[com] + ", �÷��̾� :" + a[player]);
			System.out.println();
			if(com-player==2 || com-player==-1) {
				A-=5; //�������� ���� ����
				if(A<0) {
					System.out.println("����� �Ļ��ϼ̽��ϴ�.>��<");
					add_coin(member);
					break;
				}
				member.setCoin(A);
				str="�� ��Ű�۰� ���ҽ��ϴ�..." + " ���� ����: " + member.getCoin();
			}else if(com-player==1 || com-player==-2){ //�� ������ 15���� ����
				A+=20; //�� ������ ���� ����
				member.setCoin(A);
				str = "�ڡ� �� !!!!  G  O  A  L  !!!! �١�" + " ���� ����: " + member.getCoin();
			}else if(com-player==0) {
				A-=5; //�������� ���� ����
				if(A<0) {
					System.out.println("����� �Ļ��ϼ̽��ϴ�.^��^����");	
					add_coin(member);
					break;
				}
				member.setCoin(A);
				str = "�� ���� ���ַ� ���ư����ϴ�...�ڡ�" + " ���� ����: " + member.getCoin();
			}
			System.out.println(str);
			System.out.println();
		}

	}

}
