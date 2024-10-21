package Basic_Java_Programs;

import java.util.Scanner;

public class perimeterParallelogram_10 {
    public static void main(String[] args) {
        //Perimeter Of Parallelogram
        System.out.println("Perimeter Of Parallelogram");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side a: ");
        float a = in.nextFloat();
        System.out.println("Enter the side b: ");
        float b = in.nextFloat();

        float sides = 2*(a+b);
        System.out.println(sides);
    }
}
