public class A 
{
  void fruit()
  {
    System.out.println("This is Apple,");
  }   
}
class B extends A
{
    void tree()
    {
        System.out.println("This is a Apple tree,");
    }
}
class C extends B 
{
    void item()
    {
        System.out.println("This is Apple shake,");
    }
}
class Main
{
    public static void main(String[]args)
    {
        C obj= new C();
        obj.fruit();
        obj.tree();
        obj.item();
    }
}