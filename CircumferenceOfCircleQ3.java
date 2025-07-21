package task6Package;

import java.util.Scanner;

public class CircumferenceOfCircleQ3 {

	private double radius;
	private double pi;

	public CircumferenceOfCircleQ3() {
		System.out.println("No argument constructor");
		this.radius = 0;
		this.pi = 3.1416;
	}

	public CircumferenceOfCircleQ3(double radius, double pi) {
		this.radius = radius;
		this.pi = pi;
	}

	public double calculate() {

		double circumference = 2 * pi * radius;
		return circumference;

	}

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the Radius of Circle: ");
		double inputRadius = obj.nextDouble();
		
		double pi = 3.1416;

		CircumferenceOfCircleQ3 cc = new CircumferenceOfCircleQ3(inputRadius, pi);
		double result = cc.calculate();
		System.out.println("The Circumference of Circle is: " + result);
	}
}
