
// Write a Java program to extract a portion of an array list.

import java.util.ArrayList;
import java.util.List;

  public class ArrayListDemo 
  {
  public static void main(String[] args) 
  {
  // Creae a list and add some colors to the list
  ArrayList<String> al = new ArrayList<String>();
  al.add("Red");
  al.add("Green");
  al.add("Orange");
  al.add("White");
  al.add("Black");
  System.out.println("Original list :" + al);
  List<String> sub_List = al.subList(0, 3);
  System.out.println("List of first three elements: " + sub_List);
 }
}