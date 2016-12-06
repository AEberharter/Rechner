package calculator;

public interface Operator
{
	/**
	 * 
	 * @return - returns the result
	 */
	public double calculate();
	
	/**
	 * 
	 * @return - returns the calculation with result
	 */
	public String getcalculation();
	/**
	 * 
	 * @return - returns the first number of the calculation
	 */
	public double getfirstnumber();
	
	/**
	 * 
	 * @return - returns the second number of the calculation
	 */
	public double getsecondnumber();
	
}