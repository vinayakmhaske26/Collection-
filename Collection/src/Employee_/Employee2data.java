package Employee_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Employee2data {

	public static void main(String[] args) {


		ArrayList<Employee2> set2=new ArrayList<>();
		set2.add(new Employee2(101, "darshan", 123456.0));
		set2.add(new Employee2(102, "hari", 75623.0));
		set2.add(new Employee2(103, "ram", 12345.0));
		
		System.out.println("before Sorting");
		
		
		Iterator<Employee2>it1=set2.iterator();
		while(it1.hasNext()) {
			Employee2 e2=it1.next();
			System.out.println(e2);
		}
		
		Collections.sort(set2);
		System.out.println("\nAfter Sorting with Name");
		Iterator <Employee2> it2=set2.iterator();
		while(it2.hasNext()) {
			Employee2 e2=it2.next();
			System.out.println(e2);
		}
		
	}

}
