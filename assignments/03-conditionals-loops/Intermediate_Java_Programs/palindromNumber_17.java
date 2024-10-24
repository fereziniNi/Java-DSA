package Intermediate_Java_Programs;

import javax.swing.*;
import java.util.Scanner;

public class palindromNumber_17 {
    public static void main(String[] args) {
        // Find if a number is palindrome or not
        System.out.println("Find if a number is palindrome or not");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int inverse = 0;
        int aux;

        int numAux = num;
        while(numAux > 0) {
            inverse *= 10;
            aux = numAux % 10;
            numAux /= 10;
            inverse += aux;

        }

        if(num == inverse){
            System.out.println("PALINDROME");
        }


    }
}
