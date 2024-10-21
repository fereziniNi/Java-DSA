package Basic_Java_Programs;

import java.util.Scanner;

public class areaTriangle_2 {
    public static void main(String[] args) {
        // Area Of Triangle
        System.out.println("Area Of Triangle");
        Scanner in = new Scanner(System.in);
        System.out.println("Insert the base: ");
        float base = in.nextFloat();
        System.out.println("Digit the height: ");
        float height = in.nextFloat();

        float area = 0.5F * base * height;
        System.out.println(area);
    }
}
