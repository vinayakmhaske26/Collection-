package Set_Interface;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Linked_hashset {

	public static void main(String[] args) {


		LinkedHashSet<Integer> link= new LinkedHashSet<Integer>();
		
		LinkedHashSet<Integer> link1= new LinkedHashSet<>(link);
		
		LinkedHashSet<Integer> link2= new LinkedHashSet<>(10);

		LinkedHashSet<Integer> link3= new LinkedHashSet<>(10,0.50f);
		
		link.add(10);
		link.add(56);
		link.add(12);
		link.add(null);
		link.add(10);
		
		
		
		System.out.println(link);
		
		link.add(null);
		
		System.out.println(link);
		
		
	}

}
