package moje.vjezbe;

import java.util.Scanner;

public class Vjezba20 {
	// (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
	// to enter the number of years and displays the population after the number of years.
	// Use the hint in Programming Exercise 1.11 for this program. The population
	// should be cast into an integer. Here is a sample run of the program:
	
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to the number of the years
		System.out.println("Enter the number of the years: ");
		int years = input.nextInt();
		
		// Calculate population projection
		int population = 312123123 + (((315360000 / 7) - (315360000 / 13) + (315360000 / 45)) * years);
		
		// Display the results
		System.out.println("The population in " + years + " years is " + population);
		
		
		
	}

}
