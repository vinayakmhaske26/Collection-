package ArrayList_Assignments;

import java.util.ArrayList;

public class assign16 {

	public static void main(String[] args) {


		ArrayList<String> colour=new ArrayList<>();
		
		colour.add("White");
		colour.add("Black");
		colour.add("Blue");
		colour.add("Pink");
		colour.add("Red");
		
		ArrayList<String> colour2=new ArrayList<>();
		
		colour2=(ArrayList<String>) colour.clone();
		// dublicate array list
		System.out.println(colour);
	      System.out.println(colour2);
	    
	}

}
