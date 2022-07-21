class Student //calss 1
{
  int Student_No , Student_Fees;
  String Student_Name,Student_Email,Student_Address;
  
  public Student(int num,String name,String email,String address)
  {
    this.Student_No=num;
    this.Student_Name=name;
    this.Student_Email=email;
    this.Student_Address=address;
  }
  public void StudentFees(int fees)
  {
    if (fees<=2000)
    {
      fees+=10*fees/100;
    }
    this.Student_Fees=fees;
  }
  public void display()
  {
    System.out.println("Student No: "+Student_No+", Student Name:"+Student_Name+",Student Email :"+Student_Email+",Student_Address:"+Student_Address+",Student Fees:"+Student_Fees);
  } 
}
class Student1 // class 2
{
 public static void main(String[]args)
 {
  // Print the result
  Student arr[]= new Student[5];
  arr[0] = new Student (10,"Hadiuzzaman","hadiuz@gmail.com","Malda");
  arr[1] = new Student (11,"Adi","adi@gmail.com","Kolkata");
  arr[2] = new Student (22,"Sankhojit","sankhojit@gmail.com","Cooch Behar");
  arr[3] = new Student (33,"Sayan","sayan@gmail.com","Malda");
  arr[4] = new Student (44,"Riya","riya@gmail.com","Kolkata");
 
  arr[0].StudentFees(4000);
  arr[1].StudentFees(2500);
  arr[2].StudentFees(2000);
  arr[3].StudentFees(3000);
  arr[4].StudentFees(3500);
 
  for(Student i: arr)
  {
    i.display();
  }
 } 
}
