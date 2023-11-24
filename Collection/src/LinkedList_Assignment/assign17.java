package LinkedList_Assignment;

import java.util.LinkedList;

public class assign17 {

	public static void main(String[] args) {



		LinkedList<String> list=new LinkedList<>();
		
		list.add("Ruturaj");
		list.add("Shubham");
		list.add("Vinayak");
		
		System.out.println(list);
		

		LinkedList<String> list1=new LinkedList<>();
		
		list1.add("Ruturaj");
		list1.add("Shubham");
		list1.add("Vinayak");
		
		System.out.println(list1);
		
		list.addAll(list1);
		System.out.println(list);
		
		
	}

}
