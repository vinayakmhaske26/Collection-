package ArrayList_Assignments;

import java.util.ArrayList;
import java.util.ListIterator;

public class assign2 {

	public static void main(String[] args) {

      ArrayList<Integer> Array=new ArrayList<>();
      
      Array.add(1);
      Array.add(2);
      Array.add(3);
      Array.add(4);
      Array.add(5);
      
      System.out.println(Array);
      System.out.println("Iterating Arraylist uising simple for loop");
      
      for(int i=0;i<Array.size();i++)
      {
    	  System.out.println(Array.get(i));
      }
      
      System.out.println("iterating Array by using enhanced for loop");
      
      for(Integer name:Array)
      {
    	  System.out.println(name);
      }
      
      System.out.println("ityerating Array by using list iterator method");
      
      ListIterator<Integer> name=Array.listIterator();
      
      while(name.hasNext())
      {
    	  System.out.println(name.next());
      }
		
	}

}
