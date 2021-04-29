package com.BinhHu.part2;

public class NumberGenerator extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        NumberGenerator n1 = new NumberGenerator();
        NumberGenerator n2 = new NumberGenerator();
        n1.setPriority(Thread.MAX_PRIORITY);
        n2.setPriority(Thread.MIN_PRIORITY);
        n1.start();
        n2.start();
    }
}
