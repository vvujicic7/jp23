package moje.vjezbe;

import java.util.Scanner;

public class Vjezba5 {
	
			// (Convert mile to kilometer) Write a program that reads a mile in a double
			// value
			// from the console, converts it to kilometers, and displays the result. The
			// formula
			// for the conversion is as follows: 1mi = 1.6km
	public static void main(String[] args) {
		
		double  kilometer;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insert number:");
		
		kilometer = input.nextDouble();
		
		double mile = kilometer / 1.6;
		
		input.close();
		
		System.out.println(mile);
		
					
		
		
		
		
	}

}
