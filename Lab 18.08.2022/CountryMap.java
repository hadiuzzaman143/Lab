import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountryMap 
{
	public static void main(String[] args) 
    {
		CountryMap countryMap = new CountryMap();

		countryMap.saveCountryCapital("India", "Delhi");
		countryMap.saveCountryCapital("Japan", "Tokyo");
		countryMap.saveCountryCapital("USA", "Washington, D.C.");
		
		System.out.println(countryMap.getCapital("India"));
		System.out.println(countryMap.getCountry("Tokyo"));
		System.out.println(countryMap.toArrayList());
		
		//creating instance Hashmap object
		HashMap<String, String> M2 = countryMap.swapKyeValue();
		System.out.println(M2);
	}
    
    private HashMap<String, String> M1;
	
	public CountryMap() 
    {
		M1 = new HashMap<String, String>();
	}
	// Question #1
	public HashMap<String, String> saveCountryCapital(String CountryName, String capital) 
    {
		M1.put(CountryName, capital); //logic to adding values in to HashMap
		return M1;
	}
	// Question #2
	public String getCapital(String CountryName) 
    {
		return M1.get(CountryName); // logic
	}
	// Question #3
	public String getCountry(String capitalName) 
    {
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) 
        {
			Map.Entry<String, String> me = it.next();
			
			if (me.getValue().equals(capitalName)) //logic
				return me.getKey();
		}
		
		return null;
	}
	// Question #4
	public HashMap<String, String> swapKyeValue() 
    {
		HashMap<String, String> M2 = new HashMap<String, String>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) 
		{
			Map.Entry<String, String> me = it.next();
			M2.put(me.getValue(), me.getKey());
		}
		
		return M2;
	}
	// Question #5
	public ArrayList<String> toArrayList() 
    {
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) 
        {
			Map.Entry<String, String> me = it.next();
			list.add(me.getKey());
		}
		
		return list;
	}
}