/*
 *  UCF COP3330 Fall 2021 Assignment 21 Solution
 *  Copyright 2021 Benjamin Shin
 */
/*
Write a program that converts a number from 1 to 12 to the corresponding month.
Prompt for a number and display the corresponding calendar month
 */
package exercise21.homework;

import java.util.Scanner;

public class solution21 {
    private static final Scanner input = new Scanner(System.in);

    private void input_int(String prompt){
        System.out.println(prompt);
        int month_number = input.nextInt();

        String month;
        switch (month_number) {
            case 1:  month = "January";
                break;
            case 2:  month = "February";
                break;
            case 3:  month = "March";
                break;
            case 4:  month = "April";
                break;
            case 5:  month = "May";
                break;
            case 6:  month = "June";
                break;
            case 7:  month = "July";
                break;
            case 8:  month = "August";
                break;
            case 9:  month = "September";
                break;
            case 10: month = "October";
                break;
            case 11: month = "November";
                break;
            case 12: month = "December";
                break;
            default: month = "Invalid month";
                break;
        }
        System.out.println("The name of the month is "+ month);
    }
    public static void main(String[] args) {
        solution21 app = new solution21();
        app.input_int("What is the month number? ");
    }
}
