import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex 
{    
    // class 
    public static boolean IpAddress(String input_IP) 
    {   
        // method
    	// String Declaration with Quantifier
        String numRange = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])" + "\\."    
              + "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])" + "\\." 
              + "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])" + "\\." 
              + "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";
        
        Pattern ip_pattern = Pattern.compile(numRange);    // Compile the regular expression
        Matcher match= ip_pattern.matcher(input_IP);     // find matches & regular expression
        return match.matches();     // return value
    }
    
    public static void main(String[] args) 
    {   // main method
    	// declare the all String values
        String str1 = "000.12.12.034";    
        String str2 = "121.234.12.12";
        String str3 = "23.45.12.56";
        String str4 = "00.12.123.123123.123";
        String str5 = "122.23";
        String str6 = "Hello.IP";
        
        // called the method for output
        System.out.println(str1+" : "+IpAddress(str1));
        System.out.println(str2+" : "+IpAddress(str2));
        System.out.println(str3+" : "+IpAddress(str3));
        System.out.println(str4+" : "+IpAddress(str4));
        System.out.println(str5+" : "+IpAddress(str5));
        System.out.println(str6+" : "+IpAddress(str6));

       
    }
}
 