package exercise13.homework;

/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Benjamin Shin
 *
 * create a program that computes simple interest
 * prompt user for the principal amount
 * prompt user for rate of interest and divide the percentage by 100
 * prompt user for the amount of years
 * prompt user for number of times the interest is compounded per year
 * using the formula A = P(1 + r/n)^(n*t)
 * calculate the
 */
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class solution13 {
    public static void main(String[] args) {
        System.out.println("What is the principal? ");
        Scanner input = new Scanner(System.in);
        float Principal = Float.parseFloat(input.next());

        System.out.println("What is the rate? ");
        float rate = Float.parseFloat((input.next()));
        float percent = rate/100;

        System.out.println("What is the number of years? ");
        int years = Integer.parseInt(input.next());

        System.out.println("What is the number of times the interest is compounded per year?");
        int compound = Integer.parseInt(input.next());


        double last =Principal * Math.pow(1 + (percent / compound), compound * years);

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println(Principal + " invested at "+ rate +"%, for "+ years + "years compounded " + compound + " times per year is $" +(df.format(last)) + ".");


    }
}
