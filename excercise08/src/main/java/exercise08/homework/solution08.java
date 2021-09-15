/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Benjamin Shin
 */
package exercise08.homework;
import java.util.Scanner;
/*ask user for how many people there are
ask how many whole pizzas you have
ask how may slices there are in each pizzas
multiply whole pizzas by slices and then divide by how many people
get another integer for the remainder
output all the inputs with the new calculated slices
output the calculation on how many slices each peron will get
output the remainder

*/
public class solution08 {
    public static void main(String[] args) {
        System.out.println("How many people?:");
        Scanner scan = new Scanner(System.in);
        int people = scan.nextInt();


        System.out.println("How many pizzas do you have?:");
        int whole_pizzas = scan.nextInt();

        System.out.println("How many slices per pizza?:");
        int slices = scan.nextInt();
        int num_slices=whole_pizzas*slices;
        System.out.println(people + " people with " + whole_pizzas + " pizzas. " + "(" + num_slices + " slices" + ")");

        int answer =(slices*whole_pizzas)/people;
        System.out.println("Each person gets " + answer + " pieces of pizza.");

        int remainder = (slices*whole_pizzas)%people;
        System.out.println("There are "+ remainder + " leftover pieces.");
            }
        }
