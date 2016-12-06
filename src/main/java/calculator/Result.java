package calculator;

public class Result
{
	private String resultString;
	
	public Result(double startZahl)
	{
		resultString = ""+startZahl;
	}
	public void addZwischenErgebnis(double zahl, String operator) 
	{
		resultString += (" "+operator+" "+zahl);	
	}
	public String getResultString(double result)
	{
		return resultString+" = "+result;
	}
	
}