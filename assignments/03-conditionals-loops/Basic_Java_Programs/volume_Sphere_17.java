package Basic_Java_Programs;

import java.util.Scanner;

public class volume_Sphere_17 {
    public static void main(String[] args) {
        // Volume Of Sphere
        System.out.println("Volume Of Sphere");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float radius = in.nextFloat();
        float pi = 3.14f;

        float sphere = 4/3f*pi*(radius*radius*radius);
        System.out.println(sphere);
    }
}
