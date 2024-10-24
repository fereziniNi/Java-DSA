package Intermediate_Java_Programs;

import java.util.Scanner;

public class calculateEletricityBill_2 {
    public static void main(String[] args) {
        //Calculate Electricity Bill
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the kWh: ");
        float kwh = in.nextFloat();

        float total = 0;

        if(kwh <= 100){
            total = kwh*0.50f;
        }else if(kwh <= 300){
            total = 100*0.5f + ((kwh-100) * 0.75f);
        }else if(kwh <= 500) {
            total = 100 * 0.5f + (200 * 0.75f) + ((kwh - 300) * 1.20f);
        }else{
            total = (100 * 0.50f) + (200 * 0.75f) + (200 * 1.20f) + ((kwh - 500) * 1.50f);
        }

        System.out.println(total);
    }
}
