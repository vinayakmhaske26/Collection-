package HashSet_Assignments;

import java.util.HashSet;

public class remove_elements {

	public static void main(String[] args) {


HashSet<Integer> set=new HashSet<>();
		
		set.add(12);
		set.add(13);
		set.add(14);
		set.add(15);
		
		System.out.println(set);
		
		set.removeAll(set);
		System.out.println(set);
		
	}

}
