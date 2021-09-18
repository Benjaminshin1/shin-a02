/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Benjamin Shin
 */
/*write a program that sees if the person is old enough to drive or not
prompt user for their age
if the age is less than 16 output that the user is not old enough to drive
if they are older than 16 output that they are old enough to drive
 */
package exercise16.homework;

import java.util.Scanner;

public class solution16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your age? ");
        int age = Integer.parseInt(input.next());

        String result = (age >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.println(result);
    }
}
