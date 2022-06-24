import java.util.Scanner;
public class user_input 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in); //System.in is a standard input stream 
        String userName;
        System.out.println("Enter name"); 
        userName = obj.nextLine();  //reads string    
            
        System.out.println("My name is: " + userName);
            
    } 
}
