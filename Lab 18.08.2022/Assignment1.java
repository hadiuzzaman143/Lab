import java.util.ArrayList;
// main class
public class Assignment1 
{
	// Create a Arraylist using List
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	ArrayList<Integer> saveEvenNumbers(int N) 
	{
		list = new ArrayList<Integer>();
		// logic
		for (int i = 2; i <= N; i++) 
		{
			if (i % 2 == 0) list.add(i);
		}
		
		return list;
	}
	   // Create a list using PrintEvenNumbers
	   ArrayList<Integer> printEvenNumbers() 
	{
		// Create a Arraylist using NewList
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		for (int item : list) 
		{
			newList.add(item * 2);
			System.out.println(item * 2);
		}
		
		return newList;
	}

	public static void main(String[] args) 
	{
		Assignment1 asg = new Assignment1();
		asg.saveEvenNumbers(10); // called method 1
		asg.printEvenNumbers(); // called method 2
	}

}