package Basic_Java_Programs;

import java.util.Scanner;

public class volumeCone_14 {
    public static void main(String[] args) {
        // Volume Of Cone Java Program
        System.out.println("Volume Of Cone Java Program");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        float radius = in.nextFloat();
        System.out.printf("Enter the height: ");
        float height = in.nextFloat();
        float pi = 3.14f;
        float volume = (pi*(radius*radius)*height)/3;
        System.out.println(volume);
    }
}
