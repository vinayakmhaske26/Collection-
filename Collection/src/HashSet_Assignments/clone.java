package HashSet_Assignments;

import java.util.HashSet;

public class clone {

	public static void main(String[] args) {


HashSet<Integer> set=new HashSet<>();
		
		set.add(12);
		set.add(13);
		set.add(14);
		set.add(15);
		
		System.out.println(set);
		
		HashSet<Integer> set1=new HashSet<>();
		
		set1=(HashSet<Integer>) set.clone();
		
		System.out.println(set1);
	}

}
