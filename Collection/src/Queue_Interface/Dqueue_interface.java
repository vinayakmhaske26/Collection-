package Queue_Interface;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Dqueue_interface {

	public static void main(String[] args) {


		ArrayDeque<String> d=new ArrayDeque<>();
		
		d.add("A");
		d.add("AB");
		d.add("ABC");
		d.add("XYZ");
		
		System.out.println(d);
		
		
		d.addFirst("Aa");
		d.addLast("Zz");
		System.out.println(d);
		
        
		//System.out.println(d.element());
		System.out.println(d.getFirst());
		System.out.println(d.getLast());
		
		d.offer("ABC");
		d.offerLast("XZ");
		System.out.println(d);
		
		
		System.out.println("***********************************");
		
		// peek retries but does not remove the element.. peekFirst and peekLast
		// poll retries and remove the element... pollFirst and pollLast
		
		System.out.println(d.pop());
		System.out.println(d.poll());
		System.out.println("***********************************");
		
		Iterator<String> itr=d.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
		
		
		
		
	}

}
