package Employee_;

public class Employee1 implements Comparable<Employee1> {

	private int id;
	private String name;
	private Double salary;

	public Employee1(int id, String name, Double salary) {
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
	public int compareTo(Employee1 o) {

		if (this.id < o.id)
			return -1;
		else if (this.id > o.id)
			return 1;
		else
			return 0;
	}

}
