package com.study.customer;

public class Customer {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private long creditCarNumber;
    private double moneyBalance;

    public Customer() {}

    public Customer(int id, String lastName, String firstName, String middleName, String address, long creditCarNumber, double moneyBalance) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.creditCarNumber = creditCarNumber;
        this.moneyBalance = moneyBalance;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getAddress() {
        return address;
    }

    public long getCreditCarNumber() {
        return creditCarNumber;
    }

    public double getMoneyBalance() {
        return moneyBalance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCreditCarNumber(long creditCarNumber) {
        this.creditCarNumber = creditCarNumber;
    }

    public void setMoneyBalance(double moneyBalance) {
        this.moneyBalance = moneyBalance;
    }

    @Override
    public String toString() {
        return "\nID: " + id +"\nПрізвище: "+ lastName + "\nІм'я: " + firstName + "\nПо батькові: "
                + middleName + "\nАдреса: " + address + "\nНомер кредитної картки: " +
                creditCarNumber + "\nБаланс рахунку: " + moneyBalance;
    }
}
