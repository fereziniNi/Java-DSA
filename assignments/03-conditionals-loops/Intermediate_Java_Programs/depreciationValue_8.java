package Intermediate_Java_Programs;

import java.util.Scanner;

public class depreciationValue_8 {
    public static void main(String[] args) {
        //Calculate Depreciation of Value
        System.out.println("Calculate Depreciation of Value");
        Scanner in = new Scanner(System.in);
        System.out.print("Cost of the Asset: ");
        float cost = in.nextFloat();
        System.out.print("Residual Value: ");
        float residual = in.nextFloat();
        System.out.print("Useful Life of the Asset: ");
        float life = in.nextFloat();

        float total = (cost- residual)/life;
        System.out.println(total);
    }
}
