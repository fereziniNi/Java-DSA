package Basic_Java_Programs;

import java.util.Scanner;

public class totalSurfaceCube_20 {
    public static void main(String[] args) {
        //Total Surface Area Of Cube
        System.out.println("Total Surface Area Of Cube");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the width: ");
        float width = in.nextFloat();

        float area=  width*width;
        float total = area*6;
        System.out.println(total);

    }
}
