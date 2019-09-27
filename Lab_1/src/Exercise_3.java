/**
 * @ author Abubakar Abubakar Yusif
 * 18218881
 * Lab #1 Section 4
 */

import java.util.Scanner;
public class Exercise_3{
    public static void main(String args[]) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double amount_of_water = Input.nextDouble();
        System.out.print("Enter the intial_temp: ");
        double intial_temp = Input.nextDouble();
        System.out.print("Enter the final_temp: ");
        double final_temp = Input.nextDouble();
        double answer = amount_of_water*(final_temp-intial_temp)*4184;
        System.out.print("The energy needed is: "+answer);
    }
}