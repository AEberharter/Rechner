package calculator;
import java.util.Scanner;

public class Parser
{
	static Scanner scan = new Scanner(System.in);
	  public static double toDouble(String str) 
	  {
		  while(str.isEmpty())
		  {
	    		  System.err.println("Please enter a digit!");
	    		  str = scan.next();
		  }
	      try 
	      {
	          return Double.parseDouble(str);
	      } 
	      catch (final NumberFormatException nfe) 
	      {
	    	  System.err.println("Please enter digits only!");
	          return Parser.toDouble(scan.next());
	      }
	  }
	  
}