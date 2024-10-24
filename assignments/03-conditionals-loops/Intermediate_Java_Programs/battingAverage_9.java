package Intermediate_Java_Programs;

import java.util.Scanner;

public class battingAverage_9 {
    public static void main(String[] args) {
        // Calculate Batting Average
        System.out.println("Calculate Batting Average");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Total Hits: ");
        int hits = in.nextInt();
        System.out.println("Enter the Total at Bats: ");
        int bats = in.nextInt();
        float total = (float) hits/bats;
        System.out.println(total*100+"%");
    }
}
