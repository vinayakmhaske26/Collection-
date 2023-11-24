package Vector_Ass;

import java.util.LinkedList;
import java.util.ListIterator;

public class vector_3 {

	public static void main(String[] args) {


		LinkedList<Integer> list=new LinkedList<>();
		
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		
		System.out.println(list);
		
		//System.out.println(list.set(0,101));
		
		ListIterator<Integer> itr=list.listIterator();
		

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("---------------------------");
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());		
		}
		System.out.println("---------------------------");
		 System.out.println(list);

		while(itr.hasNext())
		{
			itr.add(23);
		}	
		 System.out.println(list);
		 System.out.println(list);

	 	}
	}


