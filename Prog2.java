import java.util.*;  
 	public class Prog2{  
 		public static void main(String args[]){  
  		ArrayList<String> list = new ArrayList<String>();   
      		list.add("Black");    
      		list.add("Purple");    
      		list.add("Green");    
     		list.add("Yellow");    
       
      		Iterator<String>obj = list.iterator();
		
		while (obj.hasNext()) 
		{
			String cname = obj.next();
			System.out.println(cname);
		}

		}
  
}  
