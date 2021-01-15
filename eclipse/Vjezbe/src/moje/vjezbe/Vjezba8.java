package moje.vjezbe;

import java.util.Scanner;

public class Vjezba8 {
	// (Financial application: calculate tips) Write a program that reads the
	// subtotal
	// and the gratuity rate and then computes the gratuity and total. For example,
	// if the
	// user enters 10 for subtotal and 12% for gratuity rate, the program displays
	// $1.2
	// as gratuity and $11.2 as total.
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter subtotal: ");
		
		double subtotal = input.nextDouble();
		
		System.out.println("Enter gratuity_rate: ");
		
		double gratuity_rate = input.nextDouble();
		
		input.close();
		
		System.out.println("Gratuity_rate: " + (subtotal * gratuity_rate) / 100);
		System.out.println("Total: " + (subtotal + gratuity_rate));		
	}
}
