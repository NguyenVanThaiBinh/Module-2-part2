package com.BinhHu.part2;

public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {

        for (int i = 2; ; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 2) {
                System.out.println("Fast: "+i + " ");
                continue;
            }
            boolean check = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.println("Fast: "+i + " ");
            }

        }
    }
}
