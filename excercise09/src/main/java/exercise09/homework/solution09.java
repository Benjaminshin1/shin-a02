/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Benjamin Shin
 *
 * Calculate gallons of paint needed to paint the ceiling of a room.
 * prompt user for length and width
 * multiply length times width and divide by the given number 350
 * round the number up to the nearest integer as you cannot buy fractional gallons of paint
 *
 */
package exercise09.homework;

import java.util.Scanner;

public class solution09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length?:");
        double length = Double.parseDouble(input.next());

        System.out.println("What is the width?:");
        double width = Double.parseDouble(input.next());
        double area = length*width;

       double gallons =(length*width)/350;
        System.out.println("You will need " + Math.ceil(gallons) + " of paint to cover " + area + " square feet.");


    }
}
