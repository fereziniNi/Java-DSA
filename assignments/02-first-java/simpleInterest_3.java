import java.util.Scanner;

public class simpleInterest_3 {
    public static void main(String[] args) {
        // Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner in = new Scanner(System.in);
        System.out.print("Insert the principal: ");
        float principal = in.nextFloat();
        System.out.println("Insert the time: ");
        float time = in.nextFloat();
        System.out.println("Insert the rate: ");
        float rate = in.nextFloat();

        float ans = (rate*time*principal)/100;
        System.out.println("the simple interest = " + ans);
    }
}
