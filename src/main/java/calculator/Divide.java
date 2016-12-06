package calculator;
import java.util.Scanner;

public class Divide implements Operator
{
	private double n1, n2;
	private static Scanner scan = new Scanner(System.in);
	
	public Divide(double number1, double number2)
	{
		try
		{
			this.n1 = number1;
			this.n2 = number2;
			
			if(this.n2 == 0)
			{
				throw new Exception();
			}
		}
		catch(Exception e)
		{
			while(this.n2 == 0)
			{
				System.err.println("Division durch 0 nicht erlaubt, bitte einen anderen Divisor angeben!");
				this.n2 = Parser.toDouble(scan.next());
			}
		}
	
	}


	public double calculate() 
	{
		return n1 / n2;
	}

	public String getcalculation()
	{
		return getfirstnumber() + " / " + getsecondnumber() + " = " + calculate();
	}

	public double getfirstnumber()
	{
		return n1;
	}

	public double getsecondnumber()
	{
		return n2;
	}
}