package com.company;

public class Gift {
    private String gift;
    private char gender;
    private double price;

    public Gift() {
    }

    public Gift(String gift, char gender, double price) {
        this.gift = gift;
        this.gender = gender;
        this.price = price;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
