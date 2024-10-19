import java.util.Scanner;

public class greetingMessage_2 {
    public static void main(String[] args) {
        // Take name as input and print a greeting message for that particular name.
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter your name: ");
        String name = in.next();
        System.out.println("Greetings "+ name);
    }
}
