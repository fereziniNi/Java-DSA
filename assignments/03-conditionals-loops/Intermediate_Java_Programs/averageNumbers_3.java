package Intermediate_Java_Programs;

import java.util.Scanner;

public class averageNumbers_3 {
    public static void main(String[] args) {
        //Calculate Average Of N Numbers
        System.out.println("Calculate Average Of N Numbers");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the N: ");
        int n = in.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++){
            System.out.println("enter the num "+i+": ");
            int num = in.nextInt();
            sum += num;
        }

        int total = sum / n;
        System.out.println(total);
    }
}
