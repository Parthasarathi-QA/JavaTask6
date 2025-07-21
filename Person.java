package task6Package;

import java.util.Scanner;

public class Person {
	private String name;
	private int age;

	// Parameterized Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getter method for Name
	public String getName() {
		return name;
	}

	// Getter method for Age
	public int getAge() {
		return age;
	}

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		// Get the user inpt
		System.out.println("Enter the Name of the person: ");
		String inputName = obj.nextLine();

		System.out.println("Enter the Age of the person: ");
		int inputAge = obj.nextInt();

		// Create object
		Person per = new Person(inputName, inputAge);

		// Display using getters
		System.out.println("Name: " + per.getName());
		System.out.println("Age: " + per.getAge());
	}

}
