package com.study.main;

import com.study.customer.Customer;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerMain {

  static  Customer @NotNull [] input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть дані про покупців, кінець введення - пустий рядок у полі ID");
        ArrayList<Customer> customerArray = new ArrayList<>();
        int count = 1;
        while (true) {
            String temp;
            Customer tempCust;
            System.out.println("\nПокупець №" + count++);
            System.out.println("Введіть ID: ");
            if ((temp = scan.nextLine()).equals("")) break;
            else tempCust = new Customer();
            tempCust.setId(Integer.parseInt(temp));
            System.out.println("Введіть прізвище: ");
            tempCust.setLastName(scan.nextLine());
            System.out.println("Введіть ім'я: ");
            tempCust.setFirstName(scan.nextLine());
            System.out.println("Введіть по батькові: ");
            tempCust.setMiddleName(scan.nextLine());
            System.out.println("Введіть адресу: ");
            tempCust.setAddress(scan.nextLine());
            System.out.println("Введіть номер кредитної картки: ");
            tempCust.setCreditCarNumber(Long.parseLong(scan.nextLine()));
            System.out.println("Введіть баланс рахунку (кількість грошей): ");
            tempCust.setMoneyBalance(Double.parseDouble(scan.nextLine()));
            customerArray.add(tempCust);
        }
        return customerArray.toArray(new Customer[0]);
    }

    static  Customer [] nameCheck(String name, Customer [] array) {
      if(name == null || name.equals("") || array == null) return null;
      ArrayList<Customer> tempArray = new ArrayList<>();
        for (Customer cust: array) {
            if(cust.getFirstName().equals(name)) tempArray.add(cust);
        }
        return tempArray.toArray(new Customer[0]);
    }
    static  Customer [] cardNumberLimits(long low, long upper,Customer [] array ){
        if(low >= upper || array == null) return null;
        ArrayList<Customer> tempArray = new ArrayList<>();
        for (Customer cust: array) {
            if((cust.getCreditCarNumber() >= low) && (cust.getCreditCarNumber() <= upper))tempArray.add(cust);
        }
        return tempArray.toArray(new Customer[0]);
    }
    static  Customer [] indebtednessList(Customer [] array ){
        if(array == null) return null;
        ArrayList<Customer> tempArray = new ArrayList<>();
        for (Customer cust: array) {
            if(cust.getMoneyBalance() < 0) tempArray.add(cust);
        }
        return tempArray.toArray(new Customer[0]);
    }
    public static void main(String[] args) {
        Customer[] customers = input();
        System.out.println("\nВведені дані: ");
        int count = 1;
        for (Customer cust: customers) {
            System.out.println("\nПокупець №" + count++ + cust);
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("З яким іменем вам вивести список покупців? ");
        String name = scan.nextLine();
        Customer[] result = nameCheck(name,customers);
        count = 1;
        for (Customer cust:  result) {
            System.out.println("\nПокупець №" + count++ + cust);
        }
        System.out.println("З яким інтервалом номера кредитної картки покупців, список потрібно вивести? ");
        result = cardNumberLimits(Long.parseLong(scan.nextLine()),Long.parseLong(scan.nextLine()),customers);
        for (Customer cust:  result) {
            System.out.println("\nПокупець №" + count++ + cust);
        }

        result = indebtednessList(customers);
        System.out.println("Кількість покупців, які мають заборгованість: " + result.length);
        System.out.println("Список покупців, які мають заборгованість: ");
        for (Customer cust:  result) {
            System.out.println("\nПокупець №" + count++ + cust);
        }
    }
}
