/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq 
{
	public static void main(String[] args) 
	{
		//Gets three numbers that represent a, b ,c in the equation a⋅x + b = c
		double a = Integer.parseInt(args[0]);
		double b = Integer.parseInt(args[1]);
		double c = Integer.parseInt(args[2]);
		//Solves the equation and Prints the equation and the solution
		double x = (c - b) / a;
      		System.out.println(a + "*x + " + b + " = " + c);
      		System.out.println("x = " + x);
	}
}
