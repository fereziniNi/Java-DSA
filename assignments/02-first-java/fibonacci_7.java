import java.util.Scanner;

public class fibonacci_7 {
    public static void main(String[] args) {
        // To calculate Fibonacci Series up to n numbers.
        Scanner in = new Scanner(System.in);
        System.out.print("Insert the N: ");
        int n = in.nextInt();

        int a = 1;
        int b = 1;
        int total = 0;
        for(int i = 1; i < n; i++){
            total = a + b;
            a = b;
            b = total;
        }

        System.out.println("Fibonacci -> " + b);
    }
}
