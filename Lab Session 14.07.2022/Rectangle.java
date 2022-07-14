public class Rectangle 
{
	private int length;
	private int breadth;

 Rectangle(int length, int breadth)
 {
  this.length=length;
  this.breadth=breadth;
 }
	public int getLength(int length) 
  {
	return length;
  }
	public void setLength(int length) 
  {
   this.length=length;
  }
	public void setBreadth(int breadth) 
  {
   this.breadth=breadth;
  }
    void calculateArea() 
    {
    System.out.println(length*breadth);
    }
}
class RectangleTest
{ 
  public static void main(String[] args) 
  {
    Rectangle obj	=new Rectangle(80, 10);
    System.out.println("Area =");
    obj.calculateArea();
    obj.setLength(90);
    obj.setBreadth(10);
    System.out.println("New Area =");
    obj.calculateArea();
  }
}