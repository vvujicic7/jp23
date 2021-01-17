package moje.vjezbe;

import java.util.Scanner;

public class Vjezba13 {
	// Write a Java program that takes three numbers as input to calculate
	// and print the average of the numbers.
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insert numbers: ");
		
		double a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
		
		in.close();
		
		System.out.println((a + b + c) /3);
		
	}

}
