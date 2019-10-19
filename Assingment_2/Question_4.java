import java.util.Scanner;

public class Question4 {
	  public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  
		  System.out.print("Enter the number: ");
		  int num = input.nextInt();
		  if (isPerfect(num))
		  System.out.println("The number is a perfect number.");
		  else
		  System.out.println("The number is a not perfect number.");  
		  
			  
		  }
	  
	  public static boolean isPerfect(int num) {
		  int sum = 0;
		  for (int i = 1; i < num; i++)
		  {
			  if (num % i == 0)
				  sum = sum + i;
				  
		  }
		if (sum == num)
			return true;
		else 
			return false;
	    }
	  }