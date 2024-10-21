package Basic_Java_Programs;

import java.util.Scanner;

public class areaCircle_1 {
    public static void main(String[] args) {
        //Area Of Circle Java Program
        System.out.println("Area Of Circle Java Program");
        Scanner in = new Scanner(System.in);
        System.out.println("Insert the radius: ");
        float radius = in.nextFloat();
        float pi = 3.14F;
        float area = (radius*radius)*pi;
        System.out.println(area);

    }
}