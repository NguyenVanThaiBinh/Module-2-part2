package com.BinhHu.part1;

public class TestSleepMethod1  extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep(500);
                Thread t = Thread.currentThread();
                // tests if this thread is alive
                System.out.println("status = " + t.isAlive());

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println(i);


        }
    }

    public static void main(String[] args) {
        TestSleepMethod1 t = new TestSleepMethod1();
        TestSleepMethod1 t2 = new TestSleepMethod1();
        t.start();
        try{
            t.join(1500);
            System.out.println(t.isAlive());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        t2.start();
        System.out.println(t2.isAlive());
        System.out.println("status t1 = " + t.isAlive());
        System.out.println("status t2 = " + t2.isAlive());
    }
}
