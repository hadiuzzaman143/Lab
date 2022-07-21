public class Array // calss       
{    
    // found in array
    public static boolean con(int[] arr, int item) 
    {
        // is present in the array or not
        for (int n : arr) 
        {
           if (item == n) 
           {
              return true;
           }
        }
        return false;
     }
     public static void main(String[] args) 
     {
            int[] arr1 = 
            {
              1789, 2035, 1899, 1456, 2013, 
              1458, 2458, 1254, 1472, 2365, 
              1456, 2265, 1457, 2456};
              // Print the result
        System.out.println(con(arr1, 2013));
        System.out.println(con(arr1, 2015));
     }
  }