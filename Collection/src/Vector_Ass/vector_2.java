package Vector_Ass;

import java.util.ArrayList;
import java.util.Iterator;

public class vector_2 {

	public static void main(String[] args) {


		ArrayList<Integer> Array=new ArrayList<>();
		
		Array.add(12);
		Array.add(23);
		Array.add(34);
				
		Iterator<Integer> itr=Array.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		
		
	}

}
