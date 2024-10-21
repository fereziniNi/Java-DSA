package Basic_Java_Programs;

import java.util.Scanner;

public class volumePyramid_18 {
    public static void main(String[] args) {
        // Volume Of Pyramid
        System.out.println("Volume Of Pyramid");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base: ");
        float base = in.nextFloat();
        System.out.println("Enther the height: ");
        float height = in.nextFloat();

        float area = base*base;
        float volume = (area*height)/3;
        System.out.println(volume);

    }
}
