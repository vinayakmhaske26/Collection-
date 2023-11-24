package HashSet_Assignments;

import java.util.HashSet;
import java.util.TreeSet;

public class convert_treeset {

	public static void main(String[] args) {


HashSet<Integer> set=new HashSet<>();
		
		set.add(12);
		set.add(13);
		set.add(14);
		set.add(15);
		
		System.out.println(set);
		
		TreeSet<Integer> tree = new TreeSet<>(set);
		
		System.out.println(tree);
	}

}
