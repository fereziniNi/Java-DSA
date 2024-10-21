package Basic_Java_Programs;

import java.util.Scanner;

public class perimeterRhombus_13 {
    public static void main(String[] args) {
        // Perimeter Of Rhombus
        System.out.println("Perimeter Of Rhombus");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side: ");
        float side = in.nextFloat();

        float perimeter = side*4;
        System.out.println(perimeter);
    }
}
