package calculator;

public class Add implements Operator
{
	private double n1, n2;
	
	public Add(double zahl1, double zahl2)
	{
		this.n1 = zahl1;
		this.n2 = zahl2;
	}
	
	public double calculate()
	{
		return n1 + n2;
	}
	
	public double getfirstnumber()
	{
		return n1;
	}
	
	public double getsecondnumber()
	{
		return n2;
	}
	
	public String getcalculation()
	{
		return getfirstnumber() + " + " + getsecondnumber() + " = " + calculate();
	}
	
}