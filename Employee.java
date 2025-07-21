package task6Package;

import java.util.Scanner;

public class Employee {
	// Private attributes
	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	// Constructor
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	// Getters
	public int getID() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getName() {
		return firstName + " " + lastName;
	}

	public int getSalary() {
		return salary;
	}

	// Setter
	public void setSalary(int salary) {
		this.salary = salary;
	}

	// Annual salary
	public int getAnnualSalary() {
		return salary * 12;
	}

	// Raise salary by percentage and return new salary
	public int raiseSalary(int percent) {
		salary += (int) (salary * (percent / 100.0));
		return salary;
	}

	// toString() override
	@Override
	public String toString() {
		return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
	}

	// Main method to test the class
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		System.out.print("Enter the Employee ID: ");
		int empID = obj.nextInt();
		obj.nextLine(); // clear newline

		System.out.print("Enter the Employee First Name: ");
		String empFirstName = obj.nextLine();

		System.out.print("Enter the Employee Last Name: ");
		String empLastName = obj.nextLine();

		System.out.print("Enter the Employee Salary: ");
		int empSalary = obj.nextInt();

		// Creating Employee object
		Employee emp = new Employee(empID, empFirstName, empLastName, empSalary);

		// Displaying employee details
		System.out.println("\n--- Employee Details ---");
		System.out.println(emp.toString());
		System.out.println("Annual Salary: " + emp.getAnnualSalary());

		// Salary raise calculation
		System.out.print("\nEnter raise percentage: ");
		int raisePercent = obj.nextInt();
		int newSalary = emp.raiseSalary(raisePercent);

		System.out.println("Updated Monthly Salary: " + newSalary);
		System.out.println("Updated Annual Salary: " + emp.getAnnualSalary());
		System.out.println("Updated Info: " + emp.toString());

		obj.close();
	}
}
