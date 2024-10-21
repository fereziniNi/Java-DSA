package Basic_Java_Programs;

import java.util.Scanner;

public class sumAllNumbers_24 {
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        System.out.println("Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)");
        Scanner in = new Scanner(System.in);
        int n = 1;
        int sum = 0;
        while (n!= 0){
            System.out.print("Enter the N: ");
            n = in.nextInt();
            sum += n;
        }
        System.out.println(sum);
    }
}
