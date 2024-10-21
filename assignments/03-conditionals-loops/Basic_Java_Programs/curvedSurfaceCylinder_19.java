package Basic_Java_Programs;

import java.util.Scanner;

public class curvedSurfaceCylinder_19 {
    public static void main(String[] args) {
        //Curved Surface Area Of Cylinder
        System.out.println("Curved Surface Area Of Cylinder");
        Scanner in = new Scanner(System.in);
        System.out.println("enter the radius: ");
        float radius = in.nextFloat();
        System.out.println("enter the height: ");
        float height = in.nextFloat();

        float pi = 3.14f;

        float area = 2*pi*radius*height;
        System.out.println(area);
    }
}
