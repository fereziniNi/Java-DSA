import java.util.Scanner;

public class armstrongNumber_14 {
    public static void main(String[] args) {
        // To find Armstrong Number between two given number.
        Scanner in = new Scanner(System.in);
        System.out.print("first: ");
        int min = in.nextInt();
        System.out.print("last: ");
        int max = in.nextInt();

        //Scroll from min to max
        for(int i = min; i <+ max; i++){
            int temp = i;
            int len = String.valueOf(i).length();
            int sum = 0;

            for(int a = 0; a < len; a++){
                int num = temp % 10;
                int result = 1;

                for (int x = 0; x < len; x++) {
                        result *= num;
                }

                //Total sum
                sum += result;
                temp /= 10;
                }
            if(sum == i){
                System.out.println(sum);
            }
        }
        System.out.println("END");
    }
}
