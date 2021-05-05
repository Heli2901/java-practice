import java.util.*;
  public class Prog5 {
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
System.out.println("--------------------");
  list.set(2, "Yellow");
	for(int i=0;i<list.size();i++)
		{
						System.out.println(list.get(i));
		}


     
 }
}