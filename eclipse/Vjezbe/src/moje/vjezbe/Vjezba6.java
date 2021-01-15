package moje.vjezbe;

import java.util.Scanner;

public class Vjezba6 {
			// (Compute the volume of a triangular prism) Write a program that reads in the
			// length of
			// sides of an equilateral triangle and computes the area and volume using the
			// following
			// formulas: area = sqrt(3)/4 * (length of sides)^2
			// volume = area * length
	
	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);
		// Lenght
		System.out.println("Enter length of triangles");
		double length = input.nextDouble();
		// Area
		double area = Math.sqrt(3) / 4 * length * length;
		// Volume
		double volume = area * length;
		
		input.close();
		
		System.out.println("Area " + area + "volume " + volume);
	}
}
