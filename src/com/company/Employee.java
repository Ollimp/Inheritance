package com.company;

public class Employee {
    private String fullName;
    private String type;
    private double payment;

    public Employee(String fullName, String type, double payment) {
        this.fullName = fullName;
        this.type = type;
        this.payment = payment;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }
}
