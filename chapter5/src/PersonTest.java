import java.util.*;

public class PersonTest {
	/**
	 * This program demonstrates abstract classes
	 * @version 1.0 20181205
	 * @author Yuanfang
	 * 
	 */
	public static void main(String[] args) {
		Person[] people = new Person[2];
		people[0] = new Employee1("harry", 5000, 1989, 10, 15);
		people[1] = new Student("Maria", "cs");
		
		for (Person person : people)
			System.out.println(person.getName()+","+person.getDescription());
		System.out.println(people.toString());
	}
}

abstract class Person
{
	public Person(String n) {
		name = n;
		// TODO Auto-generated constructor stub
	}
	public abstract String getDescription();
	public String getName() {
		return name;
	}
	private String name;
}

class Employee1 extends Person
{
	public Employee1(String n, double s, int year, int month, int day) {
		super(n);
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
		hireDay = calendar.getTime();
		// TODO Auto-generated constructor stub
	}
	public double getSalary() {
		return salary;
	}
	public Date getHireDay() {
		return hireDay;
	}
	public String getDescription() {
		return String.format("an employee with a salary of $%.2f", salary);
	}
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent /100;
		salary += raise;
	}
	private double salary;
	private Date hireDay;
}

class Student extends Person{
	/**
	 * @param n the student's name
	 * @param m the student's major
	 * @author Yuanfang
	 * 
	 */
	public Student(String n, String m) {
		super(n);
		major = m;
		// TODO Auto-generated constructor stub
	}
	public String getDescription() {
		return String.format("a student majors in " + major);
	}
	private String major;
}