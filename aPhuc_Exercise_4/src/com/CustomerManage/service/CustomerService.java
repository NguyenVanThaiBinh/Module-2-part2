package com.CustomerManage.service;

import com.CustomerManage.dal.CustomerDataBase;
import com.CustomerManage.model.CustomerObject;

import java.io.IOException;
import java.util.Scanner;

import static com.CustomerManage.dal.CustomerDataBase.customerLinkedList;

public class CustomerService {
    CustomerDataBase customerDataBase = new CustomerDataBase();

    public void loadFileCustomer() throws IOException {
        customerDataBase.loadFileCustomer();
    }

    public void showAllCustomer() throws IOException {
        customerDataBase.readFileCustomer();
    }

    public void addCustomer() throws IOException {


        CustomerObject customerObject = new CustomerObject();
        customerObject.inputCustomer();
        for (CustomerObject customer : customerLinkedList) {
            if (customer.getEmail().equals(customerObject.getEmail())
                    || customer.getTelephone() == customerObject.getTelephone()) {
                System.out.println("Khach hang da ton tai, He thong vua update thong tin\n" +
                        "Chon menu de thuc hien tiep\n" +
                        "==========================================\n");
                return;
            }
        }
        int count = customerLinkedList.size();
        customerObject.setId(++count);
        customerLinkedList.add(customerObject);
        customerDataBase.saveFileCustomer();
        System.out.println(" Ban vua them moi khach hang  '" + customerObject.getName() + "'  thanh cong!");
        System.out.println("Chon menu de thuc hien tiep\n" +
                "==========================================");

    }

    public void searchCustomer() {
        if(customerLinkedList.size()==0){
            System.err.println("Customer Manager File is Empty!");
            return;
        }

        int telephone = getTelephone();
        System.out.println("Hẹ thong dang tim kiem\n" +
                "Ket qua:\n");
        boolean check = true;
        for (CustomerObject customer : customerLinkedList) {
            if (customer.getTelephone() == telephone) {
                System.out.println(customer.toString());
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Khong ton tai khach hang \n" +
                    "Chon menu de thuc hien tiep\n" +
                    "==========================================\n" +
                    "\n");
        }

    }

    public void increaseCustomerBought() throws IOException {
        if(customerLinkedList.size()==0){
            System.err.println("Customer Manager File is Empty!");
            return;
        }

        int telephone = getTelephone();
        boolean check = true;
        for (CustomerObject customer : customerLinkedList) {
            if (customer.getTelephone() == telephone) {
                customer.setCountToBuy(customer.getCountToBuy() + 1);
                System.out.println("Thong tin sau khi tang 1 don hang");
                System.out.println(customer.toString());
                System.out.println("                                          --------------");
                check = false;
                customerDataBase.saveFileCustomer();
                break;
            }
        }
        if (check) {
            System.out.println("Khong ton tai khach hang \n" +
                    "Chon menu de thuc hien tiep\n" +
                    "==========================================\n" +
                    "\n");
        }


    }

    public void sortCustomerByCountToBuy() throws IOException {
        if(customerLinkedList.size()==0){
            System.err.println("Customer Manager File is Empty!");
            return;
        }

        customerLinkedList.sort((o2, o1) -> {
            if (o1.getCountToBuy() < o2.getCountToBuy()) {
                return -1; //doi cho~
            }
            return 1;
        });
        System.out.println("Is Sorted!");
        System.out.println("------------");
        for (CustomerObject customerObject : customerLinkedList) {
            System.out.println(customerObject.toString());
        }
    }

    public void editCustomer() throws IOException {
        if(customerLinkedList.size()==0){
            System.err.println("Customer Manager File is Empty!");
            return;
        }

        boolean check = true;
        int telephone = getTelephone();
        for (CustomerObject customer : customerLinkedList) {
            if (customer.getTelephone() == telephone) {
                customer.inputCustomer();
                System.out.println("                                          --------------");
                customerDataBase.saveFileCustomer();
                check = false;
            }
        }
        if (check) {
            System.out.println("Khong ton tai khach hang \n" +
                    "Chon menu de thuc hien tiep\n" +
                    "==========================================\n" +
                    "\n");
        }
    }

    public void deleteCustomer() throws IOException {
        if(customerLinkedList.size()==0){
            System.err.println("Customer Manager File is Empty!");
            return;
        }
        boolean check = true;
        int telephone = getTelephone();
        for (CustomerObject customer : customerLinkedList) {
            if (customer.getTelephone() == telephone) {
                customerLinkedList.remove(customer);
                System.out.println("Delete complete!");
                System.out.println("                                          --------------");
                customerDataBase.saveFileCustomer();
                check = false;
            }
        }
        if (check) {
            System.out.println("Khong ton tai khach hang \n" +
                    "Chon menu de thuc hien tiep\n" +
                    "==========================================\n" +
                    "\n");
        }
    }

    private int getTelephone() {
        Scanner sc1 = new Scanner(System.in);
        int telephone;
        do {
            System.out.println("Nhap sdt khach hang:");
            while (!sc1.hasNextInt()) {
                System.out.println("Please input Telephone again: ");
                sc1.next();
            }
            telephone = sc1.nextInt();
        } while (telephone < 100000000 || telephone > 999999999);
        return telephone;
    }
}





