import java.util.Scanner;

public class largestNumber_5 {
    public static void main(String[] args) {
        // Take 2 numbers as input and print the largest number.
        Scanner in = new Scanner(System.in);
        System.out.print("enter num1: ");
        int a = in.nextInt();
        System.out.print("enter num2: ");
        int b = in.nextInt();

        if(a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
