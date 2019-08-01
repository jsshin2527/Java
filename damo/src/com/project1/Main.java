package com.project1;

import java.io.*;
import java.util.*;

import com.project1.Character;

public class Main{
   static List<Character> l = null;
   static Character c = null;
   static Monster m = null;
   static Scanner sc = new Scanner(System.in);

   public static void game() {
      int num = 0;

      c.print(c);

      m = randomMonster();

      while(m.getIsAlive() && c.getIsAlive()) {

         c.showStatus(c, m);
         recur: while(true) {
            if(m.getHP() <= 0 || c.getHP() <= 0)
               return;
            try {
               Thread.sleep(700);
               System.out.print("\n1.공격 2.아이템사용 3.스킬사용: ");
            } catch (Exception e) {
            }

            num = sc.nextInt();
            switch(num) {
            case 1:
               c.attackJudgement(c, m);
               break recur;
            case 2:
               try {
                  if(c.getItem().size() <= 0) {
                     try {
                        Thread.sleep(700);
                     } catch (Exception e) {
                        // TODO: handle exception
                     }
                     System.out.println("아이템이 없습니다.");
                     break;
                  }
               }
               catch(Exception e) {
                  System.out.println(e.toString());
               }
               c.useItem(c, m, c.getItem());
               break;
            case 3:
               if(c.getMP() > 0) {
                  c.setSkill(true);
                  c.attackJudgement(c, m);
                  break recur;
               }
               else {
                  try {
                     Thread.sleep(700);
                  } catch (Exception e) {
                     // TODO: handle exception
                  }
                  System.out.println("MP가 없습니다.");
               }
            }
         }
         if(m.getHP() <= 0 || c.getHP() <= 0)
            return;
         m.attackJudgement(m, c);
      }
      return;
   }
   public static void main(String[] args) throws Exception {

      String str = "";
      int a,b;
      File f = new File("C:\\Users\\stu\\Desktop\\Project1\\data.txt");
      int num = 0;
      if(f.exists()) {
         try {

            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println();
            System.out.println("      #####     ##     ##   ##  ###### "); 
            Thread.sleep(200);
            System.out.println("     ##        ####    ### ###  ##    ");  
            Thread.sleep(200);
            System.out.println("     ##       ##  ##   #######  ##### ");  
            Thread.sleep(200);
            System.out.println("     ## ###   ##  ##   ## # ##  ##    ");   
            Thread.sleep(200);
            System.out.println("     ##  ##   ######   ##   ##  ##    ");    
            Thread.sleep(200);
            System.out.println("      #####   ##  ##   ##   ##  ###### "); 
            Thread.sleep(200);
            System.out.println();
            Thread.sleep(200);
            System.out.println("  ####    ######     ##     #####    ###### "); 
            Thread.sleep(200);
            System.out.println(" ##         ##      ####    ##  ##     ## ");  
            Thread.sleep(200);
            System.out.println("  ####      ##     ##  ##   ##  ##     ##");  
            Thread.sleep(200);
            System.out.println("     ##     ##     ##  ##   #####      ##");
            Thread.sleep(200);
            System.out.println("     ##     ##     ######   ## ##      ##    ");
            Thread.sleep(200);
            System.out.println("  ####      ##     ##  ##   ##  ##     ##   "); 
            Thread.sleep(200);
            System.out.println();
            Thread.sleep(200);
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            
         } catch (Exception e) {
            // TODO: handle exception
         }                               

         System.out.print("저장된 데이터를 불러오겠습니까?[y/n] ");
         str = sc.next();
      }

      if(str.equals("y") || str.equals("Y")) {
         try {
            set();
            for(int i = 0; i < l.size(); i++) {
               System.out.println((i + 1) + "." +l.get(i).getClass().getName().substring(13, l.get(i).getClass().getName().length()));
            }
         } catch(Exception e ) {
            System.out.println(e.toString());
         }
         System.out.print("선택할 캐릭터: ");
         num = sc.nextInt();
         c = l.get(num - 1);
         l.remove(num - 1);
      }
      else {
         l = new ArrayList(); 
         System.out.print("1.전사 2.마법사 3.궁수: ");
         num = sc.nextInt();

         switch(num) {
         case 1:
            c = new Warrior();
            break;
         case 2:
            c = new Magician();
            break;
         case 3:
            c = new Archer();
            break;
         }
      }
      while(true) {
         game();
         if(m.getHP() <= 0) {
            c.getItemByMonster(m, c.item);
            c.getItemByMonster(m, c.item);
            try {
               Thread.sleep(700);
            } catch (Exception e) {
               // TODO: handle exception
            }
            c.abilityRise(c);
            reset(c);
            do {
               System.out.print("1.저장하기 2.계속하기: ");

               num = sc.nextInt();
               if(num == 1) {
                  l.add(c);
                  save(l);
                  return;
               }

            } while(num != 1 && num != 2);
         }
         if(c.getHP() <= 0) {
            System.out.println("게임이 끝났습니다.");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            return;
         }
      }
   }
   public static void reset(Character c) {
      Scanner sc = new Scanner(System.in);
      Character ch = null;
      if (c.getClass().getName().equals("com.project1.Archer")) {
         ch = (Archer) c;
      } else if (c.getClass().getName().equals("com.project1.Warrior")) {
         ch = (Warrior) c;
      } else {
         ch = (Magician) c;
      }
      ch.setMaxHP(ch.getMaxHP());
      ch.setMaxMP(ch.getMaxMP());
      ch.setHP(ch.getMaxHP());
      ch.setMP(ch.getMaxMP());
   }
   public static void save(List<Character> c) {
      try {
         FileOutputStream fos = new FileOutputStream("C:\\Users\\stu\\Desktop\\Project1\\data.txt");
         // FileOutputStream("c:\\Users\\com\\Desktop\\RPGProject\\data.txt");
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(c);
         oos.close();
      } catch (Exception e) {
         System.out.println(e.toString());
      }
   }

   @SuppressWarnings("unchecked")
   public static void set() {
      FileInputStream fis;
      try {
         fis = new FileInputStream("C:\\Users\\stu\\Desktop\\Project1\\data.txt");
         // fis = new FileInputStream("c:\\Users\\com\\Desktop\\RPGProject\\data.txt");
         ObjectInputStream ois = new ObjectInputStream(fis);
         l = (List<Character>) ois.readObject();
      } catch (Exception e) {
         System.out.println(e.toString());
      }
   }
   public static Monster randomMonster() {
      Random rand = new Random();
      int num = rand.nextInt(10);
      if(num == 9) 
         return new Boss();
      else 
         return new Slime();
   }
}