package Basic_Java_Programs;

public class subtractProductAndSum_22 {
    public static void main(String[] args) {
        //Subtract the Product and Sum of Digits of an Integer
        System.out.println("Subtract the Product and Sum of Digits of an Integer");
        int n = 234;
        int product = 1;
        int sum = 0;
        while(n > 0){
            int last = n % 10;
            sum += last;
            product *= last;
            n /= 10;
        }
        int total = product - sum;
        System.out.println(total);

    }
}
