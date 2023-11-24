package Comparetor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Empdata {

	public static void main(String[] args) {

		ArrayList<Emp1> list1 = new ArrayList<>();

		list1.add(new Emp1(999, "Sachin", 12234));
		list1.add(new Emp1(321, "Rohit", 234343));
		list1.add(new Emp1(123, "Rahul", 786342));
		list1.add(new Emp1(763, "Virat", 78345));
		
		ArrayList<Emp2> list2 = new ArrayList<>();

		list2.add(new Emp2(999, "Sachin", 12234));
		list2.add(new Emp2(321, "Rohit", 234343));
		list2.add(new Emp2(123, "Rahul", 786345));
		list2.add(new Emp2(763, "Virat", 783644));

		ArrayList<Emp3> list3 = new ArrayList<>();

		list3.add(new Emp3(999, "Sachin", 12234));
		list3.add(new Emp3(321, "Rohit", 23445));
		list3.add(new Emp3(123, "Rahul", 78632));
		list3.add(new Emp3(763, "Virat", 78365));

		System.out.println("Before the Sorting: ");

		Iterator<Emp1> itr = list1.iterator();
		while (itr.hasNext()) {
			Emp1 e1 = itr.next();
			System.out.println(e1);
		}
		Collections.sort(list1, new SortingbyID());

		System.out.println("\n After the Sorting by ID:");

		itr = list1.iterator();
		while (itr.hasNext()) 
		{
			Emp1 e1 = itr.next();
			System.out.println(e1);
		}
		
		System.out.println("\n After the Sorting by name:");
		Collections.sort(list2, new Sortbyname());
		Iterator<Emp2> itr1=list2.iterator();
		while(itr1.hasNext())
		{
			Emp2 e2=itr1.next();
			System.out.println(e2);
		}
		
		System.out.println("\n After the Sorting by salary:");
		Collections.sort(list3,new Sortbysalary());
		Iterator<Emp3> itr2=list3.iterator();
		while(itr2.hasNext())
		{
			Emp3 e3=itr2.next();
			System.out.println(e3);
		}

	}

}
