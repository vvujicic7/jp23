package moje.vjezbe;

import java.util.Scanner;

public class Vjezba15 {
	// Assume that runner runs 15 kilometers in 50 minutes and
	// 30 seconds. Write a program that displays the average 
	// speed in miles per hour. (Note that 1 mile is 
	// 1.6 kilometers.)
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter kilometers: ");
		double kilometer = input.nextDouble();
		
		System.out.println("Enter minutes: ");
		double minutes = input.nextDouble();
		
		System.out.println("Enter seconds: ");
		double seconds = input.nextDouble();
		
		double mile = kilometer / 1.6;
		
		double time = (minutes * 60 + seconds) / 3600;
		
		System.out.println("Average speed is : " + mile / time);
	}

}
