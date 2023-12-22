/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) 
{
		//Gets two numbers
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		//Inserts three random numbers between a (includes) to b (excludes)
		int n1 = (int)(((Math.random()) * (b - a)) + a);
		int n2 = (int)(((Math.random()) * (b - a)) + a);
		int n3 = (int)(((Math.random()) * (b - a)) + a);
		//Prints those three numbers
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		//Finds the smallest number an prints it
		int min = Math.min(n1, Math.min(n2, n3));
		System.out.println("The minimal generated number was " + min);
	}
}
