/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Benjamin Shin
 *
 * write a function that converts currency
 * in this function it would be euros to U.S dollars
 * prompt user how much euros they have
 * prompt for the exchange rate of the euro
 * print the new amount in dollars
 */
package exercise11.homework;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class solution11 {
    public static void main(String[] args) {
        System.out.println("How many euros are you exchanging? ");
        Scanner input = new Scanner(System.in);
        float euros = Float.parseFloat(input.next());

        System.out.println("What is the exchange rate? ");
        float exchange_rate = Float.parseFloat((input.next()));
        System.out.println(euros + " Euros at an exchange rate of "+ exchange_rate + " is");
        float dollars= (float) (euros * exchange_rate);
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println((df.format(dollars)) +" U.S. dollars.");
    }
}
