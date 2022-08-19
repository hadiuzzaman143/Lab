 // Problem Statement 2
 import java.util.HashSet;
 import java.util.*;
 
 public class Country
 {
   // main method
    public static void main(String[]args)
    {
    Country countries = new Country();
    //adding by invoking savecountryname method
		countries.saveCountryNames("India");
		countries.saveCountryNames("USA");
		countries.saveCountryNames("Pakistan");
		countries.saveCountryNames("Bangladesh");
		countries.saveCountryNames("China");

		System.out.println("China: " + countries.getCountry("China"));
		System.out.println("Japan: " + countries.getCountry("Japan"));
    }

    HashSet<String> H1 = new HashSet<>();
     // Question#1
    public HashSet<String>saveCountryNames(String CountryName)
    {
      H1.add(CountryName); // logic to add value into HashSet
      return H1;
    }
    // Question #2
    public String getCountry(String CountryName)
    {
        Iterator<String> it = H1.iterator();
        while(it.hasNext())
        {
            if(it.next().equals(CountryName))
            return CountryName; //logic
        }
       return null;
    }
    
 }