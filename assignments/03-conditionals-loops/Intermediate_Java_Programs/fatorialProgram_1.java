package Intermediate_Java_Programs;

import java.util.Scanner;

public class fatorialProgram_1 {
    public static void main(String[] args) {
        // Factorial Program In Java
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the n fatorial: ");
        int n = in.nextInt();
        int fatorial = 1;
        for(int i = n; i > 0; i--){
            fatorial *= i;
        }

        System.out.println(fatorial);

    }
}
