package com.project1;

import java.util.*;

public class Slime extends Monster {
   Random rand = new Random();

   static int icedCount = 0;
   static int firedCount = 0;

   public Slime() {
      setHP(100);
      setMaxHP(this.getHP());
      setAttack(10);
      setEvasion(10);
      setIsAlive(true);
      setStatus("");
      try {
         Thread.sleep(700);

      } catch (InterruptedException e) {
      }

      System.out.println("슬라임을 만났습니다.");
   }

   @Override
   public void attack(Object o1, Object o2) {
      Character c = null;
      String str = "Slime";
      int attack = ((Slime)o1).getAttack();
      if(o2.getClass().getName().equals("com.project1.Warrior")) {
         str = "전사";
         c = (Warrior)o2;
      } else if(o2.getClass().getName().equals("com.project1.Magician")) {
         str = "마법사";
         c = (Magician)o2;
      } else {
         str = "궁수";
         c = (Archer)o2;
      }
      int cur = c.getHP();
      Slime s = (Slime)o1;
      c.setHP(cur - attack);
      try {
         Thread.sleep(700);
         System.out.println(str+"가 공격을 당해 HP가 "+ cur + "에서 "+c.getHP()+"로 줄었습니다.");
      } catch (Exception e) {
         // TODO: handle exception
      }
      
      if(c.getHP() == 0) {
         isAlive(c);
      }
   }

   @Override
   public void attackJudgement(Object o1, Object o2) {
      try {
      Monster m = (Slime)o1;
      if(m.getStatus().equals("Iced")) {
         Thread.sleep(700);
         System.out.println("슬라임이 '빙결'상태입니다.");
         icedCount++;
         return;
      }
      if(m.getStatus().equals("Fired")) {
         firedCount++;
         try {
            Thread.sleep(700);
         } catch (Exception e) {
            // TODO: handle exception
         }
         System.out.println("슬라임이 '화상'상태입니다.");
      }
      if(icedCount >= 2) {
    	  m.setStatus("");
      }
      if(firedCount >= 2) {
    	  m.setStatus("");
      }
      
      icedCount = 0;
      firedCount = 0;

      Random rand = new Random();
      Character c = null;
      String str = "";
      int num = rand.nextInt(100);
      if(o2.getClass().getName().equals("com.project1.Warrior")) {
         c = (Warrior)o2;
         str = "전사";
      } 
      else if(o2.getClass().getName().equals("com.project1.Magician")) {
         c = (Magician)o2;
         str = "마법사";
      } 
      else {
         c = (Archer)o2;
         str = "궁수";
      }
      if(num >= (100 - c.getEvasion())) {
         try {
            Thread.sleep(700);
         } catch (Exception e) {
            // TODO: handle exception
         }
         System.out.println(str+"가 회피에 성공했습니다.");
         System.out.println("HP : "+c.getHP());
         return;
      }
      attack(m, c);
      } catch (Exception e) {
         // TODO: handle exception
      }
   }

   @Override
   public void isAlive(Object o) {
      Character c = null;
      String str = "";
      if(o.getClass().getName().equals("com.project1.Warrior")) {
         c = (Warrior)o;
         str = "전사";
      }
      else if(o.getClass().getName().equals("com.project1.Magician")) {
         c = (Magician)o;
         str = "마법사";
      }
      else {
         c = (Archer)o;
         str = "궁수";
      }
      try {
         Thread.sleep(700);
         System.out.println(str + "가 죽었습니다.");
      } catch (Exception e) {
         // TODO: handle exception
      }
      
      c.setAlive(false);
   }
}