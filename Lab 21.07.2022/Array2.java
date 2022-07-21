public class Array2 //class 
{
    public static void main(String[] args) 
    {
        //Initialize array  
        int[] arr = {1, 2, 5, 5, 6, 6, 7, 2};

        // duplicate element  
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i+1; j<arr.length; j++)
            {
                if ((arr[i] == arr[j]) && (i != j))
                {
                    System.out.println("dupl element : "+arr[j]);
                }
            }
        }
    }       
}
