package exercise14.homework;
/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Benjamin Shin
 *
 *prompt user for the order amount
 * prompt user for the state
 * use an if statement that checks if the state is = to WI
 * if it is WI output the subtotal, tax, and total
 * if it is not just output the total
 */

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

public class solution14 {
    public static void main(String[] args) {
        System.out.println("What is the order amount? ");
        Scanner input = new Scanner(System.in);
        float dollar = Float.parseFloat(input.next());
        System.out.println("What is the state? ");
        String state = input.next();

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.FLOOR);

        String total= "The total is $" + df.format(dollar);
        float tax = (float) (.055 * dollar);
        String compare = "WI";
        float grand_total = dollar+tax;

        if(Objects.equals(state, compare)){
            total = "The subtotal is $" + df.format(dollar) + "\n"
            + "The tax is $" + df.format(tax)+ "\n"+
            "The total is $"+ df.format(grand_total) ;
        }

        System.out.println(total);
    }
}
