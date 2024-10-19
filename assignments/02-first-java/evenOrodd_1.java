import java.util.Scanner;

public class evenOrodd_1 {
    public static void main(String[] args) {
        //Write a program to print whether a number is even or odd, also take input from the user.
        Scanner in = new Scanner(System.in);

        System.out.print("Insert a number: ");
        int num = in.nextInt();
        int n = 2;
        while(num > n){
            if(num % n == 0){
                System.out.println("EVEN");
                break;
            }else{
                n++;
            }
        }
        if(num == n){
            System.out.println("ODD");
        }

    }
}