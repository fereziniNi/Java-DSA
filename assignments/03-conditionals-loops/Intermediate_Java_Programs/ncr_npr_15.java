package Intermediate_Java_Programs;

import java.util.Scanner;

public class ncr_npr_15 {
    public static void main(String[] args) {
        // Find Ncr & Npr
        System.out.println("Find Ncr & Npr");
        Scanner in = new Scanner(System.in);
        System.out.println("Insert the N: ");
        int n = in.nextInt();
        System.out.println("Insert the R: ");
        int r = in.nextInt();

        int fatorialN = 1;
        for (int i = 1; i <= n; i++) {
            fatorialN *= i;
        }

        int fatorialR = 1;
        for (int i = 1; i <= r; i++) {
            fatorialR *= i;
        }

        int fatorialNR = 1;
        for (int i = 1; i <= (n - r); i++) {
            fatorialNR *= i;
        }

        int ncr = fatorialN / (fatorialR * fatorialNR);
        int npr = fatorialN / fatorialNR;

        System.out.println("NCR (" + n + " C " + r + ") = " + ncr);
        System.out.println("NPR (" + n + " P " + r + ") = " + npr);


    }
}
