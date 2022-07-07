public class Teacher 
{
   String collegeName = "College";
   String desingnation ="Teacher";
   void work()
   {
    System.out.println("details.");
   } 
}
class ITTecher extends Teacher
{
    public static void main(String[]args)
    {
        ITTecher obj =new ITTecher();
        obj.work();
        System.out.println(obj.collegeName);
        System.out.println(obj.desingnation);
    }
}