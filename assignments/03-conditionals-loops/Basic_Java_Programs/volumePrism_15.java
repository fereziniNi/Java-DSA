package Basic_Java_Programs;

import java.util.Scanner;

public class volumePrism_15 {
    public static void main(String[] args) {
        // Volume Of Prism
        System.out.println("Volume Of Prism");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base: ");
        float base = in.nextFloat();
        System.out.print("Enter the height: ");
        float height = in.nextFloat();
        System.out.println("Enter the width: ");
        float width = in.nextFloat();

        float area = height*base;
        float volume = area*width;
        System.out.println(volume);
    }
}
