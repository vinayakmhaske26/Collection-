package Vector_Ass;

import java.util.Enumeration;
import java.util.Vector;

public class vector_1 {

	public static void main(String[] args) {

		
		Vector<Integer> num=new Vector<>();
		
		num.add(11);
		num.add(12);
		num.add(13);
		num.add(14);
		num.add(15);
		

		System.out.println(num);
		
		Enumeration list=num.elements();
		
		while(list.hasMoreElements()) 
		{
			System.out.println(list.nextElement());
		}
		
	}

}
