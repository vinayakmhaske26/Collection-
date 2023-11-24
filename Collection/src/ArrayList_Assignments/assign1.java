package ArrayList_Assignments;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class assign1 {

	public static void main(String[] args) {

	ArrayList<String> colour=new ArrayList<>();
	
	colour.add("White");
	colour.add("Black");
	colour.add("Blue");
	colour.add("Pink");
	colour.add("Red");
	
	System.out.println(colour);
	
	System.out.println("Iterate the array list by using simple for loop");
	
	for(int i=0;i<colour.size();i++)
	{
		System.out.println(colour.get(i));
	}
	
	
	}

}
