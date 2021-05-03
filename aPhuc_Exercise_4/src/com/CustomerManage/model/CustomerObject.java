package com.CustomerManage.model;

import java.util.Scanner;

public class CustomerObject {
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    Scanner sc3 = new Scanner(System.in);
    private String name, address, email, gender;
    private int telephone, id, countToBuy;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCountToBuy() {
        return countToBuy;
    }

    public void setCountToBuy(int countToBuy) {
        this.countToBuy = countToBuy;
    }

    public CustomerObject() {
    }

    @Override
    public String toString() {
        return " id=" + id +","+
                " name=" + name +","+
                " address=" + address +","+
                " email=" + email+","+
                " gender=" + gender+","+
                " telephone= 0" + telephone +","+
                " countToBuy= " + countToBuy+" .";
    }

    public CustomerObject(int id, String name, String address, String email, int telephone, String gender, int countToBuy) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.gender = gender;
        this.telephone = telephone;
        this.id = id;
        this.countToBuy = countToBuy;
    }

    public void inputCustomer() {
        System.out.println("Nhập tên:");
        this.name = sc.nextLine();
        System.out.println("Nhập dia chi:");
        this.address = sc1.nextLine();
        System.out.println("Nhap email:");
        this.email = sc2.nextLine();
        Scanner sc1 = new Scanner(System.in);

        do {
            System.out.println("Nhap sdt khach hang:");
            while (!sc3.hasNextInt()) {
                System.out.println("Please input Telephone again: ");
                sc3.next();
            }
            this.telephone = sc3.nextInt();
        } while (this.telephone  <   100000000 || this.telephone > 999999999);
        // <   100 000 000   || < 999 999 999
        //   0 914 249 819
        //   0 329 853 571
        System.out.println("Nhap gioi tinh");
        this.gender = sc.nextLine();
    }

    public String toCSVFormat() {
        return id + ", " + name + ", " + address + ", " + email + ", " + telephone + ", " + gender + ", "
                + countToBuy + "\n";
    }


}
