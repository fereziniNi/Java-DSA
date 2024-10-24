package Intermediate_Java_Programs;

import java.util.Scanner;

public class distanceBetweenPoints_5 {
    public static void main(String[] args) {
        //Calculate Distance Between Two Points
        System.out.println("Calculate Distance Between Two Points");
        Scanner in  = new Scanner(System.in);
        System.out.print("enter the point 1: ");
        int p1 = in.nextInt();
        System.out.print("enter the point 2: ");
        int p2 = in.nextInt();

        int distance = p2 - ((p2 - p1)/2);
        System.out.println(distance);

    }
}
