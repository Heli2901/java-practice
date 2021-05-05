import java.util.*;
  public class Prog11 {
  public static void main(String[] args) {
  
  ArrayList<String> list = new ArrayList<String>();
  list.add("Black");
  list.add("Green");
  list.add("Purple");
  list.add("White");
  list.add("Violet");

  System.out.println("before reversing"); 
  for(int i=0;i<list.size();i++)
		{
		System.out.println(list.get(i));
		}
	  Collections.reverse(list);

    System.out.println("after reversing"); 
  for(int i=0;i<list.size();i++)
		{
			
		System.out.println(list.get(i));
		}
	
 }
}
