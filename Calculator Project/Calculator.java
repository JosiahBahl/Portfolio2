import java.util.Scanner;

public class Calculator{

	private Scanner _scanner = new Scanner(System.in);
	private CalculatorStack<Double> _numbers = new CalculatorStack<Double>();
	private CalculatorStack<Character> _operations = new CalculatorStack<Character>();
	private boolean _on = true;
	
	
	public Calculator()
	{
		//while the calculator is on enter digits/opperators
		while(_on)
		{
			System.out.println("Enter the number followed by the opperator followed another number. '8' '+' '9'. Enter off to quit");
			//the string you will enter.
			String things;
			//Goes through three times or the max amount of things that you can enter into a calculator.
			for(int i = 0; i <3; i++)
			{
				things = _scanner.next();
				if(things.equalsIgnoreCase("off"))
				{
					_on = false;
					System.out.println("Calculator Off");
				}
				else
				{
					evaluate(things);
				}
			}
			doOperation(_numbers, _operations);
			System.out.println(_numbers.pop());
		}
	}
	/**
	 * takes a string values and checks to see if its an operator or a number.
	 * @param opperator
	 * @return
	 */
	public void evaluate(String operator) {

		switch(operator.charAt(0))
		{
		case '+':
		case '-':
		case '*':
		case '/':
			_operations.push(operator.charAt(0));
			break;
		default :
			Double number = Double.parseDouble(operator);
			_numbers.push(number);
		}
	}
	
	/**
	 * takes two CalculatorNodes one is double number the other is the operator, 
	 * then depending on the operator does the operation with the numbers.
	 * @param numbers
	 * @param opperator
	 */
	public void doOperation(CalculatorStack<Double> numbers, CalculatorStack<Character> operator)
	{
		double secondNumber;
		double firstNumber;
		String opperatorChar;
		
		if(numbers.size() < 1 || numbers.isEmpty())
		{
			try {
				throw new Exception("You have one or no numbers for this opperation");
			} catch (Exception e) {
				secondNumber = 0.0;
				firstNumber = 0.0;
			}
		}
		else if(operator.isEmpty())
		{
			try {
				throw new Exception("You have one or no opperators for this opperations");
			} catch (Exception e) {
				opperatorChar = "+";
			}
		}
		
		else
		{
			secondNumber = numbers.pop();
			firstNumber = numbers.pop();
			opperatorChar = operator.pop().toString();
			
			if(opperatorChar.equals("+"))
			{
				numbers.push (firstNumber + secondNumber);
			}
			else if(opperatorChar.equals("-"))
			{
				numbers.push (firstNumber - secondNumber);
			}
			else if(opperatorChar.equals("*"))
			{
				numbers.push (firstNumber * secondNumber);
			}
			else if(opperatorChar.equals("/"))
			{
				if(secondNumber == 0)
				{
					System.out.println("Cannot divide by zero");
				}
				else
				{
					numbers.push (firstNumber / secondNumber);
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		//Calculator
		Calculator calculator = new Calculator();
	}
}
