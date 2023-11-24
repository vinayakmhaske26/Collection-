package Comparable_Comparable_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;	
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	

	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<>();

		list.add(new Employee(101, "Raj", 25000));
		list.add(new Employee(102, "Eknath", 12000));
		list.add(new Employee(103, "Udhhav", 11000));
		list.add(new Employee(104, "Devendra", 12500));

		System.out.println("Before Sorting :");

		Iterator<Employee> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

		System.out.println("After Sorting :");

		Collections.sort(list);

		itr = list.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

	@Override
	public int compareTo(Employee o) {
		if (this.salary < o.salary)
			return -1;
		else if (this.salary > o.salary)
			return 1;
		else
			return 0;
		
			
	}

}
