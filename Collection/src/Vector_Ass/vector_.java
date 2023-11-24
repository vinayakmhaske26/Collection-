package Vector_Ass;

import java.util.Iterator;
import java.util.Vector;

public class vector_ {

	public static void main(String[] args) {

		
		Vector<Integer> add=new Vector<>();
		
		add.add(-12);
		add.add(12);
		add.add(43);
		add.add(-32);
		add.add(-54);
		add.add(23);
		
		Iterator<Integer> itr=add.iterator();
		
		while(itr.hasNext())
		{
				if(itr.next()>0)
				{
					itr.remove();
				}
		}
		System.out.println(add);
	}
	

}

