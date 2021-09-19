/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Benjamin Shin
 */
/*
create a function that converts Fahrenheit to Celsius and Celsius to Fahrenheit
prompt user to enter either a C or F allowing for lowercase letters also
output  "your choice:C or F
prompt user for the temperature
convert temperature and output the answer
 */
package exercise18.homework;

import java.util.Scanner;

public class solution18 {
    private static final Scanner input = new Scanner(System.in);
    private String input_string;

    private int input_int(String prompt){
        System.out.println(prompt);
        return input.nextInt();
    }
    private String input_string(){
        return input.next();
    }

    public static void main(String[] args) {
        solution18 app = new solution18();
        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
        String temp = app.input_string();
        if ("Ff".contains(String.valueOf(temp))){
            int num = app.input_int("Please enter the temperature in Celsius:");
            //F = (C × 9 / 5) + 32
            int temperature = (num * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is "+ temperature);

        }else {
            int num = app.input_int("Please enter the temperature in Fahrenheit:");
            int temperature = (num - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is " + temperature);
            //C = (F − 32) × 5 / 9
        }
    }
}
