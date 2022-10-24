import java.util.Scanner;

public class Movie 
{
	String movieName; 
	int movieTicketPrice;
	String movieStartTime, movieEndTime;
	 Scanner sc=new Scanner(System.in);//scanner class object
	public void addMovie() 
	{
		//taking values from user
		System.out.println("enter movie name: ");
		String moviename=sc.nextLine();
		System.out.println("enter movie ticket price: ");
		int ticketPrice=sc.nextInt();
		System.out.println("enter movie start time(eg:10:30am): ");
		String starttime=sc.next();
		System.out.println("enter movie end time(eg:12:30am): ");
		String endtime=sc.next();
		this.movieName=moviename;
		this.movieTicketPrice=ticketPrice;
		this.movieStartTime=starttime;
		this.movieEndTime=endtime;
		System.out.println("movie added");
		
	}
	//return added details using toSting()
	@Override
	public String toString() 
	{
		return "Movie [movieName=" + movieName + ", movieTicketPrice=" + movieTicketPrice + ", movieStartTime="+ movieStartTime + ", movieEndTime=" + movieEndTime+"]";
	}
	public static void main(String[] args) 
	{
		Movie m= new Movie();
		m.addMovie();//calling 	addmovie method
		System.out.println(m.toString());//printing values by calling toSting()

	}

}
