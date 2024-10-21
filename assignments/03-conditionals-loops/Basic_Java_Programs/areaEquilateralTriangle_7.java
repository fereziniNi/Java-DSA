package Basic_Java_Programs;

import java.util.Scanner;

public class areaEquilateralTriangle_7 {
    public static void main(String[] args) {
        //Area Of Equilateral Triangle
        System.out.print("Area Of Equilateral Triangle");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side of the triangle");
        float side = in.nextFloat();
        double area = (Math.sqrt(3) / 4) * Math.pow(side, 2);
        System.out.println(area);
    }
}
