package Basic_Java_Programs;

import java.util.Scanner;

public class perimeterSqaure_12 {
    public static void main(String[] args) {
        // Perimeter Of Square
        System.out.println("Perimeter Of Square");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side side 1: ");
        float a = in.nextFloat();
        System.out.println("Enter the side side 2: ");
        float b = in.nextFloat();

        float perimeter = 2*(a+b);
        System.out.println(perimeter);
    }
}
