package calculator;
import junit.framework.*;

public class ParseTest extends TestCase
{
	protected String c;
	protected double expectedresult;

	protected void setUp()
	{
		c = "5";
	}
	
	public void testToDouble()
	{
		expectedresult = 5;
		assertEquals(expectedresult, Parser.toDouble(c));
	}

}
