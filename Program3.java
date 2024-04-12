package javaAssignment3;

/*Write a program by creating an "Employee" class having the following methods
and print the final salary.
a.getInfo() which takes the salary, number of hours of work per day of
employee as parameter
b. AddSal() which adds $10 to salary of the employee if it is less
than $500.
c. AddWork() which adds $5 to salary of employee if the number of hours of
work per day is more than 6 hours.*/

class Employee{
	private double salary;
	private int hour;
	
	public void getInfo(double salary,int hour) {
		this.salary=salary;
		this.hour=hour;
	}
	
	public void Addsal() {
		if(salary<=500) {
			System.out.println("salaey="+(salary+10));
		}
	}
	public void Addwork() {
		if(hour>6) {
			System.out.println("Salary :"+(salary+5));
		}
	}
	
}
public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		employee.getInfo(500, 6);
		employee.Addsal();
		employee.Addwork();
	}

}

