package calculator;

public class Multiply implements Operator
{
	private double n1, n2;
	
	public Multiply(double zahl1, double zahl2)
	{
		this.n1 = zahl1;
		this.n2 = zahl2;
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