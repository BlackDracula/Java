/**
 * @ author: Abubakar Abubakar Yusif
 * Matric: 1821881
 * Section: 4
 */

public class Question6 {
    public static void main(String[] args) {
        Example02(); // call the last function to print the pattern
        int rows = 5;
        for(int i = 1; i <= rows; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
    public static void Example02() {
        int row_count = 5, star_count = 5;
        for (int i = 0; i < row_count; i++) {
            for (int j = 0; j < star_count; j++) {
                System.out.printf("*" + " ");
            }
            star_count--;
            System.out.println();
        }
        System.out.println();
    }
}