package Basic_Java_Programs;

import java.util.Scanner;

public class volumeCylinder_16 {
    public static void main(String[] args) {
        // Volume Of Cylinder
        System.out.println("Volume Of Cylinder");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        float radius = in.nextFloat();
        System.out.println("Enter the height: ");
        float height = in.nextFloat();

        float pi = 3.14f;

        float volume = pi*(radius*radius)*height;
        System.out.println(volume);

    }
}
