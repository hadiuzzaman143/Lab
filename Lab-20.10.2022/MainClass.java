 public class MainClass{

	public static void main(String[] args) {
		//adding 1st customer
		Customer c1=new Customer();
		c1.createAccount(986764644, "Hadiuzzaman", 10000);
		c1.setAmount(2000);
		c1.withDrawAmount(1000);
		c1.getAmount();
		System.out.println("______________________________________________________________________");
		//adding 2nd customer
		Customer c2=new Customer();
		c2.createAccount(768765, "Sankhojit Roy", 8000);
		c2.setAmount(3000);
		c2.withDrawAmount(4000);
		c2.getAmount();

	}//end of main method

}//end of class

