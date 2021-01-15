package moje.vjezbe;

import java.util.Scanner;

public class Vjezba7 {

	// (Convert meters into feet) Write a program that reads a number in meters,
	// converts
	// it to feet, and displays the result. One meter is 3.2786 feet.
	public static void main(String[] args) {

		// Scanner
		Scanner input = new Scanner(System.in);
		// Use meter
		System.out.println("Insert meters: ");
		double meter = input.nextDouble();

		double feet = 3.2786;

		input.close();

		System.out.println("Meters in feet are: " + meter * feet);

	}

}
