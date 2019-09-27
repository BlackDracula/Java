/**
 * @ author Abubakar Abubakar Yusif
 * 18218881
 * Lab #1 Section 4
 */

import java.util.Scanner;
public class Exercise_1{
    public static void main(String args[]) {
// The formula is *1.609;
        /**
         * i do need to take the value of hours
         * and then minutes
         * seconds
         */
        int hour, minutes,second;
        double hour_,minutes_,second_;
        double mile_formula = 1.609;
        Scanner Convert = new Scanner(System.in);
        System.out.print("Enter the value of hours");
        hour = Convert.nextInt();
        hour_ = hour*mile_formula;
        System.out.print("Enter the value of minutes");
        minutes = Convert.nextInt();
        minutes_ = minutes * mile_formula;
        System.out.print("Enter the value of seconds");
        second = Convert.nextInt();
        second_ = second * mile_formula;
        double final_values = hour_ + minutes_ + second_;
        double answer = final_values;
        System.out.println("your final output is: " + answer);
    }
}