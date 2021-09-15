/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Benjamin Shin
 *
 * make a function similar to a checkout system at a register
 * prompt user for 3 items and their quantities
 * calculate subtotal of the items
 * then calculate the tax using the percentage provided of 5.5 percent
 * print out the subtotal , tax, and total
 *
 */
package exercise10.homework;
import java.util.Scanner;

public class solution10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of item 1:");
        float item1 = (float) Double.parseDouble(input.next());

        System.out.println("Enter the quantity of item 1:");
        int quant1 = Integer.parseInt(input.next());
        double subtotal= item1*quant1;

        System.out.println("Enter the price of item 2:");
        float item2 = (float) Double.parseDouble(input.next());

        System.out.println("Enter the quantity of item 2:");
        int quant2 = Integer.parseInt(input.next());
        double subtotal1=item2 * quant2;

        System.out.println("Enter the price of item 3:");
        float item3 = (float) Double.parseDouble(input.next());

        System.out.println("Enter the quantity of item 3:");
        int quant3 = Integer.parseInt(input.next());
        double subtotal2=item3 * quant3;
        double subtotal3 = subtotal + subtotal1 + subtotal2;
        double tax = subtotal3 * .055;
        double total= tax + subtotal3;
        System.out.println("Subtotal: $"+ subtotal3);
        System.out.println("tax: $"+ tax);
        System.out.println("total: $"+ total);


    }
}
