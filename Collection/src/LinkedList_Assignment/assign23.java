package LinkedList_Assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class assign23 {

	public static void main(String[] args) {


		LinkedList<String> list=new LinkedList<>();
		
		list.add("Ruturaj");
		list.add("Shubham");
		list.add("Vinayak");
		
		System.out.println(list);
		
		List<String> list1=new ArrayList<String>(list);
		
		for(String name:list1)
		{
			System.out.println(name);
		}
	}

}
