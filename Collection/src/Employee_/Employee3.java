package Employee_;

public class Employee3 implements Comparable<Employee3> {

	private int id;
	private String name;
	private Double salary;

	public Employee3(int id, String name, Double salary) {
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return getId() + " " + getName() + " " + getSalary();
	}

	public static void main(String[] args) {

	}

	@Override
	public int compareTo(Employee3 o) {
		if (getSalary() < o.getSalary())
			return -1;
		else if (getSalary() > o.getSalary())
			return 1;
		else
			return 0;
	}

}
