package LinkedList_Assignment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class asssign3 {

	public static void main(String[] args) {


	LinkedList<String> list=new LinkedList<>();
		
		list.add("Ruturaj");
		list.add("Shubham");
		list.add("Vinayak");
		
		System.out.println(list);
		
		ListIterator<String> itr=list.listIterator(1);
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
