package Comparetor;

import java.util.Comparator;

class Sortbyname implements Comparator<Emp2> {

	@Override
	public int compare(Emp2 o1, Emp2 o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

public class Emp2 {

	private int id;
	private String name;
	private double salary;

	public Emp2(int id, String name, double salary) {
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
		return getId() + " " + getName() + " " + getSalary();
	}

}
