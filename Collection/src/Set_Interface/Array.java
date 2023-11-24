package Set_Interface;

import java.util.ArrayList;
import java.util.TreeSet;

public class Array {

	public static void main(String[] args) {


		ArrayList<Integer> a=new ArrayList<>();
		
		a.add(12);
		a.add(12);
		a.add(67);
		a.add(23);
		
		System.out.println(a);
		
		TreeSet<Integer> b=new TreeSet<>(a);
		
		System.out.println(b);
		
	}

}
