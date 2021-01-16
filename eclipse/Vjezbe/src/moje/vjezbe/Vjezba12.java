package moje.vjezbe;

import java.util.Scanner;

public class Vjezba12 {
		// Write a Java program to print the area and perimeter of a circle.
		//Test Data:
		//Radius = 7.5
		//Expected Output
		//Perimeter is = 47.12388980384689
		//Area is = 176.71458676442586
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input radius");
		double radius = in.nextDouble();
		
		System.out.println("Perimeter is = " + (2 * radius * Math.PI));
		System.out.println("Area is = " + (Math.PI * radius * radius));
	
	
	}
}
