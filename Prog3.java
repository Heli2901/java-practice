import java.util.*;
 
public class Prog3 {
 
    public static void main(String[] args) {
        
        
        ArrayList<String> list = new ArrayList<String>();
        
        //we are going to add some numbers to ArrayList
        list.add("Black");
        list.add("Purple");
        list.add("Green");
        
        
        list.add(0, "Yellow");
        
        System.out.println("Element inserted at first pos of ArrayList");
	Iterator<String>obj = list.iterator();
		
		while (obj.hasNext()) 
		{
			String cname = obj.next();
			System.out.println(cname);
		}

        
    }
}
