package Basic_Java_Programs;

import java.util.Scanner;

public class areaRectangle_3 {
    public static void main(String[] args) {
        //Area Of Rectangle Program
        System.out.println("Area Of Rectangle Program");
        Scanner in = new Scanner(System.in);
        System.out.print("Insert the base: ");
        float base = in.nextFloat();
        System.out.print("Insert the height: ");
        float height = in.nextFloat();

        float rectangle = base*height;
        System.out.println(rectangle);
    }
}
