package chapter6;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * this program demonstrates cloning
 * 
 * @version 1.0 20121206
 * @author Yuanfang
 *
 */
public class CloneTest {
	public static void main(String[] args) {
		try {
			Employee1 original = new Employee1("john Q. public", 50000);
			original.setHireDay(2000, 1, 1);
			Employee1 copy = original.clone();
			copy.raiseSalary(10);
			copy.setHireDay(2002, 12, 31);
			System.out.println("original=" + original);
			System.out.println("copy=" + copy);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();// TODO: handle exception
		}
	}
}

class Employee1 implements Cloneable {
	public Employee1(String n, double s) {
		name = n;
		salary = s;
		hireDay = new Date();
		// TODO Auto-generated constructor stub
	}

	public Employee1 clone() throws CloneNotSupportedException {
		Employee1 cloned = (Employee1) super.clone();

		cloned.hireDay = (Date) hireDay.clone();

		return cloned;
	}

	public void setHireDay(int year, int month, int day) {
		Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();
		hireDay.setTime(newHireDay.getTime());
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	public String toString() {
		return "Employee1[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
	}

	private String name;
	private double salary;
	private Date hireDay;
}
