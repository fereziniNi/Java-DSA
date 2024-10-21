package Basic_Java_Programs;

import java.util.Scanner;

public class factorsNumber_23 {
    public static void main(String[] args) {
        //Input a number and print all the factors of that number (use loops).
        System.out.println("Input a number and print all the factors of that number (use loops).");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = in.nextInt();
        int fat = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
