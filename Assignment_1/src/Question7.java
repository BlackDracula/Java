/**
 * @ author: Abubakar Abubakar Yusif
 * Matric: 1821881
 * Section: 4
 */
import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int initial_money,coupons=0,chocolate_to_have_with_coupons=0,chocolate_to_have_with_initial_money=0;
        System.out.print("Hello, Enter your money: ");
        initial_money = input.nextInt();
        // modern problems need modern solution.
        for (int i =0; i < initial_money; i++) {
            coupons++;
        }
        // add chocolate with coupon
        while (true) {
            if (coupons >= 6) {
                chocolate_to_have_with_coupons += 1;
                coupons -= 6;
            }
            else {
                break;
            }
        }
        // add chocolate with actual money
        while (true){
            if (initial_money > 0){
                chocolate_to_have_with_initial_money +=1;
                initial_money -=1;
            }
            else{
                break;
            }
        }
        System.out.println("chocolate to have with only your money is: " + chocolate_to_have_with_initial_money);
        System.out.printf("You got: %d chocolate free \n", chocolate_to_have_with_coupons);
        System.out.println("your total coupons left: " + coupons);
        System.out.printf("your total chocolate is: %d ",chocolate_to_have_with_coupons+chocolate_to_have_with_initial_money);
    }
}
