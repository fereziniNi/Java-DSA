import java.util.Scanner;

public class rupiaTodolar_6 {
    public static void main(String[] args) {
        // Input currency in rupees and output in USD.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter:\n1- Dolar to Rupia\n2- Rupia to Dolar");
        int opt = in.nextInt();
        float ans;

        if(opt == 1){
            System.out.print("enter the dolar: ");
            float dolar = in.nextFloat();
            ans = (float) (dolar*84.05);
        }else{
            System.out.print("enter the rupia: ");
            float rupia = in.nextFloat();
            ans = (float)(rupia/84.05);
        }
        System.out.print("your money -> ");
        System.out.print(ans);
    }
}
