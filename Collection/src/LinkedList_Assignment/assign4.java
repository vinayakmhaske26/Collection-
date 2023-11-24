package LinkedList_Assignment;

import java.util.Collections;
import java.util.LinkedList;

public class assign4 {

	public static void main(String[] args) {


LinkedList<String> list=new LinkedList<>();
		
		list.add("Ruturaj");
		list.add("Shubham");
		list.add("Vinayak");
		
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
	}

}
