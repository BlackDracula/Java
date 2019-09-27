/**
 * Here is a sample run of this program:
 * Enter an integer: 10
 * Is 10 divisible by 4 and 5? false
 * Is 10 divisible by 4 or 5? true
 * Is 10 divisible by 4 or 5 but not both? true
 */
/**
 * @ author: Abubakar Abubakar Yusif
 * Matric: 1821881
 * Lab2 section 4
 */
import java.util.Scanner;
public class Exercise_2 {
    public static void main(String args[]){
        int num,dev_1=4,dev_2=5;
        boolean set_and,set_or,set_bitwise;
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        num = Input.nextInt();
        if (num % 4 ==0 && num % 5 ==0 ){
            set_and = true;
        }
        else{
            set_and = false;
        }
        if (num % 4 ==0 || num % 5 ==0 ){
            set_or = true;
        }
        else{
            set_or = false;
        }
        if (num % 4 ==0 ^ num % 5 ==0 ){
            set_bitwise = true;
        }
        else{
            set_bitwise = false;
        }
        System.out.println("is " +num+ " divisible by "+dev_1+" and "+dev_2+"? "+set_and);
        System.out.println("is " +num+ " divisible by "+dev_1+" or "+dev_2+"? "+set_or);
        System.out.print("is " +num+ " divisible by "+dev_1+" or "+dev_2+"but not both? "+set_bitwise);
    }
}