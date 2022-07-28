import java.util.StringTokenizer;; 

public class LabString // calss 
{
public static void main(String[]args)  
 {
   String s1 = "Welcome to java World"; //creating string object
   System.out.println(s1.charAt(5)); //5th index character
   System.out.println(s1.compareToIgnoreCase("Welcome")); // comparing
   System.out.println(s1.concat("- Let us learn"));
   System.out.println(s1.indexOf('a'));
   System.out.println(s1.replace('a', 'e'));
   System.out.println(s1.substring(4,10));
   System.out.println(s1.toLowerCase());

   StringBuffer s2 = new StringBuffer("This is StringBuffer");
   System.out.println(s2.append("- This is a sample program"));
   System.out.println(s2.insert(21,"Object"));
   System.out.println(s2.reverse());
   System.out.println(s2.replace(14, 20, "Builder"));
   parseString();
 }
  public static void parseString()
  {
    //print 0 to 2 index
    StringTokenizer temp = new StringTokenizer("C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE","\\");
    System.out.println("Drive:"+temp.nextToken()+"\\");
    System.out.println("Filders :"+temp.nextToken()+"||"+temp.nextToken()+"||"+temp.nextToken());
    System.out.println("Files :"+temp.nextToken());
  }
     
}
