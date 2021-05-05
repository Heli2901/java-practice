import java.util.*;
  public class Prog15 {
  public static void main(String[] args) {
  ArrayList<String> list1 = new ArrayList<String>();
  list1.add("Heli");
  list1.add("Darshi");
  list1.add("Mili");
  list1.add("Hetvi");
  for(int i=0;i<list1.size();i++)
		{
		System.out.println(list1.get(i));
		}
  ArrayList<String> list2 = new ArrayList<String>();
  list2.add("Patel");
  list2.add("Panchal");
  list2.add("Gohil");
  list2.add("Prajapati");
  System.out.println("---------------------------------------------");
  for(int i=0;i<list2.size();i++)
		{
		System.out.println(list2.get(i));
		}

          ArrayList<String> list3 = new ArrayList<String>();
          list3.addAll(list1);
          list3.addAll(list2);
        
          System.out.println("---------------------------------------------");
          for(int i=0;i<list3.size();i++)
		{
		System.out.println(list3.get(i));
		}

  
     

   }
}