import java.util.Scanner;

public class Circle 
{
 public float radius;
 public float pi = 3.5f;
 public Circle()
 {
    radius = 1.5f;
 }    
 protected Circle(float radius)
 {
    this.radius = radius;
 }
 protected Circle(float radius,float pi)
 {
    this(radius);
    this.pi = 3.5f; 
}
public float calculateArea(float radius)
{
 return pi*radius*radius;
}
public float calculateCircumference(float radius)
{
    return 2*pi*radius;
}
public static void main(String[]args)
{
    Circle obj= new Circle();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter radius");
    float Radius =sc.nextFloat();
    sc.close();
    System.out.println("Area is: "+obj.calculateArea(Radius));
    System.out.println("Circumference is "+obj.calculateCircumference(Radius));
}
}
