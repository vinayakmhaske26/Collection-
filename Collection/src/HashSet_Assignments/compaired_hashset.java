package HashSet_Assignments;

import java.util.HashSet;

public class compaired_hashset {

	
	public static void main(String[] args) {


HashSet<Integer> set=new HashSet<>();
		
		set.add(12);
		set.add(13);
		set.add(14);
		set.add(15);
		
		System.out.println(set);
		
HashSet<Integer> set1=new HashSet<>();
		
		set1.add(56);
		set1.add(76);
		set1.add(87);
		set1.add(89);
		
		System.out.println(set1);
		
		/* HashSet<Integer> s=new HashSet<>();
		
		for(Integer element:set)
		{
			System.out.println(set1.contains(element));
		}*/
		
		System.out.println(set.contains(set1));
	}

}
