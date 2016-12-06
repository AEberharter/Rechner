package calculator;

public class Multiply implements Operator
{
	private double n1, n2;
	
	public Multiply(double number1, double number2)
	{
		this.n1 = number1;
		this.n2 = number2;
	}

	public double calculate()
	{
		return n1 * n2;
	}

	public String getcalculation()
	{
		return getfirstnumber() + " * " + getsecondnumber() + " = " + calculate();
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