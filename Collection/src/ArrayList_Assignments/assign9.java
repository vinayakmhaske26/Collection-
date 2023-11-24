package ArrayList_Assignments;

import java.util.ArrayList;
import java.util.Collections;

public class assign9 {

	public static void main(String[] args) {


		ArrayList<Integer> Array=new ArrayList<>();
	      
	      Array.add(88);
	      Array.add(22);
	      Array.add(33);
	      Array.add(44);
	      Array.add(55);
	      
        ArrayList<Integer> Array1=new ArrayList<>();
	      
	      Array1.add(56);
	      Array1.add(23);
	      Array1.add(34);
	      Array1.add(54);
	      Array1.add(12);
	      
	     
	      Collections.copy(Array, Array1);
	    System.out.println(Array);
	    System.out.println(Array1);
	}

}
