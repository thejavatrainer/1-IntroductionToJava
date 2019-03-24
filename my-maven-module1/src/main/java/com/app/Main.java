package com.app;

public class Main {
    public static void main(String[] args) {
        Person contact1 = new Person();
        contact1.name = "Maria";
        contact1.phoneNumber = "0743111111";
        System.out.println("First contact name: " +contact1.name + " phone number:" +contact1.phoneNumber);

        Person contact2 = new Person();
        contact2.name = "Raluca";
        contact2.phoneNumber = "0743222222";
        System.out.println("Second contact name: " +contact2.name + " phone number:" +contact2.phoneNumber);

        Person contact3 = new Person();
        contact3.name = "Matei";
        contact3.phoneNumber = "0743333333";
        System.out.println("Third contact name: " +contact3.name + " phone number:" + contact3.phoneNumber);
    }
}