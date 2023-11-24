package ArrayList_Assignments;

import java.util.ArrayList;

public class assign22 {

	public static void main(String[] args) {

		ArrayList<String> colour=new ArrayList<>();
		
		colour.add("White");
		colour.add("Black");
		colour.add("Blue");
		colour.add("Pink");
		colour.add("Red");
		
		
		System.out.println(colour);
		
		for(int i=0;i<colour.size();i++)
		{
			System.out.println(colour.get(i));
		}
		
	}
}
