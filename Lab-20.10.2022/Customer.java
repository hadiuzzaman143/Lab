 public class Customer 
{
	
	long accountNumber;
	String accountName;
	double accountBalance;
	//method to create account
	public void createAccount(long accountNumber,String accountName,double accountBalance) 
	{
		this.accountNumber=accountNumber;
		this.accountName=accountName;
		this.accountBalance=accountBalance;
		System.out.println("account successfully created for "+accountName);
		System.out.println("****************************");
		
	}
	//method to add balance
	public void setAmount(long amount) {
		double updatedBal=amount+accountBalance;//logic
		System.out.println("balance deposit successfull \nOld balance: "+accountBalance+"\nupdated balance: "+updatedBal);
		this.accountBalance=updatedBal;
		System.out.println("****************************");
	}
	//method to withdrawal money
	public void withDrawAmount(long withDrawAmount) {
		
		double updatedBal1=accountBalance-withDrawAmount;
		System.out.println("balance withdrawl successfull \nOld balance: "+accountBalance+"\nUpdated balance: "+updatedBal1);
		this.accountBalance=updatedBal1;//logic
		System.out.println("****************************");
	}
	//this method printing the balance
	public void getAmount() 
	{
		System.out.println("Hello "+ accountName+" your account balanace is "+accountBalance);	
	}
}//end of class
