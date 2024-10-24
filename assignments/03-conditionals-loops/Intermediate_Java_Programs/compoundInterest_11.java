package Intermediate_Java_Programs;

import java.util.Scanner;

public class compoundInterest_11 {
    public static void main(){
        // Compound Interest Java Program
        System.out.println("Compound Interest Java Program");
        Scanner in = new Scanner(System.in);
        System.out.print("Insert the value: ");
        float price = in.nextFloat();
        System.out.print("Insert the rate of interest per year: ");
        float rate = in.nextFloat();
        System.out.print("Insert the number of years the money is invested: ");
        int year = in.nextInt();

        float interest = (1+rate/100);
        for(int i = 1; i < rate; i++){
            interest *= interest;
        }

        float total = price*interest;
        System.out.println(total);


    }
}
