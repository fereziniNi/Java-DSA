package Basic_Java_Programs;

import java.util.Scanner;

public class areaRhombus_6 {
    public static void main(String[] args) {
        // Area Of Rhombus
        System.out.println("Area Of Rhombus");
        Scanner in = new Scanner(System.in);
        System.out.println("Insert the D1: ");
        float d1 = in.nextFloat();
        System.out.println("Insert the D2: ");
        float d2 = in.nextFloat();

        float rhombus = 0.5f * d1 * d2;
        System.out.println(rhombus);
    }
}
