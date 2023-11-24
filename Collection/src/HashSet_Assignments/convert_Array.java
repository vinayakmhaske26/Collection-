package HashSet_Assignments;

import java.util.ArrayList;
import java.util.HashSet;

public class convert_Array {

	public static void main(String[] args) {


		HashSet<Integer> set=new HashSet<>();
		
		set.add(12);
		set.add(13);
		set.add(14);
		set.add(15);
		
		System.out.println(set);
		
	Integer[] Array=new Integer[set.size()];
	
	set.toArray(Array);
	
	for(Integer elements:Array)
	{
		System.out.println(elements);
	}
	}

}
