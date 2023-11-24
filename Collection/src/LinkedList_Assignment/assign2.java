package LinkedList_Assignment;

import java.util.LinkedList;
import java.util.ListIterator;

public class assign2 {

	public static void main(String[] args) {


		LinkedList<String> list=new LinkedList<>();
		
		list.add("Ruturaj");
		list.add("Shubham");
		list.add("Vinayak");
		
		System.out.println(list);
		
		// iterate using list iterator
		/*ListIterator<String> itr=list.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		
		// using for loop
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}

}
