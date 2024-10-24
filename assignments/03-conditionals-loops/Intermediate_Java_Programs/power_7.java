package Intermediate_Java_Programs;

import java.util.Scanner;

public class power_7 {
    public static void main(String[] args) {
        //Power In Java
        System.out.println("Power In Java");
        Scanner in = new Scanner(System.in);
        System.out.print("enter the base: ");
        int base = in.nextInt();
        System.out.print("enter the exponent: ");
        int exponent = in.nextInt();
        int total = base;

        for(int i = 1; i < exponent; i++){
            total *= base;
        }
        System.out.println(total);
    }
}
