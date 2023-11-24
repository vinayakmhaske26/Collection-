package ArrayList_Assignments;

import java.util.ArrayList;
import java.util.Collections;

public class assign14 {

	public static void main(String[] args) {


		 ArrayList<Integer> Array=new ArrayList<>();
	      
	      Array.add(13);
	      Array.add(22);
	      Array.add(33);
	      Array.add(44);
	      Array.add(55);
	      
	      System.out.println(Array);

	      Collections.swap(Array,2,4);
	      System.out.println(Array);
	}

}
