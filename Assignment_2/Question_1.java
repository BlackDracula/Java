import java.util.Scanner;

public class Question1 {
	  public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  int num1, num2;
		  System.out.println("Enter the pair of integers, if you want to exit the program enter -1 twice: ");
		  while ((num1 = input.nextInt()) != -1 && (num2 = input.nextInt()) != -1)
		  {
			  if (isMultiple(num1, num2))
			  System.out.println(num1 + " is a multiple of " + num2);
			  else
			  System.out.println(num1 + " is not a multiple of " + num2);
			  
		  }
	  }
	  public static boolean isMultiple(int num1, int num2) {
	    if (num1 % num2 == 0)
	      return true;
	    else 
	    	return false;
	      
	    }
	  }