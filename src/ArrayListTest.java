import java.sql.Date;
import java.util.*;
public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Employee> staff = new ArrayList <Employee> ();
		
//		staff.add(new Employee("carl Craker",7500,1987,12,15));
//		staff.add(new Employee("harry hacker",5000,1989,10,1));
//		staff.add(new Employee("Tony Tester",4000,1990,3,15 ));
		for(Employee e : staff){
			e.raiseSalary(5);
	
		}

	}
	private String name ;
	private double salary ;
	private Date hireDay ;
	
class Employee{
		public Employee(String n,double s,int year,int month,int day){
			name = n;
			salary = s;
			GregorianCalendar  calendar = new GregorianCalendar (year, month - 1, day);
			hireDay = (Date) calendar.getTime();
			
		}
		
		public String getName(){
			
			return name;
			
		}
		public double getSalary(){
			return salary;
		}
		
		public Date getHireDay(){
			return hireDay;
		}
		public void raiseSalary(double byPercent){
			double raise = salary * byPercent / 100;
			salary += raise;
		}
		
	}
					

}
