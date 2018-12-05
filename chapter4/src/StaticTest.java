

/**
 * This program demonstrates static methods
 * @version 1.0 2018.12.4
 * @author Administrator
 *
 */
public class StaticTest {
	public static void main(String[] args) {
		Employee1[] staff = new Employee1[3];
		
		staff[0] = new Employee1("Carl Cracker", 75000);
		staff[1] = new Employee1("Harry Hacker", 50000);
		staff[2] = new Employee1("Tony Tester",40000);
		
		for (Employee1 e:staff)
		{
			e.setID();
			System.out.println("name="+e.getName()+",id="+e.getID()+",salary="+e.getSalary());
		}
	}
}
class Employee1
{
	public Employee1(String n, double s)
	{
		name = n;
		salary = s;
		id = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public int getID() {
		return id;
	}
	
	public void setID() {
		id = nextID;
		nextID++;
	}
	
	public static int getNextId() {
		return nextID;
	}
	
	public static void main(String[] args) {
		Employee1 employee = new Employee1("Harry", 5000);
		System.out.println(employee.getName()+" "+employee.getSalary());
	}
	
	private String name;
	private double salary;
	private int id;
	private static int nextID = 1;
}