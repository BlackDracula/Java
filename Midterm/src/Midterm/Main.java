package Midterm;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Printing print = new Printing();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the items");
        print.setType(input.next());
        System.out.println(print.toString());
    }
}
