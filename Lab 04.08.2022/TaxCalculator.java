public class TaxCalculator //class
{
 public double CalculateTax(String empName,boolean isIndian,double empSal) 
  { 
    double taxAmount = 0;
    try // try block
    {
    
        if(isIndian ==false) //if not Indian throw this
        {
          throw new Exception("The Employee should be an Indian citizen tax");
        }
        // logic
        if(empName=="")
        {
          throw new Exception("The employee name cannot be empty");
        }
        if (empSal>100000)
        {
          return taxAmount = empSal *8/100;
        }
       if(empSal>=50000 && empSal<100000)
       {
        return taxAmount=empSal *6/100;
       }
       if(empSal>=30000 && empSal<50000)
       {
        return taxAmount=empSal*5/100;
       }
       if (empSal>=10000 && empSal<30000)
       {
        return taxAmount=empSal *4/100;
       }
       else
       {
         throw new Exception("The employee does not neet to pay tax");
       }
       }
       catch(Exception e) 
       {
        //catch block
        System.out.println(e);
       }
          return taxAmount;      
 }  
}
 class Calculatator
{
  public static void main(String[]args)
  {
    // main method
    TaxCalculator t =new TaxCalculator();
    System.out.println("Ron :");
    System.out.println("tax amount is:"+t.CalculateTax("Ron", false, 34000));
    System.out.println("Tim :");
    System.out.println("tax amount is:"+t.CalculateTax("Tim", true, 1000));
    System.out.println("jack :");
    System.out.println("tax amount is:"+t.CalculateTax("jack", true, 55000));
    System.out.println("null :");
    System.out.println("tax amount is:"+t.CalculateTax("", true, 30000));
    
    
  }
}
 
