/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		double r1 = (Math.random());
		double r2 = (Math.random());
		double r3 = (Math.random());
		System.out.println(r1 + " " + r2 + " " + r3);
		int n1 = (int)((r1 * (b-a)) + a);
		int n2 = (int)((r2 * (b-a)) + a);
		int n3 = (int)((r3 * (b-a)) + a);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		int min = Math.min(n1, n2);
		min = Math.min(min, n3);
		System.out.println("The minimal generated number was " + min);
	}
}
