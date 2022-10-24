public class ArrayIndex 
{
	
	int arr[]= {2,4,6,5,3};
	int target=11;
	public String calculate() 
	{
		
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=0;j<arr.length;j++) 
			{
				if (arr[i]+arr[j]==target)
				{
					//if arr[i]+arr[j]==target then return indexof arr[i ] and arr[j]
					return i+","+j;//returning index
				}
			}
		}//end of outer for loop
		return null;
	}//end of method
	public static void main(String[] args) {
		ArrayIndex a=new ArrayIndex();//creating object
		System.out.println(a.calculate());//calling

	}

}
