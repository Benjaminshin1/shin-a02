/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Benjamin Shin
 */
/*
create a Multistate Sales Tax Calculator
prompt user for the order amount
prompt user for their state
prompt user for their county
Wisconsin residents must be changed 5% sales tax with an additional county-level charge. For Wisconsin residents, prompt for the county of residence.
For Eau Claire county residents, add an additional 0.5% tax.
For Dunn county residents, add an additional 0.4% tax.
Illinois residents must be charged 8% sales tax with no additional county-level charge.
every other state are not charged tax
 */
package exercise20.homework;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

public class solution20 {
    private static final Scanner input = new Scanner(System.in);

    private float input_float(String prompt){
        System.out.println(prompt);
        return input.nextFloat();
    }
    private int input_int(String prompt){
        System.out.println(prompt);
        return input.nextInt();
    }
    private String input_string(String prompt){
        System.out.println(prompt);
        return input.next();
    }

    private float TAX(float order, String county,float tax, String state){
        String TAX = "Illinois";
        String TAX1 = "Eau Claire";
        String TAX2= "Dunn";

        if(Objects.equals(TAX1, county)){
            tax = (float) (.055 * order);
        }else if(Objects.equals(TAX2, county)){
            tax = (float) (.054 * order);
        }
        return tax;
    }


    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);

        solution20 app = new solution20();

        float order = app.input_float("What is the order amount? ");
        String state = app.input_string("What state do you live in? ");
        String taxed_state = "Wisconsin";
        String taxed_state1 = "Illinois";
        float tax = 0;
        if(Objects.equals(taxed_state, state)||Objects.equals(taxed_state1, state)){
            if(Objects.equals(taxed_state, state)) {

                String county = app.input_string("What county do you live in? ");
                tax = app.TAX(order, county, tax, state);
                float total = tax + order;
                System.out.println("The tax is $" + (df.format(tax))+"\nThe total is $" + (df.format(total)));
            }else {
                tax = (float) (.08 * order);
                float total = tax + order;
                System.out.println("The tax is $" + (df.format(tax))+"\nThe total is $" + (df.format(total)));
            }
        }else
            System.out.println("The total is $"+ (df.format(order)));
    }
}
