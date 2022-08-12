
// Write a Java program to compare two array lists.

import java.util.ArrayList;
  public class ArrayYesNo 
  {
  public static void main(String[] args) 
  {
   ArrayList<String> al= new ArrayList<String>();
          al.add("Red");
          al.add("Green");
          al.add("Black");
          al.add("White");
          al.add("Pink");

          ArrayList<String> all= new ArrayList<String>();
          all.add("Red");
          all.add("Green");
          all.add("Black");
          all.add("Pink");
          //Storing the comparison output in ArrayList<String>
          ArrayList<String> al1 = new ArrayList<String>();
          for (String e : al)
             al1.add(all.contains(e) ? "Yes" : "No");
          System.out.println(al1);
         
     }
}
