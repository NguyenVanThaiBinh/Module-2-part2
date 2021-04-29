package com.BinhHu.part2;

public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int i = 2; ; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 2) {
                System.out.println("Slow: "+i + " ");
                continue;
            }
            boolean check = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.println("Slow: "+i + " ");
            }

        }
    }


}
