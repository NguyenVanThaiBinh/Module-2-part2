package com.BinhHu.part3;

public class MyBank {
    int money;

    public int getMoney() {
        return money;
    }

    public MyBank() {
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public MyBank(int money) {
        this.money = money;
    }
    public  synchronized void withDraw(int money,String theadName){
        if(money <= this.money){
            System.out.println("Draw is successfully: "+money+", "+
            theadName);
            this.money -= money;
        }else{
            System.out.println("Can't not draw! "+theadName);
        }
        System.out.println("My account is: "+this.money);
    }
}
