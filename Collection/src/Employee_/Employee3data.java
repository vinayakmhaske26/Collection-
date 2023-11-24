package Employee_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Employee3data {

	public static void main(String[] args) {

		ArrayList<Employee3> set3=new ArrayList<>();
		set3.add(new Employee3(101, "pandu", 123456.0));
		set3.add(new Employee3(102, "raju", 75623.0));
		set3.add(new Employee3(103, "bablu", 12345.0));
		
		
	System.out.println("before Sorting");
	
	
	Iterator<Employee3>it1=set3.iterator();
	while(it1.hasNext()) {
		Employee3 e3=it1.next();
		System.out.println(e3);
	}
	
	
	Collections.sort(set3);
	System.out.println("\nAfter Sorting with Salary");
	Iterator <Employee3> it3=set3.iterator();
	while(it3.hasNext()) {
		Employee3 e3=it3.next();
		System.out.println(e3);
	}
	}

}
