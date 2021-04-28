package com.BinhHu.part1;

public class FirstThread  extends Thread{
    public void run(){
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {

        FirstThread t1 = new FirstThread();
        t1.start();

    }
}
