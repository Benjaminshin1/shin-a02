
/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Benjamin Shin
 */
package exercise15.homework;

import java.util.Objects;
import java.util.Scanner;
/*Make a program that asks a user for their username and password
prompt user for their username
promp user for their password
use an if else statement to see if the password matches saved password or not
print welcome if they match the case sensitive password
print i dont know you if the password is wrong
 */

public class solution15 {
    public static void main(String[] args) {
        System.out.println("What is the username: ");
        Scanner input = new Scanner(System.in);
        String username = input.next();
        System.out.println("What is the Password? ");
        String password = input.next();
        String saved = "shin1234";

        if(Objects.equals(password, saved)){
            System.out.println("Welcome!");
        }else
            System.out.println("I DON'T KNOW YOU!");
    }
}
