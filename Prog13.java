import java.util.*;
  public class Prog13 {
  public static void main(String[] args){

  ArrayList<String> list1 = new ArrayList<String>();
  list1.add("Heli");
  list1.add("Darshi");
  list1.add("Mili");
  list1.add("Hetvi");
  
  ArrayList<String> list2 = new ArrayList<String>();
  list2.add("Heli");
  list2.add("Panchal");
  list2.add("Mili");
  list2.add("Hetvi");
  
  ArrayList<String> list3 = new ArrayList<String>();
          for (String e : list1)
             list3.add(list2.contains(e) ? "Yes" : "No");
      for(int i=0;i<list3.size();i++)
		{
			
		System.out.println(list3.get(i));
		}


   }
}