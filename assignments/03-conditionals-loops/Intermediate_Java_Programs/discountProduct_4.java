package Intermediate_Java_Programs;

import java.util.Scanner;

public class discountProduct_4 {
    public static void main(String[] args) {
        // Calculate Discount Of Product
        System.out.println("Calculate Discount Of Product");
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter the price of product: ");
        float price = in.nextFloat();
        System.out.print("enter the discount(%): ");
        float porcent = in.nextFloat();

        float total = price - (price*(porcent/100));
        System.out.println(total);
    }
}
