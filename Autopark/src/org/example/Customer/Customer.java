package org.example.Customer;

public class Customer {
    private int id;
    private String name;
    private int age;
    int balance;

    public Customer(int id, String name, int age, int balance) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
