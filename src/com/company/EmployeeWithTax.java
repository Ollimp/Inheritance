package com.company;

public class EmployeeWithTax extends Employee {

    private int tax;

    public EmployeeWithTax(String fullName, String type, double payment) {
        super(fullName, type, payment);
        if("ставка".equals(type)) {
            tax = 20;
        } else {
            tax = 15;
        }
    }

    public double getPaymentWithTax() {
        return getPayment() - getPayment() * tax / 100.0;
    }
}
