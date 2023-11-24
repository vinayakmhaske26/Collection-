package Vector_Ass;

import java.util.LinkedList;
import java.util.ListIterator;

public class vector_4 {

	public static void main(String[] args) {


		LinkedList<Integer> list=new LinkedList<>();
		
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		
		System.out.println(list);
		
		ListIterator<Integer> itr=list.listIterator();
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.next());

		}
	}

}
