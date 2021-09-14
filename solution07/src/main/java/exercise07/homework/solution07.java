package exercise07.homework;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class solution07 {
    public static void main(String[] args) {
        System.out.println("What is the length of the room in feet?");
        Scanner input = new Scanner(System.in);
        String length = input.next();
        int length1 = Integer.parseInt(length);

        System.out.println("What is the width of the room in feet?");
        String width = input.next();
        int width1 = Integer.parseInt(width);
        input.close();
        int f2 = length1 * width1;
        System.out.println("The area is");
        System.out.println(f2 + " square feet");
        float m2 = (float) (f2 * 0.09290304);
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println(df.format(m2) + " square meters");

    }
}
