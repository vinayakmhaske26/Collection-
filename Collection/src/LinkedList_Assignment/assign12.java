package LinkedList_Assignment;

import java.util.LinkedList;

public class assign12 {

	public static void main(String[] args) {



		LinkedList<String> list=new LinkedList<>();
		
		list.add("Ruturaj");
		list.add("Shubham");
		list.add("Vinayak");
		
		System.out.println(list);
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list);
	}

}
