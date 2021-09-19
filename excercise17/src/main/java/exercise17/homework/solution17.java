/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Benjamin Shin
 */
/*
Create a program that prompts for your weight, gender, total alcohol consumed (in ounces), and the amount of time since your last drink.
calculate this using the formula BAC = (A × 5.14 / W × r) − .015 × H
prompt user for their gender in a form of a number
1 for male 2 for female
prompt user for how many ounces of alcohol they had
prompt user what their weight is
prompt user for how many hours it had been since their last drink
calculate their BAC
if BAC<.08 print that It is legal for you to drive.
else print It is not legal for you to drive.
 */
package exercise17.homework;

import java.util.Scanner;

public class solution17 {
    private static final Scanner input = new Scanner(System.in);

    private int input_int(String prompt){
        System.out.println(prompt);
        return input.nextInt();
    }
    private float input_float(String prompt){
        System.out.println(prompt);
        return input.nextFloat();
    }



    public static void main(String[] args) {
        solution17 app = new solution17();
            int gender = app.input_int("Enter a 1 is you are male or a 2 if you are female: ");
        if ((gender > 2) || (gender < 1)) {
            System.out.println("ERROR Please enter a valid gender\n");
            return ;
        }

        float ounce = app.input_float("How many ounces of alcohol did you have? ");
        float weight = app.input_float("What is your weight, in pounds? ");
        float hours = app.input_float("How many hours has it been since your last drink? ");

        //(A × 5.14 / W × r) − .015 × H
        if (gender == 2){
            float ratio = (float) 0.66;
            float BAC = (float) (ounce * 5.14/weight * ratio);
            float BAC1 = (float) (BAC - (.015 * hours));
            if(BAC1 > .08){
                System.out.println("It is not legal for you to drive.");
            }else System.out.println("It is legal for you to drive.");
        }else {
            float ratio = (float) 0.73;
            float BAC = (float) (ounce * 5.14/weight * ratio);
            float BAC1 = (float) (BAC - (.015 * hours));
            if(BAC1 > .08){
                System.out.println("It is not legal for you to drive.");
            }else System.out.println("It is legal for you to drive.");
        }






    }
}
