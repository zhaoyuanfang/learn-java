package chapter6;
import java.util.Arrays;

public class EmployeeSortTest {
	/**
	 * @version 1.0 20121205
	 * @author Yuanfang
	 */
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];

		staff[0] = new Employee("H", 35000);
		staff[1] = new Employee("C", 75000);
		staff[2] = new Employee("T", 38000);

		Arrays.sort(staff);

		for (Employee e : staff) {
			System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
		}
	}

}

class Employee implements Comparable<Employee> {
	public Employee(String n, double s) {
		// TODO Auto-generated constructor stub
		name = n;
		salary = s;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	public int compareTo(Employee other) {
		if (salary < other.salary)
			return -1;
		if (salary > other.salary)
			return 1;
		return 0;
	}

	private String name;
	private double salary;
}
