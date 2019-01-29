package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Everybody wants to give a unique gift that will be remembered year-round. Yet, when that special occasion comes our
 * minds go blank and we forget what our recipients want. Thus, we end up giving ties, scarves, and candles that
 * inevitably get re-gifted.
 * <p>
 * Your task is to develop a program that will prompt the user for the recipient's gender. You'll also ask for the
 * giver's price range. Use high, medium, or low.
 * <p>
 * Now, write a program that will select the perfect gift based on the table below. Feel free to modify the gift list
 * if you wish.
 * <p>
 * Gift	            Gender	Price
 * ------------------------------
 * Jewelry	        Female	High
 * Weekend Getaway	Female	High
 * Selfie Stick	    Female	Low
 * Wine Bottle	    Female	Low
 * Perfume	        Female	Medium
 * Sweater	        Female	Medium
 * Smart TV	        Male	High
 * Apple Watch	    Male	High
 * Books	        Male	Low
 * Shoes	        Male	Low
 * Guitar	        Male	Medium
 * Playstation	    Male	Medium
 *
 *
 * <b>Bonus:</b> Add a column to the list for age and change your program to prompt for the age (adult, teen, child) of
 * the recipient. You'll need to add more gift ideas if this is the case. You should also handle the possibility that you
 * have no gift ideas. In which case, just say ... get him/her a gift certificate.
 */
public class Main {

    public static void main(String[] args) {
        List<Gift> gifts = new ArrayList<>();
        gifts.add(new Gift("Jewelery", "Female", "High", "adult"));
        gifts.add(new Gift("Weekend Getaway", "Female", "High", "teen"));
        gifts.add(new Gift("Selfie Stick", "Female", "Low", "teen"));
        gifts.add(new Gift("Wine Bottle", "Female", "Low", "adult"));
        gifts.add(new Gift("Perfume", "Female", "Medium", "adult"));
        gifts.add(new Gift("Sweater", "Female", "Medium", "teen"));
        gifts.add(new Gift("Smart TV", "Male", "High", "child"));
        gifts.add(new Gift("Apple Watch", "Male", "High", "child"));
        gifts.add(new Gift("Books", "Male", "Low", "teen"));
        gifts.add(new Gift("Shoes", "Male", "Low", "teen"));
        gifts.add(new Gift("Guitar", "Male", "Medium", "adult"));
        gifts.add(new Gift("Playstation", "Male", "Medium", "child"));

        //add two additional gifts
        gifts.add(new Gift("Candies","Male","Low","child"));
        gifts.add(new Gift("Cell Phone","Female","High","teen"));

        System.out.print("Enter the gender (Male or Female): ");
        Scanner keyboard = new Scanner(System.in);
        String genderInput = keyboard.next().toLowerCase();

        System.out.print("Enter the price (Low, Medium or High): ");
        String priceInput = keyboard.next().toLowerCase();

        System.out.print("Enter the age (child, teen, adult): ");
        String ageInput = keyboard.next().toLowerCase();

        String gender = "", price = "", age = "";
        boolean noGift = true;
        for (Gift gift : gifts) {
            gender = gift.getGender();
            price = gift.getPrice();
            age = gift.getAge();
            if (genderInput.equalsIgnoreCase(gender) &&  priceInput.equalsIgnoreCase(price) && ageInput.equalsIgnoreCase(age)) {
                System.out.println(gift.getGiftName() + " " + gender + " " + price + " " +age);
                noGift = false;
            }
        }

        if(noGift){
            if(gender.equalsIgnoreCase("Male"))
             System.out.println("get him a gift certificate");
            else{
                System.out.println("get her a gift certificate");
            }
        }
    }
}
