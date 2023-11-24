package ArrayList_Assignments;

import java.util.ArrayList;

public class assign20 {

	public static void main(String[] args) {
ArrayList<String> colour=new ArrayList<>();
		
		colour.add("White");
		colour.add("Black");
		colour.add("Blue");
		colour.add("Pink");
		colour.add("Red");
		
		
		System.out.println(colour);
		
		colour.ensureCapacity(5);
		System.out.println(colour);
	}

}
