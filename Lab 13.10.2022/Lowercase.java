/*
    Take a var from scanner class
    given 2 (A,B) strings of lowercase word 
    1. calculate the the sum of length of A and B.
    2. check either A > B or not. (lexicographically) true/false
    3. capitalized first latter of A and B.
 */


import java.util.Scanner;

public class Lowercase 
{
	public static void main(String[] args) 
    {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first Number: ");
		String a1 = s.next();
		a1 = a1.toLowerCase();
		System.out.println("Enter second Number: ");
		String a2 = s.next();
		a2 = a2.toLowerCase();
		operation(a1, a2);

	}

	static void operation(String a1, String a2) 
    {
		int lOa1 = a1.length();
		int lOa2 = a2.length();
		int sum = lOa1 + lOa2;

		System.out.println("Length of first and second number is " + sum);
		if (a1.compareTo(a2) > 0) 
        {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		System.out.println(a1.substring(0, 1).toUpperCase() + a1.substring(1) + " " + a2.substring(0, 1).toUpperCase()+ a2.substring(1));
	}

}