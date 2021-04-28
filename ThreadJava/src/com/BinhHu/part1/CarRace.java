package com.BinhHu.part1;

import java.util.Random;

public  class CarRace {
    public static int DISTANCE = 100;

    public static int STEP = 2;
    public  static  class Car implements Runnable {
        // Khai báo Tên của xe đua
        private String name;

        public Car(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            // Khởi tạo điểm start(hay km ban đầu)
            int runDistance = 0;
            // Khởi tạo time bắt đầu cuộc đua
            long startTime = System.currentTimeMillis();

            // Kiểm tra chừng nào còn xe chưa kết thúc quãng đường đua thì xe vẫn tiếp tục chạy
            while (runDistance < CarRace.DISTANCE) {
                try {
                    // Random Speed KM/H
                    int speed = (new Random()).nextInt(20);
                    // Calculate traveled distance
                    runDistance += speed;
                    // Build result graphic
                    String log = "|";
                    int percentTravel = (runDistance * 100) / DISTANCE;
                    for (int i = 0; i < DISTANCE; i += STEP) {
                        if (percentTravel >= i + STEP) {
                            log += "=";
                        } else if (percentTravel >= i && percentTravel < i + STEP) {
                            log += "o";
                        } else {
                            log += "-";
                        }
                    }
                    log += "|";
                    System.out.println("Car" + this.name + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Car" + this.name + " broken...");
                    break;
                }
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
        }
    }
    public static void main(String[] args) {
        Car carA = new Car("A");
        Car carB = new Car("B");


        Thread thread1 = new Thread(carA);
        Thread thread2 = new Thread(carB);


        System.out.println("Distance: 100KM");
        thread1.start();
        thread2.start();

    }
}
