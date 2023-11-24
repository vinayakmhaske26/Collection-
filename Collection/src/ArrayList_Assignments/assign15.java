package ArrayList_Assignments;

import java.util.ArrayList;

public class assign15 {

	public static void main(String[] args) {


		 ArrayList<Integer> Array=new ArrayList<>();
	      
	      Array.add(13);
	      Array.add(22);
	      Array.add(33);
	      Array.add(44);
	      Array.add(55);
	      
	      ArrayList<Integer> Arr=new ArrayList<>();
		      
		      Arr.add(23);
		      Arr.add(56);
		      Arr.add(54);
		      Arr.add(43);
		      Arr.add(34);
		      
		      Array.addAll(Arr);
		      System.out.println(Array);
	}

}
