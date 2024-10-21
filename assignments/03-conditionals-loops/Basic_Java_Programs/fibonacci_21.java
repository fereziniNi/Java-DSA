package Basic_Java_Programs;

import java.util.Scanner;

public class fibonacci_21 {
    public static void main(String[] args) {
        //Fibonacci Series In Java Programs
        System.out.println("Fibonacci Series In Java Programs");
        Scanner in = new Scanner(System.in);
        System.out.print("N sequence(n>0): ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int total = 0;
        for(int i = 1; i < n; i++){
            total = a + b;
            a = b;
            b = total;
        }

        System.out.println(b);

    }
}
