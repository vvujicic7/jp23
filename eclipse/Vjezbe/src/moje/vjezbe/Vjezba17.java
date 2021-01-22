package moje.vjezbe;

import java.util.Scanner;

public class Vjezba17 {
	// (Multiply the digits in an integer) Write a program that reads an integer
	// between
	// 0 and 1000 and multiplies all the digits in the integer. For example, if an
	// integer
	// is 932, the multiplication of all its digits is 54.
	// Hint: Use the % operator to extract digits, and use the / operator to remove
	// the
	// extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int broj = input.nextInt(), product = 1;
		
		String s = String.valueOf(broj);
		
		// nije mi jasno...
	}

}
