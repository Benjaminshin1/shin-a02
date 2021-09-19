/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Benjamin Shin
 */
/*
Write a program that asks the user for 3 separate numbers
compare the 3 numbers and output the highest value number
 */
package exercise22.homework;

import java.util.Scanner;

public class solution22 {
    private static final Scanner input = new Scanner(System.in);

    private int input_int(String prompt) {
        System.out.println(prompt);
        return input.nextInt();
    }
    private void highest(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            System.out.println("The largest number is " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("The largest number is " + number2);
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("The largest number is " + number3);
        }
    }
    public static void main(String[] args) {
        solution22 app = new solution22();
        int number1 = app.input_int("Enter the first number ");
        int number2 = app.input_int("Enter the second number ");
        int number3 = app.input_int("Enter the third number ");
        app.highest(number1,number2,number3);

    }
}
