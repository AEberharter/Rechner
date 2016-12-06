package calculator;
import java.util.Scanner;

public class Userinput
{
	private boolean running = true;
	private static Scanner scan = new Scanner(System.in);
	
	public void start()
	{
		getinput();
	}
	
	public void getinput()
	{
		while(running)
		{			
			System.out.println("~~~~~-----TASCHENRECHNER-----~~~~~\n");
			System.out.println("Bitte geben Sie die erste Zahl ein:");
			double zahl1 = Parser.toDouble(scan.next());
			double zahl2 = 0;
			String operator = new String();
			Result res = new Result(zahl1);
			
			while(!operator.equals("="))
			{			
				System.out.println("Bitte geben Sie die durchzuführende Operation ein. Mögliche Operatoren:");
				for(Operators operators : Operators.values())
				{
					System.out.print(operators.toString()+" ");
				}
				operator = scan.next();
				
				while(!Operators.contains(operator))
				{
					System.out.println("Bitte geben sie eine gültige Operation ein! Es gelten die Operationen:");
					for(Operators operators1 : Operators.values())
					{
						System.out.print(operators1.toString()+" ");
					}
					operator = scan.next();
				}
				if(!operator.equals("="))
	            {
					System.out.println("Bitte geben Sie die nächste Zahl ein:");
					zahl2 = Parser.toDouble(scan.next());
	            }
				
				switch(operator)
				{
					case "+":
						Add add = new Add(zahl1, zahl2);
						zahl1 = add.calculate();
						System.out.println("\n" + add.getcalculation());
						printsomelines();
						break;
					
					case "-": 
						Substract sub = new Substract(zahl1, zahl2);
						zahl1 = sub.calculate();
						System.out.println("\n" + sub.getcalculation());
						printsomelines();
						break;
					
					case "/":
						try
						{							
							if(zahl2 == 0)
							{
								throw new Exception();
							}
						}
						catch(Exception e)
						{
							while(zahl2 == 0)
							{
								System.err.println("Division durch 0 nicht erlaubt, bitte einen anderen Divisor angeben!");
								zahl2 = Parser.toDouble(scan.next());
							}
						}
						Divide div = new Divide(zahl1, zahl2);
						zahl1 = div.calculate();
						System.out.println("\n" + div.getcalculation());
						printsomelines();
						break;
						
					case "*":
						Multiply mul = new Multiply(zahl1, zahl2);
						zahl1 = mul.calculate();
						System.out.println("\n" + mul.getcalculation());
						printsomelines();
						break;
						
					case "=":
						System.out.println("Achtung: Berechnung erfolgte sequenziell. Es gilt NICHT die Punkt vor Strich Regelung!");
						System.out.println("\n" + res.getResultString(zahl1));
						break;
					
					default:
						System.out.println("Something went wrong; Should not happen.");
						break;
				}
				res.addZwischenErgebnis(zahl2, operator);
			}
			
		}
	}
	
	public void printsomelines()
	{
		System.out.println();
	}
}