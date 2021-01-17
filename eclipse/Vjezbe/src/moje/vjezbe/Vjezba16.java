package moje.vjezbe;

import java.util.Scanner;

public class Vjezba16 {
	// Write program that converts square meter into ping.
	// Program prompts the user to enter a number in square
	// meter, converts it to ping, and display the result.
	// One square meter is 0.3025 ping.
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number in square meter: ");
		double squareMeter = input.nextDouble();
		
		double ping = squareMeter * 0.3025;
		
		input.close();
		
		System.out.println("Converted to ping is: " + ping);
	}

}
