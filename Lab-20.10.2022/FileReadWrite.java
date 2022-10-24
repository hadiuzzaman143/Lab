import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Main class
public class FileReadWrite {

	// Main driver method
	public static void main(String[] args)
	{

		// Content to be assigned to a file
		// Custom input just for illustration purposes
		String text= "My Name is Hadiuzzaman";

		// Try block to check if exception occurs
		try {

			// Create a FileWriter object
			// to write in the file
			FileWriter fWriter = new FileWriter("E:\\hadi.txt");

			// Writing into file
			// string
			fWriter.write(text);
			// Closing the file writing connection
			fWriter.close();
			// Display message for successful execution of
			System.out.println("File is created successfully with the content.");
			System.out.println("**********************************************");
			System.out.println("file content:");
			//reading the file content
			FileReader fread=new FileReader("E:\\hadi.txt");
			 int content;
	            while ((content = fread.read()) != -1) 
				{
	                System.out.print((char) content);//printing file content
	            }
			fread.close();	
		}
		// Catch block to handle if exception occurs
		catch (IOException e) 
		{
			// Print the exception
			System.out.print(e.getMessage());
		}
	}
}

