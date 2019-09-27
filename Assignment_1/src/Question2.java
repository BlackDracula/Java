/**
 * @ author: Abubakar Abubakar Yusif
 * Matric: 1821881
 * Section: 4
 */

import java.util.Scanner;
public class Question2 {
    public static void main(String args[]){
        int user_input, reverse = 0;
        System.out.print("Enter 3 digit integer: ");
        Scanner in = new Scanner(System.in);
        user_input = in.nextInt();
        int last_ = user_input;
        while(user_input != 0){
            reverse = reverse * 10;
            reverse = reverse + user_input%10;
            user_input = user_input/10;
        }
        int last = reverse;
        if(last == last_) {
            System.out.println(reverse+" is a palindrome");
        }else {
            System.out.println(reverse+" is not palindrome");
        }
    }
}
