package com.project4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HosvotalizationImpl implements Hospitalization {

   ChartVO vo = new ChartVO();
   ChartImpl ci = new ChartImpl();
   Scanner sc = new Scanner(System.in);
   Map<Integer, ChartVO> hMap = new HashMap<>();
   String str;

   int bed,room;
   String bed_now[] = { "", "", "", "" };
   String bed_prn[] = { "", "", "", "" };
   String bed_ill[] = { "", "", "", "" };

   public void file_save() throws Exception {
      try {

         // ������ �����ϱ� ����
         FileOutputStream fos = new FileOutputStream(str);
         ObjectOutputStream oos = new ObjectOutputStream(fos);

         // ���� ������ ħ�븦 ����
         oos.writeObject(bed_now);
         oos.writeObject(bed_prn);
         oos.writeObject(bed_ill);

         fos.close();
         oos.close();

      } catch (Exception e) {
         // TODO: handle exception
      }

   }
   
   public void view() {
      String s="��";
      System.out.println("\n          -" + room + "ȣ-");
      System.out.println("  ����������bed1����������");
      System.out.printf("   %10s               \n", bed_prn[0]);
      System.out.printf("   %10s               \n", bed_now[0]);
      System.out.printf("   %10s               \n",bed_ill[0]);
      System.out.println("  ������������������������");
      System.out.println();
      System.out.println("  ����������bed2����������");
      System.out.printf("   %10s               \n", bed_prn[1]);
      System.out.printf("   %10s               \n", bed_now[1]);
      System.out.printf("   %10s               \n",bed_ill[1]);
      System.out.println("  ������������������������");
      System.out.println();
      System.out.println("  ����������bed3����������");
      System.out.printf("   %10s               \n", bed_prn[2]);
      System.out.printf("   %10s               \n", bed_now[2]);
      System.out.printf("   %10s               \n",bed_ill[2]);
      System.out.println("  ������������������������");
      System.out.println();
      System.out.println("  ����������bed4����������");
      System.out.printf("   %10s               \n", bed_prn[3]);
      System.out.printf("   %10s               \n", bed_now[3]);
      System.out.printf("   %10s               \n",bed_ill[3]);
      System.out.println("  ������������������������");
      System.out.println();
      
   }

   @Override
   public void setup() {

      while (true) {

         try {
            System.out.print("�� ȣ��[���� ȭ�� 0]? ");
            room = sc.nextInt();
            
            if(room==0) new Main();
            
            str = "d:\\doc\\hosvotal\\hosvotalization\\" + room + ".txt";

            File f = new File(str);
            if (!f.exists()) {
               if (!f.getParentFile().exists())
                  f.getParentFile().mkdirs();
               file_save();
            }
            
            
            // ���� �ҷ�����
            FileInputStream fis = new FileInputStream(str);
            ObjectInputStream ois = new ObjectInputStream(fis);

            bed_now = (String[]) ois.readObject();
            bed_prn = (String[]) ois.readObject();
            bed_ill = (String[]) ois.readObject();

            view();
            System.out.print("\nħ�� ��ȣ[���� ȭ�� 0]: ");

            do {
               bed = sc.nextInt();
            } while (bed < 0 || bed > 4);
            if (bed == 0) {
               file_save();
               new Main();
            }

            if (bed_now[bed - 1].equals("")) {
               // �Կ�ȯ�� ���
               register();
            } else {
               // ȯ�� ���� ���� or ȯ�� ���
               int num;
               do {
                  System.out.println("1. ȯ�� ���� 2. ��� ó��");
                  num = sc.nextInt();
                  if (num == 1)
                     viewInfo();
                  else
                     discharge();
               } while (num < 1 || num > 2);
            }

            fis.close();
            ois.close();

         } catch (Exception e) {
            System.out.println(e.toString());
         }

      }
   }

   @Override
   public void register() {

      try {

         System.out.println("-------------���Կ� ��ϡ�---------------");
         int pprn;

         System.out.print("ȯ�� ��Ϲ�ȣ: ");
         pprn=sc.nextInt();

         System.out.print("�̸�: ");
         vo.setName(sc.next());

         //System.out.print("����: ");
         //bed_ill[bed - 1] = sc.nextLine();
         bed_ill[bed-1]="�ۦ�����";

         bed_now[bed - 1] = vo.getName();
         bed_prn[bed - 1] = Integer.toString(pprn);

         file_save();

         System.out.println("��� �Ϸ�");
         view();

      } catch (Exception e) {
         
      }

   }

   @Override
   public void discharge() {

      System.out.printf("%4s���� ��� ó���Ǿ����ϴ�.\n", bed_now[bed - 1]);

      bed_now[bed - 1] = "";
      bed_prn[bed - 1] = "";
      bed_ill[bed - 1] = "";

      try {
         file_save();
      } catch (Exception e) {
         
      }
   }

   @Override
   public void viewInfo() {

      try {

         FileInputStream fis = new FileInputStream("d:\\doc\\hospital\\patinfo.txt");
         ObjectInputStream ois = new ObjectInputStream(fis);

         hMap = (Map<Integer, ChartVO>) ois.readObject();

         ChartVO vo = hMap.get(bed_prn[bed - 1]);
         if(vo==null) System.out.println("ȯ�� ������ �������� �ʽ��ϴ�.");
         //vo.setPrn(Integer.parseInt(bed_prn[bed - 1]));
         System.out.println("��Ϲ�ȣ: "+bed_prn[bed - 1]);
         vo.print();
         
         fis.close();
         ois.close();

      } catch (Exception e) {
      }

   }

   @Override
   public boolean searchPrn(Integer prn) {
      if (hMap.containsKey(prn))
         return true;
      return false;
   }

}