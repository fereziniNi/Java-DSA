package Intermediate_Java_Programs;

import java.util.Scanner;

public class commissionPercentage_6 {
    public static void main(String[] args) {
        // Calculate Commission Percentage
        System.out.println("Calculate Commission Percentage");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price total: ");
        float price = in.nextFloat();
        System.out.print("enter the percentage: ");
        float percentage = in.nextFloat();

        float total = price*(percentage/100);
        System.out.println(total);
    }
}
