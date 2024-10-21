package Basic_Java_Programs;

import java.util.Scanner;

public class areaParallelogram_5 {
    public static void main(String[] args) {
        // Area Of Parallelogram
        System.out.println("Area Of Parallelogram");
        Scanner in = new Scanner(System.in);
        System.out.print("Insert the base: ");
        float base = in.nextFloat();
        System.out.print("Insert the height: ");
        float height = in.nextFloat();

        float rectangle = base*height;
        System.out.println(rectangle);
    }
}
