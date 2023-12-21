/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo 
{
	public static void main(String[] args) 
	{
		//Gets two numbers
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		//Prints their addition
      	System.out.println(a + " + " + b + " = " + (a+b));
	}
}
