import java.util.Scanner;

public class Question3 {
	  public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  
		  System.out.print("Enter the parking time for the customer: ");
		  int ParkTime = input.nextInt();
		  
		  System.out.println("The total charge for the customer is:  " + CalculateCharges(ParkTime));
		  
			  
		  }
	  
	  public static double CalculateCharges(int pt) {
		  double fee = 2.00;
	    if (pt <= 3)
	    	fee = 2.00;
	    else if (pt > 3 && pt < 19 ) 
	    	fee = (2.00) + (pt - 3)*0.50 ;
	    else
	    	fee = 10;
	     return fee; 
	    }
	  }