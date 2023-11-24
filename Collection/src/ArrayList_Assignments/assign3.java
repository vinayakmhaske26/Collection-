package ArrayList_Assignments;

import java.util.ArrayList;

public class assign3 {

	public static void main(String[] args) {

        ArrayList<String> students=new ArrayList<>();
        
        students.add("Shubham");
        students.add("Ruturaj");
        students.add("Vinayak");
        students.add("Akshay");
        
       System.out.println("Before insertion of element________"+students);
       
       students.add(0,"Inrajeet");
       
       System.out.println("After insertion of the element________"+students);
       
       for(int i=0;i<students.size();i++)
       {
    	   System.out.println(students.get(i));
       }
        
		
	}

}
