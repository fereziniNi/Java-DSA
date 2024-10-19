import java.util.Scanner;

public class calculator_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

        int answer = 0;
        while(true){
            // take the operator as input
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                //input two numbers
                System.out.print("Enter two numbers: ");
                int a = in.nextInt();
                int b = in.nextInt();

                if(op == '+'){
                    answer = a + b;
                }else if(op == '-'){
                    answer = a - b;
                }else if(op == '*'){
                    answer = a * b;
                }else if(op == '/'){
                    answer = a / b;
                }else{
                    answer = a % b;
                }
                System.out.println(answer);
            }else if(op == 'x' || op == 'X'){
                break;
            }else{
                System.out.println("invalid operation");
            }

        }
    }
}
