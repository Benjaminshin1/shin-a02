/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Benjamin Shin
 */
/*
Create a program that walks the user through troubleshooting issues with a car.
Use the given decision tree to build the system
 */
package exercise23.homework;

import java.util.Objects;
import java.util.Scanner;

public class solution23 {
    private static final Scanner input = new Scanner(System.in);

    private String input_string(String prompt) {
        System.out.println(prompt);
        return input.next();
    }
    private void solution(String answer){
        String yes = "yes";
        String no = "no";
        if(Objects.equals(answer, yes)){
            System.out.println("Are the battery terminals corroded? ");
            answer = input.next();
            if(Objects.equals(answer, yes)){
                System.out.println("Clean terminals and try starting again.");
            }else
                System.out.println("Replace cables and try again.");

        }
        else{
            System.out.println("Does the car make a slicking noise?");
            answer = input.next();
            if(Objects.equals(answer, yes)){
                System.out.println("replace the battery.");
            }
            else{
                System.out.println("Does the car crank up but fail to start?");
                answer = input.next();
                if(Objects.equals(answer, yes)){
                    System.out.println("Check spark plug connections.");
                }
                else {
                    System.out.println("Does the engine start and then die?");
                    answer = input.next();
                    if (Objects.equals(answer, yes)) {
                        System.out.println("Does you car have fuel injection?");
                        answer = input.next();
                        if (Objects.equals(answer, yes)) {
                            System.out.println("Get it in for service.");
                        } else
                            System.out.println("Check to ensure the choke is opening and closing.");
                    } else {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }



    public static void main(String[] args) {
        solution23 app = new solution23();
        String answer = app.input_string("Is the car silent when you turn the key?");
        app.solution(answer);
    }
}
