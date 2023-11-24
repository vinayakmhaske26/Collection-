package treeset_Assignments;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class decending_o implements Comparator<String>
{
	// the order are followed by the descending order...
	@Override
	public int compare(String o1, String o2) {
		if(o1.length()<o2.length())
			return -1;
		else if(o1.length()>o2.length())
			return 1;
		else 
			return (o1.compareTo(o2));
		
		// the order are followed by the ascending order...
		/*public int compare(String o1, String o2) {
			if(o1.length()<o2.length())
				return 1;
			else if(o1.length()>o2.length())
				return -1;
			else 
				return 0;*/
	}
	
}

public class assign2 {

	public static void main(String[] args) {


TreeSet<String> set = new TreeSet<>(new decending_o());
		
		set.add("Red");
		set.add("Pink");
		set.add("Black");
		set.add("White");
		set.add("Blue");
		
		System.out.println(set);
		
		Iterator<String> itr=set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
