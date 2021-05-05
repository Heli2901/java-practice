import java.util.*;

  public class Prog14 {
  public static void main(String[] args) {
   ArrayList<String> list = new ArrayList<String>();
  list.add("Black");
  list.add("Green");
  list.add("Purple");
  list.add("White");
  list.add("Violet");
  
          System.out.println("-----------before Swapping-----------");
          for(String sc: list){
          System.out.println(sc);
        }
          
         Collections.swap(list, 1, 3);
          System.out.println("-----------after Swapping------------");
          for(String sb: list){
          System.out.println(sb);
         }
     }
}