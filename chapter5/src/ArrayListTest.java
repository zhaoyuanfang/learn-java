import java.util.*;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Employee2> staff = new ArrayList<Employee2>();
		
		staff.add(new Employee2("1", 100, 1999, 12, 15));
		
		for(Employee2 employee : staff)
			System.out.println("name="+employee.getName()+",salary="+employee.getSalary());
	}
}
class Employee2
{
	public Employee2(String n, double s, int year, int month, int day) {
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
		hireDay = calendar.getTime();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public Date getHireDay() {
		return hireDay;
	}
	public void raiseSalart(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
		
	}
	private String name;
	private double salary;
	private Date hireDay;
}
