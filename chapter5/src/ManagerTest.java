import java.util.*;


/**
 * This program demonstrates inheritance.
 * @version 1.1 20181205
 * @author Yuanfang
 *
 */
public class ManagerTest {
	public static void main(String[] args) {
		Manager boss = new Manager("Carl Cracker",80000.,1987,12,15);
		boss.setBonus(5000);
		
		Employee[] staff = new Employee[4];
		
		staff[0] = new Employee("Stephen Curry", 75000, 1987, 12, 15);
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tony Tester",40000, 1990, 3, 15);
		staff[3] = boss;
		for (Employee e:staff)
			System.out.println("name="+e.getName()+",salary="+e.getSalary());
	}
	
}
class Employee
{
	public Employee(String n, double s, int year, int month, int day) {
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month -1 ,day);
		hireDay = calendar.getTime();
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public Date getDate() {
		return hireDay;
	}
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent /100;
		salary += raise;
	}
	private String name;
	private double salary;
	private Date hireDay;
}
class Manager extends Employee
{
	/**
	 * @param n the employee's name
	 * @param s the salary
	 * @param year the hire year
	 * @param month the hire month
	 * @param day the hire day
	 */
	public Manager(String n, Double s, int year, int month, int day) {
		super(n, s, year, month, day);
		bonus = 0;
		
	}
	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary+bonus;
	}
	public void setBonus(double b) {
		bonus = b;
	}
	private double bonus;
}