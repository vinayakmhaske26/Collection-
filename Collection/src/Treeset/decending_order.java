package Treeset;

import java.util.Comparator;
import java.util.TreeSet;

class reverseorder implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		//return o1.compareTo(o2);  // in ascending order...
		//return o2.compareTo(o1); // in descending order.
		return -o1.compareTo(o2); // in descending order.
	}
	
}

public class decending_order {

	public static void main(String[] args) {


		TreeSet<String> set=new TreeSet<>(new reverseorder());
		
		set.add("Shubham");
		set.add("Vinayak");
		set.add("Ruturaj");
		
		System.out.println(set);
		
	}

}
