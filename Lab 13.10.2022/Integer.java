/*
    Given a no. of n for each integer i in the range id 1 to n. print one value per line.
    if i is multiple of 3 and 5; print good morning
    if i is multiple of 3 but not 5; print good
    if i is multiple of 5 but not 3; print morning
    if i is not multiple of  3 and 5; print value of i.
*/


import java.util.Scanner;

public class Integer 
{
	public static void main(String[] args) 
    {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter start Range: ");
		int start = s.nextInt();
		System.out.println("Enter End Range: ");
		int end = s.nextInt();
		conditionCheck(start, end);
	}

	static void conditionCheck(int start, int end) 
    {
		for (int i = start; i <= end; i++) 
        {
			if (i % 3 == 0 && i % 5 == 0) 
            {
				System.out.println("Good Morning");
			} else if (i % 3 == 0 && i % 5 != 0) 
            {
				System.out.println("Good");
			} else if (i % 3 != 0 && i % 5 == 0) 
            {
				System.out.println("Morning");
			} else {
				System.out.println(i);
			}
		}
	}

}