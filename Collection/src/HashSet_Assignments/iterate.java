package HashSet_Assignments;

import java.util.HashSet;
import java.util.Iterator;

public class iterate {

	public static void main(String[] args) {

		HashSet<Integer> set=new HashSet<>();
		
		set.add(12);
		set.add(13);
		set.add(14);
		set.add(15);
		
		System.out.println(set);
		
		Iterator<Integer> i=set.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
