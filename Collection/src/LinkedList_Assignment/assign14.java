package LinkedList_Assignment;

import java.util.Collections;
import java.util.LinkedList;

public class assign14 {

	public static void main(String[] args) {



		LinkedList<String> list=new LinkedList<>();
		
		list.add("Ruturaj");
		list.add("Shubham");
		list.add("Vinayak");
		
		System.out.println(list);
		
		Collections.swap(list,0,2);
		
		System.out.println(list);
	}

}
