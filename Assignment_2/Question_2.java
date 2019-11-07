import java.util.Scanner;
import java.lang.Math;

public class MyTriangle {
public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 3 sides: ");
        double side_1, side_2, side_3;
        side_1 = input.nextDouble();
        side_2 = input.nextDouble();
        side_3 = input.nextDouble();
      System.out.println("The value is: " + isValid(side_1, side_2, side_3));
      double valid = area(side_1, side_2, side_3);
      if ( valid != (double)valid){
        System.out.println("The input is invalid");
      }else{
           System.out.print("The are is: " + area(side_1, side_2, side_3));
      }
    } 
   public  static boolean isValid(double side1, double side2, double side3){
            if ( side1 + side2 > side3){
             return true;
            }
            else {
                return false;
            }
        }
        public static double area(double side1, double side2, double side3){
            double s = (side1+ side2 + side3)/2;
            return  Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));