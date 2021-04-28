package com.BinhHu.part1;

public class Multi2 implements Runnable {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        // tests if this thread is alive
        for (int i = 0; i < 5; i++) {
            System.out.println("status "+i+ ": "+  t.isAlive());
        }

    }

    public static void main(String[] args) throws InterruptedException {
        // Kế thừa từ Runnable thì phải tạo đối tượng Thread nữa !!!
//        Multi2 m1 = new Multi2();
//        Thread t1 = new Thread(m1);
//        t1.start();
        Thread t = new Thread(new Multi2());

        // this will call run() function
        t.start();

        // waits for this thread to die

        t.join();
        // tests if this thread is alive
        for (int i = 0; i < 1; i++) {
            System.out.println("status 2= " + t.isAlive());
        }

    }
}
