package Basic_Java_Programs;

import java.util.Scanner;

public class perimeterEquilateralTriangle_9 {
    public static void main(String[] args) {
        // Perimeter Of Equilateral Triangle
        System.out.println("Perimeter Of Equilateral Triangle");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the one side: ");
        float side = in.nextFloat();

        float perimeter = side*3;
        System.out.println(perimeter);

    }
}
