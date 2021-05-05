import java.util.*;
  public class Prog7 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("Black");
    list.add("Green");
    list.add("Purple");
    list.add("White");
    list.add("Violet");

    if (list.contains("Green")) 
    {
    System.out.println("the element is found.");
    } 
    else 
    {
    System.out.println("There is no such element");
    }
 }
}
