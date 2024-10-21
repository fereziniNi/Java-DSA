package Basic_Java_Programs;

import java.util.Scanner;

public class largestNumber_25 {
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the largest number from all.
        System.out.println("Take integer inputs till the user enters 0 and print the largest number from all.");
        Scanner in = new Scanner(System.in);
        int n = 1;
        int largest = 0;
        while(n!=0){
            System.out.print("enter n: ");
            n = in.nextInt();
            if(n > largest){
                largest = n;
            }
        }
            System.out.println(largest);
    }
}
