import java.util.InputMismatchException;
import java.util.Scanner;

public class CatchBlock 
{    
	// class
	 public static void main(String[] args) 
	 {    
		// main method
	        Scanner temp = new Scanner(System.in);    // scanner object
	        System.out.print("Enter value: ");
	        
	        // try block to read user input
	        try {
	            int a = temp.nextInt();
	            int b = temp.nextInt();
	            System.out.println(a / b);
	        } 
	        catch(InputMismatchException ex) 
			{
	            // InputMismatchException is printed only
	            System.out.println(ex.getClass().toString());
	        }
	        catch(ArithmeticException ex) 
			{
	            // Print exception
	            System.out.println(ex);
	        }
	        temp.close();   // to close scanner object
	    }
}
