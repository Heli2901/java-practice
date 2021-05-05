import java.util.*;
  public class Prog12 {
  public static void main(String[] args) {
  
  ArrayList<String> list = new ArrayList<String>();
  list.add("Black");
  list.add("Green");
  list.add("Purple");
  list.add("White");
  list.add("Violet");
  System.out.println("-------real list--------");
  for(int i=0;i<list.size();i++)
		{
		System.out.println(list.get(i));
		}
  List<String> sub_List = list.subList(1, 4);

  System.out.println("--------------------------");
  for(int i=0;i<sub_List.size();i++)
		{
		System.out.println(sub_List.get(i));
		}

  }
}
