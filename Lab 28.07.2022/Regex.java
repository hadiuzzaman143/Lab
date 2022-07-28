class Regex //Class 1
{
    public static void main(String[] args)
    {
        System.out.println(validate("000.12.12.034"));
        System.out.println(validate("121.234.12.12"));
        System.out.println(validate("23.45.12.56"));
        System.out.println(validate("00.12.123.123123.123"));
        System.out.println(validate("122.12"));
        System.out.println(validate("Hello.IP"));
    }
    public static String validate (String text)
    {
        if (text.matches("^[0-9]+.[0-9]+.[0-9]+.[0-9]+$"))
        return"Ture";
        else   
         return"False";
    }
}
 