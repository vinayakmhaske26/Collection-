package Set_Interface;

import java.util.TreeSet;

public class tree_set {

	public static void main(String[] args) {


		TreeSet<Integer> tree=new TreeSet<>();
		
		TreeSet<Integer> tree1=new TreeSet<>(tree);
				
		tree.add(11);
		tree.add(22);
		tree.add(33);
		tree.add(78);
		
		System.out.println(tree); // Insertion order are not maintained but objects are maintained by sorted order....
		
		System.out.println(tree.ceiling(12));
		System.out.println(tree.ceiling(11));
		System.out.println(tree.ceiling(23));
		System.out.println(tree.ceiling(78));
		
		System.out.println(tree.first());
		
		System.out.println(tree.floor(23));
		
		System.out.println(tree.higher(23));
		
		System.out.println(tree.last());
		
		System.out.println(tree.lower(23));
		
		System.out.println(tree.pollFirst());
		
		System.out.println(tree.pollLast());
		
		System.out.println(tree.subSet(12, 50));
		
		System.out.println(tree.headSet(50));
		
		
		
		
	}

}
