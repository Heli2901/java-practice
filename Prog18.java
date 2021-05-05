import java.util.*;
  public class Prog18 {
  public static void main(String[] args) {
          ArrayList<String> list = new ArrayList<String>();
          list.add("Black");
          list.add("Green");
          list.add("Purple");
  	  list.add("White");
          list.add("Violet");
          System.out.println("Original list: " + list);
          System.out.println("array list is empty or not ?? "+list.isEmpty());
          list.removeAll(list);
          System.out.println("after remove all elements "+list);   
          System.out.println("array list is empty or not ??  "+list.isEmpty());        
}
}