import java.util.*;
  public class Prog4 {
  public static void main(String[] args) 
{
  
  ArrayList<String> list = new ArrayList<String>();
  list.add("Black");
  list.add("Green");
  list.add("Purple");
  list.add("White");
  list.add("Violet");
  
  Iterator<String>obj = list.iterator();
		
		while (obj.hasNext()) 
		{
			String cname = obj.next();
			System.out.println(cname);
		}

  String ele = list.get(2);
  System.out.println("Third element: "+ele);
 }
}