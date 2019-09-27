/**
 * @ author Abubakar Abubakar Yusif
 * 18218881
 * Lab #1 Section 4
 */

import java.util.Scanner;
public class Exercise_2{
    public static void main(String args[]) {
        System.out.print("Enter the subtotal of an gratuity rate: ");
        Scanner Input = new Scanner(System.in);
        float Sub_total = Input.nextFloat();
        double Answer = Sub_total/100*12;
        double total = Answer + Sub_total;
        System.out.println("The gratuity is RM: "+ Answer + " and total is RM: "+ total);

    }
}