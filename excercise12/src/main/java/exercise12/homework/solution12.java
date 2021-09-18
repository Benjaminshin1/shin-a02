/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Benjamin Shin
 *
 * create a program that computes simple interest
 * prompt user for the principal amount
 * prompt user for rate of interest and divide the percentage by 100
 * prompt user for the amount of years
 * using the formula A = P(1 + rt)
 * calculate the
 */
package exercise12.homework;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class solution12 {
    public static void main(String[] args) {
        System.out.println("Enter the principal: ");
        Scanner input = new Scanner(System.in);
        float Principal = Float.parseFloat(input.next());

        System.out.println("Enter the rate of interest: ");
        float rate = Float.parseFloat((input.next()));
        float percent = rate/100;

        System.out.println("Enter the number of years");
        int years = Integer.parseInt(input.next());

        float total = Principal*(1 + (percent*years));

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println("After "+ years + " years at "+ rate +"%, the investment will be worth $" +(df.format(total)));


    }
}
