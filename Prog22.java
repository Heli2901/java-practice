import java.util.*;
  public class Prog22 {
    public static void main(String[] args) {
  ArrayList <String> list = new ArrayList <String> ();
  
          list.add("Black");
          list.add("Green");
          list.add("Purple");
  	  list.add("White");
          list.add("Violet");
         
  System.out.println("\nOriginal array list: " + list);
  System.out.println("\nPrint using index of an element: ");

  for (int i = 0; i < list.size(); i++)
   System.out.println("Index["+ i +"]:" +list.get(i));
 }
}