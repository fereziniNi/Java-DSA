package Basic_Java_Programs;

import java.util.Scanner;

public class perimeterRectangle_11 {
    public static void main(String[] args) {
        // Perimeter Of Rectangle
        System.out.println("Perimeter Of Rectangle");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side A1: ");
        float a = in.nextFloat();
        System.out.println("Enter the side B1: ");
        float b = in.nextFloat();

        float perimeter = 2*(a+b);
        System.out.println(perimeter);
    }
}
