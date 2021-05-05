import java.util.*;
  public class Prog16 {
  public static void main(String[] args) {
          ArrayList<String> list = new ArrayList<String>();
          list.add("Black");
          list.add("Green");
          list.add("Purple");
  	  list.add("White");
          list.add("Violet");
          System.out.println("-------------Real list-------------");
          for(int i=0;i<list.size();i++)
		{
			
			System.out.println(list.get(i));
		}

       ArrayList<String> list1 = (ArrayList<String>)list.clone();
        System.out.println("-------------Clone list-------------");
          for(int i=0;i<list1.size();i++)
		{
			
			System.out.println(list1.get(i));
		}
        
}
}