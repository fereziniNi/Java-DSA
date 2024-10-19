import java.util.Scanner;

public class palindrome_8{
    public static void main(String[] args) {
        // To find out whether the given String is Palindrome or not.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = in.next();
        int len = word.length();
        boolean ans = true;


        for(int i = 0; i < len / 2; i++){
            if(word.charAt(i) != word.charAt(len - 1 - i)){
                ans = false;
                break;
            }
        }

        if(ans == false){
            System.out.println("NOT A PALINDROME");
        }else{
            System.out.println("PALINDROME");
        }

    }
}
