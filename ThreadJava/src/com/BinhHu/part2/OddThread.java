package com.BinhHu.part2;

import java.util.Random;

public class OddThread  extends Thread{
   public void run(){
      for (int i = 0; i < 10; i++) {
         try {
            Thread.sleep(10);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
         if(i %2 != 0){
            System.out.println(i);
         }
      }

   }
}
