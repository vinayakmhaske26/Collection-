package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class New_arraylist {

	public static void main(String[] args) {


		LinkedList<Integer> array=new LinkedList<>();
		
		array.add(92);
		array.add(43);
		array.add(null);
		array.add(null);
		array.add(46);
		array.add(43);
		array.add(null);
		array.add(null);
		array.add(68);
		array.add(65);
		array.add(null);
		array.add(null);
		
		System.out.println(array);
		
		LinkedList<Integer> array1=new LinkedList<>(array);
		
		System.out.println(array.clone());
		
		
		for(int i=0;i<array.size();i++)
		{
			System.out.println(array.get(i));
		}
	}

}
