import java.util.*;
  public class Prog20 {
  public static void main(String[] args) {
          ArrayList<String> list = new ArrayList<String>();
          list.add("Black");
          list.add("Green");
          list.add("Purple");
  
          System.out.println(list);
                   
          list.ensureCapacity(5);
          list.add("White");
          list.add("Yellow");
          System.out.println("after increasing size of the list: " + list);    
}
}