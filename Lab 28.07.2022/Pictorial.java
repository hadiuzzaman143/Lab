public class Pictorial //calss
{
    public static void main(String[] args) 
    {
                
        System.out.println(validate("hadiuz_zaman"));
        System.out.println(validate("Hadiuz_zaman"));
        System.out.println(validate("hadiuz_Zaman"));		
        System.out.println(validate("Hadiuz_Zaman"));	
    }
        
    public static String validate(String text) 
    {
        // Foubd A Match or Not Matched 
        if (text.matches("^[a-z]+_[a-z]+$"))
        return "Found a match";
        else
        return "Not matched";
    }    
}
