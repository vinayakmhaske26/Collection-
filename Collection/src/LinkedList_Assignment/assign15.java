package LinkedList_Assignment;

import java.util.LinkedList;

public class assign15 {

	public static void main(String[] args) {



		LinkedList<String> list=new LinkedList<>();
		
		list.add("Ruturaj");
		list.add("Shubham");
		list.add("Vinayak");
		
		System.out.println(list);
		
		System.out.println(list.indexOf("Ruturaj"));
		System.out.println(list.lastIndexOf("Vinayak"));
	}

}
