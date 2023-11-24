package Comparetor;

import java.util.Comparator;

class SortingbyID implements Comparator<Emp1>
{

	@Override
	public int compare(Emp1 o1, Emp1 o2) {
		if(o1.getId() < o2.getId())
			return -1;
		else if(o1.getId() < o2.getId())
			return 1;
		else
			return 0;
	}
	
}

public class Emp1 {

	private int id;
	private String name;
	private double salary;

	public Emp1(int id, String name, double salary) {
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
