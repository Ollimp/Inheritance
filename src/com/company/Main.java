package com.company;

public class Main {

    public static void main(String[] args) {
        EmployeeWithTax vasya = new EmployeeWithTax("Vasya", "Ставка", 20);
        System.out.println(vasya.getFullName());
        System.out.println(vasya.getPayment());
        System.out.println(vasya.getPaymentWithTax());

    }

}
