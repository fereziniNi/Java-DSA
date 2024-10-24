package Intermediate_Java_Programs;

import java.util.Scanner;

public class averageMarks_12 {
    public static void main(String[] args) {
        // Calculate Average Marks
        System.out.println("Calculate Average Marks");
        Scanner in = new Scanner(System.in);
        System.out.print("How many students: ");
        int students = in.nextInt();

        int grades = 0;
        for(int i = 0; i < students; i++){
            System.out.print("Insert the grade from student"+ i);
            int grade = in.nextInt();
            grades += grade;
        }

        float total = grades/students;
        System.out.println(total);
    }
}
