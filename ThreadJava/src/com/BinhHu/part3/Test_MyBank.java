package com.BinhHu.part3;

import java.util.ArrayList;
import java.util.List;

public class Test_MyBank extends Thread {
    MyBank myBank;
    String name;

    public Test_MyBank(MyBank myBank, String name) {
        this.myBank = myBank;
        this.name = name;
    }

    @Override
    public void run() {

            myBank.withDraw(800, name);

    }

    public static void main(String[] args) {
        MyBank myBank = new MyBank(1000);
//        myBank.withDraw(800, currentThread().getName());
//        myBank.withDraw(800, currentThread().getName());
//        myBank.withDraw(800, currentThread().getName());
        List<Test_MyBank> theadList = new ArrayList<>();
        //  Tạo 3 đối tượng myBank bỏ vào tk ArrayList
        for (int i = 0; i < 5; i++) {
            theadList.add(new Test_MyBank(myBank, "Thread-" + i));
        }
        //  Duyệt các phần từ trong ArrayList rồi cho nó Start
        for (Test_MyBank test : theadList) {
            test.start();
        }
    }
}
