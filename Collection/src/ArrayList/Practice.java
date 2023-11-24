package ArrayList;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {

		
ArrayList<Float> perc=new ArrayList<>();
		
		perc.add(98.0f);
		perc.add(91.0f);
		perc.add(93.0f);
				
		ArrayList<Float> per = new ArrayList<>();
		
		per.add(98.0f);
		per.add(77.0f);
		per.add(87.0f);
		perc.addAll(per);
		System.out.println(perc);
		System.out.println(perc.getClass());
	}

}
