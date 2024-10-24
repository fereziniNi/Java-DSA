package Intermediate_Java_Programs;

import java.util.Scanner;

public class CGPAProgram_10 {
    public static void main(String[] args) {
        // Calculate CGPA Java Program
        System.out.println("Calculate CGPA Java Program");
        Scanner in = new Scanner(System.in);
        System.out.print("HOW MANY TESTS?");
        int n = in.nextInt();

        int grades = 0;
        for(int i = 0; i < n; i++){
            System.out.print("enter the note: ");
            int x = in.nextInt();
            grades += x;
        }

        float total = (float)grades/n;
        System.out.println(total);
        if(total < 6){
            System.out.println("OH!! REPROVE...");
        }else{
            System.out.println("Congratulations!");
        }

    }
}
