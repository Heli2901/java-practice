import java.util.*;
  public class Prog21 {
    public static void main(String[] args){
  ArrayList<String> list = new ArrayList<String>();

  list.add("Black");
  list.add("Yellow");

  System.out.println("Original array list: " + list);
  String new_clr = "Blue";
  list.set(1,new_clr);

  int num=list.size();
  System.out.println("Replace second color with 'Blue'."); 
    System.out.println(list);
  }
}