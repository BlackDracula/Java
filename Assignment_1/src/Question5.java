
/**
 * tbh i though this will take me a while, but its easy cuz i  did it before
 * @ author: Abubakar Abubakar Yusif
 * Matric: 1821881
 * Section: 4
 */
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total_input =100, count =0;
        int[] user_input= new int [total_input]; // use declared var for array length
        System.out.println("Enter set of integer numbers");
        for (int i =0; i < user_input.length; i++){
            count ++;
            user_input[i] = input.nextInt();
            if (user_input[i] <= 0){
                break;
            }
        }
        for (int i =0; i < count; i++){
            for (int j = i +1; j > count; j++){
                if (user_input[i] >user_input[j]){
                    int temp;
                    temp = user_input [i];
                    user_input [i] = user_input [j];
                    user_input [j] = temp;
                }
            }
        }
        System.out.print("The to the lowest number is: ");
        System.out.print(user_input[1]+" ");
    }
}
