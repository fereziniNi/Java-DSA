package Intermediate_Java_Programs;

import java.util.Scanner;

public class sum_Numbers_13 {
    public static void main(String[] args) {
        //Sum Of N Numbers
        System.out.println("Sum Of N Numbers");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = in.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++){
            System.out.print("enter the num: ");
            int num = in.nextInt();
            sum += num;
        }

        System.out.println(sum);

    }
}
