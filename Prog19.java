import java.util.*;
  public class Prog19 {
  public static void main(String[] args) {
          ArrayList<String> list = new ArrayList<String>();
          list.add("Black");
          list.add("Green");
          list.add("Purple");
  	  list.add("White");
          list.add("Violet");
         System.out.println(list);
        System.out.println("The size of the list is: "+list.size());
        list.trimToSize();
        System.out.println("After triming to original, the list is: "+list.size());
        System.out.println(list);
      
}
}