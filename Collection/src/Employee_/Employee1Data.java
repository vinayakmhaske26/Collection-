package Employee_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Employee1Data {
public static void main(String[] args) {
	
	ArrayList<Employee1> set1=new ArrayList<>();
	set1.add(new Employee1(103, "akshay", 123456.0));
	set1.add(new Employee1(102, "sahil", 75623.0));
	set1.add(new Employee1(101, "ravi", 12345.0));
	
			
	System.out.println("sbefore Sorting");
	
	
	Iterator <Employee1>it1=set1.iterator();
	while(it1.hasNext()) {
		Employee1 e1=it1.next();
		System.out.println(e1);
	}
	
	Collections.sort(set1);
	System.out.println("\nAfter Sorting with Id");
	it1=set1.iterator();
	while(it1.hasNext()) {
		Employee1 e1=it1.next();
		System.out.println(e1);
	}

}
}

