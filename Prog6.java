import java.util.*;
  public class Prog6 {
  public static void main(String[] args) {
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

  
  list.remove(2);
  System.out.println("After removing third element");
  for(int i=0;i<list.size();i++)
		{
						System.out.println(list.get(i));
		}

 }
}