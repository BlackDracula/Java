/**
 * @ author: Abubakar Abubakar Yusif
 * Matric: 1821881
 * Section: 4
 */

import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total_input =3;
        int[] user_input= new int [total_input]; // use declared var for array length
        System.out.println("Enter 3 integer numbers");
        for (int i =0; i < user_input.length; i++){
            user_input[i] = input.nextInt();
        }
        for (int i =0; i < user_input.length; i++){
            for (int j = i +1; j < user_input.length; j++){
                if (user_input[i] < user_input[j]){
                    int temp;
                    temp = user_input [i];
                    user_input [i] = user_input [j];
                    user_input [j] = temp;
                }
            }
        }
        System.out.print("The entered numbers are: ");
        for (int i =0; i < user_input.length; i ++){
            System.out.print(user_input[i]+" ");
        }
    }
}
