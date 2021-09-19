/*
 *  UCF COP3330 Fall 2021 Assignment 19Solution
 *  Copyright 2021 Benjamin Shin
 */
/*
Create a function that calculates the users BMI
prompt user for their weight
prompt user for their height
calculate BMI using the following formula bmi = (weight / (height × height)) * 703
If the BMI is between 18.5 and 25, display that the person is at a normal weight.
If they are out of that range, tell them if they are underweight or overweight and tell them to consult their doctor.
 */
package exercise19.homework;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class solution19 {
    private static final Scanner input = new Scanner(System.in);

    private float input_float(){
        return input.nextFloat();
    }
    private String input_string(){
        return input.next();
    }


    public static void main(String[] args) {
        solution19 app = new solution19();
        System.out.println("Enter your weight");
        while (!input.hasNextInt()) {
            System.out.println("Enter a valid number.");
            input.nextLine();
        }
        float weight = app.input_float();

        System.out.println("Enter your height");
        while (!input.hasNextInt()) {
            System.out.println("Enter a valid height.");
            input.nextLine();
        }
        float height = app.input_float();
        //bmi = (weight / (height × height)) * 703
        float bmi =(float) (weight / (height * height)) * 703;
        DecimalFormat df = new DecimalFormat("#.##");
        //df.setRoundingMode(RoundingMode.CEILING);
        if(bmi>=18.5&&bmi<=25){
            System.out.println("Your BMI is "+ (df.format(bmi)) + "\nYou are within the ideal weight range.");
        }else if (bmi>25){
            System.out.println("Your BMI is "+ (df.format(bmi)) + "\nYou are overweight. You should see your doctor.");
        }else
            System.out.println("Your BMI is "+ (df.format(bmi)) + "\nYou are underweight. You should see your doctor." );

    }
}
