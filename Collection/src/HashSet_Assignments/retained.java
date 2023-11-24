package HashSet_Assignments;

import java.util.HashSet;

public class retained {

	public static void main(String[] args) {
		
		
HashSet<Integer> set=new HashSet<>();
		
		set.add(12);
		set.add(13);
		set.add(14);
		set.add(15);
		
		System.out.println(set);
		
HashSet<Integer> set1=new HashSet<>();
		
		set1.add(12);
		set1.add(13);
		set1.add(14);
		set1.add(15);
		
		System.out.println(set1);
		
		
		//set.equals(set1);
		System.out.println(set.equals(set1));
		
		System.out.println(set.retainAll(set1));

	}

}
