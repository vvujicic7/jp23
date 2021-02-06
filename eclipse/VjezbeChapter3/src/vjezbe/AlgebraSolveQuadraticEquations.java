package vjezbe;

import java.util.Scanner;

public class AlgebraSolveQuadraticEquations {

	/*
	 * (Algebra: solve quadratic equations) The two roots of a quadratic equation
	 * ax2 + bx + c = 0 can be obtained using the following formula: r1 = -b + 2b2 -
	 * 4ac 2a and r2 = -b - 2b2 - 4ac 2a b2 - 4ac is called the discriminant of the
	 * quadratic equation. If it is positive, the equation has two real roots. If it
	 * is zero, the equation has one root. If it is negative, the equation has no
	 * real roots. Write a program that prompts the user to enter values for a, b,
	 * and c and displays the result based on the discriminant. If the discriminant
	 * is positive, display two roots. If the discriminant is 0, display one root.
	 * Otherwise, display “The equation has no real roots”. Note that you can use
	 * Math.pow(x, 0.5) to compute 2x. Here are some sample runs.
	 */

	public static void main(String[] args) {

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt user to enter values for a,b and c.
		System.out.println("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		// Compute the discriminant of the quadriatic equation.
		double discriminant = Math.pow(b, 2) - 4 * a * c;

		// Compute the real roots of the quadriatic equation if any.
		System.out.println("The equation has ");
		if (discriminant > 0) {
			double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
			double root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
			System.out.println("two roots " + root1 + " and " + root2);
		} else if (discriminant == 0) {
			double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
			System.out.println("one root " + root1);
		} else
			System.out.println("no real costs");

	}

}
