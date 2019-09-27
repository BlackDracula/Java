/**
 * @ author: Abubakar Abubakar Yusif
 * Matric: 1821881
 * Section: 4
 */
import java.util.Scanner;
public class Question4 {
    public static void main(String args[]) {
        int mark;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks");
        mark = input.nextInt();
        while (true) {
            if (mark >= 60) {
                System.out.println("Congrats, you have passed the exam");
                break;
            } else if (mark <= 59 && mark > 0) {
                System.out.println("Hey boi, you failed the exam :(");
                break;
            } else if (mark <= 0) {
                System.out.println("No numbers are entered except 0 ");
                break;
            }
        }
    }
}