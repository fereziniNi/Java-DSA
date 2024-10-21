package Basic_Java_Programs;

import java.util.Scanner;

public class perimeterCircle_8 {
    public static void main(String[] args) {
        //Perimeter Of Circle
        System.out.println("Perimeter Of Circle");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        float radius = in.nextFloat();
        float pi = 3.14f;
        float area = radius*pi*2;
        System.out.println(area);

    }
}
