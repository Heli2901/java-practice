import java.util.*;
  public class Prog8 {
  public static void main(String[] args) {
  ArrayList<String> list = new ArrayList<String>();
  list.add("Black");
  list.add("Green");
  list.add("Purple");
  list.add("White");
  list.add("Violet");

  for(int i=0;i<list.size();i++)
		{
			
			System.out.println(list.get(i));
		}
		Collections.sort(list);
		System.out.println("After Sorting");
		for(int i=0;i<list.size();i++)
		{
						System.out.println(list.get(i));
		}

 }
}