// 
import java.util.StringTokenizer;

public class LabString  
{   
 // class
	public static void show() 
 {  
  // method
		StringTokenizer temp = new StringTokenizer("C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE","\\");    // object
		System.out.println("Drive: "+temp.nextToken()+"\\");
		System.out.println("Folders: "+temp.nextToken()+"||"+temp.nextToken()+"||"+temp.nextToken());
		System.out.println("Files: "+ temp.nextToken());
	}

	public static void main(String[] args) 
 {     
  // main method
		// solution of problem statement 1
		String s1 = "Welcome to Java World";
		
		char c = s1.charAt(5);
		System.out.println(c);    // char method
		System.out.println(s1.compareToIgnoreCase("Welcome"));    // compareToIgnoreCase method
		System.out.println(s1.concat(" - Let us learn"));    // concat method
		System.out.println(s1.indexOf('a'));    // indexOf method
		System.out.println(s1.replace('a', 'e'));    // replace method
		System.out.println(s1.substring(4,10));    // substring method
		System.out.println(s1.toLowerCase());    // toLowerCase method
		
		System.out.println("\n --------------*-------------- \n");
		
		// solution of problem statement 2
		StringBuffer s2 = new StringBuffer("This is StringBuffer");    // StringBuffer object
		System.out.println(s2.append(" - This is a sample program" ));    // append method
		System.out.println(s2.insert(21,"Object"));    // insert method
		System.out.println(s2.reverse());    // reverse method
		System.out.println(s2.replace(14, 20, "Builder"));    // replace method
		
		System.out.println("\n --------------*-------------- \n");
		
		// solution of problem statement 3
		show();   // called the method

	}

}
