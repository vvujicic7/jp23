package moje.vjezbe;

import java.util.Scanner;

public class Vjezba14 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number:");
		double inch = input.nextDouble();
		double meter = inch * 0.0254;
		
		System.out.println(inch = meter);
	}

}
