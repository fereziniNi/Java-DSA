package Basic_Java_Programs;

import java.util.Scanner;

public class addTwoNumber_26 {
    public static void main(String[] args) {
        //Addition Of Two Numbers
        System.out.println("Addition Of Two Numbers");
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter n1: ");
        int n1 = in.nextInt();
        System.out.println("Enter n2: ");
        int n2 = in.nextInt();
        int sum = n1 + n2;
        System.out.println(sum);
    }
}
