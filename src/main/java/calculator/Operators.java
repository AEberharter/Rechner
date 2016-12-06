package calculator;

public enum Operators
{
	ADD("+"),
	SUBSTRACT("-"),
	DIVIDE("/"),
	MULTIPLY("*"),
	RESULT("=");
	
	
	private String operator;
	Operators(String operator)
	{
		this.operator = operator;
	}
	public String toString()
	{
		return this.operator;
	}
	
	public static boolean contains(String test) {

	    for (Operators c : Operators.values()) {
	        if (c.toString().equals(test)) {
	            return true;
	        }
	    }

	    return false;
	}
	
}