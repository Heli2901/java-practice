import java.util.*;
  public class Prog17 {
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

        list.removeAll(list);

        System.out.println("-------------After Removing-------------");
          for(int i=0;i<list.size();i++)
		{
			
			System.out.println(list.get(i));
		}
        
}
}