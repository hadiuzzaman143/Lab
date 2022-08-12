
//Write a Java program to replace an element in a linked list.

import java.util.LinkedList;
  public class LinkedList2 
  {
  public static void main(String[] args) 
  {
          LinkedList<String> al= new LinkedList<String>();
          al.add("Red");
          al.add("Green");
          al.add("Black");
          al.add("White");
          al.add("Pink");
          System.out.println("Original linked list: " + al);
          // Replacing 2nd element with new value
          al.set(1, "Orange");
          System.out.println("The value of second element changed.");
          System.out.println("New linked list :" + al);
   }
}