package com.BinhHu.part2;

public class TestEvenOddNumber {
    public static void main(String[] args) {
        OddThread n1 = new OddThread();
        EvenThread n2 = new EvenThread();
        n1.start();
        try {
            n1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        n2.start();
    }
}
