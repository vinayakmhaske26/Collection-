package LinkedList_Assignment;

import java.util.LinkedList;

public class assign18 {

	public static void main(String[] args) {



		LinkedList<String> list=new LinkedList<>();
		
		list.add("Ruturaj");
		list.add("Shubham");
		list.add("Vinayak");
		
		
		
		LinkedList<String> list1=new LinkedList<>();
		list1=(LinkedList<String>) list.clone();
		
		System.out.println(list);
		System.out.println(list1);

		
	}

}
